package com.example.panjibs.ootd;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {
    private  static  List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.baju1);
        add(R.drawable.baju2);
        add(R.drawable.baju3);
        add(R.drawable.baju4);
        add(R.drawable.baju5);
    }};

    //Variabel ini adalah pengelompokan untuk kaki , dan menyimpan data
    private  static  List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.celana1);
        add(R.drawable.celana2);
        add(R.drawable.celana3);
        add(R.drawable.celana4);
        add(R.drawable.celana5);

    }};

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel body
    public static List<Integer> getBodies(){
        return bodies;
    }

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel leg
    public static List<Integer> getLegs(){
        return legs;
    }


}

