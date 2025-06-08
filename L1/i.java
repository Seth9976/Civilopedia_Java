package l1;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class i extends LifecycleCallback {
    public final ArrayList j;

    public i(LifecycleFragment lifecycleFragment0) {
        super(lifecycleFragment0);
        this.j = new ArrayList();
        lifecycleFragment0.addCallback("TaskOnStopCallback", this);
    }

    public static i b(Activity activity0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
        synchronized(lifecycleFragment0) {
            i i0 = (i)lifecycleFragment0.getCallbackOrNull("TaskOnStopCallback", i.class);
            if(i0 == null) {
                i0 = new i(lifecycleFragment0);
            }
            return i0;
        }
    }

    public final void c(f f0) {
        synchronized(this.j) {
            WeakReference weakReference0 = new WeakReference(f0);
            this.j.add(weakReference0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized(this.j) {
            for(Object object0: this.j) {
                f f0 = (f)((WeakReference)object0).get();
                if(f0 != null) {
                    f0.zzc();
                }
            }
            this.j.clear();
        }
    }
}

