package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

public class zzaw extends zzb implements zzax {
    @Override  // com.google.android.gms.internal.location.zzb
    public final boolean a(Parcel parcel0, int v) {
        throw null;
    }

    public static zzax zzb(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterface0 instanceof zzax ? ((zzax)iInterface0) : new zzav(iBinder0, "com.google.android.gms.location.IDeviceOrientationListener");  // 初始化器: Lcom/google/android/gms/internal/location/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

