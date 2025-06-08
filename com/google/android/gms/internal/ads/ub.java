package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

public final class ub implements zzrp, zzwf {
    public final long a;
    public final Uri b;
    public final zzfr c;
    public final zzrd d;
    public final xb e;
    public final zzcz f;
    public final zzzr g;
    public volatile boolean h;
    public boolean i;
    public long j;
    public zzev k;
    public long l;
    public zztp m;
    public boolean n;
    public final xb o;

    public ub(xb xb0, Uri uri0, zzeq zzeq0, zzrd zzrd0, xb xb1, zzcz zzcz0) {
        this.o = xb0;
        this.b = uri0;
        this.c = new zzfr(zzeq0);
        this.d = zzrd0;
        this.e = xb1;
        this.f = zzcz0;
        this.g = new zzzr();
        this.i = true;
        this.l = -1L;
        this.a = zzrr.zza();
        zzet zzet0 = new zzet();
        zzet0.zzd(uri0);
        zzet0.zzc(0L);
        zzet0.zza(6);
        zzet0.zzb(xb.R);
        this.k = zzet0.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzrp
    public final void zza(zzdy zzdy0) {
        long v = this.n ? Math.max(this.o.b(), this.j) : this.j;
        int v1 = zzdy0.zza();
        zztp zztp0 = this.m;
        zztp0.getClass();
        zzzw.zzb(zztp0, zzdy0, v1);
        zztp0.zzs(v, 1, v1, 0, null);
        this.n = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzwf
    public final void zzh() {
        this.h = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzwf
    public final void zzi() {
        int v9;
        long v8;
        zzfr zzfr1;
        int v6;
        int v5;
        boolean z1;
        String s3;
        String s2;
        String s1;
        int v4;
        int v3;
        boolean z;
        int v;
        while(!this.h) {
            try {
                v = 0;
                long v1 = this.g.zza;
                zzet zzet0 = new zzet();
                zzet0.zzd(this.b);
                zzet0.zzc(v1);
                zzet0.zza(6);
                zzet0.zzb(xb.R);
                zzev zzev0 = zzet0.zze();
                this.k = zzev0;
                long v2 = this.c.zzb(zzev0);
                this.l = v2;
                if(v2 != -1L) {
                    this.l = v2 + v1;
                }
                xb xb0 = this.o;
                Map map0 = this.c.zze();
                List list0 = (List)map0.get("icy-br");
                if(list0 == null) {
                    z = false;
                    v3 = -1;
                }
                else {
                    String s = (String)list0.get(0);
                    try {
                        v4 = -1;
                        v4 = Integer.parseInt(s) * 1000;
                        if(v4 <= 0) {
                            Log.w("IcyHeaders", "Invalid bitrate: " + s);
                            z = false;
                            v4 = -1;
                        }
                        else {
                            goto label_33;
                        }
                        goto label_34;
                    }
                    catch(NumberFormatException unused_ex) {
                        Log.w("IcyHeaders", "Invalid bitrate header: " + s);
                        v3 = v4;
                        z = false;
                        goto label_35;
                    }
                label_33:
                    z = true;
                label_34:
                    v3 = v4;
                }
            label_35:
                List list1 = (List)map0.get("icy-genre");
                zzabk zzabk0 = null;
                if(list1 == null) {
                    s1 = null;
                }
                else {
                    s1 = (String)list1.get(0);
                    z = true;
                }
                List list2 = (List)map0.get("icy-name");
                if(list2 == null) {
                    s2 = null;
                }
                else {
                    s2 = (String)list2.get(0);
                    z = true;
                }
                List list3 = (List)map0.get("icy-url");
                if(list3 == null) {
                    s3 = null;
                }
                else {
                    s3 = (String)list3.get(0);
                    z = true;
                }
                List list4 = (List)map0.get("icy-pub");
                if(list4 == null) {
                    z1 = false;
                }
                else {
                    z1 = ((String)list4.get(0)).equals("1");
                    z = true;
                }
                List list5 = (List)map0.get("icy-metaint");
                if(list5 == null) {
                    v5 = -1;
                }
                else {
                    String s4 = (String)list5.get(0);
                    try {
                        v6 = -1;
                        v6 = Integer.parseInt(s4);
                        if(v6 <= 0) {
                            Log.w("IcyHeaders", "Invalid metadata interval: " + s4);
                            v6 = -1;
                        }
                        else {
                            goto label_73;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        Log.w("IcyHeaders", "Invalid metadata interval: " + s4);
                    }
                    goto label_74;
                label_73:
                    z = true;
                label_74:
                    v5 = v6;
                }
                if(z) {
                    zzabk0 = new zzabk(v3, s1, s2, s3, z1, v5);
                }
                xb0.v = zzabk0;
                zzfr zzfr0 = this.c;
                zzabk zzabk1 = this.o.v;
                if(zzabk1 == null) {
                    zzfr1 = zzfr0;
                }
                else {
                    int v7 = zzabk1.zzf;
                    if(v7 != -1) {
                        zzfr1 = new mb(zzfr0, v7, this);
                        this.o.getClass();
                        wb wb0 = new wb(0, true);
                        zztp zztp0 = this.o.c(wb0);
                        this.m = zztp0;
                        zztp0.zzk(xb.S);
                    }
                }
                Map map1 = this.c.zze();
                this.d.zzd(zzfr1, this.b, map1, v1, this.l, this.e);
                if(this.o.v != null) {
                    this.d.zzc();
                }
                if(this.i) {
                    this.d.zzf(v1, this.j);
                    this.i = false;
                }
                v8 = v1;
                v9 = 0;
            }
            catch(Throwable throwable0) {
                goto label_117;
            }
            while(v9 == 0) {
                if(!this.h) {
                    try {
                        try {
                            this.f.zza();
                        }
                        catch(InterruptedException unused_ex) {
                            throw new InterruptedIOException();
                        }
                        v9 = this.d.zza(this.g);
                        long v10 = this.d.zzb();
                        if(v10 <= this.o.n + v8) {
                            continue;
                        }
                        this.f.zzc();
                        this.o.t.post(this.o.s);
                        v8 = v10;
                        continue;
                    }
                    catch(Throwable throwable0) {
                        v = v9;
                    }
                label_117:
                    if(v != 1) {
                        zzrd zzrd0 = this.d;
                        if(zzrd0.zzb() != -1L) {
                            this.g.zza = zzrd0.zzb();
                        }
                    }
                    zzes.zza(this.c);
                    throw throwable0;
                }
                v9 = 0;
                break;
            }
            if(v9 != 1) {
                zzrd zzrd1 = this.d;
                if(zzrd1.zzb() != -1L) {
                    this.g.zza = zzrd1.zzb();
                }
                v = v9;
            }
            zzes.zza(this.c);
            if(v != 0) {
                return;
            }
            if(false) {
                break;
            }
        }
    }
}

