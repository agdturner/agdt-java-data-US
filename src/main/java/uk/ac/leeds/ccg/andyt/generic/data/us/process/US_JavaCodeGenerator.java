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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_IO;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Environment;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Strings;
import uk.ac.leeds.ccg.andyt.generic.data.us.io.US_Files;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Object;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.US_Data;
import uk.ac.leeds.ccg.andyt.math.Math_Byte;
import uk.ac.leeds.ccg.andyt.math.Math_Double;
import uk.ac.leeds.ccg.andyt.math.Math_Integer;
import uk.ac.leeds.ccg.andyt.math.Math_long;
import uk.ac.leeds.ccg.andyt.math.Math_short;

/**
 * This class produces source code for loading the Understanding Society survey
 * data. Source code classes written in order to load the US household data are
 * written to uk.ac.leeds.ccg.andyt.generic.data.us.data.hhold. Source code
 * classes written in order to load the US individual data is written to
 * uk.ac.leeds.ccg.andyt.generic.data.us.data.person.
 */
public class US_JavaCodeGenerator extends US_Object {

    private static final long serialVersionUID = 1L;

    // For convenience
    public US_Strings Strings;
    public US_Files Files;

    protected US_JavaCodeGenerator() {
        super();
        Strings = Env.strings;
        Files = Env.files;
    }

    public US_JavaCodeGenerator(US_Environment env) {
        super(env);
        Strings = Env.strings;
        Files = Env.files;
    }

    public static void main(String[] args) {
        US_JavaCodeGenerator p;
        p = new US_JavaCodeGenerator(new US_Environment(
                new Generic_Environment()));
        //p.files.setDataDirectory(new File(System.getProperty("user.dir"), "data"));
//        String type;
//        type = "hhold";
        String name;
        int n = US_Data.NUKHLSWAVES + US_Data.NBHPSWAVES;
        HashMap<Short, String> WaveUKHLSNameLookup;
        WaveUKHLSNameLookup = US_Data.getWaveUKHLSNameLookup();
        HashMap<Short, String> WaveBHPSNameLookup;
        WaveBHPSNameLookup = US_Data.getWaveBHPSNameLookup();
        Object[] fieldTypes;

        name = "indresp";
        fieldTypes = p.getFieldTypes(name, n, WaveUKHLSNameLookup, WaveBHPSNameLookup);
        p.run(name, n, fieldTypes);

        name = "hhresp";
        fieldTypes = p.getFieldTypes(name, n, WaveUKHLSNameLookup, WaveBHPSNameLookup);
        p.run(name, n, fieldTypes);
    }

    /**
     * Pass through the data and works out what numeric type is best to store
     * each field in the data.
     *
     * @param name
     * @param n
     * @param WaveUKHLSNameLookup
     * @param WaveBHPSNameLookup
     * @return
     */
    protected Object[] getFieldTypes(String name, int n,
            HashMap<Short, String> WaveUKHLSNameLookup,
            HashMap<Short, String> WaveBHPSNameLookup) {
        Object[] r;
        r = new Object[4];
        File indir;
        indir = Files.getUSInputDir();
        HashMap<String, Integer>[] allFieldTypes;
        allFieldTypes = new HashMap[n];
        String[][] headers;
        headers = new String[n][];
        HashMap<String, Byte>[] v0ms;
        v0ms = new HashMap[n];
        HashMap<String, Byte>[] v1ms;
        v1ms = new HashMap[n];
        Object[] t;
        HashMap<String, Integer> fieldTypes;

        File indir2;

        String[] fields;
        boolean[] strings;
        boolean[] doubles;
        boolean[] longs;
        boolean[] ints;
        boolean[] shorts;
        boolean[] bytes;
        boolean[] booleans;
        HashMap<String, Byte> v0m;
        HashMap<String, Byte> v1m;
        String field;
        String type;
        int wave;
        type = "bhps";
        for (short w = 0; w < US_Data.NBHPSWAVES; w++) {
            wave = w + 1;
            indir2 = new File(indir, type + "_w" + wave);
            t = loadTest((short) wave, type, name, WaveBHPSNameLookup, indir2);
            fieldTypes = new HashMap<>();
            allFieldTypes[w] = fieldTypes;
            fields = (String[]) t[0];
            headers[w] = fields;
            strings = (boolean[]) t[1];
            doubles = (boolean[]) t[2];
            longs = (boolean[]) t[3];
            ints = (boolean[]) t[4];
            shorts = (boolean[]) t[5];
            bytes = (boolean[]) t[6];
            booleans = (boolean[]) t[7];
            v0m = (HashMap<String, Byte>) t[8];
            v1m = (HashMap<String, Byte>) t[9];
            v0ms[w] = v0m;
            v1ms[w] = v1m;
            for (int i = 0; i < strings.length; i++) {
                addToFieldTypes(fieldTypes, fields, strings, doubles, longs, ints,
                        shorts, bytes, booleans, i);
            }
        }
        type = "ukhls";
        for (short w = (short) US_Data.NBHPSWAVES; w < n; w++) {
            wave = w + 1 - US_Data.NBHPSWAVES;
            indir2 = new File(indir, type + "_w" + wave);
            t = loadTest((short) wave, type, name, WaveUKHLSNameLookup, indir2);
            fieldTypes = new HashMap<>();
            allFieldTypes[w] = fieldTypes;
            fields = (String[]) t[0];
            headers[w] = fields;
            strings = (boolean[]) t[1];
            doubles = (boolean[]) t[2];
            longs = (boolean[]) t[3];
            ints = (boolean[]) t[4];
            shorts = (boolean[]) t[5];
            bytes = (boolean[]) t[6];
            booleans = (boolean[]) t[7];
            v0m = (HashMap<String, Byte>) t[8];
            v1m = (HashMap<String, Byte>) t[9];
            v0ms[w] = v0m;
            v1ms[w] = v1m;
            for (int i = 0; i < strings.length; i++) {
                addToFieldTypes(fieldTypes, fields, strings, doubles, longs, ints,
                        shorts, bytes, booleans, i);
            }
        }
        Iterator<String> ite;
        int fieldType;
        int consolidatedFieldType;
        HashMap<String, Integer> consolidatedFieldTypes;
        consolidatedFieldTypes = new HashMap<>();
        consolidatedFieldTypes.putAll(allFieldTypes[0]);
        for (int w = 1; w < n; w++) {
            fieldTypes = allFieldTypes[w];
            ite = fieldTypes.keySet().iterator();
            while (ite.hasNext()) {
                field = ite.next();
                fieldType = fieldTypes.get(field);
                if (consolidatedFieldTypes.containsKey(field)) {
                    consolidatedFieldType = consolidatedFieldTypes.get(field);
                    if (fieldType != consolidatedFieldType) {
                        consolidatedFieldTypes.put(field,
                                Math.min(fieldType, consolidatedFieldType));
                    }
                } else {
                    consolidatedFieldTypes.put(field, fieldType);
                }
            }
        }
        r[0] = consolidatedFieldTypes;
        r[1] = headers;
        r[2] = v0ms;
        r[3] = v1ms;
        return r;
    }

    /**
     * @param fieldTypes
     * @param fields
     * @param strings
     * @param doubles
     * @param longs
     * @param ints
     * @param shorts
     * @param bytes
     * @param booleans
     * @param i
     */
    public void addToFieldTypes(HashMap<String, Integer> fieldTypes,
            String[] fields, boolean[] strings, boolean[] doubles,
            boolean[] longs, boolean[] ints, boolean[] shorts, boolean[] bytes,
            boolean[] booleans, int i) {
        String field;
        field = fields[i];
        if (strings[i]) {
            System.out.println("" + i + " " + "String");
            fieldTypes.put(field, 0);
        } else {
            if (doubles[i]) {
                System.out.println("" + i + " " + "double");
                fieldTypes.put(field, 1);
            } else {
                if (longs[i]) {
                    System.out.println("" + i + " " + "long");
                    fieldTypes.put(field, 2);
                } else {
                    if (ints[i]) {
                        System.out.println("" + i + " " + "int");
                        fieldTypes.put(field, 3);
                    } else {
                        if (shorts[i]) {
                            System.out.println("" + i + " " + "short");
                            fieldTypes.put(field, 4);
                        } else {
                            if (bytes[i]) {
                                System.out.println("" + i + " " + "byte");
                                fieldTypes.put(field, 5);
                            } else {
                                if (booleans[i]) {
                                    System.out.println("" + i + " " + "boolean");
                                    fieldTypes.put(field, 6);
                                } else {
                                    try {
                                        throw new Exception("unrecognised type");
                                    } catch (Exception ex) {
                                        ex.printStackTrace(System.err);
                                        Logger.getLogger(US_JavaCodeGenerator.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     * @param wave
     * @param type
     * @param name
     * @param waveNameLookup
     * @param indir
     * @return
     */
    public Object[] loadTest(short wave, String type, String name,
            HashMap<Short, String> waveNameLookup, File indir) {
        Object[] r;
        r = new Object[10];
        String[] fields;
        boolean[] strings;
        boolean[] doubles;
        boolean[] longs;
        boolean[] ints;
        boolean[] shorts;
        boolean[] bytes;
        boolean[] booleans;
        HashMap<String, Byte> v0m;
        HashMap<String, Byte> v1m;
        v0m = new HashMap<>();
        v1m = new HashMap<>();
        byte[] v0;
        byte[] v1;
        String swave;
        swave = waveNameLookup.get(wave);
        File f;
        f = US_Data.getInputFile(name, swave, indir);
        String m;
        m = "Test load " + type + " wave " + wave + " US " + "data from " + f;
        System.out.println("<" + m + ">");
        BufferedReader br;
        br = Generic_IO.getBufferedReader(f);
        String line;
        int nf;
        line = br.lines()
                .findFirst()
                .get();
        fields = parseHeader(line, wave, waveNameLookup);
        nf = fields.length;
        strings = new boolean[nf];
        doubles = new boolean[nf];
        longs = new boolean[nf];
        ints = new boolean[nf];
        shorts = new boolean[nf];
        bytes = new boolean[nf];
        booleans = new boolean[nf];
        v0 = new byte[nf];
        v1 = new byte[nf];

        for (int i = 0; i < nf; i++) {
            strings[i] = false;
            doubles[i] = false;
            longs[i] = false;
            ints[i] = false;
            shorts[i] = false;
            bytes[i] = false;
            booleans[i] = true;
            v0[i] = Byte.MIN_VALUE;
            v1[i] = Byte.MIN_VALUE;
        }
        br.lines()                .skip(1)                .forEach(l -> {
                    String[] split = l.split("\t");
                    for (int i = 0; i < nf; i++) {
                        parse(split[i], fields[i], i, strings, doubles, longs,
                                ints, shorts, bytes, booleans,
                                v0, v1, v0m, v1m);
                    }
                });
        /**
         * Order v0m and v1m so that v0m always has the smaller value and v1m
         * the larger.
         */
        Iterator<String> ite;
        ite = v0m.keySet().iterator();
        String s;
        byte v00;
        byte v11;
        while (ite.hasNext()) {
            s = ite.next();
            v00 = v0m.get(s);
            if (v1m.containsKey(s)) {
                v11 = v1m.get(s);
                if (v00 > v11) {
                    v0m.put(s, v11);
                    v1m.put(s, v00);
                }
            }
        }
        System.out.println("</" + m + ">");
        r[0] = fields;
        r[1] = strings;
        r[2] = doubles;
        r[3] = longs;
        r[4] = ints;
        r[5] = shorts;
        r[6] = bytes;
        r[7] = booleans;
        r[8] = v0m;
        r[9] = v1m;
        return r;
    }

    /**
     * If s can be represented as a byte reserving Byte.Min_Value for a
     * noDataValue,
     *
     * @param s
     * @param field
     * @param index
     * @param strings
     * @param doubles
     * @param longs
     * @param ints
     * @param shorts
     * @param bytes
     * @param booleans
     * @param v0
     * @param v1
     * @param v0m
     * @param v1m
     */
    public void parse(String s, String field, int index, boolean[] strings,
            boolean[] doubles, boolean[] longs, boolean[] ints, boolean[] shorts,
            boolean[] bytes, boolean[] booleans, byte[] v0, byte[] v1,
            HashMap<String, Byte> v0m, HashMap<String, Byte> v1m) {
        if (!s.trim().isEmpty()) {
            if (!strings[index]) {
                if (doubles[index]) {
                    doDouble(s, index, strings, doubles);
                } else {
                    if (longs[index]) {
                        doLong(s, index, strings, doubles, longs);
                    } else {
                        if (ints[index]) {
                            doInt(s, index, strings, doubles, longs, ints);
                        } else {
                            if (shorts[index]) {
                                doShort(s, index, strings, doubles, longs, ints, shorts);
                            } else {
                                if (bytes[index]) {
                                    doByte(s, index, strings, doubles, longs,
                                            ints, shorts, bytes);
                                } else {
                                    if (booleans[index]) {
                                        if (Math_Byte.isByte(s)) {
                                            byte b = Byte.valueOf(s);
                                            if (v0[index] > Byte.MIN_VALUE) {
                                                if (!(b == v0[index])) {
                                                    if (v1[index] > Byte.MIN_VALUE) {
                                                        if (!(b == v1[index])) {
                                                            booleans[index] = false;
                                                            bytes[index] = true;
                                                        }
                                                    } else {
                                                        v1[index] = b;
                                                        v1m.put(field, b);
                                                    }
                                                }
                                            } else {
                                                v0[index] = b;
                                                v0m.put(field, b);
                                            }
                                        } else {
                                            booleans[index] = false;
                                            shorts[index] = true;
                                            doShort(s, index, strings, doubles,
                                                    longs, ints, shorts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    protected void doByte(String s, int index, boolean[] strings,
            boolean[] doubles, boolean[] longs, boolean[] ints,
            boolean[] shorts, boolean[] bytes) {
        if (!Math_Byte.isByte(s)) {
            bytes[index] = false;
            shorts[index] = true;
            doShort(s, index, strings, doubles, longs, ints, shorts);
        }
    }

    protected void doShort(String s, int index, boolean[] strings,
            boolean[] doubles, boolean[] longs, boolean[] ints,
            boolean[] shorts) {
        if (!Math_short.isShort(s)) {
            shorts[index] = false;
            ints[index] = true;
            doInt(s, index, strings, doubles, longs, ints);
        }
    }

    protected void doInt(String s, int index, boolean[] strings,
            boolean[] doubles, boolean[] longs, boolean[] ints) {
        if (!Math_Integer.isInt(s)) {
            ints[index] = false;
            longs[index] = true;
            doLong(s, index, strings, doubles, longs);
        }
    }

    protected void doLong(String s, int index, boolean[] strings,
            boolean[] doubles, boolean[] longs) {
        if (!Math_long.isLong(s)) {
            longs[index] = false;
            doubles[index] = true;
            doDouble(s, index, strings, doubles);
        }
    }

    protected void doDouble(String s, int index, boolean[] strings,
            boolean[] doubles) {
        if (!Math_Double.isDouble(s)) {
            doubles[index] = false;
            strings[index] = true;
        }
    }

    public void run(String name, int n, Object[] types) {
        HashMap<String, Integer> fieldTypes;
        fieldTypes = (HashMap<String, Integer>) types[0];
        String[][] headers;
        headers = (String[][]) types[1];
        HashMap<String, Byte>[] v0ms;
        v0ms = (HashMap<String, Byte>[]) types[2];
        HashMap<String, Byte>[] v1ms;
        v1ms = (HashMap<String, Byte>[]) types[3];

        TreeSet<String>[] fields;
        fields = getFields(headers);

        HashMap<String, Byte> v0m0;
        v0m0 = setCommonBooleanMaps(v0ms, v1ms, fields, fieldTypes);

        File outdir;
        outdir = new File(Files.getDataDir(), "..");
        outdir = new File(outdir, "src");
        outdir = new File(outdir, "main");
        outdir = new File(outdir, "java");
        outdir = new File(outdir, "uk");
        outdir = new File(outdir, "ac");
        outdir = new File(outdir, "leeds");
        outdir = new File(outdir, "ccg");
        outdir = new File(outdir, "andyt");
        outdir = new File(outdir, "generic");
        outdir = new File(outdir, "data");
        outdir = new File(outdir, "us");
        outdir = new File(outdir, "data");
        outdir = new File(outdir, name);
        outdir.mkdirs();
        String packageName;
        packageName = "uk.ac.leeds.ccg.andyt.generic.data.us.data";
        packageName += "." + name;

        File fout;
        PrintWriter pw;
        int wave;
        String className;
        String extendedClassName;
        String prepend;
        prepend = "US_";

        //int nwaves = ; + US_Data.NBHPSWAVES;
        for (int w = 0; w < fields.length; w++) {
            if (w < n) {
                // Non-abstract classes
                wave = w + 1;
                HashMap<String, Byte> v0m;
                v0m = v0ms[w];
                className = prepend + "Wave" + wave + "_" + name + "_Record";
                fout = new File(outdir, className + ".java");
                pw = Generic_IO.getPrintWriter(fout, false);
                writeHeaderPackageAndImports(pw, packageName, "");
                extendedClassName = prepend + name + "_Record";
                printClassDeclarationSerialVersionUID(pw, packageName,
                        className, "", extendedClassName);
                // Print Field Declarations Inits And Getters
                printFieldDeclarationsInitsAndGetters(pw, fields[w], fieldTypes,
                        v0m);
                // Constructor
                pw.println("public " + className + "(String line) {");
                pw.println("s = line.split(\"\\t\");");
                for (int j = 0; j < headers[w].length; j++) {
                    pw.println("init" + headers[w][j] + "(s[" + j + "]);");
                }
                pw.println("}");
                pw.println("}");
                pw.close();
            } else {
                // Abstract classes
                pw = null;
                className = prepend + name + "_Record";
                fout = new File(outdir, className + ".java");
                pw = Generic_IO.getPrintWriter(fout, false);
                writeHeaderPackageAndImports(pw, packageName,
                        "java.io.Serializable");
                printClassDeclarationSerialVersionUID(pw, packageName,
                        className, "Serializable", "");
                pw.println("protected String[] s;");
                // Print Field Declarations Inits And Getters
                printFieldDeclarationsInitsAndGetters(pw, fields[w], fieldTypes, v0m0);
                pw.println("}");
                pw.close();
            }
        }
    }

    /**
     *
     * @param pw
     * @param packageName
     * @param imports
     */
    public void writeHeaderPackageAndImports(PrintWriter pw,
            String packageName, String imports) {
        pw.println("/**");
        pw.println(" * Source code generated by " + this.getClass().getName());
        pw.println(" */");
        pw.println("package " + packageName + ";");
        if (!imports.isEmpty()) {
            pw.println("import " + imports + ";");
        }
    }

    /**
     *
     * @param pw
     * @param packageName
     * @param className
     * @param implementations
     * @param extendedClassName
     */
    public void printClassDeclarationSerialVersionUID(PrintWriter pw,
            String packageName, String className, String implementations,
            String extendedClassName) {
        pw.print("public class " + className);
        if (!extendedClassName.isEmpty()) {
            pw.print(" extends " + extendedClassName + " {");
        }
        if (!implementations.isEmpty()) {
            pw.print(" implements " + implementations + " {");
        }
        pw.println();
        /**
         * This is not included for performance reasons. pw.println("private
         * static final long serialVersionUID = " + serialVersionUID + ";");
         */
    }

    /**
     * @param pw
     * @param fields
     * @param fieldTypes
     * @param v0
     */
    public void printFieldDeclarationsInitsAndGetters(PrintWriter pw,
            TreeSet<String> fields, HashMap<String, Integer> fieldTypes,
            HashMap<String, Byte> v0) {
        // Field declarations
        printFieldDeclarations(pw, fields, fieldTypes);
        // Field init
        printFieldInits(pw, fields, fieldTypes, v0);
        // Field getters
        printFieldGetters(pw, fields, fieldTypes);
    }

    /**
     * @param pw
     * @param fields
     * @param fieldTypes
     */
    public void printFieldDeclarations(PrintWriter pw, TreeSet<String> fields,
            HashMap<String, Integer> fieldTypes) {
        String field;
        int fieldType;
        Iterator<String> ite;
        ite = fields.iterator();
        while (ite.hasNext()) {
            field = ite.next();
            fieldType = fieldTypes.get(field);
            switch (fieldType) {
                case 0:
                    pw.println("protected String " + field + ";");
                    break;
                case 1:
                    pw.println("protected double " + field + ";");
                    break;
                case 2:
                    pw.println("protected long " + field + ";");
                    break;
                case 3:
                    pw.println("protected int " + field + ";");
                    break;
                case 4:
                    pw.println("protected short " + field + ";");
                    break;
                case 5:
                    pw.println("protected byte " + field + ";");
                    break;
                default:
                    pw.println("protected boolean " + field + ";");
                    break;
            }
        }
    }

    /**
     *
     * @param pw
     * @param fields
     * @param fieldTypes
     */
    public void printFieldGetters(PrintWriter pw, TreeSet<String> fields,
            HashMap<String, Integer> fieldTypes) {
        String field;
        int fieldType;
        Iterator<String> ite;
        ite = fields.iterator();
        while (ite.hasNext()) {
            field = ite.next();
            fieldType = fieldTypes.get(field);
            switch (fieldType) {
                case 0:
                    pw.println("public String get" + field + "() {");
                    break;
                case 1:
                    pw.println("protected double " + field + "() {");
                    break;
                case 2:
                    pw.println("public long get" + field + "() {");
                    break;
                case 3:
                    pw.println("public int get" + field + "() {");
                    break;
                case 4:
                    pw.println("public short get" + field + "() {");
                    break;
                case 5:
                    pw.println("public byte get" + field + "() {");
                    break;
                default:
                    pw.println("public boolean get" + field + "() {");
                    break;
            }
            pw.println("return " + field + ";");
            pw.println("}");
            pw.println();
        }
    }

    /**
     *
     * @param pw
     * @param fields
     * @param fieldTypes
     * @param v0
     */
    public void printFieldInits(PrintWriter pw, TreeSet<String> fields,
            HashMap<String, Integer> fieldTypes, HashMap<String, Byte> v0) {
        String field;
        int fieldType;
        Iterator<String> ite;
        ite = fields.iterator();
        while (ite.hasNext()) {
            field = ite.next();
            fieldType = fieldTypes.get(field);
            switch (fieldType) {
                case 0:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println(field + " = s;");
                    break;
                case 1:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println(field + " = Double.parseDouble(s);");
                    pw.println("} else {");
                    pw.println(field + " = Double.NaN;");
                    break;
                case 2:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println(field + " = Long.parseLong(s);");
                    pw.println("} else {");
                    pw.println(field + " = Long.MIN_VALUE;");
                    break;
                case 3:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println(field + " = Integer.parseInt(s);");
                    pw.println("} else {");
                    pw.println(field + " = Integer.MIN_VALUE;");
                    break;
                case 4:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println(field + " = Short.parseShort(s);");
                    pw.println("} else {");
                    pw.println(field + " = Short.MIN_VALUE;");
                    break;
                case 5:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println(field + " = Byte.parseByte(s);");
                    pw.println("} else {");
                    pw.println(field + " = Byte.MIN_VALUE;");
                    break;
                default:
                    pw.println("protected final void init" + field + "(String s) {");
                    pw.println("if (!s.trim().isEmpty()) {");
                    pw.println("byte b = Byte.parseByte(s);");
                    if (v0.get(field) == null) {
                        pw.println(field + " = false;");
                    } else {
                        pw.println("if (b == " + v0.get(field) + ") {");
                        pw.println(field + " = false;");
                        pw.println("} else {");
                        pw.println(field + " = true;");
                        pw.println("}");
                    }
                    break;
            }
            pw.println("}");
            pw.println("}");
            pw.println();
        }
    }

    /**
     * Thinking to returns a lists of IDs...
     *
     * @param header
     * @param wave
     * @param lookup
     * @return
     */
    public String[] parseHeader(String header, short wave, HashMap<Short, String> lookup) {
        String[] r;
        String ws;
        ws = lookup.get(wave);
        String h1;
        h1 = header.toUpperCase();
        h1 = h1.replaceAll(ws + "_", "");
        r = h1.split("\t");
        return r;
    }

    protected HashMap<String, Byte> setCommonBooleanMaps(
            HashMap<String, Byte>[] v0ms,
            HashMap<String, Byte>[] v1ms,
            TreeSet<String>[] allFields,
            HashMap<String, Integer> fieldTypes) {
        HashMap<String, Byte> v0m;
        HashMap<String, Byte> v1m;
        Iterator<String> ites0;
        Iterator<String> ites1;
        String field0;
        String field1;
        TreeSet<String> fields;
        fields = allFields[5];
        HashMap<String, Byte> v0m1;
        HashMap<String, Byte> v1m1;
        v0m1 = new HashMap<>();
        v1m1 = new HashMap<>();
        ites0 = fields.iterator();
        byte v0;
        Byte v1;
        Byte v01;
        Byte v11;
        while (ites0.hasNext()) {
            field0 = ites0.next();
            if (fieldTypes.get(field0) == 5) {
                for (int w = 0; w < v0ms.length; w++) {
                    v0m = v0ms[w];
                    v1m = v1ms[w];
                    ites1 = v0m.keySet().iterator();
                    while (ites1.hasNext()) {
                        field1 = ites1.next();
                        if (field0.equalsIgnoreCase(field1)) {
                            v0 = v0m.get(field1);
                            if (v1m == null) {
                                v1 = Byte.MIN_VALUE;
                            } else {
                                //System.out.println("field1 " + field1);
                                //System.out.println("field1 " + field1);
                                v1 = v1m.get(field1);
                                if (v1 == null) {
                                    v1 = Byte.MIN_VALUE;
                                }
                            }
                            v01 = v0m1.get(field1);
                            v11 = v1m1.get(field1);
                            if (v01 == null) {
                                v0m1.put(field1, v0);
                            } else {
                                if (v01 != v0) {
                                    // Field better stored as a byte than boolean.
                                    fieldTypes.put(field1, 4);
                                }
                                if (v11 == null) {
                                    v1m1.put(field1, v1);
                                } else {
                                    if (v1 != v11.byteValue()) {
                                        // Field better stored as a byte than boolean.
                                        fieldTypes.put(field1, 4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return v0m1;
    }

    /**
     * Finds and returns r where. r[0] are the fields in common with all waves.
     * r[1] are the fields in common with all waves. r[2] are the fields in
     * common with all waves. r[3] are the fields in common with all waves. r[4]
     * are the fields in common with all waves. r[5] fields common to waves 1,
     * 2, 3, 4 and 5 (12345) r[6] fields other than 12345 that are common to
     * waves 1 and 2 (12). r[7] fields other than 12345 that are in common to
     * waves 3, 4 and 5 (345) r[8] fields other than 345 that are in common to
     * waves 4 and 5 (45)
     *
     * @param headers
     * @return
     */
    public TreeSet<String>[] getFields(String[][] headers) {
        int n;
        n = US_Data.NUKHLSWAVES + US_Data.NBHPSWAVES;
        //System.out.println("n " + n);
        TreeSet<String>[] r;
        r = new TreeSet[n + 1];
        for (int i = 0; i < US_Data.NUKHLSWAVES; i++) {
            //System.out.println(i);
            r[i] = getFields(headers[i]);
        }
        for (int i = US_Data.NUKHLSWAVES; i < n; i++) {
            //System.out.println(i);
            r[i] = getFields(headers[i]);
        }
        r[n] = getFieldsInCommon(r);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            r[i].removeAll(r[n]);
        }
        return r;
    }

    /**
     * Finds and returns those fields that are in common and those fields .
     * result[0] are the fields in common with all.
     *
     * @param headers
     * @return
     */
    public ArrayList<String>[] getFieldsList(ArrayList<String> headers) {
        ArrayList<String>[] r;
        int size;
        size = headers.size();
        r = new ArrayList[size];
        Iterator<String> ite;
        ite = headers.iterator();
        int i;
        i = 0;
        while (ite.hasNext()) {
            r[i] = getFieldsList(ite.next());
            i++;
        }
        return r;
    }

    /**
     *
     * @param fields
     * @return
     */
    public TreeSet<String> getFields(String[] fields) {
        TreeSet<String> r;
        r = new TreeSet<>();
        r.addAll(Arrays.asList(fields));
        return r;
    }

    /**
     *
     * @param s
     * @return
     */
    public ArrayList<String> getFieldsList(String s) {
        ArrayList<String> r;
        r = new ArrayList<>();
        String[] split;
        split = s.split("\t");
        r.addAll(Arrays.asList(split));
        return r;
    }

    /**
     * Returns all the values common to s1, s2, s3, s4 and s5 and removes all
     * these common fields from s1, s2, s3, s4 and s5.
     *
     * @param sets
     * @return
     * @Todo generalise
     */
    public TreeSet<String> getFieldsInCommon(TreeSet<String>[] sets) {
        TreeSet<String> r;
        r = new TreeSet<>();
        r.addAll(sets[0]);
        for (int i = 1; i < sets.length - 1; i++) {
            System.out.println(i);
            r.retainAll(sets[i]);
        }
        return r;
    }
}
