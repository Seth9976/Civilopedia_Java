package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

public final class zzfek {
    public final zzfdo a;
    public final zzfei b;
    public final ArrayDeque c;
    public zzfeq d;
    public int e;

    public zzfek(zzfdo zzfdo0, zzfdk zzfdk0, zzfei zzfei0) {
        this.e = 1;
        this.a = zzfdo0;
        this.b = zzfei0;
        this.c = new ArrayDeque();
        zzfdk0.zzb(new zzfef(this));
    }

    public final void a() {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzfm)).booleanValue() && !zzt.zzo().zzh().zzh().zzh()) {
                this.c.clear();
                return;
            }
            if(this.b()) {
                while(!this.c.isEmpty()) {
                    zzfej zzfej0 = (zzfej)this.c.pollFirst();
                    if(zzfej0 != null) {
                        if(zzfej0.zza() == null) {
                            continue;
                        }
                        zzfdy zzfdy0 = zzfej0.zza();
                        if(this.a.zze(zzfdy0)) {
                            goto label_17;
                        }
                        continue;
                    }
                label_17:
                    zzfeq zzfeq0 = new zzfeq(this.a, this.b, zzfej0);
                    this.d = zzfeq0;
                    zzfeq0.zzd(new Q(this, zzfej0, 12, false));
                    return;
                }
            }
        }
    }

    public final boolean b() {
        synchronized(this) {
        }
        return this.d == null;
    }

    public final zzfvl zza(zzfej zzfej0) {
        synchronized(this) {
            this.e = 2;
            return this.b() ? null : this.d.zza(zzfej0);
        }
    }

    public final void zze(zzfej zzfej0) {
        synchronized(this) {
            this.c.add(zzfej0);
        }
    }
}

