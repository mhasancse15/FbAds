package com.mhasancse.fbads;

import android.app.NativeActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mhasancse.fbads.ads.BannerAdsActivity;
import com.mhasancse.fbads.ads.InterstitialAdsActivity;
import com.mhasancse.fbads.ads.NativeAdsActivity;
import com.mhasancse.fbads.ads.NativeBannerAdActivity;
import com.mhasancse.fbads.ads.RecycleViewNativeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bannerAdsFB(View view) {
        Intent i=new Intent(MainActivity.this, BannerAdsActivity.class);
        startActivity(i);
    }

    public void interstitialAdsShow(View view) {
        Intent i=new Intent(MainActivity.this, InterstitialAdsActivity.class);
        startActivity(i);
    }

    public void nativeBannerAds(View view) {
        Intent i=new Intent(MainActivity.this, NativeBannerAdActivity.class);
        startActivity(i);
    }

    public void nativeAds(View view) {
        Intent i=new Intent(MainActivity.this, NativeAdsActivity.class);
        startActivity(i);
    }

    public void recycleViewNativeAds(View view) {
        Intent i=new Intent(MainActivity.this, RecycleViewNativeActivity.class);
        startActivity(i);
    }
}
