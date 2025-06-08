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

public final class zzcin implements zzayj {
    public final zzayy a;
    public final Context b;
    public final zzayj c;
    public final String d;
    public final int e;
    public final boolean f;
    public InputStream g;
    public boolean h;
    public Uri i;
    public volatile zzbcy j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public zzfvl p;
    public final AtomicLong q;
    public final zzciv r;

    public zzcin(Context context0, zzayj zzayj0, String s, int v, zzayy zzayy0, zzciv zzciv0, byte[] arr_b) {
        this.b = context0;
        this.c = zzayj0;
        this.a = zzayy0;
        this.r = zzciv0;
        this.d = s;
        this.e = v;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 0L;
        this.q = new AtomicLong(-1L);
        this.p = null;
        this.f = ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
    }

    public final boolean a() {
        if(!this.f) {
            return false;
        }
        return !((Boolean)zzay.zzc().zzb(zzbhz.zzds)).booleanValue() || this.m ? ((Boolean)zzay.zzc().zzb(zzbhz.zzdt)).booleanValue() && !this.n : true;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        if(!this.h) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream0 = this.g;
        int v2 = inputStream0 == null ? this.c.zza(arr_b, v, v1) : inputStream0.read(arr_b, v, v1);
        if(!this.f || this.g != null) {
            zzayy zzayy0 = this.a;
            if(zzayy0 != null) {
                ((zzciz)zzayy0).zzW(this, v2);
            }
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzayl0) throws IOException {
        String s;
        long v2;
        boolean z1;
        zzbdk zzbdk0;
        zzbcv zzbcv0;
        if(this.h) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        boolean z = true;
        this.h = true;
        this.i = zzayl0.zza;
        if(!this.f) {
            zzayy zzayy0 = this.a;
            if(zzayy0 != null) {
                ((zzciz)zzayy0).zzX(this, zzayl0);
            }
        }
        this.j = zzbcy.zza(zzayl0.zza);
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdp)).booleanValue()) {
            if(this.j == null) {
                zzbcv0 = null;
            }
            else {
                this.j.zzh = zzayl0.zzc;
                this.j.zzi = zzfpi.zzc(this.d);
                this.j.zzj = this.e;
                zzbcv0 = zzt.zzc().zzb(this.j);
            }
            if(zzbcv0 != null && zzbcv0.zze()) {
                this.k = zzbcv0.zzd();
                this.m = zzbcv0.zzg();
                this.n = zzbcv0.zzf();
                this.o = zzbcv0.zza();
                this.l = true;
                if(!this.a()) {
                    this.g = zzbcv0.zzc();
                    if(this.f) {
                        zzayy zzayy2 = this.a;
                        if(zzayy2 != null) {
                            ((zzciz)zzayy2).zzX(this, zzayl0);
                        }
                    }
                    return -1L;
                }
            }
        }
        else if(this.j != null) {
            this.j.zzh = zzayl0.zzc;
            this.j.zzi = zzfpi.zzc(this.d);
            this.j.zzj = this.e;
            long v = (long)(this.j.zzg ? ((Long)zzay.zzc().zzb(zzbhz.zzdr)) : ((Long)zzay.zzc().zzb(zzbhz.zzdq)));
            long v1 = zzt.zzA().elapsedRealtime();
            Future future0 = zzbdj.zza(this.b, this.j);
            try {
                zzbdk0 = (zzbdk)future0.get(v, TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException | TimeoutException unused_ex) {
                z1 = false;
                goto label_38;
            }
            catch(InterruptedException unused_ex) {
                z1 = false;
                goto label_47;
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_64;
            }
            try {
                this.k = zzbdk0.zzd();
                this.m = zzbdk0.zzf();
                this.n = zzbdk0.zze();
                this.o = zzbdk0.zza();
                if(!this.a()) {
                    this.g = zzbdk0.zzc();
                    if(this.f) {
                        zzayy zzayy1 = this.a;
                        if(zzayy1 != null) {
                            ((zzciz)zzayy1).zzX(this, zzayl0);
                        }
                    }
                    goto label_71;
                }
                goto label_78;
            }
            catch(ExecutionException | TimeoutException unused_ex) {
                z1 = true;
                try {
                label_38:
                    future0.cancel(true);
                }
                catch(Throwable throwable0) {
                    z = z1;
                    goto label_64;
                }
                v2 = zzt.zzA().elapsedRealtime() - v1;
                zzchh zzchh0 = this.r.zza.u;
                if(zzchh0 != null) {
                    zzchh0.zzi(z1, v2);
                }
                this.l = z1;
                s = "Cache connection took " + v2 + "ms";
                goto label_84;
            }
            catch(InterruptedException unused_ex) {
                z1 = true;
                try {
                label_47:
                    future0.cancel(true);
                    Thread.currentThread().interrupt();
                }
                catch(Throwable throwable0) {
                    z = z1;
                    goto label_64;
                }
                v2 = zzt.zzA().elapsedRealtime() - v1;
                zzchh zzchh1 = this.r.zza.u;
                if(zzchh1 != null) {
                    zzchh1.zzi(z1, v2);
                }
                this.l = z1;
                s = "Cache connection took " + v2 + "ms";
                goto label_84;
            }
            catch(Throwable throwable0) {
            }
        label_64:
            long v3 = zzt.zzA().elapsedRealtime() - v1;
            zzchh zzchh2 = this.r.zza.u;
            if(zzchh2 != null) {
                zzchh2.zzi(z, v3);
            }
            this.l = z;
            zze.zza(("Cache connection took " + v3 + "ms"));
            throw throwable0;
        label_71:
            long v4 = zzt.zzA().elapsedRealtime() - v1;
            zzchh zzchh3 = this.r.zza.u;
            if(zzchh3 != null) {
                zzchh3.zzi(true, v4);
            }
            this.l = true;
            zze.zza(("Cache connection took " + v4 + "ms"));
            return -1L;
        label_78:
            long v5 = zzt.zzA().elapsedRealtime() - v1;
            zzchh zzchh4 = this.r.zza.u;
            if(zzchh4 != null) {
                zzchh4.zzi(true, v5);
            }
            this.l = true;
            s = "Cache connection took " + v5 + "ms";
        label_84:
            zze.zza(s);
        }
        this.l = false;
        if(this.j != null) {
            zzayl0 = new zzayl(Uri.parse(this.j.zza), null, zzayl0.zzb, zzayl0.zzc, zzayl0.zzd, null, 0);
        }
        return this.c.zzb(zzayl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        if(!this.h) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.h = false;
        this.i = null;
        InputStream inputStream0 = this.g;
        if(inputStream0 != null) {
            IOUtils.closeQuietly(inputStream0);
            this.g = null;
            return;
        }
        this.c.zzd();
    }

    public final long zze() {
        return this.o;
    }

    public final long zzf() {
        if(this.j == null) {
            return -1L;
        }
        if(this.q.get() != -1L) {
            return this.q.get();
        }
        synchronized(this) {
            if(this.p == null) {
                zzcim zzcim0 = new zzcim(this);
                this.p = zzcfv.zza.zzb(zzcim0);
            }
        }
        if(!this.p.isDone()) {
            return -1L;
        }
        try {
            long v1 = (long)(((Long)this.p.get()));
            this.q.compareAndSet(-1L, v1);
            return this.q.get();
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            return -1L;
        }
    }

    public final boolean zzh() {
        return this.k;
    }

    public final boolean zzi() {
        return this.n;
    }

    public final boolean zzj() {
        return this.m;
    }

    public final boolean zzk() {
        return this.l;
    }
}

