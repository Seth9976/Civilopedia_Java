package k2;

import A.f;
import J2.j;
import N.T;
import N.z;
import Y3.n;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import o2.q;
import x2.i;

public final class b extends z {
    public final ArrayList b;
    public final Object c;
    public final Object d;

    public b(ArrayList arrayList0, List list0, List list1) {
        j.f(list1, "civilizationLeaders");
        super();
        this.b = arrayList0;
        this.c = list0;
        this.d = list1;
    }

    @Override  // N.z
    public final int a() {
        return this.b.size();
    }

    @Override  // N.z
    public final void c(T t0, int v) {
        File file0 = (File)this.b.get(v);
        String s = file0.getName();
        j.e(s, "getName(...)");
        String s1 = (String)i.U(n.G0(s, new String[]{" "}));
        Object object0 = this.c;
        if(s1 == null) {
            s1 = ((q)i.S(((List)object0))).b;
        }
        for(Object object1: ((Iterable)object0)) {
            q q0 = (q)object1;
            if(j.a(q0.b, s1)) {
                String s2 = DateFormat.getDateTimeInstance().format(new Date(file0.lastModified()));
                ((r2.b)t0).s.x(((List)object0), s1, ((List)this.d), f.i(q0.i, " ", s2));
                ((LinearLayout)((B.f)((r2.b)t0).s.j).j).setOnCreateContextMenuListener(new a(v));
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // N.z
    public final T d(ViewGroup viewGroup0, int v) {
        return new r2.b(g1.n.l(LayoutInflater.from(viewGroup0.getContext()), viewGroup0));
    }
}

