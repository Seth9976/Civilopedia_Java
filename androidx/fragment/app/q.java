package androidx.fragment.app;

import E.j;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class q extends AnimationSet implements Runnable {
    public final ViewGroup i;
    public final View j;
    public boolean k;
    public boolean l;
    public boolean m;

    public q(Animation animation0, ViewGroup viewGroup0, View view0) {
        super(false);
        this.m = true;
        this.i = viewGroup0;
        this.j = view0;
        this.addAnimation(animation0);
        viewGroup0.post(this);
    }

    @Override  // android.view.animation.AnimationSet
    public final boolean getTransformation(long v, Transformation transformation0) {
        this.m = true;
        if(this.k) {
            return !this.l;
        }
        if(!super.getTransformation(v, transformation0)) {
            this.k = true;
            j.a(this.i, this);
        }
        return true;
    }

    @Override  // android.view.animation.Animation
    public final boolean getTransformation(long v, Transformation transformation0, float f) {
        this.m = true;
        if(this.k) {
            return !this.l;
        }
        if(!super.getTransformation(v, transformation0, f)) {
            this.k = true;
            j.a(this.i, this);
        }
        return true;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup0 = this.i;
        if(!this.k && this.m) {
            this.m = false;
            viewGroup0.post(this);
            return;
        }
        viewGroup0.endViewTransition(this.j);
        this.l = true;
    }
}

