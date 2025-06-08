package N;

import android.view.View;
import java.util.List;

public final class u {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view0) {
        int v = this.k.size();
        View view1 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < v; ++v2) {
            View view2 = ((T)this.k.get(v2)).a;
            G g0 = (G)view2.getLayoutParams();
            if(view2 != view0 && !g0.a.h()) {
                int v3 = (g0.a.b() - this.d) * this.e;
                if(v3 >= 0 && v3 < v1) {
                    view1 = view2;
                    if(v3 == 0) {
                        break;
                    }
                    v1 = v3;
                }
            }
        }
        if(view1 == null) {
            this.d = -1;
            return;
        }
        this.d = ((G)view1.getLayoutParams()).a.b();
    }

    public final View b(M m0) {
        List list0 = this.k;
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = ((T)this.k.get(v1)).a;
                G g0 = (G)view0.getLayoutParams();
                if(!g0.a.h() && this.d == g0.a.b()) {
                    this.a(view0);
                    return view0;
                }
            }
            return null;
        }
        T t0 = m0.i(this.d, 0x7FFFFFFFFFFFFFFFL);
        this.d += this.e;
        return t0.a;
    }
}

