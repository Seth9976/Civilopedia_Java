package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbvg extends zzaqx implements zzbvh {
    public zzbvg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzg(iObjectWrapper0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zze(s);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzf(zze0);
                break;
            }
            case 4: {
                zzbuj zzbuj0 = zzbui.zzb(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zzh(zzbuj0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

