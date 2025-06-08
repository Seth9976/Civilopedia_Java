package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbkx extends zzaqx implements zzbky {
    public zzbkx() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbmj zzbmj0;
        switch(v) {
            case 2: {
                float f = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzj(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IObjectWrapper iObjectWrapper1 = this.zzi();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper1);
                return true;
            }
            case 5: {
                float f1 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 6: {
                float f2 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;
            }
            case 7: {
                zzdk zzdk0 = this.zzh();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, zzdk0);
                return true;
            }
            case 8: {
                boolean z = this.zzk();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 9: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbmj0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbmj0 = iInterface0 instanceof zzbmj ? ((zzbmj)iInterface0) : new zzbmj(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                zzaqy.zzc(parcel0);
                this.zzl(zzbmj0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

