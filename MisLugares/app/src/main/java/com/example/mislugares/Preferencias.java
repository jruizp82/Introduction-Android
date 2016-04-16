package com.example.mislugares;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Ruiz on 26/04/2015.
 */
public class Preferencias extends PreferenceActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
