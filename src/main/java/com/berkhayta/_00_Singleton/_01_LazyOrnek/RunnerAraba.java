package com.berkhayta._00_Singleton._01_LazyOrnek;

import java.util.ArrayList;

public class RunnerAraba {
    public static void main(String[] args) {
       /* //3 tane farklı araba nesnesi ürettim:
        Araba a1 = new Araba();
        Araba a2 = new Araba();
        Araba a3 = new Araba();
        //Bu 3 farklı nesnenin hashcode'ları birbirinden farklı olarak gelir.
        //Bu da bize her seferinde yeni bir nesne üretildiğini gösterir.
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("-------------------------------------");
        Araba a4=new Araba();
        System.out.println(a4);
        a4=new Araba();
        System.out.println(a4);
        a4=new Araba();
        System.out.println(a4);*/

        ArrayList<Araba> arabaArrayList=new ArrayList<>();



        Araba a1=Araba.getInstance("Audi");
        arabaArrayList.add(a1);
        System.out.println(a1);

        a1=Araba.getInstance("BWM");
        arabaArrayList.add(a1);
        System.out.println(a1);

        a1=Araba.getInstance("Mercedes");
        arabaArrayList.add(a1);
        System.out.println(a1);

        for (Araba araba : arabaArrayList) {
            System.out.println(araba.getMarka());
        }

    }
}
