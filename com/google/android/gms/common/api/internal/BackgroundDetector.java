package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean arg1);
    }

    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final ArrayList k;
    public boolean l;
    public static final BackgroundDetector m;

    static {
        BackgroundDetector.m = new BackgroundDetector();
    }

    public BackgroundDetector() {
        this.i = new AtomicBoolean();
        this.j = new AtomicBoolean();
        this.k = new ArrayList();
        this.l = false;
    }

    public final void a(boolean z) {
        synchronized(BackgroundDetector.m) {
            for(Object object0: this.k) {
                ((BackgroundStateChangeListener)object0).onBackgroundStateChanged(z);
            }
        }
    }

    @KeepForSdk
    public void addListener(BackgroundStateChangeListener backgroundDetector$BackgroundStateChangeListener0) {
        synchronized(BackgroundDetector.m) {
            this.k.add(backgroundDetector$BackgroundStateChangeListener0);
        }
    }

    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return BackgroundDetector.m;
    }

    @KeepForSdk
    public static void initialize(Application application0) {
        BackgroundDetector backgroundDetector0 = BackgroundDetector.m;
        synchronized(backgroundDetector0) {
            if(!backgroundDetector0.l) {
                application0.registerActivityLifecycleCallbacks(backgroundDetector0);
                application0.registerComponentCallbacks(backgroundDetector0);
                backgroundDetector0.l = true;
            }
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.i.get();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        boolean z = this.i.compareAndSet(true, false);
        this.j.set(true);
        if(z) {
            this.a(false);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        boolean z = this.i.compareAndSet(true, false);
        this.j.set(true);
        if(z) {
            this.a(false);
        }
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

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        if(v == 20 && this.i.compareAndSet(false, true)) {
            this.j.set(true);
            this.a(true);
        }
    }

    @TargetApi(16)
    @KeepForSdk
    public boolean readCurrentStateIfPossible(boolean z) {
        AtomicBoolean atomicBoolean0 = this.j;
        if(!atomicBoolean0.get()) {
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
            if(!atomicBoolean0.getAndSet(true) && activityManager$RunningAppProcessInfo0.importance > 100) {
                this.i.set(true);
            }
        }
        return this.isInBackground();
    }
}

