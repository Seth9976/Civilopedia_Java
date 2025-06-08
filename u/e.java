package u;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import m0.B;

public abstract class e {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    static {
        Method method2;
        Method method1;
        Field field1;
        Field field0;
        Class class2;
        Class class0 = IBinder.class;
        Class class1 = Activity.class;
        e.g = new Handler(Looper.getMainLooper());
        Method method0 = null;
        try {
            class2 = null;
            class2 = Class.forName("android.app.ActivityThread");
        }
        catch(Throwable unused_ex) {
        }
        try {
            e.a = class2;
            field0 = class1.getDeclaredField("mMainThread");
            field0.setAccessible(true);
        }
        catch(Throwable unused_ex) {
            field0 = null;
        }
        try {
            e.b = field0;
            field1 = class1.getDeclaredField("mToken");
            field1.setAccessible(true);
        }
        catch(Throwable unused_ex) {
            field1 = null;
        }
        e.c = field1;
        Class class3 = e.a;
        if(class3 == null) {
        label_22:
            method1 = null;
        }
        else {
            try {
                method1 = class3.getDeclaredMethod("performStopActivity", class0, Boolean.TYPE, String.class);
                method1.setAccessible(true);
                goto label_23;
            }
            catch(Throwable unused_ex) {
            }
            goto label_22;
        }
    label_23:
        e.d = method1;
        Class class4 = e.a;
        if(class4 == null) {
        label_29:
            method2 = null;
        }
        else {
            try {
                method2 = class4.getDeclaredMethod("performStopActivity", class0, Boolean.TYPE);
                method2.setAccessible(true);
                goto label_30;
            }
            catch(Throwable unused_ex) {
            }
            goto label_29;
        }
    label_30:
        e.e = method2;
        Class class5 = e.a;
        if((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && class5 != null) {
            try {
                Method method3 = class5.getDeclaredMethod("requestRelaunchActivity", class0, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                method3.setAccessible(true);
                method0 = method3;
            }
            catch(Throwable unused_ex) {
            }
        }
        e.f = method0;
    }

    public static boolean a(Activity activity0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            activity0.recreate();
            return true;
        }
        Method method0 = e.f;
        if((v == 26 || v == 27) && method0 == null) {
            return false;
        }
        if(e.e == null && e.d == null) {
            return false;
        }
        try {
            Object object0 = e.c.get(activity0);
            if(object0 == null) {
                return false;
            }
            Object object1 = e.b.get(activity0);
            if(object1 == null) {
                return false;
            }
            Application application0 = activity0.getApplication();
            d d0 = new d(activity0);
            application0.registerActivityLifecycleCallbacks(d0);
            Handler handler0 = e.g;
            handler0.post(new B(1, d0, object0));
            boolean z = v == 26 || v == 27;
            try {
                if(z) {
                    method0.invoke(object1, object0, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                }
                else {
                    activity0.recreate();
                }
            }
            catch(Throwable unused_ex) {
                handler0.post(new B(2, application0, d0));
                return false;
            }
            handler0.post(new B(2, application0, d0));
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

