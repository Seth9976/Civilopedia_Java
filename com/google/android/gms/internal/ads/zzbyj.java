package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

public abstract class zzbyj extends zzaqx implements zzbyk {
    public zzbyj() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Uri.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzf(arrayList0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zze(s);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzbyk zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterface0 instanceof zzbyk ? ((zzbyk)iInterface0) : new zzbyi(iBinder0, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

