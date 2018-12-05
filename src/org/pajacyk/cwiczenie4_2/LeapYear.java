package org.pajacyk.cwiczenie4_2;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if ((year / 4) == 0
                && (year / 100 != 0)
                || (year / 400 == 0)) {
            return true;
        }
        return false;
    }
}
