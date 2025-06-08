package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;
import p.k;

public final class zzhg {
    public final k a;

    public zzhg(k k0) {
        this.a = k0;
    }

    @Nullable
    public final String zza(@Nullable Uri uri0, @Nullable String s, @Nullable String s1, String s2) {
        if(uri0 != null) {
            k k0 = (k)this.a.getOrDefault(uri0.toString(), null);
            return k0 == null ? null : ((String)k0.getOrDefault("" + s2, null));
        }
        return null;
    }
}

