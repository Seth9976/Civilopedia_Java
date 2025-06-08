package k2;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import com.spears.civilopedia.planning.PlanningActivity;
import com.spears.civilopedia.planning.edit.PlotEditSelectorActivity;
import f2.j;
import n2.g;

public final class h implements MenuItem.OnMenuItemClickListener {
    public final int a;
    public final j b;

    public h(j j0, int v) {
        this.a = v;
        this.b = j0;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        j j0 = this.b;
        switch(this.a) {
            case 0: {
                J2.j.f(((PlanningActivity)j0), "this$0");
                J2.j.f(menuItem0, "it");
                ((PlanningActivity)j0).u(new g());  // 初始化器: Ljava/lang/Object;-><init>()V
                return true;
            }
            case 1: {
                J2.j.f(((PlanningActivity)j0), "this$0");
                J2.j.f(menuItem0, "it");
                ((PlanningActivity)j0).u(new g());  // 初始化器: Ljava/lang/Object;-><init>()V
                return true;
            }
            default: {
                J2.j.f(((PlotEditSelectorActivity)j0), "this$0");
                J2.j.f(menuItem0, "it");
                ((PlotEditSelectorActivity)j0).setResult(-1, ((PlotEditSelectorActivity)j0).getIntent());
                ((PlotEditSelectorActivity)j0).finish();
                return true;
            }
        }
    }
}

