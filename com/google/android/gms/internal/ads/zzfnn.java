package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

public final class zzfnn implements zzfnq {
    public final URL zza;

    public zzfnn(URL uRL0) {
        this.zza = uRL0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnq
    public final URLConnection zza() {
        return this.zza.openConnection();
    }
}

