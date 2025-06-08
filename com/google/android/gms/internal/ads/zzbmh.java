package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbmh extends zzaqx implements zzbmi {
    public zzbmh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
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
            zzaqy.zzc(parcel0);
            this.zze(zzblv0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbmi zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterface0 instanceof zzbmi ? ((zzbmi)iInterface0) : new zzbmg(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

