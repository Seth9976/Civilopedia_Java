package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzato extends zzatj {
    public final zzatm zza;
    public ByteBuffer zzb;
    public long zzc;

    public zzato(int v) {
        this.zza = new zzatm();
    }

    public final void a(int v) {
        throw new IllegalStateException("Buffer too small (" + (this.zzb == null ? 0 : this.zzb.capacity()) + " < " + v + ")");
    }

    @Override  // com.google.android.gms.internal.ads.zzatj
    public final void zzb() {
        super.zzb();
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
    }

    public final void zzh(int v) throws IllegalStateException {
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 != null) {
            int v1 = this.zzb.position() + v;
            if(byteBuffer0.capacity() >= v1) {
                return;
            }
            this.a(v1);
            throw null;
        }
        this.a(v);
        throw null;
    }

    public final boolean zzi() {
        return (this.a & 0x40000000) == 0x40000000;
    }
}

