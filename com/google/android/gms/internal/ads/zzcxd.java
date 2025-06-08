package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcxd extends zzcvv {
    public final zzbms i;
    public final Runnable j;
    public final Executor k;

    public zzcxd(zzcxw zzcxw0, zzbms zzbms0, Runnable runnable0, Executor executor0) {
        super(zzcxw0);
        this.i = zzbms0;
        this.j = runnable0;
        this.k = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxx
    public final void zzW() {
        zzcxc zzcxc0 = new zzcxc(this, new zzcxb(new AtomicReference(this.j)));
        this.k.execute(zzcxc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final int zza() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final View zzc() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final zzdk zzd() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zze() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zzf() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final void zzg() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final void zzh(ViewGroup viewGroup0, zzq zzq0) {
    }
}

