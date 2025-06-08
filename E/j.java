package E;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;

public final class j implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public final View i;
    public ViewTreeObserver j;
    public final Runnable k;

    public j(View view0, Runnable runnable0) {
        this.i = view0;
        this.j = view0.getViewTreeObserver();
        this.k = runnable0;
    }

    public static void a(View view0, Runnable runnable0) {
        if(view0 == null) {
            throw new NullPointerException("view == null");
        }
        j j0 = new j(view0, runnable0);
        view0.getViewTreeObserver().addOnPreDrawListener(j0);
        view0.addOnAttachStateChangeListener(j0);
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z = this.j.isAlive();
        View view0 = this.i;
        if(z) {
            this.j.removeOnPreDrawListener(this);
        }
        else {
            view0.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view0.removeOnAttachStateChangeListener(this);
        this.k.run();
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.j = view0.getViewTreeObserver();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        boolean z = this.j.isAlive();
        View view1 = this.i;
        if(z) {
            this.j.removeOnPreDrawListener(this);
        }
        else {
            view1.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view1.removeOnAttachStateChangeListener(this);
    }
}

