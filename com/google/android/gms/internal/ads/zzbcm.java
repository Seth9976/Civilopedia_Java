package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbcm extends zzaqx implements zzbcn {
    public zzbcm() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                this.zzf();
                break;
            }
            case 2: {
                this.zzc();
                break;
            }
            case 3: {
                zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzd(zze0);
                break;
            }
            case 4: {
                this.zze();
                break;
            }
            case 5: {
                this.zzb();
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

