package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgb;

public final class t implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final zzgb b;

    public t(zzgb zzgb0, String s) {
        this.b = zzgb0;
        Preconditions.checkNotNull(s);
        this.a = s;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        synchronized(this) {
            this.b.a.zzay().zzd().zzb(this.a, throwable0);
        }
    }
}

