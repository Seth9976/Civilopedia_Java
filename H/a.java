package h;

import V.e;
import android.graphics.drawable.Animatable;
import z1.a0;

public final class a extends a0 {
    public final int k;
    public final Animatable l;

    public a(Animatable animatable0, int v) {
        this.k = v;
        this.l = animatable0;
        super();
    }

    @Override  // z1.a0
    public final void N() {
        if(this.k != 0) {
            ((e)this.l).start();
            return;
        }
        this.l.start();
    }

    @Override  // z1.a0
    public final void O() {
        if(this.k != 0) {
            ((e)this.l).stop();
            return;
        }
        this.l.stop();
    }
}

