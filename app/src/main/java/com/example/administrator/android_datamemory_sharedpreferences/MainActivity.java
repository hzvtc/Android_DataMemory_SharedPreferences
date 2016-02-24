package com.example.administrator.android_datamemory_sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String COLUM_NAME="name";
    public static final String COLUM_MOBILE="mobile";

    private SharePreferencesHelper sph;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sph=new SharePreferencesHelper(this,"contacts");

        sph.setValue(COLUM_NAME,"111");
        sph.setValue(COLUM_MOBILE,"111");

        String name = sph.getValue(COLUM_NAME);
        String mobile=sph.getValue(COLUM_MOBILE);
        mTextView=(TextView)findViewById(R.id.mTextView);
        mTextView.setText(name+"\n"+mobile);
    }
}
