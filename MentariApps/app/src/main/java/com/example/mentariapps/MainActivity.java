package com.example.mentariapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar RS
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }

    public void clickpolisi(View view) {
        //gambar polisi di click
        Intent i = new Intent(this,polisi.class);
        startActivity(i);
    }

    public void clicksupermarket(View view) {
        //gambar suoermarket di click
        Intent i = new Intent(this,supermarket.class);
        startActivity(i);
    }

    public void clicksekolah(View view) {
        //gambar sekolah di click
        Intent i = new Intent(this,sekolah.class);
        startActivity(i);
    }
}