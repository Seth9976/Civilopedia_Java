package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class m1 implements zzayv {
    public final Uri a;
    public final zzayj b;
    public final S8 c;
    public final zzazb d;
    public final zzaub e;
    public volatile boolean f;
    public boolean g;
    public long h;
    public long i;
    public final o1 j;

    public m1(o1 o10, Uri uri0, zzayj zzayj0, S8 s80, zzazb zzazb0) {
        this.j = o10;
        uri0.getClass();
        this.a = uri0;
        zzayj0.getClass();
        this.b = zzayj0;
        s80.getClass();
        this.c = s80;
        this.d = zzazb0;
        this.e = new zzaub();
        this.g = true;
        this.i = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzayv
    public final void zzb() {
        this.f = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzayv
    public final void zzc() {
        int v5;
        long v4;
        zzatw zzatw0;
        zzatv zzatv0;
        long v3;
        int v;
        while(!this.f) {
            try {
                v = 0;
                long v1 = this.e.zza;
                zzayl zzayl0 = new zzayl(this.a, null, this.e.zza, this.e.zza, -1L, null, 0);
                long v2 = this.b.zzb(zzayl0);
                this.i = v2;
                if(v2 == -1L) {
                    v3 = v1;
                }
                else {
                    v3 = v1;
                    v2 += v3;
                    this.i = v2;
                }
                zzatv0 = new zzatv(this.b, v3, v2);
            }
            catch(Throwable throwable0) {
                zzatv0 = null;
                goto label_40;
            }
            try {
                Uri uri0 = this.b.zzc();
                zzatw0 = this.c.a(zzatv0, uri0);
                if(this.g) {
                    zzatw0.zze(v3, this.h);
                    this.g = false;
                }
                v4 = v3;
                v5 = 0;
            }
            catch(Throwable throwable0) {
                goto label_40;
            }
            while(v5 == 0) {
                try {
                    if(!this.f) {
                        this.d.zza();
                        v5 = zzatw0.zzf(zzatv0, this.e);
                        if(zzatv0.zzd() <= this.j.o + v4) {
                            continue;
                        }
                        v4 = zzatv0.zzd();
                        this.d.zzb();
                        this.j.u.post(this.j.t);
                        continue;
                    }
                    v5 = 0;
                    break;
                }
                catch(Throwable throwable0) {
                    v = v5;
                }
            label_40:
                if(v != 1 && zzatv0 != null) {
                    this.e.zza = zzatv0.zzd();
                }
                zzazo.zzm(this.b);
                throw throwable0;
            }
            if(v5 != 1) {
                this.e.zza = zzatv0.zzd();
                v = v5;
            }
            zzazo.zzm(this.b);
            if(v != 0) {
                return;
            }
            if(false) {
                break;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayv
    public final boolean zze() {
        return this.f;
    }
}

