package L3;

import J2.j;
import T1.c;
import Y3.n;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class m implements p {
    public final o a;
    public final a b;
    public final String c;
    public static final String d;
    public static final b e;

    static {
        String s1;
        String s = m.class.getCanonicalName();
        j.f(s, "<this>");
        int v = n.z0(6, s, ".");
        if(v == -1) {
            s1 = "";
        }
        else {
            s1 = s.substring(0, v);
            j.e(s1, "substring(...)");
        }
        m.d = s1;
        m.e = new b("NO_LOCKS", a.i);  // 初始化器: LL3/m;-><init>(Ljava/lang/String;LL3/o;)V
    }

    public m(String s) {
        this(s, new c(new ReentrantLock(), 7));
    }

    public m(String s, o o0) {
        this.a = o0;
        this.b = a.j;
        this.c = s;
    }

    public final i a(I2.a a0) {
        return new i(this, a0);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    public final e b(I2.b b0) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), b0, 1);
    }

    public final L3.j c(I2.b b0) {
        return new L3.j(this, new ConcurrentHashMap(3, 1.0f, 2), b0);
    }

    public l d(Object object0, String s) {
        AssertionError assertionError0 = new AssertionError("Recursion detected " + s + (object0 == null ? "" : "on input: " + object0) + " under " + this);
        m.e(assertionError0);
        throw assertionError0;
    }

    public static void e(AssertionError assertionError0) {
        StackTraceElement[] arr_stackTraceElement = assertionError0.getStackTrace();
        int v;
        for(v = 0; true; ++v) {
            if(v >= arr_stackTraceElement.length) {
                v = -1;
                break;
            }
            if(!arr_stackTraceElement[v].getClassName().startsWith(m.d)) {
                break;
            }
        }
        List list0 = Arrays.asList(arr_stackTraceElement).subList(v, arr_stackTraceElement.length);
        assertionError0.setStackTrace(((StackTraceElement[])list0.toArray(new StackTraceElement[list0.size()])));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("@");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        stringBuilder0.append(" (");
        return i3.e.h(stringBuilder0, this.c, ")");
    }
}

