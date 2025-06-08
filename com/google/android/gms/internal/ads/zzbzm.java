package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbzm extends zzaqx implements zzbzn {
    public zzbzm() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbzr zzbzr0 = null;
        switch(v) {
            case 1: {
                zzbzh zzbzh1 = (zzbzh)zzaqy.zza(parcel0, zzbzh.CREATOR);
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, null);
                return true;
            }
            case 2: {
                zzbzh zzbzh0 = (zzbzh)zzaqy.zza(parcel0, zzbzh.CREATOR);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if(iInterface4 instanceof zzbzo) {
                        zzbzo zzbzo0 = (zzbzo)iInterface4;
                    }
                }
                zzaqy.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzbzv zzbzv2 = (zzbzv)zzaqy.zza(parcel0, zzbzv.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzr0 = iInterface3 instanceof zzbzr ? ((zzbzr)iInterface3) : new zzbzp(iBinder3);
                }
                zzaqy.zzc(parcel0);
                this.zzg(zzbzv2, zzbzr0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzbzv zzbzv1 = (zzbzv)zzaqy.zza(parcel0, zzbzv.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzr0 = iInterface2 instanceof zzbzr ? ((zzbzr)iInterface2) : new zzbzp(iBinder2);
                }
                zzaqy.zzc(parcel0);
                this.zzf(zzbzv1, zzbzr0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzbzv zzbzv0 = (zzbzv)zzaqy.zza(parcel0, zzbzv.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzr0 = iInterface1 instanceof zzbzr ? ((zzbzr)iInterface1) : new zzbzp(iBinder1);
                }
                zzaqy.zzc(parcel0);
                this.zze(zzbzv0, zzbzr0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzr0 = iInterface0 instanceof zzbzr ? ((zzbzr)iInterface0) : new zzbzp(iBinder0);
                }
                zzaqy.zzc(parcel0);
                this.zzh(s, zzbzr0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

