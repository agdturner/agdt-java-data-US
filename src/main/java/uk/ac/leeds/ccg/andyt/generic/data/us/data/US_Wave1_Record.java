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

import java.util.ArrayList;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhold.US_Wave1_HHOLD_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.person.US_Wave1_PERSON_Record;

/**
 *
 * @author geoagdt
 */
public class US_Wave1_Record extends US_Record {
    
    private US_Wave1_HHOLD_Record hhold;
    
    private final  ArrayList<US_Wave1_PERSON_Record> people;
    
    public US_Wave1_Record(int A_HIDP){
        super(A_HIDP);
        hhold = null;
        people = new ArrayList<>();
    }
    
    public US_Wave1_Record(US_Wave1_HHOLD_Record hhold,
            ArrayList<US_Wave1_PERSON_Record> people){
        super(hhold.getA_HIDP());
        this.hhold = hhold;
        this.people = people;
    }

    /**
     * @return the hhold
     */
    public US_Wave1_HHOLD_Record getHhold() {
        return hhold;
    }
    
    /**
     * @return the people
     */
    public ArrayList<US_Wave1_PERSON_Record> getPeople() {
        return people;
    }

    /**
     * @param hhold the hhold to set
     */
    public void setHhold(US_Wave1_HHOLD_Record hhold) {
        this.hhold = hhold;
    }
}
