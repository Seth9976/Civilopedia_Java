package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;

public final class zzdov implements ViewTreeObserver.OnScrollChangedListener {
    public final View zza;
    public final zzcli zzb;
    public final String zzc;
    public final WindowManager.LayoutParams zzd;
    public final int zze;
    public final WindowManager zzf;

    public zzdov(View view0, zzcli zzcli0, String s, WindowManager.LayoutParams windowManager$LayoutParams0, int v, WindowManager windowManager0) {
        this.zza = view0;
        this.zzb = zzcli0;
        this.zzc = s;
        this.zzd = windowManager$LayoutParams0;
        this.zze = v;
        this.zzf = windowManager0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        zzcli zzcli0 = this.zzb;
        String s = this.zzc;
        WindowManager.LayoutParams windowManager$LayoutParams0 = this.zzd;
        int v = this.zze;
        WindowManager windowManager0 = this.zzf;
        Rect rect0 = new Rect();
        if(this.zza.getGlobalVisibleRect(rect0) && zzcli0.zzH().getWindowToken() != null) {
            windowManager$LayoutParams0.y = "1".equals(s) || "2".equals(s) ? rect0.bottom - v : rect0.top - v;
            windowManager0.updateViewLayout(zzcli0.zzH(), windowManager$LayoutParams0);
        }
    }
}

