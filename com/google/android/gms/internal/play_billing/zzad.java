package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzad extends zzar implements zzae {
    public zzad() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override  // com.google.android.gms.internal.play_billing.zzar
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Bundle bundle0 = (Bundle)zzas.zza(parcel0, Bundle.CREATOR);
            zzas.zzb(parcel0);
            this.zza(bundle0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

