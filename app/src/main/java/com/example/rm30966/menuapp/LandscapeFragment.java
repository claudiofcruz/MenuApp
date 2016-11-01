package com.example.rm30966.menuapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rm30966 on 31/10/2016.
 */
public class LandscapeFragment extends Fragment
{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance)
    {
        return inflater.inflate(R.layout.l_fragment, container, false);
    }
}
