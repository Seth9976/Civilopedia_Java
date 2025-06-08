package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

public final class zzbds {
    public zzarb a;
    public boolean b;
    public final ExecutorService c;

    public zzbds() {
        this.c = zzcex.zzb;
    }

    public zzbds(Context context0) {
        ExecutorService executorService0 = zzcex.zzb;
        this.c = executorService0;
        zzbhz.zzc(context0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzis)).booleanValue()) {
            executorService0.execute(() -> if(((Boolean)zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
                try {
                    this.a = (zzarb)zzcfm.zzb(context0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbdo.zza);
                    IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                    this.a.zze(iObjectWrapper0, "GMA_SDK");
                    this.b = true;
                }
                catch(zzcfl | RemoteException | NullPointerException unused_ex) {
                    zzcfi.zze("Cannot dynamite load clearcut");
                }
            });
            return;
        }
        this.a(context0);
    }

    // 检测为 lambda 实现。
    public final void a(Context context0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            try {
                this.a = (zzarb)zzcfm.zzb(context0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbdo.zza);
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                this.a.zze(iObjectWrapper0, "GMA_SDK");
                this.b = true;
            }
            catch(zzcfl | RemoteException | NullPointerException unused_ex) {
                zzcfi.zze("Cannot dynamite load clearcut");
            }
        }
    }
}

