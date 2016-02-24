package com.example.administrator.android_datamemory_sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/2/24.
 */
public class SharePreferencesHelper {
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    Context context;

    public SharePreferencesHelper(Context mContext, String name) {
        context = mContext;
        sp = context.getSharedPreferences(name, 0);
        editor = sp.edit();
    }


    public void setValue(String key, String value) {
        editor=sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getValue(String key) {
        return sp.getString(key, null);
    }
}
