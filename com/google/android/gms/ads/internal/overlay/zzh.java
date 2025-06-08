package com.google.android.gms.ads.internal.overlay;

import E0.a;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcli;

@VisibleForTesting
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcli zzcli0) throws a {
        this.zzb = zzcli0.getLayoutParams();
        ViewParent viewParent0 = zzcli0.getParent();
        this.zzd = zzcli0.zzG();
        if(viewParent0 == null || !(viewParent0 instanceof ViewGroup)) {
            throw new a("Could not get the parent of the WebView for an overlay.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        this.zzc = (ViewGroup)viewParent0;
        this.zza = ((ViewGroup)viewParent0).indexOfChild(zzcli0.zzH());
        ((ViewGroup)viewParent0).removeView(zzcli0.zzH());
        zzcli0.zzap(true);
    }
}

