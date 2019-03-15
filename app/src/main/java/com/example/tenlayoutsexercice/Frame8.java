package com.example.tenlayoutsexercice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.tenlayoutsexercice.fragments.Frame8Fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class Frame8 extends FragmentActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout8);

        Frame8Fragment frag_name = new Frame8Fragment();
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().add(R.id.frameLayout8, frag_name, frag_name.getTag()).commit();
    }


    public void changeActivity() {
        startActivity(new Intent(Frame8.this, Fragment9.class));

    }
}
