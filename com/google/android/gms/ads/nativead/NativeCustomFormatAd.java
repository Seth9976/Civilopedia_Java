package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import java.util.List;

public interface NativeCustomFormatAd {
    public interface DisplayOpenMeasurement {
        void setView(View arg1);

        boolean start();
    }

    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomFormatAd arg1, String arg2);
    }

    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(NativeCustomFormatAd arg1);
    }

    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    void destroy();

    List getAvailableAssetNames();

    String getCustomFormatId();

    DisplayOpenMeasurement getDisplayOpenMeasurement();

    Image getImage(String arg1);

    CharSequence getText(String arg1);

    VideoController getVideoController();

    MediaView getVideoMediaView();

    void performClick(String arg1);

    void recordImpression();
}

