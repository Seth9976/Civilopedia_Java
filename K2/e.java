package k2;

import J2.j;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.RelativeLayout;
import com.spears.civilopedia.planning.PlanningActivity;
import l2.d;
import n2.A;
import n2.b;
import n2.c;
import n2.f;
import n2.i;
import n2.q;
import n2.v;

public final class e implements View.OnClickListener {
    public final int i;
    public final PlanningActivity j;
    public final d k;

    public e(PlanningActivity planningActivity0, d d0, int v) {
        this.i = v;
        this.j = planningActivity0;
        this.k = d0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        d d0 = this.k;
        PlanningActivity planningActivity0 = this.j;
        if(this.i != 0) {
            j.f(planningActivity0, "this$0");
            i i0 = planningActivity0.I;
            if(i0 instanceof f) {
                j.d(i0, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.GridState.FocusCity");
                A a0 = planningActivity0.G;
                if(a0 != null) {
                    v v0 = d0.a();
                    c c0 = (c)a0.d;
                    c0.getClass();
                    c0.b(v0.a);
                    ((f)i0).a.c.add(v0.a);
                    planningActivity0.u(new f(((f)i0).a));
                    return;
                }
                j.l("world");
                throw null;
            }
            return;
        }
        j.f(planningActivity0, "this$0");
        i i1 = planningActivity0.I;
        if(i1 instanceof f) {
            j.d(i1, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.GridState.FocusCity");
            ((RelativeLayout)d0.a.i.j).setVisibility(8);
            v v1 = d0.a();
            b b0 = ((f)i1).a;
            b0.c.add(v1.a);
            v v2 = d0.a();
            v v3 = d0.a();
            A a1 = planningActivity0.G;
            if(a1 != null) {
                d0.b(v2, new q(v3, a1));
                planningActivity0.r();
                planningActivity0.u(new f(b0));
                return;
            }
            j.l("world");
            throw null;
        }
    }
}

