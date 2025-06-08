package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbmx extends zzaqx implements zzbmy {
    public zzbmx() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbmv zzbmv0;
        switch(v) {
            case 2: {
                String s = this.zzq();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.zzu();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            case 4: {
                String s1 = this.zzo();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 5: {
                zzblb zzblb0 = this.zzk();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzblb0);
                return true;
            }
            case 6: {
                String s2 = this.zzp();
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 7: {
                String s3 = this.zzn();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 8: {
                double f = this.zze();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 9: {
                String s4 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 10: {
                String s5 = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            case 11: {
                zzdk zzdk0 = this.zzh();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 12: {
                String s6 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            case 13: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbkt zzbkt0 = this.zzi();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbkt0);
                return true;
            }
            case 15: {
                Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzz(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                Bundle bundle1 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                boolean z = this.zzI(bundle1);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 17: {
                Bundle bundle2 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzB(bundle2);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper0 = this.zzm();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper0);
                return true;
            }
            case 19: {
                IObjectWrapper iObjectWrapper1 = this.zzl();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper1);
                return true;
            }
            case 20: {
                Bundle bundle3 = this.zzf();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle3);
                return true;
            }
            case 21: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbmv0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbmv0 = iInterface0 instanceof zzbmv ? ((zzbmv)iInterface0) : new zzbmt(iBinder0, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzF(zzbmv0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                this.zzw();
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                List list1 = this.zzv();
                parcel1.writeNoException();
                parcel1.writeList(list1);
                return true;
            }
            case 24: {
                boolean z1 = this.zzH();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 25: {
                zzcu zzcu0 = zzct.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzy(zzcu0);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzcq zzcq0 = zzcp.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzD(zzcq0);
                parcel1.writeNoException();
                return true;
            }
            case 27: {
                this.zzC();
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                this.zzA();
                parcel1.writeNoException();
                return true;
            }
            case 29: {
                zzbky zzbky0 = this.zzj();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbky0);
                return true;
            }
            case 30: {
                boolean z2 = this.zzG();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z2);
                return true;
            }
            case 0x1F: {
                zzdh zzdh0 = this.zzg();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdh0);
                return true;
            }
            case 0x20: {
                zzde zzde0 = zzdd.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzE(zzde0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

