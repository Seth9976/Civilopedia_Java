package t1;

import android.os.Bundle;
import android.util.Log;
import f0.g;
import g1.n;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k.d;
import o3.k;
import u1.c;
import w1.b;
import x1.j;

public final class a implements N1.a, v1.a, w1.a {
    public final m0.a i;

    public a(m0.a a0) {
        this.i = a0;
        super();
    }

    @Override  // w1.a
    public void a(j j0) {
        m0.a a0 = this.i;
        synchronized(a0) {
            if(((w1.a)a0.b) instanceof b) {
                ((ArrayList)a0.c).add(j0);
            }
            ((w1.a)a0.b).a(j0);
        }
    }

    @Override  // N1.a
    public void b(N1.b b0) {
        m0.a a0 = this.i;
        a0.getClass();
        c c0 = c.a;
        c0.b("AnalyticsConnector now available.");
        q1.a a1 = (q1.a)b0.get();
        d d0 = new d(a1, 12);
        n n0 = new n(25);
        q1.d d1 = ((q1.b)a1).a(n0, "clx");
        if(d1 == null) {
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            q1.d d2 = ((q1.b)a1).a(n0, "crash");
            if(d2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            d1 = d2;
        }
        if(d1 != null) {
            c0.b("Registered Firebase Analytics listener.");
            k k0 = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
            g g0 = new g(d0, TimeUnit.MILLISECONDS);
            synchronized(a0) {
                for(Object object0: ((ArrayList)a0.c)) {
                    k0.a(((j)object0));
                }
                n0.k = k0;
                n0.j = g0;
                a0.b = k0;
                a0.a = g0;
            }
            return;
        }
        c0.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }

    @Override  // v1.a
    public void e(Bundle bundle0) {
        ((v1.a)this.i.a).e(bundle0);
    }
}

