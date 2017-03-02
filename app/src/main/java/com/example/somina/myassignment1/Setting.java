package com.example.somina.myassignment1;

import android.preference.PreferenceActivity;
import android.os.Bundle;


public class Setting extends PreferenceActivity {

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState)    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.user_setting);
    }

}

