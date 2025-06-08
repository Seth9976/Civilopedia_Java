package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

public final class j extends d {
    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        y.c(activity0);
    }

    @Override  // androidx.lifecycle.d
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

