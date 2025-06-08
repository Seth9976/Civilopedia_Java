package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzbnt implements zzfok {
    public final String zza;

    public zzbnt(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        String s = this.zza;
        if(((Boolean)zzbjo.zzk.zze()).booleanValue()) {
            zzt.zzo().zzt(((Throwable)object0), "prepareClickUrl.attestation2");
        }
        return s;
    }
}

