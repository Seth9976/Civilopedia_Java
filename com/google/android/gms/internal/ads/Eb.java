package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class eb extends zzgb {
    public long c;
    public int d;
    public int e;

    public final boolean c(zzgb zzgb0) {
        zzcw.zzd(!zzgb0.a(0x40000000));
        zzcw.zzd(!zzgb0.a(0x10000000));
        zzcw.zzd(!zzgb0.a(4));
        if(this.d <= 0 || this.d < this.e && zzgb0.a(0x80000000) == this.a(0x80000000) && (zzgb0.zzb == null || (this.zzb == null || zzgb0.zzb.remaining() + this.zzb.position() <= 3072000))) {
            int v = this.d;
            this.d = v + 1;
            if(v == 0) {
                this.zzd = zzgb0.zzd;
                if(zzgb0.a(1)) {
                    this.zzc(1);
                }
            }
            if(zzgb0.a(0x80000000)) {
                this.zzc(0x80000000);
            }
            ByteBuffer byteBuffer0 = zzgb0.zzb;
            if(byteBuffer0 != null) {
                this.zzi(byteBuffer0.remaining());
                this.zzb.put(byteBuffer0);
            }
            this.c = zzgb0.zzd;
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzgb
    public final void zzb() {
        super.zzb();
        this.d = 0;
    }
}

