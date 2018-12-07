package org.pajacyk.debugerexample;

public class Main {
    static final String POLE_KLASY_MATH = "Some static value";
    String poleObiektowWKlasieField = "pole obiektu";

    static String returnFirstElementFromTable (String[] table){
        return table[0];
    }

    public static void main(String[] args) {
        String[] s = {"A", "B", "C"};
        args =s;
        Person[] people = {new Person("Ala", "Kowalska", 940608120),
                new Person("", "Nowak", 124585124),
                null,
                new Person("Piotr", "", null)};
        for (Person person : people){
            System.out.println( person.pesel);
        }
    }
}
