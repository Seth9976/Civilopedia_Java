package i0;

import Y.g;
import Y.m;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.ads.d3;
import h0.i;
import j0.j;
import n1.a;

public final class k implements Runnable {
    public final int i;
    public final j j;
    public final l k;

    public k(l l0, j j0, int v) {
        this.i = v;
        this.k = l0;
        this.j = j0;
        super();
    }

    @Override
    public final void run() {
        j j0;
        if(this.i != 0) {
            try {
                l l0 = this.k;
                j0 = l0.i;
                ListenableWorker listenableWorker0 = l0.l;
                g g0 = (g)this.j.get();
                i i0 = l0.k;
                if(g0 == null) {
                    throw new IllegalStateException("Worker was marked important (" + i0.c + ") but did not provide ForegroundInfo");
                }
                m.d().a("WM-WorkForegroundRunnab", "Updating notification for " + i0.c, new Throwable[0]);
                listenableWorker0.setRunInForeground(true);
                l0.m.getClass();
                j j1 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
                d3 d30 = new d3(l0.m, j1, listenableWorker0.getId(), g0, l0.j, 1);
                l0.m.a.k(d30);
                j0.l(j1);
                return;
            }
            catch(Throwable throwable0) {
            }
            j0.k(throwable0);
            return;
        }
        a a0 = this.k.l.getForegroundInfoAsync();
        this.j.l(a0);
    }
}

