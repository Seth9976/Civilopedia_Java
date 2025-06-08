package E;

import T1.c;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import f.A;

public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final c a;
    public final View b;

    public t(c c0, View view0) {
        this.a = c0;
        this.b = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        ((View)((A)this.a.j).g.getParent()).invalidate();
    }
}

