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
package uk.ac.leeds.ccg.data.us.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import uk.ac.leeds.ccg.data.io.Data_Files;

/**
 * US_Files
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class US_Files extends Data_Files {

    /**
     * @param dir The directory.
     * @throws java.io.IOException If encountered.
     */
    public US_Files(Path dir) throws IOException {
        super(dir);
    }

    public Path getInputDataDir(String s) throws IOException {
        return Paths.get(getInputDir().toString(), s);
    }

    public Path getUSInputDir() throws IOException {
        Path r = getInputDir();
        r = Paths.get(r.toString(), "UKDA-6614-tab", "tab");
        return r;
    }

    public Path getGeneratedUSSubsetsDir() throws IOException {
        Path f = Paths.get(getGeneratedDir().toString(), "Subsets");
        Files.createDirectories(f);
        return f;
    }
    
}
