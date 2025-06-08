package N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k extends AnimatorListenerAdapter {
    public boolean a;
    public final m b;

    public k(m m0) {
        this.b = m0;
        super();
        this.a = false;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a) {
            this.a = false;
            return;
        }
        m m0 = this.b;
        if(((float)(((Float)m0.z.getAnimatedValue()))) == 0.0f) {
            m0.A = 0;
            m0.f(0);
            return;
        }
        m0.A = 2;
        m0.s.invalidate();
    }
}

