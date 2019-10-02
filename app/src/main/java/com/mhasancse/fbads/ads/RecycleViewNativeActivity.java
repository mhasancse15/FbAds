package com.mhasancse.fbads.ads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.mhasancse.fbads.R;
import com.mhasancse.fbads.adapter.NativeAdsDataAdapter;

import java.util.ArrayList;

public class RecycleViewNativeActivity extends AppCompatActivity {

    private static final String TAG = "RecycleViewNativeActivity";



    ArrayList<Object> mTargetData = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private NativeAdsDataAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_native);

        AudienceNetworkAds.initialize(this);
        initView();
        initImageBitmaps();
        fetchData();
    }

    private void initImageBitmaps() {

        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
 mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
 mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
 mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");
        mTargetData.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n");


        initView();
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new NativeAdsDataAdapter(this, mTargetData);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void fetchData() {
        for (int i = 0; i < mTargetData.size(); i++) {
            // mTargetData.add("jhjdfhbjds");
        }
        mAdapter.notifyDataSetChanged();
        mAdapter.initNativeAds();

    }
}
