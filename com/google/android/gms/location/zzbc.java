package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

public abstract class zzbc extends zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    @Override  // com.google.android.gms.internal.location.zzb
    public final boolean a(Parcel parcel0, int v) {
        if(v == 1) {
            this.zzd(((Location)zzc.zzb(parcel0, Location.CREATOR)));
            return true;
        }
        return false;
    }

    public static zzbd zzb(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterface0 instanceof zzbd ? ((zzbd)iInterface0) : new zzbb(iBinder0, "com.google.android.gms.location.ILocationListener");  // 初始化器: Lcom/google/android/gms/internal/location/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

