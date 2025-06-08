package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.URL;
import java.net.URLConnection;

public final class zzfnl implements zzfnq {
    public final Network zza;
    public final URL zzb;

    public zzfnl(Network network0, URL uRL0) {
        this.zza = network0;
        this.zzb = uRL0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnq
    public final URLConnection zza() {
        return this.zza.openConnection(this.zzb);
    }
}

