package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.AdapterStatus;

public final class zzbqo implements AdapterStatus {
    public final State a;
    public final String b;
    public final int c;

    public zzbqo(State adapterStatus$State0, String s, int v) {
        this.a = adapterStatus$State0;
        this.b = s;
        this.c = v;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final State getInitializationState() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.c;
    }
}

