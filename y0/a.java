package Y0;

import dalvik.system.DelegateLastClassLoader;

public abstract class a {
    public static DelegateLastClassLoader a(ClassLoader classLoader0, String s) {
        return new DelegateLastClassLoader(s, classLoader0);
    }

    public static void b() {
    }
}

