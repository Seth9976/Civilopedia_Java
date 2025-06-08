package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbv;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzcan extends zzaqx implements zzcao {
    public zzcan() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzcar zzcar0 = null;
        switch(v) {
            case 1: {
                zzcas zzcas0 = (zzcas)zzaqy.zza(parcel0, zzcas.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzg(zzcas0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.zzq();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcar0 = iInterface0 instanceof zzcar ? ((zzcar)iInterface0) : new zzcap(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzo(zzcar0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                boolean z = this.zzs();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 6: {
                this.zzh();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                this.zzj();
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zze();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzi(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzk(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzf(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                String s = this.zzd();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 13: {
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzp(s1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbw zzbw0 = zzbv.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzl(zzbw0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle0);
                return true;
            }
            case 16: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzcar0 = iInterface1 instanceof zzcam ? ((zzcam)iInterface1) : new zzcam(iBinder1, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzu(((zzcam)zzcar0));
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                parcel0.readString();
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzr(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                String s2 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzm(s2);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                boolean z1 = this.zzt();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 21: {
                zzdh zzdh0 = this.zzc();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdh0);
                return true;
            }
            case 34: {
                boolean z2 = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzn(z2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

