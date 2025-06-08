package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcar;

public abstract class zzbr extends zzaqx implements zzbs {
    public zzbr() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbf zzbf0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzn();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.zzZ();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 4: {
                zzl zzl0 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                zzaqy.zzc(parcel0);
                boolean z1 = this.zzaa(zzl0);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z1);
                return true;
            }
            case 5: {
                this.zzz();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                this.zzB();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbf0 = iInterface0 instanceof zzbf ? ((zzbf)iInterface0) : new zzbd(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzD(zzbf0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbf0 = iInterface1 instanceof zzbz ? ((zzbz)iInterface1) : new zzbx(iBinder1);
                }
                zzaqy.zzc(parcel0);
                this.zzG(((zzbz)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzX();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                this.zzA();
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                zzq zzq0 = this.zzg();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, zzq0);
                return true;
            }
            case 13: {
                zzq zzq1 = (zzq)zzaqy.zza(parcel0, zzq.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzF(zzq1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbye zzbye0 = zzbyd.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzM(zzbye0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                zzbyh zzbyh0 = zzbyg.zzb(parcel0.readStrongBinder());
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzQ(zzbyh0, s);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                String s1 = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 19: {
                zzbiu zzbiu0 = zzbit.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzO(zzbiu0);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbf0 = iInterface2 instanceof zzbc ? ((zzbc)iInterface2) : new zzba(iBinder2, "com.google.android.gms.ads.internal.client.IAdClickListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzC(((zzbc)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbf0 = iInterface3 instanceof zzcd ? ((zzcd)iInterface3) : new zzcd(iBinder3);
                }
                zzaqy.zzc(parcel0);
                this.zzab(((zzcd)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                boolean z2 = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzN(z2);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                boolean z3 = this.zzY();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z3);
                return true;
            }
            case 24: {
                zzcar zzcar0 = zzcaq.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzS(zzcar0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                String s2 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzT(s2);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzdk zzdk0 = this.zzl();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 29: {
                zzff zzff0 = (zzff)zzaqy.zza(parcel0, zzff.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzU(zzff0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                zzdo zzdo0 = (zzdo)zzaqy.zza(parcel0, zzdo.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzK(zzdo0);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                String s3 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 0x20: {
                zzbz zzbz0 = this.zzj();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbz0);
                return true;
            }
            case 33: {
                zzbf zzbf1 = this.zzi();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbf1);
                return true;
            }
            case 34: {
                boolean z4 = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzL(z4);
                parcel1.writeNoException();
                return true;
            }
            case 35: {
                String s4 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 36: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbf0 = iInterface4 instanceof zzbw ? ((zzbw)iInterface4) : new zzbu(iBinder4);
                }
                zzaqy.zzc(parcel0);
                this.zzE(((zzbw)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 37: {
                Bundle bundle0 = this.zzd();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, bundle0);
                return true;
            }
            case 38: {
                String s5 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzR(s5);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                zzw zzw0 = (zzw)zzaqy.zza(parcel0, zzw.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzI(zzw0);
                parcel1.writeNoException();
                return true;
            }
            case 40: {
                zzbcj zzbcj0 = zzbci.zze(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzH(zzbcj0);
                parcel1.writeNoException();
                return true;
            }
            case 41: {
                zzdh zzdh0 = this.zzk();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdh0);
                return true;
            }
            case 42: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzbf0 = iInterface5 instanceof zzde ? ((zzde)iInterface5) : new zzdc(iBinder5);
                }
                zzaqy.zzc(parcel0);
                this.zzP(((zzde)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 43: {
                zzl zzl1 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbf0 = iInterface6 instanceof zzbi ? ((zzbi)iInterface6) : new zzbg(iBinder6, "com.google.android.gms.ads.internal.client.IAdLoadCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzy(zzl1, ((zzbi)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            case 44: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzW(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 45: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzbf0 = iInterface7 instanceof zzcg ? ((zzcg)iInterface7) : new zzce(iBinder7, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzJ(((zzcg)zzbf0));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbs zzac(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterface0 instanceof zzbs ? ((zzbs)iInterface0) : new zzbq(iBinder0);
    }
}

