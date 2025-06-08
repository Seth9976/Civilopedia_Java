package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;

public abstract class zzct extends zzaqx implements zzcu {
    public zzct() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                String s1 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzcu zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterface0 instanceof zzcu ? ((zzcu)iInterface0) : new zzcs(iBinder0, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

