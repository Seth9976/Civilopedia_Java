package com.google.android.gms.internal.ads;

import F0.f;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzcer {
    public final Object a;
    public final zzj b;
    public final zzcev c;
    public boolean d;
    public Context e;
    public zzcfo f;
    public zzbie g;
    public Boolean h;
    public final AtomicInteger i;
    public final C2 j;
    public final Object k;
    public zzfvl l;
    public final AtomicBoolean m;

    public zzcer() {
        this.a = new Object();
        zzj zzj0 = new zzj();
        this.b = zzj0;
        this.c = new zzcev(zzaw.zzd(), zzj0);
        this.d = false;
        this.g = null;
        this.h = null;
        this.i = new AtomicInteger(0);
        this.j = new C2();
        this.k = new Object();
        this.m = new AtomicBoolean();
    }

    public final int zza() {
        return this.i.get();
    }

    public final Context zzc() {
        return this.e;
    }

    public final Resources zzd() {
        if(this.f.zzd) {
            return this.e.getResources();
        }
        try {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzil)).booleanValue()) {
                return zzcfm.zza(this.e).getResources();
            }
            zzcfm.zza(this.e).getResources();
            return null;
        }
        catch(zzcfl zzcfl0) {
        }
        zzcfi.zzk("Cannot load resource from dynamite apk or local jar", zzcfl0);
        return null;
    }

    public final zzbie zzf() {
        synchronized(this.a) {
        }
        return this.g;
    }

    public final zzcev zzg() {
        return this.c;
    }

    public final zzg zzh() {
        synchronized(this.a) {
        }
        return this.b;
    }

    public final zzfvl zzj() {
        if(this.e != null && !((Boolean)zzay.zzc().zzb(zzbhz.zzcj)).booleanValue()) {
            Object object0 = this.k;
            synchronized(object0) {
                zzfvl zzfvl0 = this.l;
                if(zzfvl0 != null) {
                    return zzfvl0;
                }
                zzcem zzcem0 = new zzcem(this);
                zzfvl zzfvl1 = zzcfv.zza.zzb(zzcem0);
                this.l = zzfvl1;
                return zzfvl1;
            }
        }
        return zzfvc.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        synchronized(this.a) {
        }
        return this.h;
    }

    public final void zzo() {
        C2 c20 = this.j;
        c20.getClass();
        long v = zzt.zzA().currentTimeMillis();
        synchronized(c20.a) {
            if(c20.c == 3 && c20.b + ((long)(((Long)zzay.zzc().zzb(zzbhz.zzeU)))) <= v) {
                c20.c = 1;
            }
        }
        long v2 = zzt.zzA().currentTimeMillis();
        synchronized(c20.a) {
            if(c20.c != 2) {
                return;
            }
            c20.c = 3;
            c20.b = v2;
        }
    }

    public final void zzp() {
        this.i.decrementAndGet();
    }

    public final void zzq() {
        this.i.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzr(Context context0, zzcfo zzcfo0) {
        zzbie zzbie0;
        synchronized(this.a) {
            if(!this.d) {
                this.e = context0.getApplicationContext();
                this.f = zzcfo0;
                zzt.zzb().zzc(this.c);
                this.b.zzr(this.e);
                zzbyy.zzb(this.e, this.f);
                if(((Boolean)zzbjj.zzc.zze()).booleanValue()) {
                    zzbie0 = new zzbie();
                }
                else {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbie0 = null;
                }
                this.g = zzbie0;
                if(zzbie0 != null) {
                    zzcfy.zza(new f(this).zzb(), "AppState.registerCsiReporter");
                }
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzhc)).booleanValue()) {
                    ((ConnectivityManager)context0.getSystemService("connectivity")).registerDefaultNetworkCallback(new B0(this, 1));
                }
                this.d = true;
                this.zzj();
            }
        }
        zzt.zzp().zzc(context0, zzcfo0.zza);
    }

    public final void zzs(Throwable throwable0, String s) {
        zzbyy.zzb(this.e, this.f).zze(throwable0, s, ((Double)zzbjx.zzg.zze()).floatValue());
    }

    public final void zzt(Throwable throwable0, String s) {
        zzbyy.zzb(this.e, this.f).zzd(throwable0, s);
    }

    public final void zzu(Boolean boolean0) {
        synchronized(this.a) {
            this.h = boolean0;
        }
    }

    public final boolean zzv(Context context0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhc)).booleanValue()) {
            return this.m.get();
        }
        NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }
}

