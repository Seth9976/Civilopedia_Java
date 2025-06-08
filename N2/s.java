package n2;

import I2.b;
import J2.j;
import java.util.ArrayList;
import x2.k;

public final class s {
    public final ArrayList a;

    public s(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    public final ArrayList a(t t0) {
        ArrayList arrayList0 = s.b(t0, new r(1, this, s.class, "isFilled", "isFilled(Lcom/spears/civilopedia/planning/logic/PlotPosition;)Z", 0, 1));
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            v v0 = this.d(((t)object0));
            if(v0 != null) {
                arrayList1.add(v0);
            }
        }
        return arrayList1;
    }

    public static ArrayList b(t t0, b b0) {
        j.f(t0, "position");
        ArrayList arrayList0 = new ArrayList();
        int v = t0.i - 1;
        int v1 = t0.i + 1;
        if(v <= v1) {
            while(true) {
                int v2 = t0.j - 1;
                int v3 = t0.j + 1;
                if(v2 <= v3) {
                    while(true) {
                        t t1 = new t(v, v2);
                        if(t1.b(t0) == 1 && ((Boolean)b0.b(t1)).booleanValue()) {
                            arrayList0.add(t1);
                        }
                        if(v2 == v3) {
                            break;
                        }
                        ++v2;
                    }
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return arrayList0;
    }

    public final boolean c(t t0) {
        j.f(t0, "position");
        ArrayList arrayList0 = this.a;
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(((v)object0).a.equals(t0)) {
                    return 0;
                }
                if(false) {
                    break;
                }
            }
        }
        return 1;
    }

    public final v d(t t0) {
        j.f(t0, "position");
        for(Object object0: this.a) {
            if(t0.equals(((v)object0).a)) {
                return (v)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList0 = new ArrayList(k.E(this.a));
        for(Object object0: this.a) {
            arrayList0.add(((v)object0).a);
        }
        return arrayList0;
    }
}

