package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzcbd extends zzaqx implements zzcbe {
    public zzcbd() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzcbl zzcbl0 = null;
        switch(v) {
            case 1: {
                zzl zzl0 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbl0 = iInterface0 instanceof zzcbl ? ((zzcbl)iInterface0) : new zzcbj(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzf(zzl0, zzcbl0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbl0 = iInterface1 instanceof zzcbh ? ((zzcbh)iInterface1) : new zzcbf(iBinder1, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzk(((zzcbh)zzcbl0));
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.zzo();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 4: {
                String s = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzm(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcbl0 = iInterface2 instanceof zzcbm ? ((zzcbm)iInterface2) : new zzcbm(iBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzp(((zzcbm)zzcbl0));
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzcbs zzcbs0 = (zzcbs)zzaqy.zza(parcel0, zzcbs.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzl(zzcbs0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzdb zzdb0 = zzda.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzi(zzdb0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                boolean z1 = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzn(iObjectWrapper1, z1);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzcbb zzcbb0 = this.zzd();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzcbb0);
                return true;
            }
            case 12: {
                zzdh zzdh0 = this.zzc();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdh0);
                return true;
            }
            case 13: {
                zzde zzde0 = zzdd.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzj(zzde0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzl zzl1 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbl0 = iInterface3 instanceof zzcbl ? ((zzcbl)iInterface3) : new zzcbj(iBinder3);
                }
                zzaqy.zzc(parcel0);
                this.zzg(zzl1, zzcbl0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                boolean z2 = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzh(z2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzcbe zzq(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterface0 instanceof zzcbe ? ((zzcbe)iInterface0) : new zzcbc(iBinder0);
    }
}

