package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zziq;
import p.b;

public final class a implements Runnable {
    public final int i;
    public final String j;
    public final long k;
    public final zzd l;

    public a(zzd zzd0, String s, long v, int v1) {
        this.i = v1;
        this.l = zzd0;
        this.j = s;
        this.k = v;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            zzd zzd0 = this.l;
            zzd0.zzg();
            String s = this.j;
            Preconditions.checkNotEmpty(s);
            b b0 = zzd0.c;
            Integer integer0 = (Integer)b0.getOrDefault(s, null);
            zzge zzge0 = zzd0.a;
            if(integer0 == null) {
                zzge0.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", s);
            }
            else {
                zziq zziq0 = zzge0.zzs().zzj(false);
                int v = (int)integer0;
                if(v - 1 != 0) {
                    b0.put(s, ((int)(v - 1)));
                    return;
                }
                b0.remove(s);
                b b1 = zzd0.b;
                Long long0 = (Long)b1.getOrDefault(s, null);
                long v1 = this.k;
                if(long0 == null) {
                    u9.o(zzge0, "First ad unit exposure time was never set");
                }
                else {
                    b1.remove(s);
                    zzd0.b(s, v1 - ((long)long0), zziq0);
                }
                if(b0.isEmpty()) {
                    long v2 = zzd0.d;
                    if(v2 == 0L) {
                        u9.o(zzge0, "First ad exposure time was never set");
                        return;
                    }
                    zzd0.a(v1 - v2, zziq0);
                    zzd0.d = 0L;
                    return;
                }
            }
            return;
        }
        zzd zzd1 = this.l;
        zzd1.zzg();
        String s1 = this.j;
        Preconditions.checkNotEmpty(s1);
        b b2 = zzd1.c;
        long v3 = this.k;
        if(b2.isEmpty()) {
            zzd1.d = v3;
        }
        Integer integer1 = (Integer)b2.getOrDefault(s1, null);
        if(integer1 != null) {
            b2.put(s1, ((int)(((int)integer1) + 1)));
            return;
        }
        if(b2.k >= 100) {
            zzd1.a.zzay().zzk().zza("Too many ads visible");
            return;
        }
        b2.put(s1, 1);
        zzd1.b.put(s1, v3);
    }
}

