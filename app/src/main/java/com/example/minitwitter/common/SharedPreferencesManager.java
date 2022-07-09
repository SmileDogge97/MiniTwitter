package com.example.minitwitter.common;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.PublicKey;

public class SharedPreferencesManager {

    private static final String APP_SETTIGS_FILE = "APP_SETTINGS";

    private SharedPreferencesManager() {
    }

    private static SharedPreferences getSharedPreferences() {
        return MyApp.getContext().getSharedPreferences(APP_SETTIGS_FILE, Context.MODE_PRIVATE);
    }

    public static void setSomeStringValue(String dataLabel, String dataValue){
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(dataLabel, dataValue);
        editor.commit();
    }

    public static void setSomeBooleanValue(String dataLabel, boolean dataValue){
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putBoolean(dataLabel, dataValue);
        editor.commit();
    }

    public static String getSomeStringValue(String dataLabel){
        return getSharedPreferences().getString(dataLabel, null);
    }

    public static boolean getSomeBooleanValue(String dataLabel){
        return getSharedPreferences().getBoolean(dataLabel, false);
    }
}
