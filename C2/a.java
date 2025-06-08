package c2;

import J2.j;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final b a;
    public final d b;

    public a(b b0, d d0) {
        this.a = b0;
        this.b = d0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        j.f(this.a, "this$0");
        d d0 = android.support.v4.media.session.a.J(new K3.j(1, this.b, valueAnimator0));
        this.a.b(d0);
    }
}

