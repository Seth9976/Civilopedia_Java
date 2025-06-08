package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbme extends zzaqx implements zzbmf {
    public zzbme() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzblv zzblv0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                zzblv0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                zzblv0 = iInterface0 instanceof zzblv ? ((zzblv)iInterface0) : new zzblt(iBinder0);
            }
            String s = parcel0.readString();
            zzaqy.zzc(parcel0);
            this.zze(zzblv0, s);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbmf zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterface0 instanceof zzbmf ? ((zzbmf)iInterface0) : new zzbmd(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

