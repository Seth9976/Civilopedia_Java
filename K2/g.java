package k2;

import J2.j;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.spears.civilopedia.planning.PlanningActivity;
import com.spears.civilopedia.planning.components.PlanningContainerView;
import java.util.logging.Logger;
import n0.e;
import n2.t;
import n2.v;
import q0.h;
import q0.i;
import v0.a;
import v0.b;

public final class g implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public g(Object object0, Object object1, Object object2, Object object3, int v) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        this.l = object2;
        this.m = object3;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.j;
        Object object1 = this.m;
        Object object2 = this.l;
        Object object3 = this.k;
        if(this.i != 0) {
            i i0 = (i)object3;
            String s = i0.a;
            e e0 = (e)object2;
            h h0 = (h)object1;
            b b0 = (b)object0;
            b0.getClass();
            Logger logger0 = b.f;
            try {
                r0.g g0 = b0.c.a(s);
                if(g0 == null) {
                    String s1 = "Transport backend \'" + s + "\' is not registered";
                    logger0.warning(s1);
                    e0.d(new IllegalArgumentException(s1));
                    return;
                }
                a a0 = new a(b0, i0, ((o0.b)g0).a(h0), 0);
                ((x0.h)b0.e).f(a0);
                e0.d(null);
                return;
            }
            catch(Exception exception0) {
            }
            logger0.warning("Error scheduling event " + exception0.getMessage());
            e0.d(exception0);
            return;
        }
        j.f(((PlanningActivity)object0), "this$0");
        j.f(((v)object3), "$plot");
        j.f(((ImageView)object2), "$productionView");
        j.f(((LinearLayoutCompat)object1), "$bannerView");
        PlanningContainerView planningContainerView0 = ((PlanningActivity)object0).D;
        if(planningContainerView0 != null) {
            t t0 = ((v)object3).a;
            planningContainerView0.a(t0, ((ImageView)object2));
            PlanningContainerView planningContainerView1 = ((PlanningActivity)object0).D;
            if(planningContainerView1 != null) {
                planningContainerView1.a(t0, ((LinearLayoutCompat)object1));
                return;
            }
            j.l("contentView");
            throw null;
        }
        j.l("contentView");
        throw null;
    }
}

