package E;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import x.b;

public final class x extends A {
    public WindowInsets a;
    public b b;
    public static Field c = null;
    public static boolean d = false;
    public static Constructor e = null;
    public static boolean f = false;

    public x() {
        this.a = x.e();
    }

    public x(H h0) {
        super(h0);
        this.a = h0.a();
    }

    @Override  // E.A
    public H b() {
        H h0 = H.b(this.a, null);
        h0.a.j(null);
        h0.a.l(this.b);
        return h0;
    }

    @Override  // E.A
    public void c(b b0) {
        this.b = b0;
    }

    @Override  // E.A
    public void d(b b0) {
        WindowInsets windowInsets0 = this.a;
        if(windowInsets0 != null) {
            this.a = windowInsets0.replaceSystemWindowInsets(b0.a, b0.b, b0.c, b0.d);
        }
    }

    private static WindowInsets e() {
        Class class0 = WindowInsets.class;
        if(!x.d) {
            try {
                x.c = class0.getDeclaredField("CONSUMED");
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException0);
            }
            x.d = true;
        }
        Field field0 = x.c;
        if(field0 != null) {
            try {
                WindowInsets windowInsets0 = (WindowInsets)field0.get(null);
                if(windowInsets0 != null) {
                    return new WindowInsets(windowInsets0);
                }
            }
            catch(ReflectiveOperationException reflectiveOperationException1) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException1);
            }
        }
        if(!x.f) {
            try {
                x.e = class0.getConstructor(Rect.class);
            }
            catch(ReflectiveOperationException reflectiveOperationException2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException2);
            }
            x.f = true;
        }
        Constructor constructor0 = x.e;
        if(constructor0 != null) {
            try {
                return (WindowInsets)constructor0.newInstance(new Rect());
            }
            catch(ReflectiveOperationException reflectiveOperationException3) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException3);
            }
        }
        return null;
    }
}

