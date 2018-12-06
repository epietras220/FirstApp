package org.pajacyk.travel.office;

public class Date {
    private int day;
    private int miesieac;
    private int rok;
    private String name;


    public Date(int rok, int miesiac, int day, String name){
        this.day = day;
        this.miesieac = miesiac;
        this.rok = rok;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMiesiac() {
        return miesieac;
    }

    public void setMiesiac(int miesieac) {
        this.miesieac = miesieac;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return ":" + "\n"+
                "day=" + day + '\''+
                "miesieac=" + miesieac + '\''+
                "rok=" + rok + '\''+
                "name='" + name + '\'' + "\n";
    }
}
