package com.example.startupzilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlankFragment3 extends Fragment {

    private BlankViewModel mViewModel;

    public static BlankFragment3 newInstance() {
        return new BlankFragment3();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.blank_fragment3, container, false);
    }
    

}