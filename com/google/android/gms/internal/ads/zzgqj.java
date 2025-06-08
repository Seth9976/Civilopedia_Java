package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgqj extends zzgqm {
    public final Logger a;

    public zzgqj(String s) {
        this.a = Logger.getLogger(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqm
    public final void zza(String s) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", s);
    }
}

