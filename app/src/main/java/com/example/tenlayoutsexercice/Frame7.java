package com.example.tenlayoutsexercice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.tenlayoutsexercice.fragments.Frame7Fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class Frame7 extends FragmentActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout7);

        Frame7Fragment frag_name = new Frame7Fragment();
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().add(R.id.frameLayout7, frag_name, frag_name.getTag()).commit();
    }


    public void changeActivity() {
        startActivity(new Intent(Frame7.this, Frame8.class));

    }
}
