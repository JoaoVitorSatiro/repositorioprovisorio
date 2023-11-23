package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void btnvoltar2(View va) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void btnironman(View i){
        Intent intent = new Intent(this, MainActivityironman.class);
        startActivity(intent);
    }
    public void btnblackpanther(View bp){
        Intent intent = new Intent(this, MainActivitybp.class);
        startActivity(intent);
    }
}