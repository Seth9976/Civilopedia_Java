package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzagm implements zzaga {
    public final zzdy a;
    public zzzy b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    public zzagm() {
        this.a = new zzdy(10);
        this.d = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        zzcw.zzb(this.b);
        if(!this.c) {
            return;
        }
        int v = zzdy0.zza();
        int v1 = this.f;
        if(v1 < 10) {
            int v2 = Math.min(v, 10 - v1);
            zzdy zzdy1 = this.a;
            System.arraycopy(zzdy0.zzH(), zzdy0.zzc(), zzdy1.zzH(), this.f, v2);
            if(this.f + v2 == 10) {
                zzdy1.zzF(0);
                if(zzdy1.zzk() == 73 && zzdy1.zzk() == 68 && zzdy1.zzk() == 51) {
                    zzdy1.zzG(3);
                    this.e = zzdy1.zzj() + 10;
                    goto label_18;
                }
                Log.w("Id3Reader", "Discarding invalid ID3 tag");
                this.c = false;
                return;
            }
        }
    label_18:
        int v3 = Math.min(v, this.e - this.f);
        zzzw.zzb(this.b, zzdy0, v3);
        this.f += v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 5);
        this.b = zzzy0;
        zzab zzab0 = new zzab();
        zzab0.zzH(zzahm0.zzb());
        zzab0.zzS("application/id3");
        zzzy0.zzk(zzab0.zzY());
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
        zzcw.zzb(this.b);
        if(this.c) {
            int v = this.e;
            if(v != 0 && this.f == v) {
                long v1 = this.d;
                if(v1 != 0x8000000000000001L) {
                    this.b.zzs(v1, 1, v, 0, null);
                }
                this.c = false;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.c = true;
        if(v != 0x8000000000000001L) {
            this.d = v;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.c = false;
        this.d = 0x8000000000000001L;
    }
}

