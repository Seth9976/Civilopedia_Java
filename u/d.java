package u;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import m0.B;

public final class d implements Application.ActivityLifecycleCallbacks {
    public Object i;
    public Activity j;
    public final int k;
    public boolean l;
    public boolean m;
    public boolean n;

    public d(Activity activity0) {
        this.l = false;
        this.m = false;
        this.n = false;
        this.j = activity0;
        this.k = activity0.hashCode();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        if(this.j == activity0) {
            this.j = null;
            this.m = true;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        if(this.m && !this.n && !this.l) {
            try {
                Object object0 = this.i;
                Object object1 = e.c.get(activity0);
                if(object1 == object0 && activity0.hashCode() == this.k) {
                    B b0 = new B(3, e.b.get(activity0), object1);
                    e.g.postAtFrontOfQueue(b0);
                    this.n = true;
                    this.i = null;
                }
            }
            catch(Throwable throwable0) {
                Log.e("ActivityRecreator", "Exception while fetching field values", throwable0);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        if(this.j == activity0) {
            this.l = true;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

