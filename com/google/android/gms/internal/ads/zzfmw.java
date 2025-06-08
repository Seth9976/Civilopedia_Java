package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzfmw {
    public final zzfmz a;
    public final boolean b;

    public zzfmw(zzfmz zzfmz0) {
        this.a = zzfmz0;
        this.b = true;
    }

    public final zzfmv zza(byte[] arr_b) {
        return new zzfmv(this, arr_b);
    }

    public static zzfmw zzb(Context context0, String s, String s1) {
        zzfmz zzfmz0;
        DynamiteModule dynamiteModule0;
        try {
            dynamiteModule0 = DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
            goto label_4;
        }
        catch(Exception exception0) {
            try {
                throw new zzfly(exception0);
            label_4:
                IBinder iBinder0 = dynamiteModule0.instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                if(iBinder0 == null) {
                    zzfmz0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    zzfmz0 = iInterface0 instanceof zzfmz ? ((zzfmz)iInterface0) : new zzfmx(iBinder0, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                goto label_16;
            }
            catch(Exception exception1) {
            }
        }
        try {
            throw new zzfly(exception1);
        label_16:
            zzfmz0.zze(ObjectWrapper.wrap(context0), s, null);
            Log.i("GASS", "GassClearcutLogger Initialized.");
            return new zzfmw(zzfmz0);
        }
        catch(zzfly | RemoteException | NullPointerException | SecurityException unused_ex) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfmw(new w6());  // 初始化器: Lcom/google/android/gms/internal/ads/zzfmy;-><init>()V
        }
    }

    public static zzfmw zzc() {
        w6 w60 = new w6();  // 初始化器: Lcom/google/android/gms/internal/ads/zzfmy;-><init>()V
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfmw(w60);
    }
}

