package com.google.android.gms.internal.ads;

import android.net.Uri;
import i3.e;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

public final class zzrd implements zzst {
    public final zzyy a;
    public zzyr b;
    public zzyl c;

    public zzrd(zzyy zzyy0) {
        this.a = zzyy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final int zza(zzzr zzzr0) throws IOException {
        zzyr zzyr0 = this.b;
        zzyr0.getClass();
        zzyl zzyl0 = this.c;
        zzyl0.getClass();
        return zzyr0.zza(zzyl0, zzzr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final long zzb() {
        return this.c == null ? -1L : this.c.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zzc() {
        zzyr zzyr0 = this.b;
        if(zzyr0 instanceof zzado) {
            ((zzado)zzyr0).zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zzd(zzp zzp0, Uri uri0, Map map0, long v, long v1, zzyu zzyu0) throws IOException {
        boolean z1;
        zzyl zzyl0 = new zzyl(zzp0, v, v1);
        this.c = zzyl0;
        if(this.b != null) {
            return;
        }
        zzyr[] arr_zzyr = this.a.zzb(uri0, map0);
        boolean z = true;
        if(arr_zzyr.length == 1) {
            this.b = arr_zzyr[0];
        }
        else {
            int v2 = 0;
            while(v2 < arr_zzyr.length) {
                zzyr zzyr0 = arr_zzyr[v2];
                try {
                    if(zzyr0.zzd(zzyl0)) {
                        this.b = zzyr0;
                        goto label_26;
                    }
                    goto label_29;
                }
                catch(EOFException unused_ex) {
                    z1 = this.b == null && zzyl0.zzf() != v ? false : true;
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    if(this.b == null && zzyl0.zzf() != v) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    zzyl0.zzj();
                    throw throwable0;
                }
            label_26:
                zzcw.zzf(true);
                zzyl0.zzj();
                break;
            label_29:
                z1 = this.b != null || zzyl0.zzf() == v;
            label_30:
                zzcw.zzf(z1);
                zzyl0.zzj();
                ++v2;
            }
            if(this.b == null) {
                throw new zztz(e.f("None of the available extractors (", zzeg.zzJ(arr_zzyr), ") could read the stream."), uri0);
            }
        }
        this.b.zzb(zzyu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zze() {
        if(this.b != null) {
            this.b = null;
        }
        this.c = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zzf(long v, long v1) {
        zzyr zzyr0 = this.b;
        zzyr0.getClass();
        zzyr0.zzc(v, v1);
    }
}

