package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class zzcev implements zzbbg {
    public final Object a;
    public final zzg b;
    public final zzcet c;
    public final zzces d;
    public final HashSet e;
    public final HashSet f;
    public boolean g;

    public zzcev(String s, zzg zzg0) {
        this.a = new Object();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = false;
        this.d = new zzces(s, zzg0);
        this.b = zzg0;
        this.c = new zzcet();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbg
    public final void zza(boolean z) {
        long v = zzt.zzA().currentTimeMillis();
        zzces zzces0 = this.d;
        zzg zzg0 = this.b;
        if(z) {
            zzces0.d = v - zzg0.zzd() > ((long)(((Long)zzay.zzc().zzb(zzbhz.zzaN)))) ? -1 : zzg0.zzc();
            this.g = true;
            return;
        }
        zzg0.zzt(v);
        zzg0.zzJ(zzces0.d);
    }

    // 去混淆评级： 低(20)
    public final zzcek zzb(Clock clock0, String s) {
        return new zzcek(clock0, this, "1", s);
    }

    public final void zzc(zzcek zzcek0) {
        synchronized(this.a) {
            this.e.add(zzcek0);
        }
    }

    public final void zzd() {
        synchronized(this.a) {
            this.d.zzb();
        }
    }

    public final void zze() {
        synchronized(this.a) {
            this.d.zzc();
        }
    }

    public final void zzf() {
        synchronized(this.a) {
            this.d.zzd();
        }
    }

    public final void zzg() {
        synchronized(this.a) {
            this.d.zze();
        }
    }

    public final void zzh(zzl zzl0, long v) {
        synchronized(this.a) {
            this.d.zzf(zzl0, v);
        }
    }

    public final void zzi(HashSet hashSet0) {
        synchronized(this.a) {
            this.e.addAll(hashSet0);
        }
    }

    public final boolean zzj() {
        return this.g;
    }

    public final Bundle zzk(Context context0, zzfdi zzfdi0) {
        HashSet hashSet0 = new HashSet();
        synchronized(this.a) {
            hashSet0.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBundle("app", this.d.zza(context0, "0"));
        Bundle bundle1 = new Bundle();
        Iterator iterator0 = this.f.iterator();
        if(!iterator0.hasNext()) {
            bundle0.putBundle("slots", bundle1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: hashSet0) {
                arrayList0.add(((zzcek)object0).zza());
            }
            bundle0.putParcelableArrayList("ads", arrayList0);
            zzfdi0.zzc(hashSet0);
            return bundle0;
        }
        Object object1 = iterator0.next();
        zzceu zzceu0 = (zzceu)object1;
        throw null;
    }
}

