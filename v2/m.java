package V2;

import Y3.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import v3.c;
import x2.j;

public final class m {
    public final List a;
    public final LinkedHashMap b;
    public static final m c;

    static {
        m.c = new m(j.z(new k[]{g.c, V2.j.c, h.c, i.c}));
    }

    public m(List list0) {
        this.a = list0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            c c0 = ((k)object0).a;
            ArrayList arrayList0 = linkedHashMap0.get(c0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(c0, arrayList0);
            }
            arrayList0.add(object0);
        }
        this.b = linkedHashMap0;
    }

    public final l a(String s, c c0) {
        Integer integer0;
        J2.j.f(c0, "packageFqName");
        List list0 = (List)this.b.get(c0);
        if(list0 == null) {
            return null;
        }
        for(Object object0: list0) {
            k k0 = (k)object0;
            if(n.H0(s, k0.b)) {
                String s1 = s.substring(k0.b.length());
                J2.j.e(s1, "substring(...)");
                if(s1.length() == 0) {
                label_23:
                    integer0 = null;
                }
                else {
                    int v = s1.length();
                    int v1 = 0;
                    int v2 = 0;
                    while(v1 < v) {
                        int v3 = s1.charAt(v1) - 0x30;
                        if(v3 < 0 || v3 >= 10) {
                            goto label_23;
                        }
                        v2 = v2 * 10 + v3;
                        ++v1;
                    }
                    integer0 = v2;
                }
                if(integer0 != null) {
                    return new l(k0, ((int)integer0));
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }
}

