package w0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import f2.J;
import java.util.Objects;
import q0.i;
import x0.h;
import y0.b;

public final class f implements Runnable {
    public final j i;
    public final i j;
    public final int k;
    public final Runnable l;

    public f(j j0, i i0, int v, Runnable runnable0) {
        this.i = j0;
        this.j = i0;
        this.k = v;
        this.l = runnable0;
    }

    @Override
    public final void run() {
        j j0;
        Runnable runnable0;
        int v1;
        i i0;
        try {
            i0 = this.j;
            v1 = this.k;
            runnable0 = this.l;
            j0 = this.i;
            b b0 = j0.f;
            Objects.requireNonNull(j0.c);
            ((h)b0).f(new J(j0.c, 7));
            NetworkInfo networkInfo0 = ((ConnectivityManager)j0.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isConnected()) {
                ((h)b0).f(new g(j0, i0, v1));
            }
            else {
                j0.a(i0, v1);
            }
        }
        catch(SynchronizationException unused_ex) {
            j0.d.a(i0, v1 + 1, false);
        }
        finally {
            runnable0.run();
        }
    }
}

