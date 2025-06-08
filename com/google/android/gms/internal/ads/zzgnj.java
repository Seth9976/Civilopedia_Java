package com.google.android.gms.internal.ads;

public final class zzgnj extends RuntimeException {
    public zzgnj(zzgma zzgma0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzglc zza() {
        return new zzglc(this.getMessage());
    }
}

