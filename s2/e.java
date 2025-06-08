package S2;

import I2.b;
import J2.j;
import J2.l;
import java.util.Arrays;
import java.util.Map.Entry;

public final class e extends l implements b {
    public static final e i;

    static {
        e.i = new e(1);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        String s1;
        j.f(((Map.Entry)object0), "entry");
        String s = (String)((Map.Entry)object0).getKey();
        Object object1 = ((Map.Entry)object0).getValue();
        if(object1 instanceof boolean[]) {
            s1 = Arrays.toString(((boolean[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof char[]) {
            s1 = Arrays.toString(((char[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof byte[]) {
            s1 = Arrays.toString(((byte[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof short[]) {
            s1 = Arrays.toString(((short[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof int[]) {
            s1 = Arrays.toString(((int[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof float[]) {
            s1 = Arrays.toString(((float[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof long[]) {
            s1 = Arrays.toString(((long[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof double[]) {
            s1 = Arrays.toString(((double[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        if(object1 instanceof Object[]) {
            s1 = Arrays.toString(((Object[])object1));
            j.e(s1, "toString(...)");
            return s + '=' + s1;
        }
        return s + '=' + object1.toString();
    }
}

