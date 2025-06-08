package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.measurement.internal.zzgb;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class u extends FutureTask implements Comparable {
    public final long i;
    public final boolean j;
    public final String k;
    public final zzgb l;

    public u(zzgb zzgb0, Runnable runnable0, boolean z, String s) {
        this.l = zzgb0;
        super(runnable0, null);
        Preconditions.checkNotNull(s);
        long v = zzgb.k.getAndIncrement();
        this.i = v;
        this.k = s;
        this.j = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            u9.o(zzgb0.a, "Tasks index overflow");
        }
    }

    public u(zzgb zzgb0, Callable callable0, boolean z) {
        this.l = zzgb0;
        super(callable0);
        Preconditions.checkNotNull("Task exception on worker thread");
        long v = zzgb.k.getAndIncrement();
        this.i = v;
        this.k = "Task exception on worker thread";
        this.j = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            u9.o(zzgb0.a, "Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(Object object0) {
        boolean z = this.j;
        if(z != ((u)object0).j) {
            return z ? -1 : 1;
        }
        long v = this.i;
        int v1 = Long.compare(v, ((u)object0).i);
        if(v1 >= 0) {
            if(v1 > 0) {
                return 1;
            }
            this.l.a.zzay().zzh().zzb("Two tasks share the same index. index", v);
            return 0;
        }
        return -1;
    }

    @Override
    public final void setException(Throwable throwable0) {
        this.l.a.zzay().zzd().zzb(this.k, throwable0);
        super.setException(throwable0);
    }
}

