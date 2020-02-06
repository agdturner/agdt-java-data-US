package uk.ac.leeds.ccg.data.us.core;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import uk.ac.leeds.ccg.data.core.Data_Environment;
import uk.ac.leeds.ccg.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.generic.io.Generic_IO;
import uk.ac.leeds.ccg.data.us.data.US_Data;
import uk.ac.leeds.ccg.data.us.io.US_Files;
import uk.ac.leeds.ccg.generic.memory.Generic_MemoryManager;

/**
 * US_Environment
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class US_Environment extends Generic_MemoryManager {

    //public final transient Generic_Environment env;
    public final transient Data_Environment de;
    public transient Generic_Environment env;
    public transient US_Files files;
    public US_Data data;

    public transient static final String EOL = System.getProperty("line.separator");

    public US_Environment(Data_Environment de) throws IOException, Exception {
        this.de = de;
        this.env = de.env;
        files = new US_Files(Paths.get(de.files.getDataDir().toString(), 
                US_Strings.s_US));
        data = new US_Data(files);
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
            if (!swapSomeData()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean swapSomeData(boolean hoome) {
        try {
            boolean r = swapSomeData();
            checkAndMaybeFreeMemory();
            return r;
        } catch (OutOfMemoryError e) {
            if (hoome) {
                clearMemoryReserve(env);
                boolean r = US_Environment.this.swapSomeData(HOOMEF);
                initMemoryReserve(env);
                return r;
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
    public boolean swapSomeData() {
        boolean r = clearSomeData();
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
    
    public void cacheData() throws IOException {
        Path f = files.getEnvDataFile();
        Generic_IO.writeObject(data, f);
    }

    public final void loadData() throws IOException, ClassNotFoundException {
        Path f = files.getEnvDataFile();
        data = (US_Data) Generic_IO.readObject(f);
    }
}
