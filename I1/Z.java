package i1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;

public final class z implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;
    public final long l;
    public final Object m;
    public final Object n;

    public z(Object object0, Object object1, Object object2, Object object3, long v, int v1) {
        this.i = v1;
        this.n = object0;
        this.j = object1;
        this.k = object2;
        this.m = object3;
        this.l = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.i) {
            case 0: {
                zzpf.zzc();
                zzgw zzgw0 = (zzgw)this.n;
                boolean z = zzgw0.i.zzg().zzs(null, zzeh.zzak);
                long v = this.l;
                String s = (String)this.m;
                String s1 = (String)this.j;
                String s2 = (String)this.k;
                if(z) {
                    if(s1 == null) {
                        zzgw0.i.zzR(s2, null);
                        return;
                    }
                    zziq zziq0 = new zziq(s, s1, v);
                    zzgw0.i.zzR(s2, zziq0);
                    return;
                }
                if(s1 == null) {
                    zzgw0.i.l.zzs().zzy(s2, null);
                    return;
                }
                zziq zziq1 = new zziq(s, s1, v);
                zzgw0.i.l.zzs().zzy(s2, zziq1);
                return;
            }
            case 1: {
                ((zzij)this.n).h(this.l, this.m, ((String)this.j), ((String)this.k));
                return;
            }
            default: {
                ((Bundle)this.j).remove("screen_name");
                ((Bundle)this.j).remove("screen_class");
                Bundle bundle0 = ((zziy)this.n).a.zzv().Q("screen_view", ((Bundle)this.j), null, false);
                ((zziy)this.n).d(((zziq)this.k), ((zziq)this.m), this.l, true, bundle0);
            }
        }
    }
}

