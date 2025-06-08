package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzcek {
    public final Clock a;
    public final zzcev b;
    public final LinkedList c;
    public final Object d;
    public final String e;
    public final String f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;

    public zzcek(Clock clock0, zzcev zzcev0, String s, String s1) {
        this.d = new Object();
        this.g = -1L;
        this.h = -1L;
        this.i = 0L;
        this.j = -1L;
        this.k = -1L;
        this.a = clock0;
        this.b = zzcev0;
        this.e = s;
        this.f = s1;
        this.c = new LinkedList();
    }

    public final Bundle zza() {
        synchronized(this.d) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("seq_num", this.e);
            bundle0.putString("slotid", this.f);
            bundle0.putBoolean("ismediation", false);
            bundle0.putLong("treq", this.j);
            bundle0.putLong("tresponse", this.k);
            bundle0.putLong("timp", this.g);
            bundle0.putLong("tload", this.h);
            bundle0.putLong("pcc", this.i);
            bundle0.putLong("tfetch", -1L);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: this.c) {
                ((B2)object1).getClass();
                Bundle bundle1 = new Bundle();
                bundle1.putLong("topen", ((B2)object1).a);
                bundle1.putLong("tclose", ((B2)object1).b);
                arrayList0.add(bundle1);
            }
            bundle0.putParcelableArrayList("tclick", arrayList0);
            return bundle0;
        }
    }

    public final String zzc() {
        return this.e;
    }

    public final void zzd() {
        synchronized(this.d) {
            if(this.k != -1L) {
                B2 b20 = new B2(this);
                b20.a = this.a.elapsedRealtime();
                this.c.add(b20);
                ++this.i;
                this.b.zzd();
                this.b.zzc(this);
            }
        }
    }

    public final void zze() {
        synchronized(this.d) {
            if(this.k != -1L && !this.c.isEmpty()) {
                B2 b20 = (B2)this.c.getLast();
                if(b20.b == -1L) {
                    b20.b = b20.c.a.elapsedRealtime();
                    this.b.zzc(this);
                }
            }
        }
    }

    public final void zzf() {
        synchronized(this.d) {
            if(this.k != -1L && this.g == -1L) {
                this.g = this.a.elapsedRealtime();
                this.b.zzc(this);
            }
            this.b.zze();
        }
    }

    public final void zzg() {
        synchronized(this.d) {
            this.b.zzf();
        }
    }

    public final void zzh(boolean z) {
        synchronized(this.d) {
            if(this.k != -1L) {
                this.h = this.a.elapsedRealtime();
            }
        }
    }

    public final void zzi() {
        synchronized(this.d) {
            this.b.zzg();
        }
    }

    public final void zzj(zzl zzl0) {
        synchronized(this.d) {
            long v1 = this.a.elapsedRealtime();
            this.j = v1;
            this.b.zzh(zzl0, v1);
        }
    }

    public final void zzk(long v) {
        synchronized(this.d) {
            this.k = v;
            if(v != -1L) {
                this.b.zzc(this);
            }
        }
    }
}

