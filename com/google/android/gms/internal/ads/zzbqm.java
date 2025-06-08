package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

public abstract class zzbqm extends zzaqx implements zzbqn {
    public zzbqm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ArrayList arrayList0 = parcel0.createTypedArrayList(zzbqg.CREATOR);
            zzaqy.zzc(parcel0);
            this.zzb(arrayList0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbqn zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterface0 instanceof zzbqn ? ((zzbqn)iInterface0) : new zzbql(iBinder0, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

