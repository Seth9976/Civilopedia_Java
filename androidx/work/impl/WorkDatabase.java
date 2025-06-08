package androidx.work.impl;

import B1.a;
import E1.d;
import O.j;
import f0.g;
import g1.n;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends j {
    public static final long j;
    public static final int k;

    static {
        WorkDatabase.j = TimeUnit.DAYS.toMillis(1L);
    }

    public abstract n i();

    public abstract n j();

    public abstract a k();

    public abstract n l();

    public abstract g m();

    public abstract d n();

    public abstract n o();
}

