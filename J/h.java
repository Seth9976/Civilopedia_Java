package j;

import android.support.v4.media.session.a;
import android.view.View;
import l.I0;

public final class h extends a {
    public final int d;
    public boolean e;
    public int f;
    public final Object g;

    public h(i i0) {
        this.d = 0;
        super();
        this.g = i0;
        this.e = false;
        this.f = 0;
    }

    public h(I0 i00, int v) {
        this.d = 1;
        super();
        this.g = i00;
        this.f = v;
        this.e = false;
    }

    @Override  // E.v
    public final void a() {
        if(this.d != 0) {
            if(!this.e) {
                ((I0)this.g).a.setVisibility(this.f);
            }
            return;
        }
        int v = this.f + 1;
        this.f = v;
        i i0 = (i)this.g;
        if(v == i0.a.size()) {
            a a0 = i0.d;
            if(a0 != null) {
                a0.a();
            }
            this.f = 0;
            this.e = false;
            i0.e = false;
        }
    }

    @Override  // android.support.v4.media.session.a
    public void b(View view0) {
        if(this.d != 1) {
            return;
        }
        this.e = true;
    }

    @Override  // android.support.v4.media.session.a
    public final void c() {
        if(this.d != 0) {
            ((I0)this.g).a.setVisibility(0);
            return;
        }
        if(!this.e) {
            this.e = true;
            a a0 = ((i)this.g).d;
            if(a0 != null) {
                a0.c();
            }
        }
    }
}

