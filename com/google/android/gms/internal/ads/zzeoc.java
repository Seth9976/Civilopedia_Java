package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

public final class zzeoc implements zzetf {
    public final ArrayList zza;

    public zzeoc(ArrayList arrayList0) {
        this.zza = arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putStringArrayList("ad_types", this.zza);
    }
}

