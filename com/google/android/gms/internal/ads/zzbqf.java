package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class zzbqf implements zzaiu {
    public volatile zzbps a;
    public final Context b;

    public zzbqf(Context context0) {
        this.b = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaiu
    public final zzaix zza(zzajb zzajb0) throws zzajk {
        ParcelFileDescriptor parcelFileDescriptor0;
        Map map0 = zzajb0.zzl();
        int v = map0.size();
        String[] arr_s = new String[v];
        String[] arr_s1 = new String[v];
        int v2 = 0;
        for(Object object0: map0.entrySet()) {
            arr_s[v2] = (String)((Map.Entry)object0).getKey();
            arr_s1[v2] = (String)((Map.Entry)object0).getValue();
            ++v2;
        }
        zzbpt zzbpt0 = new zzbpt(zzajb0.zzk(), arr_s, arr_s1);
        long v3 = zzt.zzA().elapsedRealtime();
        try {
            zzcga zzcga0 = new zzcga();
            U1 u10 = new U1(this, zzcga0);
            V1 v10 = new V1(zzcga0);
            Looper looper0 = zzt.zzt().zzb();
            this.a = new zzbps(zzcaj.zza(this.b), looper0, u10, v10, 0xA6);  // 初始化器: Lcom/google/android/gms/common/internal/BaseGmsClient;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/BaseGmsClient$BaseConnectionCallbacks;Lcom/google/android/gms/common/internal/BaseGmsClient$BaseOnConnectionFailedListener;I)V
            this.a.checkAvailabilityAndConnect();
            zzfvl zzfvl0 = zzfvc.zzo(zzfvc.zzn(zzcga0, new T1(zzbpt0), zzcfv.zza), ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzdz)))))), TimeUnit.MILLISECONDS, zzcfv.zzd);
            zzfvl0.zzc(new A0(this, 6), zzcfv.zza);
            parcelFileDescriptor0 = (ParcelFileDescriptor)zzfvl0.get();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return null;
        }
        finally {
            zze.zza(("Http assets remote cache took " + (zzt.zzA().elapsedRealtime() - v3) + "ms"));
        }
        zzbpv zzbpv0 = (zzbpv)new zzbzt(parcelFileDescriptor0).zza(zzbpv.CREATOR);
        if(zzbpv0 == null) {
            return null;
        }
        if(zzbpv0.zza) {
            throw new zzajk(zzbpv0.zzb);
        }
        if(zzbpv0.zze.length == zzbpv0.zzf.length) {
            HashMap hashMap0 = new HashMap();
            for(int v1 = 0; true; ++v1) {
                String[] arr_s2 = zzbpv0.zze;
                if(v1 >= arr_s2.length) {
                    break;
                }
                hashMap0.put(arr_s2[v1], zzbpv0.zzf[v1]);
            }
            return new zzaix(zzbpv0.zzc, zzbpv0.zzd, hashMap0, zzbpv0.zzg, zzbpv0.zzh);
        }
        return null;
    }
}

