package org.pajacyk.travel.office;

public class Date {
    private int day;
    private int month;
    private int year;
    private String name;


    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int rok) {
        this.year = rok;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("%4d/%02d/%02d", year, month, day);
    }

    public static Date of(String s, String separator) {
        String[] array = s.split(separator);
        if (array.length != 3) {
            return null;
        }
        int year = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int day = Integer.parseInt(array[2]);
        return new Date(year, month, day);
    }

}
