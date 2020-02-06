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
package uk.ac.leeds.ccg.data.us.core;

import java.io.Serializable;

/**
 * @author Andy Turner
 * @version 1.0.0
 */
public abstract class US_Object implements Serializable {

    /**
     * A reference to LR_Environment
     */
    public transient final US_Environment Env;

    public US_Object(US_Environment env) {
        Env = env;
    }
}
