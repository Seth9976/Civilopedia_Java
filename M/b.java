package m;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o1.a;

public final class b extends a {
    public final Object c;
    public final ExecutorService d;
    public volatile Handler e;

    public b() {
        this.c = new Object();
        this.d = Executors.newFixedThreadPool(4, new O1.b(1));
    }

    public static Handler o0(Looper looper0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, null, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException unused_ex) {
            return new Handler(looper0);
        }
        catch(InvocationTargetException unused_ex) {
            return new Handler(looper0);
        }
    }
}

