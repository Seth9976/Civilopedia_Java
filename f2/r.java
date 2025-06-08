package f2;

import J2.j;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.spears.civilopedia.MainActivity;
import com.spears.civilopedia.planning.PlanningActivity;
import com.spears.civilopedia.tree.civic.CivicTreeActivity;
import com.spears.civilopedia.tree.tech.TechTreeActivity;

public final class r implements View.OnClickListener {
    public final int i;
    public final MainActivity j;

    public r(MainActivity mainActivity0, int v) {
        this.i = v;
        this.j = mainActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MainActivity mainActivity0 = this.j;
        switch(this.i) {
            case 0: {
                j.f(mainActivity0, "this$0");
                mainActivity0.k().j = null;
                mainActivity0.startActivity(new Intent(mainActivity0, PlanningActivity.class));
                return;
            }
            case 1: {
                j.f(mainActivity0, "this$0");
                mainActivity0.startActivity(new Intent(mainActivity0, CivicTreeActivity.class));
                return;
            }
            default: {
                j.f(mainActivity0, "this$0");
                mainActivity0.startActivity(new Intent(mainActivity0, TechTreeActivity.class));
            }
        }
    }
}

