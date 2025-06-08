package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class zzgb extends zzfv {
    public final int b;
    public final zzfy zza;
    public ByteBuffer zzb;
    public boolean zzc;
    public long zzd;
    public ByteBuffer zze;

    static {
        zzbc.zzb("media3.decoder");
    }

    public zzgb(int v, int v1) {
        this.zza = new zzfy();
        this.b = v;
    }

    public final ByteBuffer b(int v) {
        int v1 = this.b;
        if(v1 == 1) {
            return ByteBuffer.allocate(v);
        }
        if(v1 != 2) {
            throw new zzga((this.zzb == null ? 0 : this.zzb.capacity()), v);
        }
        return ByteBuffer.allocateDirect(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzfv
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
        ByteBuffer byteBuffer1 = this.zze;
        if(byteBuffer1 != null) {
            byteBuffer1.clear();
        }
        this.zzc = false;
    }

    @EnsuresNonNull({"data"})
    public final void zzi(int v) {
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 == null) {
            this.zzb = this.b(v);
            return;
        }
        int v1 = byteBuffer0.position();
        int v2 = v + v1;
        if(byteBuffer0.capacity() >= v2) {
            this.zzb = byteBuffer0;
            return;
        }
        ByteBuffer byteBuffer1 = this.b(v2);
        byteBuffer1.order(byteBuffer0.order());
        if(v1 > 0) {
            byteBuffer0.flip();
            byteBuffer1.put(byteBuffer0);
        }
        this.zzb = byteBuffer1;
    }

    public final void zzj() {
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 != null) {
            byteBuffer0.flip();
        }
        ByteBuffer byteBuffer1 = this.zze;
        if(byteBuffer1 != null) {
            byteBuffer1.flip();
        }
    }

    public final boolean zzk() {
        return this.a(0x40000000);
    }
}

