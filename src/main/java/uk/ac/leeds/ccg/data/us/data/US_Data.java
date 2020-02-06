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
package uk.ac.leeds.ccg.data.us.data;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import uk.ac.leeds.ccg.data.us.io.US_Files;

/**
 * US_Data
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class US_Data {

    public static short nBHPSWaves = 18;
    public static short nUKHLSWaves = 8;
    
    public US_Files files;
    
    public US_Data(US_Files Files) {
        this.files = Files;
    }
    
    public static HashMap<Short, String> getWaveUKHLSNameLookup() {
        HashMap<Short, String> r = new HashMap<>();
        short wave = 1;
        r.put(wave, "A");
        wave++;
        r.put(wave, "B");
        wave++;
        r.put(wave, "C");
        wave++;
        r.put(wave, "D");
        wave++;
        r.put(wave, "E");
        wave++;
        r.put(wave, "F");
        wave++;
        r.put(wave, "G");
        wave++;
        r.put(wave, "H");
        wave++;
        r.put(wave, "I");
        return r;
    }

    public static HashMap<Short, String> getWaveBHPSNameLookup() {
        HashMap<Short, String> r = new HashMap<>();
        short wave = 1;
        r.put(wave, "BA");
        wave++;
        r.put(wave, "BB");
        wave++;
        r.put(wave, "BC");
        wave++;
        r.put(wave, "BD");
        wave++;
        r.put(wave, "BE");
        wave++;
        r.put(wave, "BF");
        wave++;
        r.put(wave, "BG");
        wave++;
        r.put(wave, "BH");
        wave++;
        r.put(wave, "BI");
        wave++;
        r.put(wave, "BJ");
        wave++;
        r.put(wave, "BK");
        wave++;
        r.put(wave, "BL");
        wave++;
        r.put(wave, "BM");
        wave++;
        r.put(wave, "BN");
        wave++;
        r.put(wave, "BO");
        wave++;
        r.put(wave, "BP");
        wave++;
        r.put(wave, "BQ");
        wave++;
        r.put(wave, "BR");
        return r;
    }
    
    public static Path getInputFile(String name, String wave, Path indir) {
        String filename = wave + "_" + name + ".tab";
        return Paths.get(indir.toString(), filename);
    }
    
}
