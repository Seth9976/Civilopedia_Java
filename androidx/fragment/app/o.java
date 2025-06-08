package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class o extends AnimatorListenerAdapter {
    public final ViewGroup a;
    public final View b;
    public final h c;

    public o(ViewGroup viewGroup0, View view0, h h0) {
        this.a = viewGroup0;
        this.b = view0;
        this.c = h0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.endViewTransition(this.b);
        animator0.removeListener(this);
        View view0 = this.c.O;
        if(view0 != null && this.c.G) {
            view0.setVisibility(8);
        }
    }
}

