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
package uk.ac.leeds.ccg.andyt.generic.data.us.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_IO;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Environment;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Strings;
import uk.ac.leeds.ccg.andyt.generic.data.us.io.US_Files;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Object;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.US_Data;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.US_ID;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave1_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave2_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave3_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave4_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave5_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave6_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave7_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave8_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave9_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave10_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave11_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave12_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave13_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave14_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave15_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave16_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave17_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave18_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave19_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave20_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave21_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave22_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave23_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave24_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave25_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.hhresp.US_Wave26_hhresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave1_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave2_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave3_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave4_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave5_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave6_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave7_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave8_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave9_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave10_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave11_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave12_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave13_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave14_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave15_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave16_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave17_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave18_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave19_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave20_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave21_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave22_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave23_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave24_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave25_indresp_Record;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.indresp.US_Wave26_indresp_Record;

/**
 *
 * @author geoagdt
 */
public class US_Main_Process extends US_Object {

    // For convenience
    protected final US_Data data;
    protected final US_Strings Strings;
    protected final US_Files Files;

    // For logging.
    File logF;
    public static transient PrintWriter logPW;
    File logF0;
    public static transient PrintWriter logPW0;

    public US_Main_Process(US_Environment env) {
        super(env);
        data = env.data;
        Strings = env.Strings;
        Files = env.Files;
    }

    public static void main(String[] args) {
        US_Main_Process p;
        US_Environment env;
        env = new US_Environment();
        p = new US_Main_Process(env);
        p.Files.setDataDirectory(new File(System.getProperty("user.dir"), "data"));
        // Main switches
        //p.doJavaCodeGeneration = true;
        p.run();
    }

    public void run() {
        logF0 = new File(Files.getOutputDataDir(), "log0.txt");
        logPW0 = Generic_IO.getPrintWriter(logF0, false); // Overwrite log file.

        if (doJavaCodeGeneration) {
            runJavaCodeGeneration();
        }

        File indir;
        File outdir;
        File generateddir;

        indir = Files.getUSInputDir();
        generateddir = Files.getGeneratedDataUSDir();
        outdir = new File(generateddir, "Subsets");
        outdir.mkdirs();

        HashMap<Short, String> WaveUKHLSNameLookup;
        WaveUKHLSNameLookup = US_Data.getWaveUKHLSNameLookup();
        HashMap<Short, String> WaveBHPSNameLookup;
        WaveBHPSNameLookup = US_Data.getWaveBHPSNameLookup();

        int n = US_Data.NBHPSWAVES + US_Data.NUKHLSWAVES;

        doDataProcessingStep1(indir, outdir, n, WaveBHPSNameLookup,
                WaveUKHLSNameLookup);

        logPW.close();
    }

    /**
     * Method for running JavaCodeGeneration
     */
    public void runJavaCodeGeneration() {
        String[] args;
        args = null;
        US_JavaCodeGenerator.main(args);
    }

    protected void initlog(int i) {
        logF = new File(Files.getOutputDataDir(), "log" + i + ".txt");
        logPW = Generic_IO.getPrintWriter(logF, true); // Append to log file.
    }

    /**
     * Read input data and create subsets. Organise for person records that each
     * subset is split into separate files one for each collection. The
     * collections will be merged one by one in doDataProcessingStep2.
     *
     * @param indir
     * @param outdir
     * @param n
     * @param WaveBHPSNameLookup
     * @param WaveUKHLSNameLookup
     */
    public void doDataProcessingStep1(File indir, File outdir, int n,
            HashMap<Short, String> WaveBHPSNameLookup,
            HashMap<Short, String> WaveUKHLSNameLookup) {
        initlog(1);
        Object[] r;
        r = new Object[4];
        String type;
        File indir2;
        File f;
        File outf;
        BufferedReader br;
        String swave;
        String m;
        String name;
        /**
         * Get the household data to attach to the individual records
         */
        HashMap<Short, HashMap<Integer, Short>> HIDPToHSOWNLookups;
        HIDPToHSOWNLookups = getHIDPToHSOWNLookups(n, indir, WaveBHPSNameLookup,
                WaveUKHLSNameLookup);
        /**
         * Get the individual records and attach household details. And create
         * sets for those people in subsequent waves.
         */
        HashMap<Short, HashSet<US_ID>> sets;
        sets = new HashMap<>();
        name = "indresp";
        System.out.println(name);
        type = "bhps";
        for (short wave = 1; wave < WaveBHPSNameLookup.size() + 1; wave++) {
            HashSet<US_ID> set0;
            set0 = sets.get((short) (wave - 1));
            HashSet<US_ID> set1;
            set1 = new HashSet<>();
            sets.put(wave, set1);
            HashMap<Integer, Short> HIDPToHSOWN;
            HIDPToHSOWN = HIDPToHSOWNLookups.get(wave);
            indir2 = new File(indir, type + "_w" + wave);
            swave = WaveBHPSNameLookup.get(wave);
            f = US_Data.getInputFile(name, swave, indir2);
            outf = new File(outdir, swave + "_Wave" + wave + "_" + type + "Subset.csv");
            PrintWriter pw0;
            pw0 = Generic_IO.getPrintWriter(outf, false);
            printHeader(wave, pw0);
            outf = new File(outdir, swave + "_Wave" + wave + "_" + type + ".csv");
            PrintWriter pw1;
            pw1 = Generic_IO.getPrintWriter(outf, false);
            printHeader(wave, pw1);
            m = "Test load " + type + " wave " + wave + " US " + "data from " + f;
            System.out.println("<" + m + ">");
            switch (wave) {
                case 1:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave1_indresp_Record rec;
                        rec = new US_Wave1_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 1, null, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 2:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave2_indresp_Record rec;
                        rec = new US_Wave2_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 2, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 3:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave3_indresp_Record rec;
                        rec = new US_Wave3_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 3, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 4:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave4_indresp_Record rec;
                        rec = new US_Wave4_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 4, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 5:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave5_indresp_Record rec;
                        rec = new US_Wave5_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 5, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 6:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave6_indresp_Record rec;
                        rec = new US_Wave6_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 6, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 7:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines()
                            .skip(1)
                            .forEach(l -> {
                                US_Wave7_indresp_Record rec;
                                rec = new US_Wave7_indresp_Record(l);
                                byte SEX = rec.getSEX();
                                short AGE_DV = rec.getAGE_DV();
                                int PIDP = rec.getPIDP();
                                int HIDP = rec.getHIDP();
                                //int FININT_TM = w1rec.getFIMNNINT_TM();
                                byte JBSTAT = rec.getJBSTAT();
                                short JBRGSC_DV = rec.getJBRGSC_DV();
                                byte GOR_DV = rec.getGOR_DV();
                                byte HIQUAL_DV = rec.getHIQUAL_DV();
                                short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                                processBHPS((byte) 7, set0, set1, pw0, pw1, SEX,
                                        AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                        GOR_DV, HIQUAL_DV, HSOWN);
                            });
                    break;
                case 8:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave8_indresp_Record rec;
                        rec = new US_Wave8_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 8, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 9:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave9_indresp_Record rec;
                        rec = new US_Wave9_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 9, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 10:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave10_indresp_Record rec;
                        rec = new US_Wave10_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 10, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 11:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave11_indresp_Record rec;
                        rec = new US_Wave11_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 11, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 12:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave12_indresp_Record rec;
                        rec = new US_Wave12_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 12, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 13:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave13_indresp_Record rec;
                        rec = new US_Wave13_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 13, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 14:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave14_indresp_Record rec;
                        rec = new US_Wave14_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 14, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 15:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave15_indresp_Record rec;
                        rec = new US_Wave15_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 15, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 16:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave16_indresp_Record rec;
                        rec = new US_Wave16_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 16, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 17:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave17_indresp_Record rec;
                        rec = new US_Wave17_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //int FININT_TM = w1rec.getFIMNNINT_TM();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 17, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 18:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave18_indresp_Record rec;
                        rec = new US_Wave18_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        //byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processBHPS((byte) 18, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, JBSTAT, JBRGSC_DV,
                                GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
            }
            pw0.close();
            pw1.close();
            System.out.println("</" + m + ">");
        }
        type = "ukhls";
        for (short w = (short) (WaveBHPSNameLookup.size() + 1); w < n; w++) {
            HashMap<Integer, Short> HIDPToHSOWN;
            HIDPToHSOWN = HIDPToHSOWNLookups.get(w);
            short wave = (short) (w - WaveBHPSNameLookup.size());
            HashSet<US_ID> set0;
            set0 = sets.get((short) (wave - 1));
            HashSet<US_ID> set1;
            set1 = new HashSet<>();
            sets.put(wave, set1);
            indir2 = new File(indir, type + "_w" + wave);
            swave = WaveUKHLSNameLookup.get(wave);
            f = US_Data.getInputFile(name, swave, indir2);
            outf = new File(outdir, swave + "_Wave" + wave + "_" + type + "Subset.csv");
            PrintWriter pw0;
            pw0 = Generic_IO.getPrintWriter(outf, false);
            printHeader(wave, pw0);
            outf = new File(outdir, swave + "_Wave" + wave + "_" + type + ".csv");
            PrintWriter pw1;
            pw1 = Generic_IO.getPrintWriter(outf, false);
            printHeader(wave, pw1);
            m = "Test load " + type + " wave " + w + " US " + "data from " + f;
            System.out.println("<" + m + ">");
            switch (w) {
                case 19:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave19_indresp_Record rec;
                        rec = new US_Wave19_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 20:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave20_indresp_Record rec;
                        rec = new US_Wave20_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 21:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave21_indresp_Record rec;
                        rec = new US_Wave21_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSDV();
                        //short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 22:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave22_indresp_Record rec;
                        rec = new US_Wave22_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 23:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave23_indresp_Record rec;
                        rec = new US_Wave23_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        //short AGE_DV = Short.MIN_VALUE;
                        byte AGE_DV = rec.getAGDV();
                        //short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 24:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave24_indresp_Record rec;
                        rec = new US_Wave24_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 25:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave25_indresp_Record rec;
                        rec = new US_Wave25_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
                case 26:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave26_indresp_Record rec;
                        rec = new US_Wave26_indresp_Record(l);
                        byte SEX = rec.getSEX();
                        short AGE_DV = rec.getAGE_DV();
                        int PIDP = rec.getPIDP();
                        int HIDP = rec.getHIDP();
                        byte FIMNGRS_TC = rec.getFIMNGRS_TC();
                        byte JBSTAT = rec.getJBSTAT();
                        short JBRGSC_DV = rec.getJBRGSC_DV();
                        byte GOR_DV = rec.getGOR_DV();
                        byte HIQUAL_DV = rec.getHIQUAL_DV();
                        short HSOWN = getHSOWN(HIDPToHSOWN, HIDP);
                        processUKHLS(wave, set0, set1, pw0, pw1, SEX,
                                AGE_DV, PIDP, HIDP, FIMNGRS_TC, JBSTAT,
                                JBRGSC_DV, GOR_DV, HIQUAL_DV, HSOWN);
                    });
                    break;
            }
            pw0.close();
            pw1.close();
            System.out.println("</" + m + ">");
        }
        logPW.close();
    }

    /**
     * Get the household data to attach to the individual records
     *
     * @param n
     * @param indir
     * @param WaveBHPSNameLookup
     * @param WaveUKHLSNameLookup
     * @return
     */
    protected HashMap<Short, HashMap<Integer, Short>> getHIDPToHSOWNLookups(
            int n, File indir,
            HashMap<Short, String> WaveBHPSNameLookup,
            HashMap<Short, String> WaveUKHLSNameLookup) {
        HashMap<Short, HashMap<Integer, Short>> r;
        r = new HashMap<>();
        String name;
        String type;
        File indir2;
        String swave;
        File f;
        String m;
        BufferedReader br;
        name = "hhresp";
        System.out.println(name);
        type = "bhps";
        for (short wave = 1; wave < WaveBHPSNameLookup.size() + 1; wave++) {
            HashMap<Integer, Short> HIDPToHSOWN;
            HIDPToHSOWN = new HashMap<>();
            r.put(wave, HIDPToHSOWN);
            indir2 = new File(indir, type + "_w" + wave);
            swave = WaveBHPSNameLookup.get(wave);
            f = US_Data.getInputFile(name, swave, indir2);
            m = "Test load " + type + " wave " + wave + " US " + "data from " + f;
            System.out.println("<" + m + ">");
            switch (wave) {
                case 1:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave1_hhresp_Record rec;
                        rec = new US_Wave1_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 2:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave2_hhresp_Record rec;
                        rec = new US_Wave2_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 3:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave3_hhresp_Record rec;
                        rec = new US_Wave3_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 4:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave4_hhresp_Record rec;
                        rec = new US_Wave4_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 5:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave5_hhresp_Record rec;
                        rec = new US_Wave5_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 6:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave6_hhresp_Record rec;
                        rec = new US_Wave6_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN
                                .put(HIDP, HSOWND_BH);
                    });
                    break;
                case 7:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave7_hhresp_Record rec;
                        rec = new US_Wave7_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 8:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave8_hhresp_Record rec;
                        rec = new US_Wave8_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 9:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave9_hhresp_Record rec;
                        rec = new US_Wave9_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 10:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave10_hhresp_Record rec;
                        rec = new US_Wave10_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 11:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave11_hhresp_Record rec;
                        rec = new US_Wave11_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 12:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave12_hhresp_Record rec;
                        rec = new US_Wave12_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 13:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave13_hhresp_Record rec;
                        rec = new US_Wave13_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 14:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave14_hhresp_Record rec;
                        rec = new US_Wave14_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 15:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave15_hhresp_Record rec;
                        rec = new US_Wave15_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 16:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave16_hhresp_Record rec;
                        rec = new US_Wave16_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 17:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave17_hhresp_Record rec;
                        rec = new US_Wave17_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                case 18:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave18_hhresp_Record rec;
                        rec = new US_Wave18_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND_BH = rec.getHSOWND_BH();
                        HIDPToHSOWN.put(HIDP, HSOWND_BH);
                    });
                    break;
                default:
                    break;
            }
            System.out.println("</" + m + ">");
        }
        type = "ukhls";
        for (short w = (short) (WaveBHPSNameLookup.size() + 1); w < n; w++) {
            HashMap<Integer, Short> HIDPToHSOWN;
            HIDPToHSOWN = new HashMap<>();
            r.put(w, HIDPToHSOWN);
            short wave = (short) (w - WaveBHPSNameLookup.size());
            indir2 = new File(indir, type + "_w" + wave);
            swave = WaveUKHLSNameLookup.get(wave);
            f = US_Data.getInputFile(name, swave, indir2);
            m = "Test load " + type + " wave " + w + " US " + "data from " + f;
            System.out.println("<" + m + ">");
            switch (wave) {
                case 19:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave19_hhresp_Record rec;
                        rec = new US_Wave19_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 20:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave20_hhresp_Record rec;
                        rec = new US_Wave20_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 21:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave21_hhresp_Record rec;
                        rec = new US_Wave21_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 22:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave22_hhresp_Record rec;
                        rec = new US_Wave22_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 23:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave23_hhresp_Record rec;
                        rec = new US_Wave23_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 24:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave24_hhresp_Record rec;
                        rec = new US_Wave24_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 25:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave25_hhresp_Record rec;
                        rec = new US_Wave25_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                case 26:
                    br = Generic_IO.getBufferedReader(f);
                    br.lines().skip(1).forEach(l -> {
                        US_Wave26_hhresp_Record rec;
                        rec = new US_Wave26_hhresp_Record(l);
                        int HIDP = rec.getHIDP();
                        short HSOWND = rec.getHSOWND();
                        HIDPToHSOWN.put(HIDP, HSOWND);
                        short FIHHMNGRS_TC = rec.getFIHHMNGRS_TC();
                    });
                    break;
                default:
                    break;
            }
            System.out.println("</" + m + ">");
        }
        return r;
    }

    protected short getHSOWN(HashMap<Integer, Short> HIDPToHSOWN, Integer HIDP) {
        short HSOWN;
        if (HIDPToHSOWN.containsKey(HIDP)) {
            HSOWN = HIDPToHSOWN.get(HIDP);
        } else {
            HSOWN = Short.MIN_VALUE;
        }
        return HSOWN;
    }

    protected void printHeader(short wave, PrintWriter pw) {
        if (wave < 19) {
            pw.println("SEX,AGE_DV,PIDP,HIDP,JBSTAT,JBRGSC_DV,GOR_DV,HIQUAL_DV,HSOWN_BH");
        } else {
            switch (wave) {
                case 21:
                    pw.println("SEX,AGDV,PIDP,HIDP,FIMNGRS_TC,JBSTAT,JBRGSDV,GOR_DV,HIQUAL_DV,HSOWN");
                    break;
                case 23:
                    pw.println("SEX,AGDV,PIDP,HIDP,FIMNGRS_TC,JBSTAT,JBRGSC_DV,GOR_DV,HIQUAL_DV,HSOWN");
                    break;
                default:
                    pw.println("SEX,AGE_DV,PIDP,HIDP,FIMNGRS_TC,JBSTAT,JBRGSC_DV,GOR_DV,HIQUAL_DV,HSOWN");
                    break;
            }
        }
    }

    protected void processBHPS(short wave, HashSet<US_ID> set0, 
            HashSet<US_ID> set1, PrintWriter pw0, PrintWriter pw1, 
            byte SEX, short AGE_DV, int PIDP, int HIDP, byte JBSTAT,
            short JBRGSC_DV, byte GOR_DV, byte HIQUAL_DV, short HSOWN) {
        String s;
        s = "";
        s += getByteString(SEX);
        s += getShortString(AGE_DV);
        s += getIntString(PIDP);
        s += getIntString(HIDP);
        s += getByteString(JBSTAT);
        s += getShortString(JBRGSC_DV);
        s += getByteString(GOR_DV);
        s += getByteString(HIQUAL_DV);
        s += getShortString(HSOWN);
        if (wave > 1) {
            if (set0.contains(new US_ID(PIDP))) {
                pw0.println(s);
            }
        }
        pw1.println(s);
        set1.add(new US_ID(PIDP));
    }

    protected void processUKHLS(short wave, HashSet<US_ID> set0,
            HashSet<US_ID> set1, PrintWriter pw0, PrintWriter pw1, byte SEX,
            short AGE_DV, int PIDP, int HIDP, byte FIMNGRS_TC, byte JBSTAT,
            short JBRGSC_DV, byte GOR_DV, byte HIQUAL_DV, short HSOWN) {
        String s;
        s = "";
        s += getByteString(SEX);
        s += getShortString(AGE_DV);
        s += getIntString(PIDP);
        s += getIntString(HIDP);
        s += getByteString(JBSTAT);
        s += getShortString(JBRGSC_DV);
        s += getByteString(GOR_DV);
        s += getByteString(HIQUAL_DV);
        s += getShortString(HSOWN);
        if (wave > 1) {
            if (set0.contains(new US_ID(PIDP))) {
                pw0.println(s);
            }
        }
        pw1.println(s);
        set1.add(new US_ID(PIDP));
    }

    public String getByteString(byte b) {
        String r = "";
        if (b == Byte.MIN_VALUE) {
            r += ",";
        } else {
            r += b + ",";
        }
        return r;
    }

    public String getShortString(short s) {
        String r = "";
        if (s == Short.MIN_VALUE) {
            r += ",";
        } else {
            r += s + ",";
        }
        return r;
    }

    public String getIntString(int i) {
        String r = "";
        if (i == Integer.MIN_VALUE) {
            r += ",";
        } else {
            r += i + ",";
        }
        return r;
    }

    public String getShortString(byte s) {
        String r = "";
        if (s == Short.MIN_VALUE) {
            r += ",";
        } else {
            r += s + ",";
        }
        return r;
    }

    public static void log0(String s) {
        logPW.println(s);
    }

    public static void lo1(String s) {
        System.out.println(s);
    }

    public static void log(String s) {
        logPW.println(s);
        System.out.println(s);
    }

    public static void logStart(String s) {
        s = "<" + s + ">";
        logPW.println(s);
        System.out.println(s);
    }

    public static void logEnd(String s) {
        s = "</" + s + ">";
        logPW.println(s);
        System.out.println(s);
    }
    boolean doJavaCodeGeneration = false;
    boolean doLoadDataIntoCaches = false;
}
