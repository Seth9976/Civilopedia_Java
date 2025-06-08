package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbci extends zzaqx implements zzbcj {
    public zzbci() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbcg zzbcg0;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbcg0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                    zzbcg0 = iInterface0 instanceof zzbcg ? ((zzbcg)iInterface0) : new zzbce(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzd(zzbcg0);
                break;
            }
            case 2: {
                parcel0.readInt();
                zzaqy.zzc(parcel0);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzc(zze0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzbcj zze(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterface0 instanceof zzbcj ? ((zzbcj)iInterface0) : new zzbch(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

