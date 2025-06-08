package x;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class h extends g {
    @Override  // x.g
    public final Typeface B(Object object0) {
        try {
            Object object1 = Array.newInstance(this.h, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.n.invoke(null, object1, "sans-serif", -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    @Override  // x.g
    public final Method G(Class class0) {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }
}

