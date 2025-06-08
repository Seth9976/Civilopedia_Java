package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbcf extends zzaqx implements zzbcg {
    public zzbcf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbck zzbck0 = null;
        switch(v) {
            case 2: {
                zzbs zzbs0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbs0);
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzbck0 = iInterface0 instanceof zzbck ? ((zzbck)iInterface0) : new zzbck(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzj(zzbck0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbck0 = iInterface1 instanceof zzbcn ? ((zzbcn)iInterface1) : new zzbcl(iBinder1, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzi(iObjectWrapper0, ((zzbcn)zzbck0));
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzdh zzdh0 = this.zzf();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdh0);
                return true;
            }
            case 6: {
                boolean z = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzg(z);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzde zzde0 = zzdd.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzh(zzde0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

