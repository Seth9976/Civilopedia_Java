package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class x extends u {
    public final int m;
    public final Activity n;
    public final y o;

    public x(y y0, Activity activity0, int v) {
        this.m = v;
        switch(v) {
            case 1: {
                this.o = y0;
                this.n = activity0;
                super(y0.i, true);
                return;
            }
            case 2: {
                this.o = y0;
                this.n = activity0;
                super(y0.i, true);
                return;
            }
            case 3: {
                this.o = y0;
                this.n = activity0;
                super(y0.i, true);
                return;
            }
            case 4: {
                this.o = y0;
                this.n = activity0;
                super(y0.i, true);
                return;
            }
            default: {
                this.o = y0;
                this.n = activity0;
                super(y0.i, true);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        switch(this.m) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.o.i.h)).onActivityStarted(ObjectWrapper.wrap(this.n), this.j);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.o.i.h)).onActivityResumed(ObjectWrapper.wrap(this.n), this.j);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(this.o.i.h)).onActivityPaused(ObjectWrapper.wrap(this.n), this.j);
                return;
            }
            case 3: {
                ((zzcc)Preconditions.checkNotNull(this.o.i.h)).onActivityStopped(ObjectWrapper.wrap(this.n), this.j);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.o.i.h)).onActivityDestroyed(ObjectWrapper.wrap(this.n), this.j);
            }
        }
    }
}

