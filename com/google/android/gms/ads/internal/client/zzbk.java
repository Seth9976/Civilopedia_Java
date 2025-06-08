package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzbk extends zzaqx implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                zzl zzl1 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzg(zzl1);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 3: {
                boolean z = this.zzi();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 4: {
                String s = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                zzl zzl0 = (zzl)zzaqy.zza(parcel0, zzl.CREATOR);
                int v1 = parcel0.readInt();
                zzaqy.zzc(parcel0);
                this.zzh(zzl0, v1);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

