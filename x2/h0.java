package X2;

import J2.j;
import android.view.MenuInflater;
import android.view.View;
import k.l;

public abstract class h0 {
    public final int i;
    public boolean j;
    public Object k;

    public h0() {
        this.i = 1;
        super();
    }

    public h0(String s, boolean z) {
        this.i = 0;
        super();
        this.k = s;
        this.j = z;
    }

    public Integer a(h0 h00) {
        j.f(h00, "visibility");
        if(this == h00) {
            return 0;
        }
        Integer integer0 = (Integer)g0.a.get(this);
        Integer integer1 = (Integer)g0.a.get(h00);
        return integer0 == null || integer1 == null || integer0.equals(integer1) ? null : ((int)(((int)integer0) - ((int)integer1)));
    }

    public abstract void b();

    public abstract View c();

    public String f() {
        return (String)this.k;
    }

    public abstract l g();

    public abstract MenuInflater h();

    public abstract CharSequence i();

    public abstract CharSequence j();

    public abstract void k();

    public abstract boolean l();

    public h0 m() {
        return this;
    }

    public abstract void n(View arg1);

    public abstract void o(int arg1);

    public abstract void p(CharSequence arg1);

    public abstract void q(int arg1);

    public abstract void r(CharSequence arg1);

    public abstract void s(boolean arg1);

    @Override
    public String toString() {
        return this.i == 0 ? this.f() : super.toString();
    }
}

