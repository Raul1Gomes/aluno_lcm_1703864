package com.example.getgameseasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PromotionPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_page);
    }

    public void Voltarmainpage2(View view) {
        Intent intent=new Intent(this,MainPage.class);
        startActivity(intent);
    }
}