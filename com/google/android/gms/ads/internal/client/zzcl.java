package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbua;
import java.util.List;

public abstract class zzcl extends zzaqx implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzcy zzcy0;
        switch(v) {
            case 1: {
                this.zzj();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                float f = parcel0.readFloat();
                zzaqy.zzc(parcel0);
                this.zzp(f);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzq(s);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                boolean z = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzo(z);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzm(iObjectWrapper0, s1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                String s2 = parcel0.readString();
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzk(s2, iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                float f1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 8: {
                boolean z1 = this.zzt();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 9: {
                String s3 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 10: {
                String s4 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzh(s4);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzbua zzbua0 = zzbtz.zzf(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzn(zzbua0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                zzbqn zzbqn0 = zzbqm.zzc(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzr(zzbqn0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                List list0 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 14: {
                zzez zzez0 = (zzez)zzaqy.zza(parcel0, zzez.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzs(zzez0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                this.zzi();
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzcy0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcy0 = iInterface0 instanceof zzcy ? ((zzcy)iInterface0) : new zzcw(iBinder0, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzl(zzcy0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

