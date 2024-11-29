package com.exammarcos.examenpmdm.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.exammarcos.examenpmdm.R;

import java.util.ArrayList;


public class PrimerFragment extends Fragment {

int contadorPulsaciones=0;



    public PrimerFragment() {
        // Required empty public constructor
    }

    ArrayList<String> nombres= new ArrayList<>();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        nombres.add("pumba");
        nombres.add("timon");
        nombres.add("scar");
        nombres.add("simon");
        nombres.add("simba");
        nombres.add("mufasa");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer, container, false);
    }
}