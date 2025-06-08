package t2;

import J2.j;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import com.spears.civilopedia.tree.tech.TechTreeActivity;
import com.spears.civilopedia.tree.tech.TechTreeNode;
import f2.z;
import x2.w;

public final class b implements View.OnClickListener {
    public final int i;
    public final TechTreeNode j;
    public final String k;

    public b(TechTreeNode techTreeNode0, String s, int v) {
        this.i = v;
        this.j = techTreeNode0;
        this.k = s;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.k;
        TechTreeNode techTreeNode0 = this.j;
        if(this.i != 0) {
            j.f(techTreeNode0, "this$0");
            c c0 = techTreeNode0.r;
            if(c0 != null) {
                z z0 = new z(1);
                Bundle bundle0 = new Bundle();
                bundle0.putString("TITLE", s);
                bundle0.putString("TYPE_NAME", null);
                z0.setArguments(bundle0);
                z0.show(((TechTreeActivity)c0).g(), "tooltip");
            }
            return;
        }
        j.f(techTreeNode0, "this$0");
        c c1 = techTreeNode0.r;
        if(c1 != null) {
            String s1 = w.l(((TechTreeActivity)c1).r(), s);
            z z1 = new z(1);
            Bundle bundle1 = new Bundle();
            bundle1.putString("TITLE", s1);
            bundle1.putString("TYPE_NAME", s);
            z1.setArguments(bundle1);
            z1.show(((TechTreeActivity)c1).g(), "tooltip");
        }
    }
}

