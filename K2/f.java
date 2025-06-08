package k2;

import J2.j;
import com.spears.civilopedia.planning.PlanningActivity;
import f2.J;
import w0.k;
import x0.h;

public final class f implements Runnable {
    public final int i;
    public final Object j;

    public f(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.j;
        if(this.i != 0) {
            ((k)object0).getClass();
            J j0 = new J(((k)object0), 9);
            ((h)((k)object0).d).f(j0);
            return;
        }
        j.f(((PlanningActivity)object0), "this$0");
        ((PlanningActivity)object0).q();
    }
}

