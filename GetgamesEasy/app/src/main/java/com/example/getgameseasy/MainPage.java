package com.example.getgameseasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void Enviarparapagetop(View view) {
        Intent intent=new Intent(this,Pagetoptrendinggames.class);
        startActivity(intent);
    }

    public void Enviarpromotionpage(View view) {
        Intent intent=new Intent(this,PromotionPage.class);
        startActivity(intent);
    }
}