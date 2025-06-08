package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbua;

public abstract class zzci extends zzaqx implements zzcj {
    public zzci() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                zzeh zzeh0 = this.getLiteSdkVersion();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, zzeh0);
                return true;
            }
            case 2: {
                zzbua zzbua0 = this.getAdapterCreator();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbua0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzcj asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterface0 instanceof zzcj ? ((zzcj)iInterface0) : new zzch(iBinder0, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

