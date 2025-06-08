package com.google.android.gms.internal.consent_sdk;

public final class zzcf implements zzch {
    public zzcl i;

    public static void zza(zzcl zzcl0, zzcl zzcl1) {
        if(((zzcf)zzcl0).i != null) {
            throw new IllegalStateException();
        }
        ((zzcf)zzcl0).i = zzcl1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        zzcl zzcl0 = this.i;
        if(zzcl0 == null) {
            throw new IllegalStateException();
        }
        return zzcl0.zzb();
    }
}

