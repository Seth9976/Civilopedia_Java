package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class zzgqb implements zzako {
    public final String i;
    public zzakp j;
    public boolean k;
    public boolean l;
    public ByteBuffer m;
    public long n;
    public long o;
    public zzgqg p;
    public static final zzgqm q;

    static {
        zzgqb.q = zzgqm.zzb(zzgqb.class);
    }

    public zzgqb(String s) {
        this.o = -1L;
        this.i = s;
        this.l = true;
        this.k = true;
    }

    public final void a() {
        synchronized(this) {
            if(!this.l) {
                try {
                    zzgqb.q.zza((this.i.length() == 0 ? new String("mem mapping ") : "mem mapping " + this.i));
                    this.m = this.p.zzd(this.n, this.o);
                    this.l = true;
                    return;
                }
                catch(IOException iOException0) {
                }
                throw new RuntimeException(iOException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzako
    public final String zza() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzako
    public final void zzb(zzgqg zzgqg0, ByteBuffer byteBuffer0, long v, zzakl zzakl0) throws IOException {
        this.n = zzgqg0.zzb();
        byteBuffer0.remaining();
        this.o = v;
        this.p = zzgqg0;
        zzgqg0.zze(zzgqg0.zzb() + v);
        this.l = false;
        this.k = false;
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzako
    public final void zzc(zzakp zzakp0) {
        this.j = zzakp0;
    }

    public abstract void zzf(ByteBuffer arg1);

    public final void zzg() {
        synchronized(this) {
            this.a();
            zzgqb.q.zza((this.i.length() == 0 ? new String("parsing details of ") : "parsing details of " + this.i));
            ByteBuffer byteBuffer0 = this.m;
            if(byteBuffer0 != null) {
                this.k = true;
                byteBuffer0.rewind();
                this.zzf(byteBuffer0);
                if(byteBuffer0.remaining() > 0) {
                    byteBuffer0.slice();
                }
                this.m = null;
            }
        }
    }
}

