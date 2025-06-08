package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;

public final class zzdox implements zzbom {
    public final zzdpa zza;
    public final WindowManager zzb;
    public final View zzc;

    public zzdox(zzdpa zzdpa0, WindowManager windowManager0, View view0) {
        this.zza = zzdpa0;
        this.zzb = windowManager0;
        this.zzc = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzdpa zzdpa0 = this.zza;
        WindowManager windowManager0 = this.zzb;
        View view0 = this.zzc;
        zzdpa0.getClass();
        zzcfi.zze("Hide native ad policy validator overlay.");
        ((zzcli)object0).zzH().setVisibility(8);
        if(((zzcli)object0).zzH().getWindowToken() != null) {
            windowManager0.removeView(((zzcli)object0).zzH());
        }
        ((zzcli)object0).destroy();
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        if(zzdpa0.c != null && viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnScrollChangedListener(zzdpa0.c);
        }
    }
}

