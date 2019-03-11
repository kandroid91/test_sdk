package com.example.mylibrary;

import android.util.Log;

public class LibraryClass {
    public void prcess() {
        try {
            int a = 10;
            int b = a * 5 / 10;
            String str = "test";
            str = str.substring(2);
            Log.d("test", str);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
