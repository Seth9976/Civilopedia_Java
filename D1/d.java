package d1;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.zzay;
import com.google.android.gms.internal.consent_sdk.zzj;

public final class d implements Application.ActivityLifecycleCallbacks {
    public final Activity i;
    public final zzay j;

    public d(zzay zzay0, Activity activity0) {
        this.j = zzay0;
        this.i = activity0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        if(activity0 != this.i) {
            return;
        }
        new zzj(3, "Activity is destroyed.");
        this.j.a();
        if(this.j.i.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

