package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbla extends zzaqx implements zzblb {
    public zzbla() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzf();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                Uri uri0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzf(parcel1, uri0);
                return true;
            }
            case 3: {
                double f = this.zzb();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 4: {
                int v2 = this.zzd();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 5: {
                int v1 = this.zzc();
                parcel1.writeNoException();
                parcel1.writeInt(v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzblb zzg(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterface0 instanceof zzblb ? ((zzblb)iInterface0) : new zzbkz(iBinder0);
    }
}

