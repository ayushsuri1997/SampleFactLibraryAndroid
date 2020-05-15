package com.example.factcallib;

import android.util.Log;

public class Factorial {


    public static void fact(int n){
        int facto = 1;
        if(n == 0){
            Log.d("tag",String.valueOf(1));
        }
        else {
            for(int i=n;i>0;i--){
                facto = facto * i;
            }
            Log.d("tag",String.valueOf(facto));
        }
    }
}
