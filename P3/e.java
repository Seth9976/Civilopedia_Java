package p3;

import java.security.AccessControlException;
import java.util.HashMap;
import v3.b;
import v3.c;

public final class e {
    public int[] a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public a g;
    public String[] h;
    public static final boolean i;
    public static final HashMap j;

    static {
        try {
            e.i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        }
        catch(AccessControlException unused_ex) {
            e.i = false;
        }
        HashMap hashMap0 = new HashMap();
        e.j = hashMap0;
        hashMap0.put(b.j(new c("kotlin.jvm.internal.KotlinClass")), a.m);
        hashMap0.put(b.j(new c("kotlin.jvm.internal.KotlinFileFacade")), a.n);
        hashMap0.put(b.j(new c("kotlin.jvm.internal.KotlinMultifileClass")), a.p);
        hashMap0.put(b.j(new c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.q);
        hashMap0.put(b.j(new c("kotlin.jvm.internal.KotlinSyntheticClass")), a.o);
    }
}

