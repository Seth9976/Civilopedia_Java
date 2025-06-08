package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class zzdwh {
    public final zzdwm a;
    public final Executor b;
    public final Map c;

    public zzdwh(zzdwm zzdwm0, Executor executor0) {
        this.a = zzdwm0;
        this.c = zzdwm0.zza();
        this.b = executor0;
    }

    public final zzdwg zza() {
        zzdwg zzdwg0 = new zzdwg(this);
        zzdwg0.a.putAll(this.c);
        return zzdwg0;
    }
}

