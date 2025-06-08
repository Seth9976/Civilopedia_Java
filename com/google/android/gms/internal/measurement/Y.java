package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class y implements Application.ActivityLifecycleCallbacks {
    public final zzee i;

    public y(zzee zzee0) {
        this.i = zzee0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        m m0 = new m(this, bundle0, activity0);
        this.i.b(m0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        x x0 = new x(this, activity0, 4);
        this.i.b(x0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        x x0 = new x(this, activity0, 2);
        this.i.b(x0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        x x0 = new x(this, activity0, 1);
        this.i.b(x0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        zzbz zzbz0 = new zzbz();
        m m0 = new m(this, activity0, zzbz0);
        this.i.b(m0);
        Bundle bundle1 = zzbz0.zzb(50L);
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        x x0 = new x(this, activity0, 0);
        this.i.b(x0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        x x0 = new x(this, activity0, 3);
        this.i.b(x0);
    }
}

