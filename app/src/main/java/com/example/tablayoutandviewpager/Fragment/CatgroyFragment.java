package com.example.tablayoutandviewpager.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tablayoutandviewpager.R;


public class CatgroyFragment extends Fragment {

    private static final String ARG_ID = "id";
    private static final String ARG_Name = "name";


    private int id;
    private String name;

    public CatgroyFragment() {
        // Required empty public constructor
    }


    public static CatgroyFragment newInstance (int ID, String Name) {
        CatgroyFragment fragment = new CatgroyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ID,ID );
        args.putString(ARG_Name, Name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getInt(ARG_ID);
            name = getArguments().getString(ARG_Name);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_catgroy, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tv= view.findViewById(R.id.TV);
        tv.setText(id+" : "+name);
    }
}