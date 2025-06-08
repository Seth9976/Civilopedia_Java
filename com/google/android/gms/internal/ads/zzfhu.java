package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class zzfhu implements Runnable {
    public final Context i;
    public final zzcfo j;
    public final zzfhz k;
    public String l;
    public int m;
    public final zzdtz n;
    public boolean o;
    public final zzcah p;
    public static Boolean zza;

    public zzfhu(Context context0, zzcfo zzcfo0, zzdtz zzdtz0, zzect zzect0, zzcah zzcah0, byte[] arr_b) {
        this.k = zzfic.zzc();
        this.o = false;
        this.i = context0;
        this.j = zzcfo0;
        this.n = zzdtz0;
        this.p = zzcah0;
    }

    public final void a() {
        synchronized(this) {
            if(this.o) {
                return;
            }
            this.o = true;
            if(!zzfhu.zza()) {
                return;
            }
            this.l = zzs.zzo(this.i);
            this.m = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.i);
            long v1 = (long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzho)))));
            zzcfv.zzd.scheduleAtFixedRate(this, v1, v1, TimeUnit.MILLISECONDS);
        }
    }

    public final void b() {
        synchronized(this) {
            try {
                zzecq zzecq0 = new zzecq(((String)zzay.zzc().zzb(zzbhz.zzhn)), 60000, new HashMap(), ((zzfic)this.k.zzal()).zzaw(), "application/x-protobuf");
                String s = this.j.zza;
                int v1 = Binder.getCallingUid();
                new zzecs(this.i, s, this.p, v1, null).zzb(zzecq0);
                this.k.zzc();
            }
            catch(Exception exception0) {
                if(exception0 instanceof zzdzl && ((zzdzl)exception0).zza() == 3) {
                    this.k.zzc();
                    return;
                }
                zzt.zzo().zzs(exception0, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override
    public final void run() {
        synchronized(this) {
            if(!zzfhu.zza()) {
                return;
            }
            if(this.k.zza() == 0) {
                return;
            }
            this.b();
        }
    }

    public static boolean zza() {
        synchronized(zzfhu.class) {
            if(zzfhu.zza == null) {
                zzfhu.zza = ((Boolean)zzbji.zzb.zze()).booleanValue() ? Boolean.valueOf(Math.random() < ((double)(((Double)zzbji.zza.zze())))) : Boolean.FALSE;
            }
            return zzfhu.zza.booleanValue();
        }
    }

    public final void zzb(zzfhl zzfhl0) {
        synchronized(this) {
            if(!this.o) {
                this.a();
            }
            if(!zzfhu.zza()) {
                return;
            }
            if(zzfhl0 == null) {
                return;
            }
            if(this.k.zza() >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhp))))) {
                return;
            }
            zzfia zzfia0 = zzfib.zza();
            zzfhw zzfhw0 = zzfhx.zza();
            zzfhw0.zzo(zzfhl0.zzh());
            zzfhw0.zzl(zzfhl0.zzg());
            zzfhw0.zze(zzfhl0.zzb());
            zzfhw0.zzq(3);
            zzfhw0.zzk(this.j.zza);
            zzfhw0.zza(this.l);
            zzfhw0.zzi(Build.VERSION.RELEASE);
            zzfhw0.zzm(Build.VERSION.SDK_INT);
            zzfhw0.zzp(zzfhl0.zzj());
            zzfhw0.zzh(zzfhl0.zza());
            zzfhw0.zzc(((long)this.m));
            zzfhw0.zzn(zzfhl0.zzi());
            zzfhw0.zzb(zzfhl0.zzc());
            zzfhw0.zzd(zzfhl0.zzd());
            zzfhw0.zzf(zzfhl0.zze());
            zzfhw0.zzg(this.n.zzc(zzfhl0.zze()));
            zzfhw0.zzj(zzfhl0.zzf());
            zzfia0.zza(zzfhw0);
            this.k.zzb(zzfia0);
        }
    }
}

