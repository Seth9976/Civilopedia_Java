package l2;

import J2.j;
import J2.u;
import O2.A;
import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.spears.civilopedia.R.drawable;
import com.spears.civilopedia.planning.PlanningActivity;
import kotlin.NoWhenBranchMatchedException;
import n2.n;
import n2.w;
import n2.x;

public final class f extends ImageView {
    public final x i;
    public e j;

    public f(x x0, PlanningActivity planningActivity0) {
        j.f(x0, "river");
        super(planningActivity0);
        this.i = x0;
        this.j = e.k;
        n n0 = new u(x0.a, 0.0f).c(A.T(x0.a, x0.b));
        w w0 = n0.a;
        w w1 = n0.b;
        this.setImageResource(R.drawable.terrain_river);
        Context context0 = this.getContext();
        j.e(context0, "getContext(...)");
        double f = (double)context0.getResources().getDisplayMetrics().density;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)(80.0 * f)), ((int)(80.0 * f)));
        relativeLayout$LayoutParams0.leftMargin = (int)(((w0.a + w1.a) / 2.0 - 40.0) * f);
        relativeLayout$LayoutParams0.topMargin = (int)(((w0.b + w1.b) / 2.0 - 40.0) * f);
        this.setLayoutParams(relativeLayout$LayoutParams0);
    }

    public final x getRiver() {
        return this.i;
    }

    public final e getStatus() {
        return this.j;
    }

    public final void setStatus(e e0) {
        float f;
        j.f(e0, "value");
        this.j = e0;
        switch(e0.ordinal()) {
            case 0: {
                f = 0.5f;
                break;
            }
            case 1: 
            case 2: {
                f = 1.0f;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.setAlpha(f);
    }
}

