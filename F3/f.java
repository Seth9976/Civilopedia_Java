package F3;

import J2.j;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x2.i;
import x2.r;

public final class f {
    public final List a;
    public final int b;
    public static final l c = null;
    public static final int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final f p;
    public static final f q;
    public static final ArrayList r;
    public static final ArrayList s;

    static {
        e e1;
        f.c = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
        f.e = f.d;
        f.f = f.d << 1;
        f.g = f.d << 2;
        f.h = f.d << 3;
        f.i = f.d << 4;
        f.j = f.d << 5;
        f.d <<= 7;
        int v = (f.d << 6) - 1;
        f.k = v;
        int v1 = f.d | f.d << 1 | f.d << 2;
        f.l = v1;
        f.m = new f(v);
        f.n = new f(f.d << 4 | f.d << 5);
        new f(f.d);
        new f(f.d << 1);
        new f(f.d << 2);
        f.o = new f(v1);
        new f(f.d << 3);
        f.p = new f(f.d << 4);
        f.q = new f(f.d << 5);
        new f(f.d << 1 | f.d << 4 | f.d << 5);
        Class class0 = f.class;
        Field[] arr_field = class0.getFields();
        j.e(arr_field, "getFields(...)");
        ArrayList arrayList0 = new ArrayList();
        for(int v3 = 0; v3 < arr_field.length; ++v3) {
            Field field0 = arr_field[v3];
            if(Modifier.isStatic(field0.getModifiers())) {
                arrayList0.add(field0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            e e0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Field field1 = (Field)object0;
            Object object1 = field1.get(null);
            f f0 = object1 instanceof f ? ((f)object1) : null;
            if(f0 != null) {
                String s = field1.getName();
                j.e(s, "getName(...)");
                e0 = new e(f0.b, s);
            }
            if(e0 != null) {
                arrayList1.add(e0);
            }
        }
        f.r = arrayList1;
        Field[] arr_field1 = class0.getFields();
        j.e(arr_field1, "getFields(...)");
        ArrayList arrayList2 = new ArrayList();
        for(int v2 = 0; v2 < arr_field1.length; ++v2) {
            Field field2 = arr_field1[v2];
            if(Modifier.isStatic(field2.getModifiers())) {
                arrayList2.add(field2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object2: arrayList2) {
            if(j.a(((Field)object2).getType(), Integer.TYPE)) {
                arrayList3.add(object2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object3: arrayList3) {
            Field field3 = (Field)object3;
            Object object4 = field3.get(null);
            j.d(object4, "null cannot be cast to non-null type kotlin.Int");
            int v4 = (int)(((Integer)object4));
            if(v4 == (-v4 & v4)) {
                String s1 = field3.getName();
                j.e(s1, "getName(...)");
                e1 = new e(v4, s1);
            }
            else {
                e1 = null;
            }
            if(e1 != null) {
                arrayList4.add(e1);
            }
        }
        f.s = arrayList4;
    }

    public f(int v) {
        this(v, r.i);
    }

    public f(int v, List list0) {
        j.f(list0, "excludes");
        super();
        this.a = list0;
        for(Object object0: list0) {
            v &= ~((d)object0).a();
        }
        this.b = v;
    }

    public final boolean a(int v) {
        return (v & this.b) != 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!f.class.equals(class0)) {
            return false;
        }
        j.d(object0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        return j.a(this.a, ((f)object0).a) ? this.b == ((f)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        Object object0 = null;
        for(Object object1: f.r) {
            if(((e)object1).a == this.b) {
                object0 = object1;
                break;
            }
        }
        String s = ((e)object0) == null ? null : ((e)object0).b;
        if(s == null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: f.s) {
                e e0 = (e)object2;
                String s1 = this.a(e0.a) ? e0.b : null;
                if(s1 != null) {
                    arrayList0.add(s1);
                }
            }
            s = i.Y(arrayList0, " | ", null, null, null, 62);
        }
        return "DescriptorKindFilter(" + s + ", " + this.a + ')';
    }
}

