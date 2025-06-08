package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbtz extends zzaqx implements zzbua {
    public zzbtz() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                zzbud zzbud0 = this.zzb(s);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbud0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                boolean z = this.zze(s1);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 3: {
                String s2 = parcel0.readString();
                zzaqy.zzc(parcel0);
                zzbvt zzbvt0 = this.zzc(s2);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbvt0);
                return true;
            }
            case 4: {
                String s3 = parcel0.readString();
                zzaqy.zzc(parcel0);
                boolean z1 = this.zzd(s3);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbua zzf(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterface0 instanceof zzbua ? ((zzbua)iInterface0) : new zzbty(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

