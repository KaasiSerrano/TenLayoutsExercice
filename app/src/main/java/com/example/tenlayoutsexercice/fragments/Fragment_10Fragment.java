package com.example.tenlayoutsexercice.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tenlayoutsexercice.Fragment9;
import com.example.tenlayoutsexercice.Fragment_10;
import com.example.tenlayoutsexercice.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_10Fragment extends Fragment {
    Button btn;
    Fragment9 frag9;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_10fragment, container, false);

        btn=view.findViewById(R.id.button_10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), Fragment_10.class );
                startActivity(intent);
            }
        });
        return view;
    }



}
