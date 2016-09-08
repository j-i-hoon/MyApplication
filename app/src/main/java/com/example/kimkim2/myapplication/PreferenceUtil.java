package com.example.kimkim2.myapplication;

/**
 * Created by kimkim2 on 2016-09-06.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * @설명 : Preference Util
 * @클래스명 : PreferenceUtil
 *
 */
public class PreferenceUtil {

    /**
     * gps 활성화 다이얼로그 한번만 띄우도록 하는 Method
     */
    public static void setGPSDialogShown(Context context){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isGPSDialogShown", true);
        editor.commit();

    }
    /**
     * gps 활성화 다이얼로그 띄웠는지 여부 확인 Method
     * @return
     */
    public static boolean getGPSDialogShown(Context context){

        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("isGPSDialogShown", false);
    }


}