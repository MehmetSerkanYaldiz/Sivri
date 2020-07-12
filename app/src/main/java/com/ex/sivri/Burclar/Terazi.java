package com.ex.sivri.Burclar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ex.sivri.Adapter;
import com.ex.sivri.Models.Bilgiler;
import com.ex.sivri.Models.Model;
import com.ex.sivri.R;
import com.ex.sivri.RestApi.ManagerAll;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Terazi extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    String ask, kariyer, maddi, genel;
    private AdView teraziAdview;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terazi);
        teraziAdview = findViewById(R.id.teraziAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        teraziAdview.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1617152789997444/9791532528");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        istek();

    }
    @Override
    public void onBackPressed() {
        mInterstitialAd.show();
        super.onBackPressed();
    }
    public void istek(){
        LayoutInflater Inflater = getLayoutInflater();
        View view = Inflater.inflate(R.layout.dialog, null);

        ProgressBar progressBar = view.findViewById(R.id.progress);
        TextView textView = view.findViewById(R.id.Ptext);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(view);
        alert.setCancelable(false);
        final AlertDialog dialog = alert.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        Call<Bilgiler> teraziBilgiList= ManagerAll.getInstance().teraziBilgileri();
        teraziBilgiList.enqueue(new Callback<Bilgiler>() {
            @Override
            public void onResponse(Call<Bilgiler> call, Response<Bilgiler> response) {
                if (response.isSuccessful()) {
                    genel = (response.body().getGenel());
                    ask = (response.body().getAsk());
                    maddi = (response.body().getMaddi());
                    kariyer = (response.body().getKariyer());

                    models = new ArrayList<>();
                    models.add(new Model(R.drawable.terazi, "Terazi Burcu Günlük  Genel Yorum", "" + genel));
                    models.add(new Model(R.drawable.terazi, "Terazi Burcu Günlük Aşk & İlişkiler Yorumu", "" + ask));
                    models.add(new Model(R.drawable.terazi, "Terazi Burcu Maddi Durum Yorumu", "" + maddi));
                    models.add(new Model(R.drawable.terazi, "Terazi Burcu Günlük Kariyer Yorumu", "" + kariyer));
                    adapter = new Adapter(models, getApplicationContext());
                    viewPager = findViewById(R.id.ViewPager);
                    viewPager.setAdapter(adapter);
                    viewPager.setPadding(130, 0, 130, 0);
                }
                dialog.cancel();
            }

            @Override
            public void onFailure(Call<Bilgiler> call, Throwable t) {

            }
        });
    }
}
