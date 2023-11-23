package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void btnmarvel(View m) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void btndc(View d) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

    }
    public void btnvol2(View vol) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}