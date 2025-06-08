package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class zzcju implements Releasable {
    public final Context i;
    public final String j;
    public final WeakReference k;

    public zzcju(zzchr zzchr0) {
        Context context0 = zzchr0.getContext();
        this.i = context0;
        this.j = zzt.zzp().zzc(context0, zzchr0.zzp().zza);
        this.k = new WeakReference(zzchr0);
    }

    public static void a(zzcju zzcju0, HashMap hashMap0) {
        zzchr zzchr0 = (zzchr)zzcju0.k.get();
        if(zzchr0 != null) {
            zzchr0.zzd("onPrecacheEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzb();

    @VisibleForTesting
    public final void zzc(String s, String s1, String s2, String s3) {
        d3 d30 = new d3(this, s, s1, s2, s3, 0);
        zzcfb.zza.post(d30);
    }

    @VisibleForTesting
    public final void zze(String s, String s1, long v) {
        c3 c30 = new c3(this, s, s1, v);
        zzcfb.zza.post(c30);
    }

    @VisibleForTesting
    public final void zzf(String s, String s1, int v, int v1, long v2, long v3, boolean z, int v4, int v5) {
        a3 a30 = new a3(this, s, s1, v, v1, v2, v3, z, v4, v5);
        zzcfb.zza.post(a30);
    }

    @VisibleForTesting
    public final void zzg(String s, String s1, long v, long v1, boolean z, long v2, long v3, long v4, int v5, int v6) {
        Z2 z20 = new Z2(this, s, s1, v, v1, v2, v3, v4, z, v5, v6);
        zzcfb.zza.post(z20);
    }

    public void zzh(int v) {
    }

    public void zzn(int v) {
    }

    public void zzo(int v) {
    }

    public void zzp(int v) {
    }

    public abstract boolean zzq(String arg1);

    public boolean zzr(String s, String[] arr_s) {
        return this.zzq(s);
    }

    public boolean zzs(String s, String[] arr_s, zzcjm zzcjm0) {
        return this.zzq(s);
    }
}

