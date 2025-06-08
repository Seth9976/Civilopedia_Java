package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzdm extends zzaqx implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                this.zzi();
                break;
            }
            case 2: {
                this.zzh();
                break;
            }
            case 3: {
                this.zzg();
                break;
            }
            case 4: {
                this.zze();
                break;
            }
            case 5: {
                boolean z = zzaqy.zzh(parcel0);
                zzaqy.zzc(parcel0);
                this.zzf(z);
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

