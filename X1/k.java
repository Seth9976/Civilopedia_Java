package x1;

import C1.c;
import C1.d;
import android.util.Log;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;

public final class k implements Callable {
    public final int a;
    public final l b;

    public k(l l0, int v) {
        this.a = v;
        this.b = l0;
        super();
    }

    @Override
    public final Object call() {
        if(this.a != 0) {
            i i0 = this.b.g;
            w3.k k0 = i0.c;
            d d0 = (d)k0.k;
            d0.getClass();
            String s = null;
            if(!new File(((File)d0.j), ((String)k0.j)).exists()) {
                NavigableSet navigableSet0 = ((c)i0.k.k).c();
                if(!navigableSet0.isEmpty()) {
                    s = (String)navigableSet0.first();
                }
                return s != null && i0.i.c(s);
            }
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            d0.getClass();
            new File(((File)d0.j), ((String)k0.j)).delete();
            return true;
        }
        try {
            w3.k k1 = this.b.e;
            d d1 = (d)k1.k;
            d1.getClass();
            if(!new File(((File)d1.j), ((String)k1.j)).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                return false;
            }
            return true;
        }
        catch(Exception exception0) {
        }
        Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", exception0);
        return false;
    }
}

