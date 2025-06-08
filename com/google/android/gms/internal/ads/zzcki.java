package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzcki extends zzek {
    public final Context e;
    public final zzeq f;
    public final String g;
    public final int h;
    public final boolean i;
    public InputStream j;
    public boolean k;
    public Uri l;
    public volatile zzbcy m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public zzfvl s;
    public final AtomicLong t;
    public final zzckl u;

    public zzcki(Context context0, zzeq zzeq0, String s, int v, zzfs zzfs0, zzckl zzckl0, byte[] arr_b) {
        super(false);
        this.e = context0;
        this.f = zzeq0;
        this.u = zzckl0;
        this.g = s;
        this.h = v;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
        this.zzf(zzfs0);
    }

    public final boolean d() {
        if(!this.i) {
            return false;
        }
        return !((Boolean)zzay.zzc().zzb(zzbhz.zzds)).booleanValue() || this.p ? ((Boolean)zzay.zzc().zzb(zzbhz.zzdt)).booleanValue() && !this.q : true;
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        if(!this.k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream0 = this.j;
        int v2 = inputStream0 == null ? this.f.zza(arr_b, v, v1) : inputStream0.read(arr_b, v, v1);
        if(!this.i || this.j != null) {
            this.zzg(v2);
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws IOException {
        String s;
        long v2;
        boolean z1;
        zzbdk zzbdk0;
        zzbcv zzbcv0;
        if(this.k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z = true;
        this.k = true;
        this.l = zzev0.zza;
        if(!this.i) {
            this.c(zzev0);
        }
        this.m = zzbcy.zza(zzev0.zza);
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdp)).booleanValue()) {
            if(this.m == null) {
                zzbcv0 = null;
            }
            else {
                this.m.zzh = zzev0.zzf;
                this.m.zzi = zzfpi.zzc(this.g);
                this.m.zzj = this.h;
                zzbcv0 = zzt.zzc().zzb(this.m);
            }
            if(zzbcv0 != null && zzbcv0.zze()) {
                this.n = zzbcv0.zzd();
                this.p = zzbcv0.zzg();
                this.q = zzbcv0.zzf();
                this.r = zzbcv0.zza();
                this.o = true;
                if(!this.d()) {
                    this.j = zzbcv0.zzc();
                    if(this.i) {
                        this.c(zzev0);
                    }
                    return -1L;
                }
            }
        }
        else if(this.m != null) {
            this.m.zzh = zzev0.zzf;
            this.m.zzi = zzfpi.zzc(this.g);
            this.m.zzj = this.h;
            long v = (long)(this.m.zzg ? ((Long)zzay.zzc().zzb(zzbhz.zzdr)) : ((Long)zzay.zzc().zzb(zzbhz.zzdq)));
            long v1 = zzt.zzA().elapsedRealtime();
            Future future0 = zzbdj.zza(this.e, this.m);
            try {
                zzbdk0 = (zzbdk)future0.get(v, TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException | TimeoutException unused_ex) {
                z1 = false;
                goto label_34;
            }
            catch(InterruptedException unused_ex) {
                z1 = false;
                goto label_43;
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_60;
            }
            try {
                this.n = zzbdk0.zzd();
                this.p = zzbdk0.zzf();
                this.q = zzbdk0.zze();
                this.r = zzbdk0.zza();
                if(!this.d()) {
                    this.j = zzbdk0.zzc();
                    if(this.i) {
                        this.c(zzev0);
                    }
                    goto label_67;
                }
                goto label_74;
            }
            catch(ExecutionException | TimeoutException unused_ex) {
                z1 = true;
                try {
                label_34:
                    future0.cancel(true);
                }
                catch(Throwable throwable0) {
                    z = z1;
                    goto label_60;
                }
                v2 = zzt.zzA().elapsedRealtime() - v1;
                zzchh zzchh0 = this.u.zza.t;
                if(zzchh0 != null) {
                    zzchh0.zzi(z1, v2);
                }
                this.o = z1;
                s = "Cache connection took " + v2 + "ms";
                goto label_80;
            }
            catch(InterruptedException unused_ex) {
                z1 = true;
                try {
                label_43:
                    future0.cancel(true);
                    Thread.currentThread().interrupt();
                }
                catch(Throwable throwable0) {
                    z = z1;
                    goto label_60;
                }
                v2 = zzt.zzA().elapsedRealtime() - v1;
                zzchh zzchh1 = this.u.zza.t;
                if(zzchh1 != null) {
                    zzchh1.zzi(z1, v2);
                }
                this.o = z1;
                s = "Cache connection took " + v2 + "ms";
                goto label_80;
            }
            catch(Throwable throwable0) {
            }
        label_60:
            long v3 = zzt.zzA().elapsedRealtime() - v1;
            zzchh zzchh2 = this.u.zza.t;
            if(zzchh2 != null) {
                zzchh2.zzi(z, v3);
            }
            this.o = z;
            zze.zza(("Cache connection took " + v3 + "ms"));
            throw throwable0;
        label_67:
            long v4 = zzt.zzA().elapsedRealtime() - v1;
            zzchh zzchh3 = this.u.zza.t;
            if(zzchh3 != null) {
                zzchh3.zzi(true, v4);
            }
            this.o = true;
            zze.zza(("Cache connection took " + v4 + "ms"));
            return -1L;
        label_74:
            long v5 = zzt.zzA().elapsedRealtime() - v1;
            zzchh zzchh4 = this.u.zza.t;
            if(zzchh4 != null) {
                zzchh4.zzi(true, v5);
            }
            this.o = true;
            s = "Cache connection took " + v5 + "ms";
        label_80:
            zze.zza(s);
        }
        this.o = false;
        if(this.m != null) {
            zzev0 = new zzev(Uri.parse(this.m.zza), null, zzev0.zze, zzev0.zzf, zzev0.zzg, null, zzev0.zzi);
        }
        return this.f.zzb(zzev0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        if(!this.k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.k = false;
        this.l = null;
        if(!this.i || this.j != null) {
            z = true;
        }
        InputStream inputStream0 = this.j;
        if(inputStream0 == null) {
            this.f.zzd();
        }
        else {
            IOUtils.closeQuietly(inputStream0);
            this.j = null;
        }
        if(z) {
            this.a();
        }
    }

    public final long zzk() {
        return this.r;
    }

    public final long zzl() {
        if(this.m == null) {
            return -1L;
        }
        if(this.t.get() != -1L) {
            return this.t.get();
        }
        synchronized(this) {
            if(this.s == null) {
                zzckh zzckh0 = new zzckh(this);
                this.s = zzcfv.zza.zzb(zzckh0);
            }
        }
        if(!this.s.isDone()) {
            return -1L;
        }
        try {
            long v1 = (long)(((Long)this.s.get()));
            this.t.compareAndSet(-1L, v1);
            return this.t.get();
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            return -1L;
        }
    }

    public final boolean zzn() {
        return this.n;
    }

    public final boolean zzo() {
        return this.q;
    }

    public final boolean zzp() {
        return this.p;
    }

    public final boolean zzq() {
        return this.o;
    }
}

