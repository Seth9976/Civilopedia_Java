package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

public final class zzeos implements zzetf {
    public final ArrayList zza;

    public zzeos(ArrayList arrayList0) {
        this.zza = arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putStringArrayList("android_permissions", this.zza);
    }
}

