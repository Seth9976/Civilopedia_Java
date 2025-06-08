package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

public final class zzcgi {
    public static final void zza(View view0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        I2 i20 = new I2(view0, viewTreeObserver$OnGlobalLayoutListener0);
        View view1 = (View)((WeakReference)i20.i).get();
        ViewTreeObserver viewTreeObserver0 = null;
        if(view1 != null) {
            ViewTreeObserver viewTreeObserver1 = view1.getViewTreeObserver();
            if(viewTreeObserver1 != null && viewTreeObserver1.isAlive()) {
                viewTreeObserver0 = viewTreeObserver1;
            }
        }
        if(viewTreeObserver0 != null) {
            viewTreeObserver0.addOnGlobalLayoutListener(i20);
        }
    }

    public static final void zzb(View view0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        J2 j20 = new J2(view0, viewTreeObserver$OnScrollChangedListener0);
        View view1 = (View)((WeakReference)j20.i).get();
        ViewTreeObserver viewTreeObserver0 = null;
        if(view1 != null) {
            ViewTreeObserver viewTreeObserver1 = view1.getViewTreeObserver();
            if(viewTreeObserver1 != null && viewTreeObserver1.isAlive()) {
                viewTreeObserver0 = viewTreeObserver1;
            }
        }
        if(viewTreeObserver0 != null) {
            viewTreeObserver0.addOnScrollChangedListener(j20);
        }
    }
}

