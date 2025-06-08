package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public class zzgqc extends zzgqf implements zzako {
    public zzakp p;
    public final String q;

    public zzgqc(String s) {
        this.q = "moov";
    }

    @Override  // com.google.android.gms.internal.ads.zzako
    public final String zza() {
        return this.q;
    }

    @Override  // com.google.android.gms.internal.ads.zzako
    public final void zzb(zzgqg zzgqg0, ByteBuffer byteBuffer0, long v, zzakl zzakl0) throws IOException {
        zzgqg0.zzb();
        byteBuffer0.remaining();
        this.j = zzgqg0;
        this.l = zzgqg0.zzb();
        zzgqg0.zze(zzgqg0.zzb() + v);
        this.m = zzgqg0.zzb();
        this.i = zzakl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzako
    public final void zzc(zzakp zzakp0) {
        this.p = zzakp0;
    }
}

