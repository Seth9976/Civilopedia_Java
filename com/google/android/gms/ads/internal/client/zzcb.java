package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdz;

public abstract class zzcb extends zzaqx implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable0 = zzaqy.zza(parcel0, zzq.CREATOR);
                String s = parcel0.readString();
                zzbua zzbua0 = zzbtz.zzf(parcel0.readStrongBinder());
                int v1 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzbs zzbs0 = this.zzd(iObjectWrapper0, ((zzq)parcelable0), s, zzbua0, v1);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbs0);
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable1 = zzaqy.zza(parcel0, zzq.CREATOR);
                String s1 = parcel0.readString();
                zzbua zzbua1 = zzbtz.zzf(parcel0.readStrongBinder());
                int v2 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzbs zzbs1 = this.zze(iObjectWrapper1, ((zzq)parcelable1), s1, zzbua1, v2);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbs1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                String s2 = parcel0.readString();
                zzbua zzbua2 = zzbtz.zzf(parcel0.readStrongBinder());
                int v3 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzbo zzbo0 = this.zzb(iObjectWrapper2, s2, zzbua2, v3);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbo0);
                return true;
            }
            case 4: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                zzblf zzblf0 = this.zzh(iObjectWrapper3, iObjectWrapper4);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzblf0);
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzbua zzbua3 = zzbtz.zzf(parcel0.readStrongBinder());
                int v4 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzcao zzcao0 = this.zzm(iObjectWrapper5, zzbua3, v4);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzcao0);
                return true;
            }
            case 7: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 8: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                zzbxv zzbxv0 = this.zzl(iObjectWrapper6);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbxv0);
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                int v5 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzcm zzcm0 = this.zzg(iObjectWrapper7, v5);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzcm0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                zzq zzq0 = (zzq)zzaqy.zza(parcel0, zzq.CREATOR);
                String s3 = parcel0.readString();
                int v6 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzbs zzbs2 = this.zzf(iObjectWrapper8, zzq0, s3, v6);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbs2);
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                zzbll zzbll0 = this.zzi(iObjectWrapper9, iObjectWrapper10, iObjectWrapper11);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbll0);
                return true;
            }
            case 12: {
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                String s4 = parcel0.readString();
                zzbua zzbua4 = zzbtz.zzf(parcel0.readStrongBinder());
                int v7 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzcbe zzcbe0 = this.zzn(iObjectWrapper12, s4, zzbua4, v7);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzcbe0);
                return true;
            }
            case 13: {
                IObjectWrapper iObjectWrapper13 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable2 = zzaqy.zza(parcel0, zzq.CREATOR);
                String s5 = parcel0.readString();
                zzbua zzbua5 = zzbtz.zzf(parcel0.readStrongBinder());
                int v8 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzbs zzbs3 = this.zzc(iObjectWrapper13, ((zzq)parcelable2), s5, zzbua5, v8);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbs3);
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper14 = Stub.asInterface(parcel0.readStrongBinder());
                zzbua zzbua6 = zzbtz.zzf(parcel0.readStrongBinder());
                int v9 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzcdz zzcdz0 = this.zzo(iObjectWrapper14, zzbua6, v9);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzcdz0);
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper15 = Stub.asInterface(parcel0.readStrongBinder());
                zzbua zzbua7 = zzbtz.zzf(parcel0.readStrongBinder());
                int v10 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                zzbxl zzbxl0 = this.zzk(iObjectWrapper15, zzbua7, v10);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbxl0);
                return true;
            }
            case 16: {
                IObjectWrapper iObjectWrapper16 = Stub.asInterface(parcel0.readStrongBinder());
                zzbua zzbua8 = zzbtz.zzf(parcel0.readStrongBinder());
                int v11 = parcel0.readInt();
                zzbph zzbph0 = zzbpg.zzc(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                zzbpk zzbpk0 = this.zzj(iObjectWrapper16, zzbua8, v11, zzbph0);
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbpk0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

