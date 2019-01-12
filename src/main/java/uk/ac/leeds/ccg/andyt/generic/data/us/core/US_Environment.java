package uk.ac.leeds.ccg.andyt.generic.data.us.core;

import java.io.File;
import java.io.Serializable;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_Environment;
//import uk.ac.leeds.ccg.andyt.data.postcode.Generic_UKPostcode_Handler;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_IO;
import uk.ac.leeds.ccg.andyt.generic.data.us.data.US_Data;
import uk.ac.leeds.ccg.andyt.generic.data.us.io.US_Files;

/**
 *
 * @author geoagdt
 */
public class US_Environment extends US_OutOfMemoryErrorHandler
        implements Serializable {

    public transient Generic_Environment ge;
    public transient US_Strings Strings;
    public transient US_Files Files;
    
    /**
     * Data.
     */
    public US_Data data;

    public transient static final String EOL = System.getProperty("line.separator");

    public US_Environment() {
        //Memory_Threshold = 3000000000L;
        Strings = new US_Strings();
        Files = new US_Files(Strings);
        ge = new Generic_Environment(Files, Strings);
        File f;
        f = Files.getEnvDataFile();
        if (f.exists()) {
            loadData();
            data.Files = Files;
            data.Strings = Strings;
        } else {
            data = new US_Data(Files, Strings);
        }
    }

    /**
     * A method to try to ensure there is enough memory to continue.
     *
     * @return
     */
    @Override
    public boolean checkAndMaybeFreeMemory() {
        System.gc();
        while (getTotalFreeMemory() < Memory_Threshold) {
//            int clear = clearAllData();
//            if (clear == 0) {
//                return false;
//            }
            if (!swapDataAny()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean swapDataAny(boolean handleOutOfMemoryError) {
        try {
            boolean result = swapDataAny();
            checkAndMaybeFreeMemory();
            return result;
        } catch (OutOfMemoryError e) {
            if (handleOutOfMemoryError) {
                clearMemoryReserve();
                boolean result = swapDataAny(HOOMEF);
                initMemoryReserve();
                return result;
            } else {
                throw e;
            }
        }
    }

    /**
     * Currently this just tries to swap WaAS data.
     *
     * @return
     */
    @Override
    public boolean swapDataAny() {
        boolean r;
        r = clearSomeData();
        if (r) {
            return r;
        } else {
            System.out.println("No WaAS data to clear. Do some coding to try "
                    + "to arrange to clear something else if needs be. If the "
                    + "program fails then try providing more memory...");
            return r;
        }
    }

    public boolean clearSomeData() {
        //return data.clearSomeData();
        return false;
    }

    public int clearAllData() {
        int r;
        r = 0;
        //r = data.clearAllData();
        return r;
    }
    
    public void cacheData() {
        File f;
        f = Files.getEnvDataFile();
        System.out.println("<cache data>");
        Generic_IO.writeObject(data, f);
        System.out.println("</cache data>");
    }

    public final void loadData() {
        File f;
        f = Files.getEnvDataFile();
        System.out.println("<load data>");
        data = (US_Data) Generic_IO.readObject(f);
        System.out.println("<load data>");
    }
}
