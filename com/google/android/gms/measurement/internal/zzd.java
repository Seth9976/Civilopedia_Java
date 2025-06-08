package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.u9;
import i1.a;
import i1.j;
import p.b;
import p.h;

public final class zzd extends j {
    public final b b;
    public final b c;
    public long d;

    public zzd(zzge zzge0) {
        super(zzge0);
        this.c = new b();  // 初始化器: Lp/k;-><init>()V
        this.b = new b();  // 初始化器: Lp/k;-><init>()V
    }

    public final void a(long v, zziq zziq0) {
        zzge zzge0 = this.a;
        if(zziq0 == null) {
            zzge0.zzay().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            zzge0.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_xt", v);
        zzln.zzK(zziq0, bundle0, true);
        zzge0.zzq().c("am", "_xa", bundle0);
    }

    public final void b(String s, long v, zziq zziq0) {
        zzge zzge0 = this.a;
        if(zziq0 == null) {
            zzge0.zzay().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            zzge0.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s);
        bundle0.putLong("_xt", v);
        zzln.zzK(zziq0, bundle0, true);
        zzge0.zzq().c("am", "_xu", bundle0);
    }

    public final void c(long v) {
        b b0 = this.b;
        for(Object object0: ((h)b0.keySet())) {
            b0.put(((String)object0), v);
        }
        if(!b0.isEmpty()) {
            this.d = v;
        }
    }

    public final void zzd(String s, long v) {
        zzge zzge0 = this.a;
        if(s != null && s.length() != 0) {
            zzge0.zzaz().zzp(new a(this, s, v, 0));
            return;
        }
        u9.o(zzge0, "Ad unit id must be a non-empty string");
    }

    public final void zze(String s, long v) {
        zzge zzge0 = this.a;
        if(s != null && s.length() != 0) {
            zzge0.zzaz().zzp(new a(this, s, v, 1));
            return;
        }
        u9.o(zzge0, "Ad unit id must be a non-empty string");
    }

    public final void zzf(long v) {
        zziq zziq0 = this.a.zzs().zzj(false);
        b b0 = this.b;
        for(Object object0: ((h)b0.keySet())) {
            this.b(((String)object0), v - ((long)(((Long)b0.getOrDefault(((String)object0), null)))), zziq0);
        }
        if(!b0.isEmpty()) {
            this.a(v - this.d, zziq0);
        }
        this.c(v);
    }
}

