package Z;

import Y.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o1.a;

public final class e extends a {
    public final k c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public static final String h;

    static {
        e.h = "WM-WorkContinuationImpl";
    }

    public e(k k0, List list0) {
        this.c = k0;
        this.d = list0;
        this.e = new ArrayList(list0.size());
        this.f = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            String s = ((n)list0.get(v)).a.toString();
            this.e.add(s);
            this.f.add(s);
        }
    }

    public static boolean o0(e e0, HashSet hashSet0) {
        hashSet0.addAll(e0.e);
        HashSet hashSet1 = e.p0(e0);
        for(Object object0: hashSet0) {
            if(hashSet1.contains(((String)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        hashSet0.removeAll(e0.e);
        return false;
    }

    public static HashSet p0(e e0) {
        HashSet hashSet0 = new HashSet();
        e0.getClass();
        return hashSet0;
    }
}

