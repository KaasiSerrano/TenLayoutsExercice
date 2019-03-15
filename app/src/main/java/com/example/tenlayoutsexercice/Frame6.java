package com.example.tenlayoutsexercice;

import android.os.Bundle;
import android.widget.Button;

import com.example.tenlayoutsexercice.fragments.Frame6Fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class Frame6 extends FragmentActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout6);

        Frame6Fragment frag_name = new Frame6Fragment();
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().add(R.id.frameLayout6, frag_name, frag_name.getTag()).commit();
    }


}
