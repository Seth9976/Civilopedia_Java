package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

public final class zzzi {
    public final zzdy a;

    public zzzi() {
        this.a = new zzdy(10);
    }

    public final zzbl zza(zzys zzys0, zzaby zzaby0) throws IOException {
        zzdy zzdy0 = this.a;
        zzbl zzbl0 = null;
        int v;
        for(v = 0; true; v += v2) {
            try {
                ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 10, false);
            }
            catch(EOFException unused_ex) {
                break;
            }
            zzdy0.zzF(0);
            if(zzdy0.zzm() != 4801587) {
                break;
            }
            zzdy0.zzG(3);
            int v1 = zzdy0.zzj();
            int v2 = v1 + 10;
            if(zzbl0 == null) {
                byte[] arr_b = new byte[v2];
                System.arraycopy(zzdy0.zzH(), 0, arr_b, 0, 10);
                ((zzyl)zzys0).zzm(arr_b, 10, v1, false);
                zzbl0 = zzaca.zza(arr_b, v2, zzaby0, new zzabb());
            }
            else {
                ((zzyl)zzys0).zzl(v1, false);
            }
        }
        zzys0.zzj();
        ((zzyl)zzys0).zzl(v, false);
        return zzbl0;
    }
}

