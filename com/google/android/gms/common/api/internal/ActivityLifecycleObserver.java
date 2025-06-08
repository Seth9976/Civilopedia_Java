package com.google.android.gms.common.api.internal;

import M0.a;
import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @KeepForSdk
    public static final ActivityLifecycleObserver of(Activity activity0) {
        a a0;
        synchronized(activity0) {
            LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
            a0 = (a)lifecycleFragment0.getCallbackOrNull("LifecycleObserverOnStop", a.class);
            if(a0 == null) {
                a0 = new a(lifecycleFragment0);  // 初始化器: Lcom/google/android/gms/common/api/internal/LifecycleCallback;-><init>(Lcom/google/android/gms/common/api/internal/LifecycleFragment;)V
                a0.j = new ArrayList();
                lifecycleFragment0.addCallback("LifecycleObserverOnStop", a0);
            }
        }
        return new zab(a0);
    }

    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable arg1);
}

