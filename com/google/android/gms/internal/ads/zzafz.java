package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzafz implements zzaga {
    public final List a;
    public final zzzy[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public zzafz(List list0) {
        this.a = list0;
        this.b = new zzzy[list0.size()];
        this.f = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        boolean z1;
        boolean z;
        if(this.c) {
            if(this.d == 2) {
                if(zzdy0.zza() == 0) {
                    z = false;
                }
                else {
                    if(zzdy0.zzk() != 0x20) {
                        this.c = false;
                    }
                    --this.d;
                    z = this.c;
                }
                if(!z) {
                    return;
                }
            }
            if(this.d == 1) {
                if(zzdy0.zza() == 0) {
                    z1 = false;
                }
                else {
                    if(zzdy0.zzk() != 0) {
                        this.c = false;
                    }
                    --this.d;
                    z1 = this.c;
                }
                if(!z1) {
                    return;
                }
            }
            int v1 = zzdy0.zzc();
            int v2 = zzdy0.zza();
            zzzy[] arr_zzzy = this.b;
            for(int v = 0; v < arr_zzzy.length; ++v) {
                zzzy zzzy0 = arr_zzzy[v];
                zzdy0.zzF(v1);
                zzzy0.zzq(zzdy0, v2);
            }
            this.e += v2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        for(int v = 0; true; ++v) {
            zzzy[] arr_zzzy = this.b;
            if(v >= arr_zzzy.length) {
                break;
            }
            zzahj zzahj0 = (zzahj)this.a.get(v);
            zzahm0.zzc();
            zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 3);
            zzab zzab0 = new zzab();
            zzab0.zzH(zzahm0.zzb());
            zzab0.zzS("application/dvbsubs");
            zzab0.zzI(Collections.singletonList(zzahj0.zzb));
            zzab0.zzK(zzahj0.zza);
            zzzy0.zzk(zzab0.zzY());
            arr_zzzy[v] = zzzy0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
        if(this.c) {
            if(this.f != 0x8000000000000001L) {
                zzzy[] arr_zzzy = this.b;
                for(int v = 0; v < arr_zzzy.length; ++v) {
                    arr_zzzy[v].zzs(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.c = true;
        if(v != 0x8000000000000001L) {
            this.f = v;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.c = false;
        this.f = 0x8000000000000001L;
    }
}

