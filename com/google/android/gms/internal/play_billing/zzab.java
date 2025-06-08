package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzab extends zzar implements zzac {
    public zzab() {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
    }

    @Override  // com.google.android.gms.internal.play_billing.zzar
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Bundle bundle0 = (Bundle)zzas.zza(parcel0, Bundle.CREATOR);
            zzas.zzb(parcel0);
            this.zza(bundle0);
            return true;
        }
        return false;
    }
}

