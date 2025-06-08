package h;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import z1.a0;

public final class c extends a0 {
    public final ObjectAnimator k;
    public final boolean l;

    public c(AnimationDrawable animationDrawable0, boolean z, boolean z1) {
        int v = animationDrawable0.getNumberOfFrames();
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        int v2 = animationDrawable0.getNumberOfFrames();
        d0.b = v2;
        if(d0.a == null || d0.a.length < v2) {
            d0.a = new int[v2];
        }
        int[] arr_v = d0.a;
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            int v4 = animationDrawable0.getDuration((z ? v2 - v1 - 1 : v1));
            arr_v[v1] = v4;
            v3 += v4;
        }
        d0.c = v3;
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(animationDrawable0, "currentIndex", new int[]{(z ? v - 1 : 0), (z ? 0 : v - 1)});
        objectAnimator0.setAutoCancel(true);
        objectAnimator0.setDuration(((long)d0.c));
        objectAnimator0.setInterpolator(d0);
        this.l = z1;
        this.k = objectAnimator0;
    }

    @Override  // z1.a0
    public final void K() {
        this.k.reverse();
    }

    @Override  // z1.a0
    public final void N() {
        this.k.start();
    }

    @Override  // z1.a0
    public final void O() {
        this.k.cancel();
    }

    @Override  // z1.a0
    public final boolean f() {
        return this.l;
    }
}

