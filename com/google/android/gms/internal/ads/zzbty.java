package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbty extends zzaqw implements zzbua {
    @Override  // com.google.android.gms.internal.ads.zzbua
    public final zzbud zzb(String s) throws RemoteException {
        zzbud zzbud0;
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 1);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbud0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbud0 = iInterface0 instanceof zzbud ? ((zzbud)iInterface0) : new zzbub(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
        parcel1.recycle();
        return zzbud0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final zzbvt zzc(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 3);
        zzbvt zzbvt0 = zzbvs.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbvt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final boolean zzd(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 4);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final boolean zze(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 2);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }
}

