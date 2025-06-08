package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbml extends zzaqx implements zzbmm {
    public zzbml() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            zzbs zzbs0 = zzbr.zzac(parcel0.readStrongBinder());
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            zzaqy.zzc(parcel0);
            this.zze(zzbs0, iObjectWrapper0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbmm zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterface0 instanceof zzbmm ? ((zzbmm)iInterface0) : new zzbmk(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

