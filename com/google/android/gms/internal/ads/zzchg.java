package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

public final class zzchg {
    public final Context a;
    public final zzcli b;
    public final ViewGroup c;
    public zzchf d;

    public zzchg(Context context0, ViewGroup viewGroup0, zzcli zzcli0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.a = context0;
        this.c = viewGroup0;
        this.b = zzcli0;
        this.d = null;
    }

    public final zzchf zza() {
        return this.d;
    }

    public final void zzb(int v, int v1, int v2, int v3) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzchf zzchf0 = this.d;
        if(zzchf0 != null) {
            zzchf0.zzE(v, v1, v2, v3);
        }
    }

    public final void zzc(int v, int v1, int v2, int v3, int v4, boolean z, zzchq zzchq0) {
        if(this.d != null) {
            return;
        }
        zzbig.zza(this.b.zzo().zza(), this.b.zzn(), new String[]{"vpr2"});
        zzbio zzbio0 = this.b.zzo().zza();
        zzchf zzchf0 = new zzchf(this.a, this.b, v4, z, zzbio0, zzchq0);
        this.d = zzchf0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        this.c.addView(zzchf0, 0, viewGroup$LayoutParams0);
        this.d.zzE(v, v1, v2, v3);
        this.b.zzB(false);
    }

    public final void zzd() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzchf zzchf0 = this.d;
        if(zzchf0 != null) {
            zzchf0.zzn();
            this.c.removeView(this.d);
            this.d = null;
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzchf zzchf0 = this.d;
        if(zzchf0 != null) {
            zzchf0.zzt();
        }
    }

    public final void zzf(int v) {
        zzchf zzchf0 = this.d;
        if(zzchf0 != null) {
            zzchf0.zzB(v);
        }
    }
}

