package k2;

import J2.j;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.spears.civilopedia.planning.PlanningActivity;
import com.spears.civilopedia.planning.logic.Plot;
import java.util.ArrayList;
import m2.a;
import n2.A;
import n2.b;
import n2.c;
import n2.g;
import n2.v;
import o2.q;

public final class d implements DialogInterface.OnClickListener {
    public final PlanningActivity i;
    public final a j;
    public final Plot k;
    public final ArrayList l;
    public final v m;

    public d(PlanningActivity planningActivity0, a a0, Plot plot0, ArrayList arrayList0, v v0) {
        this.i = planningActivity0;
        this.j = a0;
        this.k = plot0;
        this.l = arrayList0;
        this.m = v0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        PlanningActivity planningActivity0 = this.i;
        j.f(planningActivity0, "this$0");
        j.f(this.j, "$placement");
        Plot plot0 = this.k;
        j.f(plot0, "$plot");
        ArrayList arrayList0 = this.l;
        v v1 = this.m;
        j.f(v1, "$plotWithPosition");
        planningActivity0.u(new g());  // 初始化器: Ljava/lang/Object;-><init>()V
        q q0 = this.j.a;
        if(j.a(q0.a, "DISTRICTS")) {
            plot0.o(q0.b);
        }
        else if(j.a(q0.a, "WONDERS")) {
            plot0.n(q0.b);
        }
        if(arrayList0.isEmpty()) {
            plot0.p(null);
        }
        plot0.q(null);
        plot0.r(null);
        A a0 = planningActivity0.G;
        if(a0 != null) {
            b b0 = ((c)a0.d).a(v1.a);
            if(b0 != null) {
                a0.d(b0);
            }
            planningActivity0.n(v1);
            return;
        }
        j.l("world");
        throw null;
    }
}

