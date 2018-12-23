/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.leeds.ccg.andyt.generic.data.us.data;

import java.io.File;
import java.util.HashMap;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Strings;
import uk.ac.leeds.ccg.andyt.generic.data.us.io.US_Files;

/**
 *
 * @author Andy Turner
 */
public class US_Data {

    public static short NBHPSWAVES = 18;
    public static short NUKHLSWAVES = 8;
    
    public US_Files Files;
    public US_Strings Strings;
    
    public US_Data(US_Files Files, US_Strings Strings) {
        this.Files = Files;
        this.Strings = Strings;
    }
    
    public static HashMap<Short, String> getWaveUKHLSNameLookup() {
        HashMap<Short, String> r;
        r = new HashMap<>();
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
        HashMap<Short, String> r;
        r = new HashMap<>();
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
    
    public static File getInputFile(String name, String wave, File indir) {
        File f;
        String filename;
        filename = wave + "_" + name;
        filename += ".tab";
        f = new File(indir, filename);
        return f;
    }
    
}
