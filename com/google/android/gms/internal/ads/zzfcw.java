package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfcw {
    public final Context a;
    public final zzcj b;
    public final AtomicReference c;
    public static zzfcw d;

    public zzfcw(Context context0, zzcj zzcj0) {
        this.c = new AtomicReference();
        this.a = context0;
        this.b = zzcj0;
    }

    public final zzbua zzb() {
        return (zzbua)this.c.get();
    }

    public final zzcfo zzc(int v, boolean z, int v1) {
        boolean z1 = zzs.zzA(this.a);
        zzcfo zzcfo0 = new zzcfo(221908000, v1, true, z1);
        if(((Boolean)zzbjr.zzc.zze()).booleanValue()) {
            zzeh zzeh0 = null;
            zzcj zzcj0 = this.b;
            if(zzcj0 != null) {
                try {
                    zzeh0 = zzcj0.getLiteSdkVersion();
                }
                catch(RemoteException unused_ex) {
                }
            }
            return zzeh0 == null ? zzcfo0 : new zzcfo(221908000, zzeh0.zza(), true, z1);
        }
        return zzcfo0;
    }

    public static zzfcw zzd(Context context0) {
        synchronized(zzfcw.class) {
            zzfcw zzfcw0 = zzfcw.d;
            if(zzfcw0 != null) {
                return zzfcw0;
            }
            zzcj zzcj0 = null;
            Context context1 = context0.getApplicationContext();
            long v1 = (long)(((Long)zzbjr.zzb.zze()));
            if(v1 > 0L && v1 <= 221908400L) {
                try {
                    zzcj0 = zzci.asInterface(((IBinder)context1.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context1)));
                }
                catch(ClassCastException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException classCastException0) {
                    zzcfi.zzh("Failed to retrieve lite SDK info.", classCastException0);
                }
            }
            zzfcw zzfcw1 = new zzfcw(context1, zzcj0);
            zzfcw.d = zzfcw1;
            return zzfcw1;
        }
    }

    public final void zze(zzbua zzbua0) {
        boolean z = ((Boolean)zzbjr.zza.zze()).booleanValue();
        AtomicReference atomicReference0 = this.c;
        if(z) {
            zzcj zzcj0 = this.b;
            zzbua zzbua1 = null;
            if(zzcj0 != null) {
                try {
                    zzbua1 = zzcj0.getAdapterCreator();
                }
                catch(RemoteException unused_ex) {
                }
            }
            if(zzbua1 != null) {
                zzbua0 = zzbua1;
            }
            zzfcv.zza(atomicReference0, null, zzbua0);
            return;
        }
        zzfcv.zza(atomicReference0, null, zzbua0);
    }
}

