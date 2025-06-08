package androidx.fragment.app;

import i3.e;
import java.lang.reflect.InvocationTargetException;

public class k {
    public static final p.k a;

    static {
        k.a = new p.k();
    }

    public h a(ClassLoader classLoader0, String s) {
        try {
            return (h)k.b(classLoader0, s).getConstructor(null).newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            throw new Fragment.InstantiationException(e.f("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"), instantiationException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new Fragment.InstantiationException(e.f("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"), illegalAccessException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new Fragment.InstantiationException(e.f("Unable to instantiate fragment ", s, ": could not find Fragment constructor"), noSuchMethodException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new Fragment.InstantiationException(e.f("Unable to instantiate fragment ", s, ": calling Fragment constructor caused an exception"), invocationTargetException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    public static Class b(ClassLoader classLoader0, String s) {
        try {
            p.k k0 = k.a;
            Class class0 = (Class)k0.getOrDefault(s, null);
            if(class0 == null) {
                class0 = Class.forName(s, false, classLoader0);
                k0.put(s, class0);
            }
            return class0;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new Fragment.InstantiationException(e.f("Unable to instantiate fragment ", s, ": make sure class name exists"), classNotFoundException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(ClassCastException classCastException0) {
            throw new Fragment.InstantiationException(e.f("Unable to instantiate fragment ", s, ": make sure class is a valid subclass of Fragment"), classCastException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }
}

