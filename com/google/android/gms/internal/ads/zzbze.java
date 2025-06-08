package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzbze extends zzaqx implements zzbzf {
    public zzbze() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            this.zzb();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

