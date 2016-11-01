package com.example.rm30966.menuapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class OrientationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            LandscapeFragment ls_fragment = new LandscapeFragment();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }
        else
        {
            PortraitFragment po_fragment = new PortraitFragment();
            fragmentTransaction.replace(android.R.id.content, po_fragment);
        }

        fragmentTransaction.commit();
        //setContentView(R.layout.activity_orientation);
    }
}
