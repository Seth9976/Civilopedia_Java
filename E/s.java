package E;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class s extends AnimatorListenerAdapter {
    public final v a;
    public final View b;

    public s(v v0, View view0) {
        this.a = v0;
        this.b = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a.b(this.b);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.a.c();
    }
}

