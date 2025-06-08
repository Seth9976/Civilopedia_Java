package com.google.android.gms.internal.location;

import android.os.Parcel;

public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override  // com.google.android.gms.internal.location.zzb
    public final boolean a(Parcel parcel0, int v) {
        switch(v) {
            case 1: {
                this.zzb(((zzaa)zzc.zzb(parcel0, zzaa.CREATOR)));
                return true;
            }
            case 2: {
                this.zzc();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

