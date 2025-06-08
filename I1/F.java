package i1;

import B.a;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

public abstract class f {
    public final C a;
    public final a b;
    public volatile long c;
    public static volatile zzby d;

    public f(C c0) {
        Preconditions.checkNotNull(c0);
        this.a = c0;
        this.b = new a(this, c0, 9, false);
    }

    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks(this.b);
    }

    public abstract void b();

    public final void c(long v) {
        this.a();
        if(v >= 0L) {
            this.c = this.a.zzav().currentTimeMillis();
            if(!this.d().postDelayed(this.b, v)) {
                this.a.zzay().zzd().zzb("Failed to schedule delayed post. time", v);
            }
        }
    }

    public final Handler d() {
        if(f.d != null) {
            return f.d;
        }
        synchronized(f.class) {
            if(f.d == null) {
                f.d = new zzby(this.a.zzau().getMainLooper());
            }
            return f.d;
        }
    }
}

