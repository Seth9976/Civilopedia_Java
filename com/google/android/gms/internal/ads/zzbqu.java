package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbqu extends zzaqx implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbqy zzbqy0;
        switch(v) {
            case 3: {
                zzdk zzdk0 = this.zzb();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 4: {
                this.zzd();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbqy0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbqy0 = iInterface0 instanceof zzbqy ? ((zzbqy)iInterface0) : new zzbqw(iBinder0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzf(iObjectWrapper1, zzbqy0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zze(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbky zzbky0 = this.zzc();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzbky0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

