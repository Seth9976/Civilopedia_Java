package i1;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfh;
import com.google.android.gms.measurement.internal.zzge;
import i3.e;
import java.io.IOException;
import java.util.Map;

public final class l implements Runnable {
    public final int i;
    public final int j;
    public final String k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public l(zzeu zzeu0, int v, String s, Object object0, Object object1, Object object2) {
        this.i = 0;
        super();
        this.o = zzeu0;
        this.j = v;
        this.k = s;
        this.l = object0;
        this.m = object1;
        this.n = object2;
    }

    public l(String s, n n0, int v, IOException iOException0, byte[] arr_b, Map map0) {
        this.i = 1;
        super();
        Preconditions.checkNotNull(n0);
        this.l = n0;
        this.j = v;
        this.m = iOException0;
        this.n = arr_b;
        this.k = s;
        this.o = map0;
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            ((n)this.l).a(this.k, this.j, ((IOException)this.m), ((byte[])this.n), ((Map)this.o));
            return;
        }
        zzeu zzeu0 = (zzeu)this.o;
        r r0 = zzeu0.a.zzm();
        if(r0.b) {
            zzge zzge0 = zzeu0.a;
            if(zzeu0.c == 0) {
                zzeu0.c = zzge0.zzf().zzy() ? 'C' : 'c';
            }
            if(zzeu0.d < 0L) {
                zzge0.zzf().zzh();
                zzeu0.d = 68000L;
            }
            int v = zzeu0.c;
            long v1 = zzeu0.d;
            String s = this.k;
            String s1 = zzeu.e(true, s, this.l, this.m, this.n);
            StringBuilder stringBuilder0 = new StringBuilder("2");
            stringBuilder0.append("01VDIWEA?".charAt(this.j));
            stringBuilder0.append(((char)v));
            stringBuilder0.append(v1);
            String s2 = e.h(stringBuilder0, ":", s1);
            if(s2.length() > 0x400) {
                s2 = s.substring(0, 0x400);
            }
            zzfh zzfh0 = r0.d;
            if(zzfh0 != null) {
                zzfh0.zzb(s2, 1L);
            }
        }
        else {
            Log.println(6, zzeu0.zzq(), "Persisted config not initialized. Not logging error/warn");
        }
    }
}

