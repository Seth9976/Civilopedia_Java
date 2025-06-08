package N;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class l implements ValueAnimator.AnimatorUpdateListener {
    public final m a;

    public l(m m0) {
        this.a = m0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.a.c.setAlpha(((int)(f * 255.0f)));
        this.a.d.setAlpha(((int)(f * 255.0f)));
        this.a.s.invalidate();
    }
}

