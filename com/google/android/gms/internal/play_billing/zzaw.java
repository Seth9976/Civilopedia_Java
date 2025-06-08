package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

public abstract class zzaw extends zzar implements zzax {
    public zzaw() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override  // com.google.android.gms.internal.play_billing.zzar
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            int v1 = parcel0.readInt();
            zzas.zzb(parcel0);
            this.zza(v1);
            return true;
        }
        return false;
    }
}

