package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void btnvoltar(View vo) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void btnaquaman(View a) {
        Intent intent = new Intent(this, MainActivityaquaman.class);
        startActivity(intent);
    }

    public void btnbatman(View b) {
        Intent intent = new Intent(this, MainActivitybatman.class);
        startActivity(intent);
    }
}