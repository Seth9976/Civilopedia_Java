package J2;

import i3.e;
import kotlin.UninitializedPropertyAccessException;

public abstract class j {
    public static boolean a(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public static void b(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        IllegalStateException illegalStateException0 = new IllegalStateException(s + " must not be null");
        j.j(illegalStateException0, "J2.j");
        throw illegalStateException0;
    }

    public static void c(Object object0) {
        if(object0 != null) {
            return;
        }
        NullPointerException nullPointerException0 = new NullPointerException();
        j.j(nullPointerException0, "J2.j");
        throw nullPointerException0;
    }

    public static void d(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        NullPointerException nullPointerException0 = new NullPointerException(s);
        j.j(nullPointerException0, "J2.j");
        throw nullPointerException0;
    }

    public static void e(Object object0, String s) [...] // Inlined contents

    public static void f(Object object0, String s) [...] // Inlined contents

    public static void g(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException(j.h(s));
        j.j(illegalArgumentException0, "J2.j");
        throw illegalArgumentException0;
    }

    public static String h(String s) [...] // Inlined contents

    public static final a i(Object[] arr_object) {
        j.f(arr_object, "array");
        return new a(arr_object);
    }

    public static void j(RuntimeException runtimeException0, String s) [...] // Inlined contents

    public static String k(Object object0, String s) [...] // Inlined contents

    public static void l(String s) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException0 = new UninitializedPropertyAccessException(e.f("lateinit property ", s, " has not been initialized"));  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        j.j(uninitializedPropertyAccessException0, "J2.j");
        throw uninitializedPropertyAccessException0;
    }
}

