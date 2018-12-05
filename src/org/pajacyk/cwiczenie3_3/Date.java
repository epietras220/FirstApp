package org.pajacyk.cwiczenie3_3;

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

    public void getInfo(){
        System.out.println("Informacje o obiekcie:" + getName());
        System.out.println("Dzień: " + getDay() + "Miesiąc: " + getMiesiac() + "Rok: " + getRok());
    }


}
