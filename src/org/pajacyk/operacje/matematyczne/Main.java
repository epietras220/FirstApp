package org.pajacyk.operacje.matematyczne;

public class Main {
    public static void main(String[] args) {
       // int x = -8;
       // int suma = x + 3;
//        while (true){
//            if (false){
//                break;
//            }
//        }
//        System.out.println("outside");

//        x = -x;
//        double iloraz1= x/4;
//        double iloraz2= x/4.0;
//        //double iloraz3= x/0;
//        double iloraz4= x/0.0;
//        double iloraz5= 0/0.0;

//        int x =5;
//        int y = x++;
//        System.out.println(~101);
//        System.out.println(y);
        int [][] table;
        table = new int[][]{{1, 2}, {3, 4}, {5, 6}};

        for (int i =0;i<table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + ",");
            }
        }
        System.out.println("");
            for (int[]z:table){
                for(int elem:z){
                    System.out.print(elem+",");
                }
            }
        }




//        System.out.println(iloraz1);
//        System.out.println(iloraz2);
//       // System.out.println(iloraz3);
//        System.out.println(iloraz4);
//        System.out.println(iloraz5);
   }
