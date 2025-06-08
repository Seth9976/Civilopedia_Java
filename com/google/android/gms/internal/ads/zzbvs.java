package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbvs extends zzaqx implements zzbvt {
    public zzbvs() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbvk zzbvk0;
        zzbvw zzbvw0;
        zzbvh zzbvh0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, parcelable$Creator0);
                Parcelable parcelable0 = zzaqy.zza(parcel0, parcelable$Creator0);
                Parcelable parcelable1 = zzaqy.zza(parcel0, zzq.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbvw0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    zzbvw0 = iInterface0 instanceof zzbvw ? ((zzbvw)iInterface0) : new zzbvu(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzh(iObjectWrapper0, s, bundle0, ((Bundle)parcelable0), ((zzq)parcelable1), zzbvw0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                zzbwg zzbwg0 = this.zzf();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, zzbwg0);
                return true;
            }
            case 3: {
                zzbwg zzbwg1 = this.zzg();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, zzbwg1);
                return true;
            }
            case 5: {
                zzdk zzdk0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 10: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                parcel0.createStringArray();
                Bundle[] arr_bundle = (Bundle[])parcel0.createTypedArray(Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Parcelable parcelable2 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbvh0 = iInterface1 instanceof zzbvh ? ((zzbvh)iInterface1) : new zzbvf(iBinder1);
                }
                zzbug zzbug0 = zzbuf.zzb(parcel0.readStrongBinder());
                Parcelable parcelable3 = zzaqy.zza(parcel0, zzq.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzi(s1, s2, ((zzl)parcelable2), iObjectWrapper1, zzbvh0, zzbug0, ((zzq)parcelable3));
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                Parcelable parcelable4 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    zzbvk0 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    zzbvk0 = iInterface2 instanceof zzbvk ? ((zzbvk)iInterface2) : new zzbvi(iBinder2, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzbug zzbug1 = zzbuf.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzk(s3, s4, ((zzl)parcelable4), iObjectWrapper2, zzbvk0, zzbug1);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                boolean z = this.zzq(iObjectWrapper3);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 16: {
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                Parcelable parcelable5 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbvh0 = iInterface3 instanceof zzbvq ? ((zzbvq)iInterface3) : new zzbvo(iBinder3);
                }
                zzbug zzbug2 = zzbuf.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzo(s5, s6, ((zzl)parcelable5), iObjectWrapper4, zzbvh0, zzbug2);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                boolean z1 = this.zzr(iObjectWrapper5);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 18: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                Parcelable parcelable6 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbvh0 = iInterface4 instanceof zzbvn ? ((zzbvn)iInterface4) : new zzbvl(iBinder4);
                }
                zzbug zzbug3 = zzbuf.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzl(s7, s8, ((zzl)parcelable6), iObjectWrapper6, zzbvh0, zzbug3);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                String s9 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzp(s9);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                Parcelable parcelable7 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbvh0 = iInterface5 instanceof zzbvq ? ((zzbvq)iInterface5) : new zzbvo(iBinder5);
                }
                zzbug zzbug4 = zzbuf.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzn(s10, s11, ((zzl)parcelable7), iObjectWrapper7, zzbvh0, zzbug4);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                Parcelable parcelable8 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbvh0 = iInterface6 instanceof zzbvh ? ((zzbvh)iInterface6) : new zzbvf(iBinder6);
                }
                zzbug zzbug5 = zzbuf.zzb(parcel0.readStrongBinder());
                Parcelable parcelable9 = zzaqy.zza(parcel0, zzq.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzj(s12, s13, ((zzl)parcelable8), iObjectWrapper8, zzbvh0, zzbug5, ((zzq)parcelable9));
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                Parcelable parcelable10 = zzaqy.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbvh0 = iInterface7 instanceof zzbvn ? ((zzbvn)iInterface7) : new zzbvl(iBinder7);
                }
                zzbug zzbug6 = zzbuf.zzb(parcel0.readStrongBinder());
                Parcelable parcelable11 = zzaqy.zza(parcel0, zzbkp.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzm(s14, s15, ((zzl)parcelable10), iObjectWrapper9, zzbvh0, zzbug6, ((zzbkp)parcelable11));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbvt zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterface0 instanceof zzbvt ? ((zzbvt)iInterface0) : new zzbvr(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

