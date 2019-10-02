package com.mhasancse.fbads.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdsManager;
import com.mhasancse.fbads.R;
import com.mhasancse.fbads.ads.RecycleViewNativeActivity;

import java.util.ArrayList;

public class NativeAdsDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final String TAG = "Example";
    private NativeAdsManager fbNativeManager;
    private final Context mContext;
    private ArrayList<Object> dataList;

    private ArrayList<NativeAd> nativeAd = new ArrayList<>();

    private final int ITEM_TYPE_DATA = 0;
    private final int ITEM_TYPE_AD = 1;

    private final int AD_POSITION = 4;
    private final int AD_POSITION_EVERY_COUNT = 5;

    private static final String  FB_NATIVE_AD_ID = "2143555465960810_2145707915745565";

    public NativeAdsDataAdapter(Context context, ArrayList<Object> mTargetData) {
        dataList = mTargetData;
        mContext = context;
        fbNativeManager = new NativeAdsManager(mContext, FB_NATIVE_AD_ID,8);
    }



    public void initNativeAds(){
        Log.i(TAG, "Size of adapter!" + dataList.size());
        fbNativeManager.setListener(new NativeAdsManager.Listener() {
            @Override
            public void onAdsLoaded() {
                Log.i(TAG, "onAdsLoaded!" + fbNativeManager.getUniqueNativeAdCount());

                int count = fbNativeManager.getUniqueNativeAdCount();
                for(int i=0; i< count; i ++) {
                    NativeAd ad = fbNativeManager.nextNativeAd();
                    addNativeAd(i, ad);
                }
            }

            @Override
            public void onAdError(AdError adError) {

            }
        });
        fbNativeManager.loadAds();
    }

    public void addNativeAd(int i, NativeAd ad) {
        if (ad == null) {
            return;
        }
        if (this.nativeAd.size() > i && this.nativeAd.get(i) != null) {
            this.nativeAd.get(i).unregisterView();
            this.dataList.remove(AD_POSITION + (i * AD_POSITION_EVERY_COUNT));
            this.nativeAd = null;
            this.notifyDataSetChanged();
        }
        this.nativeAd.add(i, ad);

        if(dataList.size() > (AD_POSITION + (i * AD_POSITION_EVERY_COUNT))) {
            dataList.add(AD_POSITION + (i * AD_POSITION_EVERY_COUNT), ad);
            notifyItemInserted(AD_POSITION + (i * AD_POSITION_EVERY_COUNT));
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(i == ITEM_TYPE_AD)
        {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_ads_row, viewGroup, false);
            return new NativeAdViewHolder( v );
        }else {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_ads_row_data, viewGroup, false);
            return new TargetViewHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {
        if(holder instanceof TargetViewHolder) {
            TargetViewHolder viewHolder = (TargetViewHolder) holder;
            String data = String.valueOf( dataList.get(i));
            viewHolder.txtTV.setText(data);
        }else{
            NativeAdViewHolder viewHolder = (NativeAdViewHolder) holder;
            NativeAd ad = (NativeAd) this.dataList.get(i);

            View mNativeView = NativeAdView.render(mContext, ad, NativeAdView.Type.HEIGHT_300);
            viewHolder.nativeAdContainer.removeAllViews();
            viewHolder.nativeAdContainer.addView(mNativeView);
        }
    }

    public int getDrawableName(String str){
        return mContext.getResources().getIdentifier(str,"drawable",mContext.getPackageName());
    }

    @Override
    public int getItemCount() {
        if(dataList == null)
            return 0;
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if( dataList.get(position) instanceof NativeAd)
            return ITEM_TYPE_AD;
        else
            return ITEM_TYPE_DATA;
    }


    public static class TargetViewHolder extends RecyclerView.ViewHolder {
        TextView txtTV;
        TargetViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTV= itemView.findViewById(R.id.txtTV);

        }
    }

    public static class NativeAdViewHolder extends RecyclerView.ViewHolder {
        LinearLayout nativeAdContainer;

        NativeAdViewHolder(@NonNull View itemView) {
            super(itemView);
            nativeAdContainer = itemView.findViewById(R.id.adContainer);
        }
    }
}