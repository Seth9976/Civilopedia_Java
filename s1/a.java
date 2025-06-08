package s1;

import f2.J;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o2.G;

public final class a {
    public final Set a;
    public final Set b;
    public final int c;
    public final int d;
    public final d e;
    public final Set f;

    public a(HashSet hashSet0, HashSet hashSet1, int v, int v1, d d0, HashSet hashSet2) {
        this.a = Collections.unmodifiableSet(hashSet0);
        this.b = Collections.unmodifiableSet(hashSet1);
        this.c = v;
        this.d = v1;
        this.e = d0;
        this.f = Collections.unmodifiableSet(hashSet2);
    }

    public static a a(Object object0, Class class0, Class[] arr_class) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet0.add(class0);
        for(int v = 0; v < arr_class.length; ++v) {
            G.c(arr_class[v], "Null interface");
        }
        Collections.addAll(hashSet0, arr_class);
        J j0 = new J(object0, 3);
        return new a(new HashSet(hashSet0), new HashSet(hashSet1), 0, 0, j0, hashSet2);
    }

    @Override
    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}

