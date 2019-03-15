package com.example.tenlayoutsexercice.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tenlayoutsexercice.Frame6;
import com.example.tenlayoutsexercice.Frame7;
import com.example.tenlayoutsexercice.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frame6Fragment extends Fragment implements View.OnClickListener {
Frame6 frame6;
    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.layout6fragment, container, false);

        Button b =  v.findViewById(R.id.button6);
        b.setOnClickListener(this);
        return v;
    }
        @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button6:
                startActivity(new Intent(getActivity(), Frame7.class));
                break;
        }
    }
}



