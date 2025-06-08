package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

public abstract class zzbuc extends zzaqx implements zzbud {
    public zzbuc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbug zzbug0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable0 = zzaqy.zza(parcel0, zzq.CREATOR);
                Parcelable parcelable1 = zzaqy.zza(parcel0, zzl.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface0 instanceof zzbug ? ((zzbug)iInterface0) : new zzbue(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzt(iObjectWrapper0, ((zzq)parcelable0), ((zzl)parcelable1), s, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = this.zzn();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl0 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                String s1 = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface1 instanceof zzbug ? ((zzbug)iInterface1) : new zzbue(iBinder1);
                }
                zzaqy.zzc(parcel0);
                this.zzw(iObjectWrapper2, zzl0, s1, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzG();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                this.zzo();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable2 = zzaqy.zza(parcel0, zzq.CREATOR);
                Parcelable parcelable3 = zzaqy.zza(parcel0, zzl.CREATOR);
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface2 instanceof zzbug ? ((zzbug)iInterface2) : new zzbue(iBinder2);
                }
                zzaqy.zzc(parcel0);
                this.zzu(iObjectWrapper3, ((zzq)parcelable2), ((zzl)parcelable3), s2, s3, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable4 = zzaqy.zza(parcel0, zzl.CREATOR);
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface3 instanceof zzbug ? ((zzbug)iInterface3) : new zzbue(iBinder3);
                }
                zzaqy.zzc(parcel0);
                this.zzx(iObjectWrapper4, ((zzl)parcelable4), s4, s5, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zzD();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzE();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable5 = zzaqy.zza(parcel0, zzl.CREATOR);
                String s6 = parcel0.readString();
                zzcaw zzcaw0 = zzcav.zzb(parcel0.readStrongBinder());
                String s7 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzp(iObjectWrapper5, ((zzl)parcelable5), s6, zzcaw0, s7);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzl zzl1 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                String s8 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzs(zzl1, s8);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                this.zzJ();
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                boolean z = this.zzL();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable6 = zzaqy.zza(parcel0, zzl.CREATOR);
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface4 instanceof zzbug ? ((zzbug)iInterface4) : new zzbue(iBinder4);
                }
                Parcelable parcelable7 = zzaqy.zza(parcel0, zzbkp.CREATOR);
                ArrayList arrayList0 = parcel0.createStringArrayList();
                zzaqy.zzc(parcel0);
                this.zzy(iObjectWrapper6, ((zzl)parcelable6), s9, s10, zzbug0, ((zzbkp)parcelable7), arrayList0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, null);
                return true;
            }
            case 17: {
                Bundle bundle0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle0);
                return true;
            }
            case 18: {
                Bundle bundle1 = this.zzf();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle1);
                return true;
            }
            case 19: {
                Bundle bundle2 = this.zzg();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle2);
                return true;
            }
            case 20: {
                zzl zzl2 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzA(zzl2, s11, s12);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzC(iObjectWrapper7);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, false);
                return true;
            }
            case 23: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                zzcaw zzcaw1 = zzcav.zzb(parcel0.readStrongBinder());
                ArrayList arrayList1 = parcel0.createStringArrayList();
                zzaqy.zzc(parcel0);
                this.zzr(iObjectWrapper8, zzcaw1, arrayList1);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
                zzblv zzblv0 = this.zzi();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzblv0);
                return true;
            }
            case 25: {
                boolean z1 = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzF(z1);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzdk zzdk0 = this.zzh();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 27: {
                zzbup zzbup0 = this.zzk();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbup0);
                return true;
            }
            case 28: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl3 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                String s13 = parcel0.readString();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface5 instanceof zzbug ? ((zzbug)iInterface5) : new zzbue(iBinder5);
                }
                zzaqy.zzc(parcel0);
                this.zzz(iObjectWrapper9, zzl3, s13, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzI(iObjectWrapper10);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzbqk zzbqk0 = zzbqj.zzb(parcel0.readStrongBinder());
                ArrayList arrayList2 = parcel0.createTypedArrayList(zzbqq.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzq(iObjectWrapper11, zzbqk0, arrayList2);
                parcel1.writeNoException();
                return true;
            }
            case 0x20: {
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl4 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                String s14 = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface6 instanceof zzbug ? ((zzbug)iInterface6) : new zzbue(iBinder6);
                }
                zzaqy.zzc(parcel0);
                this.zzB(iObjectWrapper12, zzl4, s14, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 33: {
                zzbwg zzbwg0 = this.zzl();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, zzbwg0);
                return true;
            }
            case 34: {
                zzbwg zzbwg1 = this.zzm();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, zzbwg1);
                return true;
            }
            case 35: {
                IObjectWrapper iObjectWrapper13 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable8 = zzaqy.zza(parcel0, zzq.CREATOR);
                Parcelable parcelable9 = zzaqy.zza(parcel0, zzl.CREATOR);
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbug0 = iInterface7 instanceof zzbug ? ((zzbug)iInterface7) : new zzbue(iBinder7);
                }
                zzaqy.zzc(parcel0);
                this.zzv(iObjectWrapper13, ((zzq)parcelable8), ((zzl)parcelable9), s15, s16, zzbug0);
                parcel1.writeNoException();
                return true;
            }
            case 36: {
                zzbuj zzbuj0 = this.zzj();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbuj0);
                return true;
            }
            case 37: {
                IObjectWrapper iObjectWrapper14 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzH(iObjectWrapper14);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

