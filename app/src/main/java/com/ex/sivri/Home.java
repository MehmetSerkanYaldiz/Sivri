package com.ex.sivri;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Home extends AppCompatActivity {
    private AdView mAdView;
   CardView Koc, Boga, Ikizler, Yengec, Aslan, Basak, Terazi, Akrep, Yay, Oglak, Kova, Balık;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        InternetKontrol();
        tanımla();
        Listener();
    }
    public boolean InternetKontrol() {
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager.getActiveNetworkInfo() != null
                && manager.getActiveNetworkInfo().isAvailable()
                && manager.getActiveNetworkInfo().isConnected()) {

            return true;
        } else {
            LayoutInflater Inflater = getLayoutInflater();
            View view = Inflater.inflate(R.layout.alert, null);

            ImageView imageView=view.findViewById(R.id.alertImage);
            TextView textView = view.findViewById(R.id.alertTitle);
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setView(view);
            alert.setCancelable(false);
            final AlertDialog dialog = alert.create();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
            return false;
        }
    }

    public void tanımla() {
        Koc = findViewById(R.id.koc);
        Boga=findViewById(R.id.boga);
        Ikizler=findViewById(R.id.ikizler);
        Yengec=findViewById(R.id.yengeç);
        Aslan=findViewById(R.id.aslan);
        Basak=findViewById(R.id.basak);
        Terazi=findViewById(R.id.terazi);
        Akrep=findViewById(R.id.akrep);
        Yay=findViewById(R.id.yay);
        Oglak=findViewById(R.id.oglak);
        Kova=findViewById(R.id.kova);
        Balık=findViewById(R.id.balık);

    }public void Listener(){
        Koc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Koc.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });

        Boga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Boga.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);

            }
        });
        Ikizler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Ikizler.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Yengec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Yengec.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Aslan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Aslan.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Basak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Basak.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Terazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Terazi.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Akrep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Akrep.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Yay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Yay.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Oglak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Oglak.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Kova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Kova.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
        Balık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this, com.ex.sivri.Burclar.Balik.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });
    }

}
