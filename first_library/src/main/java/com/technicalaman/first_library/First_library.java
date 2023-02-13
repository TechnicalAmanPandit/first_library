package com.technicalaman.first_library;

import android.content.Context;
import android.widget.Toast;

public class First_library {

    public static void Toasty(Context context,String msg){

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
