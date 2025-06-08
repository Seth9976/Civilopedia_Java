package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzcav extends zzaqx implements zzcaw {
    public zzcav() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzl(iObjectWrapper0);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                int v1 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                this.zzk(iObjectWrapper1, v1);
                break;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzi(iObjectWrapper2);
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzj(iObjectWrapper3);
                break;
            }
            case 5: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzo(iObjectWrapper4);
                break;
            }
            case 6: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzf(iObjectWrapper5);
                break;
            }
            case 7: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzcax zzcax0 = (zzcax)zzaqy.zza(parcel0, zzcax.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzm(iObjectWrapper6, zzcax0);
                break;
            }
            case 8: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zze(iObjectWrapper7);
                break;
            }
            case 9: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                int v2 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                this.zzg(iObjectWrapper8, v2);
                break;
            }
            case 10: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzh(iObjectWrapper9);
                break;
            }
            case 11: {
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzn(iObjectWrapper10);
                break;
            }
            case 12: {
                Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzcaw zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterface0 instanceof zzcaw ? ((zzcaw)iInterface0) : new zzcau(iBinder0, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

