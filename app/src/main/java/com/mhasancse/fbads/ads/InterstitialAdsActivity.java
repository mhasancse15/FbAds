package com.mhasancse.fbads.ads;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.mhasancse.fbads.R;

public class InterstitialAdsActivity extends AppCompatActivity {
    private AdView adView;
    private Ad adfacebook;
    private com.facebook.ads.InterstitialAd interstitialAd;

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial_ads);
        AudienceNetworkAds.initialize(this);

        loadInterstitialAds();
    }

    private void loadInterstitialAds() {
        interstitialAd = new com.facebook.ads.InterstitialAd(InterstitialAdsActivity.this, getString(R.string.fb_interstitial_ads));
        interstitialAd.setAdListener(new AbstractAdListener() {
            public void onAdLoaded(Ad ad) {
                adfacebook = ad;

               /* //On Create Ads Show
                if (adfacebook == interstitialAd) {
                    interstitialAd.show();
                }*/
            }
        });
        interstitialAd.loadAd();

    }

    // facebook Ads
    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        //OnBack Press Ads Show
        if (adfacebook == interstitialAd) {
            interstitialAd.show();
        }
        super.onBackPressed();
    }


}
