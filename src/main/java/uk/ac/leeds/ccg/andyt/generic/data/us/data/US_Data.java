/*
 * Copyright 2018 geoagdt.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.andyt.generic.data.us.data;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_IO;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Strings;
import uk.ac.leeds.ccg.andyt.generic.data.us.io.US_Files;
import uk.ac.leeds.ccg.andyt.generic.data.us.process.US_Main_Process;

/**
 *
 * @author geoagdt
 */
public class US_Data implements Serializable {

    public transient US_Files Files;
    public transient US_Strings Strings;

    /**
     * Stores the number of waves in the US
     */
    public static final byte NUKHLSWAVES = 8;
    /**
     * Stores the number of waves in the US
     */
    public static final byte NBHPSWAVES = 13;
    
    public static final byte W1 = 1;
    public static final byte W2 = 2;
    public static final byte W3 = 3;
    public static final byte W4 = 4;
    public static final byte W5 = 5;
    public static final byte W6 = 6;
    public static final byte W7 = 7;
    public static final byte W8 = 8;
    public static final byte W9 = 9;
    public static final byte W10 = 10;
    public static final byte W11 = 11;
    public static final byte W12 = 12;
    public static final byte W13 = 13;

    /**
     * The main US data store. Keys are Collection IDs.
     */
    public HashMap<Short, US_Collection> data;

    /**
     * Looks up from a CASEW1 to the Collection ID.
     */
    public HashMap<Short, Short> CASEW1ToCID;

    public US_Collection getCollection(short collectionID) {
        US_Collection r;
        r = data.get(collectionID);
        if (r == null) {
            r = (US_Collection) loadSubsetCollection(collectionID);
            data.put(collectionID, r);
        }
        return r;
    }

    public void clearCollection(short cID) {
        US_Collection c;
        data.put(cID, null);
    }

    public US_Data(US_Files Files, US_Strings Strings) {
        this.Files = Files;
        this.Strings = Strings;
        data = new HashMap<>();
        CASEW1ToCID = new HashMap<>();
    }

    public boolean clearSomeData() {
        Iterator<Short> ite;
        ite = data.keySet().iterator();
        short cID;
        while (ite.hasNext()) {
            cID = ite.next();
            US_Collection c;
            c = data.get(cID);
            cacheSubsetCollection(cID, c);
            data.put(cID, null);
            return true;
        }
        return false;
    }

    public int clearAllData() {
        int r;
        r = 0;
        Iterator<Short> ite;
        ite = data.keySet().iterator();
        short cID;
        while (ite.hasNext()) {
            cID = ite.next();
            US_Collection c;
            c = data.get(cID);
            cacheSubsetCollection(cID, c);
            data.put(cID, null);
            r++;
        }
        return r;
    }

    /**
     *
     * @param cID the value of collectionID
     * @param o the value of o
     */
    public void cacheSubsetCollection(short cID, Object o) {
        File f;
        f = new File(Files.getGeneratedUSSubsetsDir(),
                "US_" + cID + "." + Strings.S_dat);
        cache(f, o);
    }

    /**
     *
     * @param cID the value of collectionID
     * @return
     */
    public Object loadSubsetCollection(short cID) {
        Object r;
        File f;
        f = new File(Files.getGeneratedUSSubsetsDir(),
                "US_" + cID + "." + Strings.S_dat);
        r = load(f);
        return r;
    }

    /**
     *
     * @param f the File to load Object result from.
     * @return
     */
    protected Object load(File f) {
        Object r;
        US_Main_Process.log1("<load File " + f + ">");
        r = Generic_IO.readObject(f);
        US_Main_Process.log1("</load File " + f + ">");
        return r;
    }

    /**
     *
     * @param f the value of cf
     * @param o the value of o
     */
    protected void cache(File f, Object o) {
        US_Main_Process.log1("<cache File " + f + ">");
        Generic_IO.writeObject(o, f);
        US_Main_Process.log1("</cache File " + f + ">");
    }

}
