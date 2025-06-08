package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzfm {
    public final HashMap a;
    public Map b;

    public zzfm() {
        this.a = new HashMap();
    }

    public final Map zza() {
        synchronized(this) {
            if(this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }
    }
}

