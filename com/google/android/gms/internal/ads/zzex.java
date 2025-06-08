package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class zzex implements zzeq {
    public final Context a;
    public final ArrayList b;
    public final zzeq c;
    public zzfg d;
    public zzej e;
    public zzen f;
    public zzeq g;
    public zzfu h;
    public zzeo i;
    public zzfq j;
    public zzeq k;

    public zzex(Context context0, zzeq zzeq0) {
        this.a = context0.getApplicationContext();
        this.c = zzeq0;
        this.b = new ArrayList();
    }

    public final void a(zzeq zzeq0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            zzeq0.zzf(((zzfs)arrayList0.get(v)));
        }
    }

    public static final void b(zzeq zzeq0, zzfs zzfs0) {
        if(zzeq0 != null) {
            zzeq0.zzf(zzfs0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        zzeq zzeq0 = this.k;
        zzeq0.getClass();
        return zzeq0.zza(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws IOException {
        zzcw.zzf(this.k == null);
        String s = zzev0.zza.getScheme();
        boolean z = zzeg.zzV(zzev0.zza);
        Context context0 = this.a;
        if(z) {
            String s1 = zzev0.zza.getPath();
            if(s1 != null && s1.startsWith("/android_asset/")) {
                if(this.e == null) {
                    zzej zzej0 = new zzej(context0);
                    this.e = zzej0;
                    this.a(zzej0);
                }
                this.k = this.e;
                return this.k.zzb(zzev0);
            }
            if(this.d == null) {
                zzfg zzfg0 = new zzfg();
                this.d = zzfg0;
                this.a(zzfg0);
            }
            this.k = this.d;
            return this.k.zzb(zzev0);
        }
        if("asset".equals(s)) {
            if(this.e == null) {
                zzej zzej1 = new zzej(context0);
                this.e = zzej1;
                this.a(zzej1);
            }
            this.k = this.e;
            return this.k.zzb(zzev0);
        }
        if("content".equals(s)) {
            if(this.f == null) {
                zzen zzen0 = new zzen(context0);
                this.f = zzen0;
                this.a(zzen0);
            }
            this.k = this.f;
            return this.k.zzb(zzev0);
        }
        zzeq zzeq0 = this.c;
        if("rtmp".equals(s)) {
            if(this.g == null) {
                try {
                    zzeq zzeq1 = (zzeq)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = zzeq1;
                    this.a(zzeq1);
                }
                catch(ClassNotFoundException unused_ex) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                }
                catch(Exception exception0) {
                    throw new RuntimeException("Error instantiating RTMP extension", exception0);
                }
                if(this.g == null) {
                    this.g = zzeq0;
                }
            }
            this.k = this.g;
            return this.k.zzb(zzev0);
        }
        if("udp".equals(s)) {
            if(this.h == null) {
                zzfu zzfu0 = new zzfu(2000);
                this.h = zzfu0;
                this.a(zzfu0);
            }
            this.k = this.h;
            return this.k.zzb(zzev0);
        }
        if("data".equals(s)) {
            if(this.i == null) {
                zzeo zzeo0 = new zzeo();
                this.i = zzeo0;
                this.a(zzeo0);
            }
            this.k = this.i;
            return this.k.zzb(zzev0);
        }
        if(!"rawresource".equals(s) && !"android.resource".equals(s)) {
            this.k = zzeq0;
            return this.k.zzb(zzev0);
        }
        if(this.j == null) {
            zzfq zzfq0 = new zzfq(context0);
            this.j = zzfq0;
            this.a(zzfq0);
        }
        this.k = this.j;
        return this.k.zzb(zzev0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.k == null ? null : this.k.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        zzeq zzeq0 = this.k;
        if(zzeq0 != null) {
            try {
                zzeq0.zzd();
                this.k = null;
            }
            catch(Throwable throwable0) {
                this.k = null;
                throw throwable0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Map zze() {
        return this.k == null ? Collections.emptyMap() : this.k.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfs0) {
        zzfs0.getClass();
        this.c.zzf(zzfs0);
        this.b.add(zzfs0);
        zzex.b(this.d, zzfs0);
        zzex.b(this.e, zzfs0);
        zzex.b(this.f, zzfs0);
        zzex.b(this.g, zzfs0);
        zzex.b(this.h, zzfs0);
        zzex.b(this.i, zzfs0);
        zzex.b(this.j, zzfs0);
    }
}

