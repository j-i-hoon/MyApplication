package com.example.kimkim2.myapplication;

/**
 * Created by kimkim2 on 2016-09-06.
 */

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.Window;


/**
 * @설명 : 보관함 Activity
 * @클래스명 : StorageActivity
 *
 */
public class StorageActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.activity_storage);
    }

}