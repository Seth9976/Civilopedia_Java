package androidx.lifecycle;

import T1.c;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;

public class y extends Fragment {
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity0, Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity0, Bundle bundle0) {
            y.a(activity0, g.ON_CREATE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity0) {
            y.a(activity0, g.ON_RESUME);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity0) {
            y.a(activity0, g.ON_START);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity0) {
            y.a(activity0, g.ON_DESTROY);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity0) {
            y.a(activity0, g.ON_PAUSE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity0) {
            y.a(activity0, g.ON_STOP);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity0) {
        }

        public static void registerIn(Activity activity0) {
            activity0.registerActivityLifecycleCallbacks(new a());
        }
    }

    public c i;
    public static final int j;

    public static void a(Activity activity0, g g0) {
        if(activity0 instanceof n) {
            i i0 = ((n)activity0).getLifecycle();
            if(i0 instanceof p) {
                ((p)i0).e(g0);
            }
        }
    }

    public final void b(g g0) {
        if(Build.VERSION.SDK_INT < 29) {
            y.a(this.getActivity(), g0);
        }
    }

    public static void c(Activity activity0) {
        if(Build.VERSION.SDK_INT >= 29) {
            a.registerIn(activity0);
        }
        FragmentManager fragmentManager0 = activity0.getFragmentManager();
        if(fragmentManager0.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager0.beginTransaction().add(new y(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();  // 初始化器: Landroid/app/Fragment;-><init>()V
            fragmentManager0.executePendingTransactions();
        }
    }

    @Override  // android.app.Fragment
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.b(g.ON_CREATE);
    }

    @Override  // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b(g.ON_DESTROY);
        this.i = null;
    }

    @Override  // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.b(g.ON_PAUSE);
    }

    @Override  // android.app.Fragment
    public final void onResume() {
        super.onResume();
        c c0 = this.i;
        if(c0 != null) {
            x x0 = (x)c0.j;
            int v = x0.j + 1;
            x0.j = v;
            if(v == 1) {
                if(x0.k) {
                    x0.n.e(g.ON_RESUME);
                    x0.k = false;
                }
                else {
                    x0.m.removeCallbacks(x0.o);
                }
            }
        }
        this.b(g.ON_RESUME);
    }

    @Override  // android.app.Fragment
    public final void onStart() {
        super.onStart();
        c c0 = this.i;
        if(c0 != null) {
            x x0 = (x)c0.j;
            int v = x0.i + 1;
            x0.i = v;
            if(v == 1 && x0.l) {
                x0.n.e(g.ON_START);
                x0.l = false;
            }
        }
        this.b(g.ON_START);
    }

    @Override  // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b(g.ON_STOP);
    }
}

