package o1;

import M1.e;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class c implements BackgroundStateChangeListener {
    public static final AtomicReference a;

    static {
        c.a = new AtomicReference();
    }

    @Override  // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized(f.j) {
            for(Object object1: new ArrayList(f.l.values())) {
                f f0 = (f)object1;
                if(f0.e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    for(Object object2: f0.i) {
                        f f1 = ((b)object2).a;
                        if(z) {
                            f1.getClass();
                        }
                        else {
                            ((e)f1.h.get()).b();
                        }
                    }
                }
            }
        }
    }
}

