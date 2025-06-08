package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzbmu extends zzaqx implements zzbmv {
    public zzbmu() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzf(s);
                break;
            }
            case 2: {
                this.zze();
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

