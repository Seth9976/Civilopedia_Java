package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbua;

@KeepForSdk
public class LiteSdkInfo extends zzci {
    public LiteSdkInfo(Context context0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcj
    public zzbua getAdapterCreator() {
        return new zzbtx();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcj
    public zzeh getLiteSdkVersion() {
        return new zzeh(221908400, 221908000, "21.1.0");
    }
}

