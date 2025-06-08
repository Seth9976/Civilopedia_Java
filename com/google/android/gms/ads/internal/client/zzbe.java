package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzbe extends zzaqx implements zzbf {
    public zzbe() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                this.zzd();
                break;
            }
            case 2: {
                int v1 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                this.zze(v1);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.zzi();
                break;
            }
            case 5: {
                this.zzj();
                break;
            }
            case 6: {
                this.zzc();
                break;
            }
            case 7: {
                this.zzg();
                break;
            }
            case 8: {
                zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzf(zze0);
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

