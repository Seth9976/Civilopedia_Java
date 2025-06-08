package androidx.fragment.app;

import B.b;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;

public final class n implements Animation.AnimationListener {
    public final ViewGroup a;
    public final h b;
    public final v c;

    public n(v v0, ViewGroup viewGroup0, h h0) {
        this.c = v0;
        this.a = viewGroup0;
        this.b = h0;
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationEnd(Animation animation0) {
        b b0 = new b(this, 18);
        this.a.post(b0);
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationRepeat(Animation animation0) {
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationStart(Animation animation0) {
    }
}

