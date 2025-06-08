package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class zzrb implements zzsc {
    public final ArrayList a;
    public final HashSet b;
    public final zzsj c;
    public final zzpc d;
    public Looper e;
    public zzci f;
    public zzmu g;

    public zzrb() {
        this.a = new ArrayList(1);
        this.b = new HashSet(1);
        this.c = new zzsj();
        this.d = new zzpc();
    }

    public void a() {
    }

    public void b() {
    }

    public final void c(zzci zzci0) {
        this.f = zzci0;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zzsb)arrayList0.get(v1)).zza(this, zzci0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzci zzG() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzg(Handler handler0, zzpd zzpd0) {
        zzpd0.getClass();
        this.d.zzb(handler0, zzpd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzh(Handler handler0, zzsk zzsk0) {
        zzsk0.getClass();
        this.c.zzb(handler0, zzsk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzi(zzsb zzsb0) {
        this.b.remove(zzsb0);
        if(!this.b.isEmpty() && this.b.isEmpty()) {
            this.a();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzk(zzsb zzsb0) {
        this.e.getClass();
        this.b.add(zzsb0);
        if(this.b.isEmpty()) {
            this.b();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzm(zzsb zzsb0, zzfs zzfs0, zzmu zzmu0) {
        Looper looper0 = Looper.myLooper();
        zzcw.zzd(this.e == null || this.e == looper0);
        this.g = zzmu0;
        zzci zzci0 = this.f;
        this.a.add(zzsb0);
        if(this.e == null) {
            this.e = looper0;
            this.b.add(zzsb0);
            this.zzn(zzfs0);
            return;
        }
        if(zzci0 != null) {
            this.zzk(zzsb0);
            zzsb0.zza(this, zzci0);
        }
    }

    public abstract void zzn(zzfs arg1);

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzp(zzsb zzsb0) {
        this.a.remove(zzsb0);
        if(this.a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            this.zzq();
            return;
        }
        this.zzi(zzsb0);
    }

    public abstract void zzq();

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzr(zzpd zzpd0) {
        this.d.zzc(zzpd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzs(zzsk zzsk0) {
        this.c.zzm(zzsk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final boolean zzu() {
        return true;
    }
}

