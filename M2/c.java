package m2;

import N.T;
import N.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import f2.j;
import f2.l;
import java.util.ArrayList;
import java.util.HashSet;
import o1.a;
import o2.r;
import x2.i;

public final class c extends z {
    public final int b;
    public final ArrayList c;
    public ArrayList d;
    public final HashSet e;
    public Object f;
    public j g;

    public c(l l0, ArrayList arrayList0) {
        this.b = 1;
        J2.j.f(l0, "environment");
        J2.j.f(arrayList0, "list");
        super();
        this.f = l0;
        this.c = arrayList0;
        this.e = new HashSet();
        this.e();
    }

    public c(l l0, ArrayList arrayList0, ArrayList arrayList1) {
        this.b = 0;
        J2.j.f(l0, "environment");
        super();
        this.c = arrayList0;
        this.d = arrayList1;
        this.e = new HashSet();
        this.e();
    }

    @Override  // N.z
    public final int a() {
        if(this.b != 0) {
            ArrayList arrayList0 = this.d;
            if(arrayList0 != null) {
                return arrayList0.size();
            }
            J2.j.l("items");
            throw null;
        }
        ArrayList arrayList1 = (ArrayList)this.f;
        if(arrayList1 != null) {
            return arrayList1.size();
        }
        J2.j.l("items");
        throw null;
    }

    @Override  // N.z
    public final int b(int v) {
        if(this.b != 0) {
            ArrayList arrayList0 = this.d;
            if(arrayList0 != null) {
                return ((m2.j)arrayList0.get(v)).getType();
            }
            J2.j.l("items");
            throw null;
        }
        ArrayList arrayList1 = (ArrayList)this.f;
        if(arrayList1 != null) {
            return ((e)arrayList1.get(v)).getType();
        }
        J2.j.l("items");
        throw null;
    }

    @Override  // N.z
    public final void c(T t0, int v) {
        if(this.b != 0) {
            ArrayList arrayList0 = this.d;
            k k0 = null;
            if(arrayList0 != null) {
                m2.j j0 = (m2.j)arrayList0.get(v);
                h h0 = j0 instanceof h ? ((h)j0) : null;
                TextView textView0 = ((m)t0).t;
                if(h0 != null) {
                    textView0.setText(h0.a.g);
                }
                if(j0 instanceof k) {
                    k0 = (k)j0;
                }
                if(k0 != null) {
                    o o0 = k0.a;
                    textView0.setText(o0.b.i);
                    ImageView imageView0 = ((m)t0).u;
                    if(imageView0 != null) {
                        a.S(imageView0, "ICON_" + ((k)j0).a.b.b);
                    }
                    ImageView imageView1 = ((m)t0).v;
                    if(imageView1 != null) {
                        imageView1.setOnClickListener(new j2.h(5, this, k0));
                    }
                    textView0.setAlpha((o0.a.a() ? 1.0f : 0.3f));
                    if(imageView0 != null) {
                        imageView0.setAlpha(textView0.getAlpha());
                    }
                }
                j2.h h1 = new j2.h(6, this, j0);
                ((m)t0).s.setOnClickListener(h1);
                return;
            }
            J2.j.l("items");
            throw null;
        }
        ArrayList arrayList1 = (ArrayList)this.f;
        f f0 = null;
        if(arrayList1 != null) {
            e e0 = (e)arrayList1.get(v);
            d d0 = e0 instanceof d ? ((d)e0) : null;
            TextView textView1 = ((b)t0).t;
            if(d0 != null) {
                textView1.setText(android.support.v4.media.session.a.H(d0.a, new Object[0]));
            }
            if(e0 instanceof f) {
                f0 = (f)e0;
            }
            LinearLayout linearLayout0 = ((b)t0).s;
            if(f0 != null) {
                m2.a a0 = f0.a;
                textView1.setText(a0.a.i);
                ImageView imageView2 = ((b)t0).u;
                if(imageView2 != null) {
                    a.S(imageView2, "ICON_" + a0.a.b);
                }
                ImageView imageView3 = ((b)t0).v;
                if(imageView3 != null) {
                    imageView3.setOnClickListener(new j2.h(3, this, f0));
                }
                linearLayout0.setAlpha((a0.b.isEmpty() || a0.c != null ? 0.3f : 1.0f));
            }
            linearLayout0.setOnClickListener(new j2.h(4, this, e0));
            return;
        }
        J2.j.l("items");
        throw null;
    }

    @Override  // N.z
    public final T d(ViewGroup viewGroup0, int v) {
        if(this.b != 0) {
            if(v == 0) {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A0034, viewGroup0, false);  // layout:item_page_header
                J2.j.d(view0, "null cannot be cast to non-null type android.widget.LinearLayout");
                return new m(((LinearLayout)view0));
            }
            View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A0038, viewGroup0, false);  // layout:item_plot_edit_selector
            J2.j.d(view1, "null cannot be cast to non-null type android.widget.LinearLayout");
            return new m(((LinearLayout)view1));
        }
        if(v == 0) {
            View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A0034, viewGroup0, false);  // layout:item_page_header
            J2.j.d(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
            return new b(((LinearLayout)view2));
        }
        View view3 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A0038, viewGroup0, false);  // layout:item_plot_edit_selector
        J2.j.d(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new b(((LinearLayout)view3));
    }

    public final void e() {
        if(this.b != 0) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: this.c) {
                if(!J2.j.a(((o)object0).b.b, "INTRO")) {
                    arrayList1.add(object0);
                }
            }
            int v = 0;
            r r0 = null;
            int v1 = 0;
            for(Object object1: arrayList1) {
                if(v1 >= 0) {
                    if(v1 == 0 || !J2.j.a((r0 == null ? null : r0.b), ((o)object1).b.c)) {
                        r r1 = ((l)this.f).b.d().j(((o)object1).b.a, ((o)object1).b.c);
                        if(r1 != null) {
                            arrayList0.add(new h(r1));
                            r0 = r1;
                        }
                    }
                    if(!i.M(this.e, ((o)object1).b.c)) {
                        arrayList0.add(new k(((o)object1)));
                    }
                    ++v1;
                    continue;
                }
                x2.j.D();
                throw null;
            }
            if(!arrayList0.isEmpty()) {
                for(Object object2: arrayList0) {
                    if(((m2.j)object2) instanceof h) {
                        ++v;
                        if(v < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            if(v == 1) {
                x2.o.I(arrayList0, n.i);
            }
            this.d = arrayList0;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new d("LOC_DISTRICT_NAME"));
        HashSet hashSet0 = this.e;
        if(!hashSet0.contains("LOC_DISTRICT_NAME")) {
            ArrayList arrayList3 = new ArrayList(x2.k.E(this.c));
            for(Object object3: this.c) {
                arrayList3.add(new f(((m2.a)object3)));
            }
            arrayList2.addAll(arrayList3);
        }
        arrayList2.add(new d("LOC_WONDER_NAME"));
        if(!hashSet0.contains("LOC_WONDER_NAME")) {
            ArrayList arrayList4 = this.d;
            ArrayList arrayList5 = new ArrayList(x2.k.E(arrayList4));
            for(Object object4: arrayList4) {
                arrayList5.add(new f(((m2.a)object4)));
            }
            arrayList2.addAll(arrayList5);
        }
        this.f = arrayList2;
    }
}

