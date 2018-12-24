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

import java.io.Serializable;

/**
 *
 * @author geoagdt
 */
public class US_ID implements Comparable, Serializable {

    private final int PIDP;

    public US_ID(int PIDP) {
        this.PIDP = PIDP;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof US_ID) {
            US_ID o2 = (US_ID) o;
            if (PIDP > o2.PIDP) {
                return 1;
            } else {
                if (PIDP < o2.PIDP) {
                    return -1;
                }
                return 0;
            }
        }
        return -2;
    }

    /**
     * @return the PIDP
     */
    public int getPIDP() {
        return PIDP;
    }

    @Override
    public String toString() {
        return "PIDP " + PIDP;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof US_ID) {
            US_ID o2;
            o2 = (US_ID) o;
            if (PIDP == o2.PIDP) {
                    return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.PIDP;
        return hash;
    }

}
