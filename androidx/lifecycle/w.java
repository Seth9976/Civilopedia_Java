package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

public final class w extends d {
    public final x i;

    public w(x x0) {
        this.i = x0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        y y0 = (y)activity0.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        y0.i = this.i.p;
    }

    @Override  // androidx.lifecycle.d
    public final void onActivityPaused(Activity activity0) {
        x x0 = this.i;
        int v = x0.j - 1;
        x0.j = v;
        if(v == 0) {
            x0.m.postDelayed(x0.o, 700L);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        x x0 = this.i;
        int v = x0.i - 1;
        x0.i = v;
        if(v == 0 && x0.k) {
            x0.n.e(g.ON_STOP);
            x0.l = true;
        }
    }
}

