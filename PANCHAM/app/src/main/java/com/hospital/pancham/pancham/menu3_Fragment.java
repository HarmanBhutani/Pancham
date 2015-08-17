package com.hospital.pancham.pancham;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Harman Bhutani on 8/15/2015.
 */
public class menu3_Fragment extends android.support.v4.app.Fragment {
     View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.menu3_layout,container,false);
        return rootview;
    }
}
