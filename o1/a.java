package O1;

import P1.b;
import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class a implements Runnable {
    public final int i;
    public final c j;

    public a(c c0, int v) {
        this.i = v;
        this.j = c0;
        super();
    }

    private final void a() {
        b b0;
        c c0 = this.j;
        synchronized(c.m) {
            c0.a.a();
            B.c c1 = B.c.n(c0.a.a);
            try {
                b0 = c0.c.d();
                if(b0.b == 1 || b0.b == 2) {
                    String s = c0.f(b0);
                    P1.a a0 = b0.a();
                    a0.b = s;
                    a0.c = 3;
                    b0 = a0.a();
                    c0.c.b(b0);
                }
            }
            finally {
                if(c1 != null) {
                    c1.G();
                }
            }
        }
        c0.i(b0);
        a a1 = new a(c0, 1);
        c0.i.execute(a1);
    }

    @Override
    public final void run() {
        b b1;
        b b0;
        if(this.i != 0) {
            c c0 = this.j;
            synchronized(c.m) {
                c0.a.a();
                B.c c1 = B.c.n(c0.a.a);
                try {
                    b0 = c0.c.d();
                }
                catch(Throwable throwable1) {
                    if(c1 != null) {
                        c1.G();
                    }
                    throw throwable1;
                }
                if(c1 != null) {
                    c1.G();
                }
            }
            try {
                if(b0.b == 5 || b0.b == 3) {
                    b1 = c0.g(b0);
                }
                else {
                    g g0 = c0.d;
                    g0.getClass();
                    if(TextUtils.isEmpty(b0.c)) {
                    label_27:
                        b1 = c0.b(b0);
                    }
                    else {
                        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                        g0.a.getClass();
                        long v = timeUnit0.toSeconds(System.currentTimeMillis());
                        if(b0.f + b0.e < v + g.b) {
                            goto label_27;
                        }
                        return;
                    }
                }
            }
            catch(FirebaseInstallationsException unused_ex) {
                c0.h();
                return;
            }
            c0.e(b1);
            c0.k(b0, b1);
            if(b1.b == 4) {
                c0.j(b1.a);
            }
            int v1 = b1.b;
            if(v1 == 5) {
                new FirebaseInstallationsException();  // 初始化器: Lcom/google/firebase/FirebaseException;-><init>()V
                c0.h();
                return;
            }
            if(v1 != 1 && v1 != 2) {
                c0.i(b1);
                return;
            }
            new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            c0.h();
            return;
        }
        this.a();
    }
}

