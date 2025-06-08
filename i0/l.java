package i0;

import B1.a;
import android.content.Context;
import androidx.work.ListenableWorker;
import h0.i;
import j0.j;

public final class l implements Runnable {
    public final j i;
    public final Context j;
    public final i k;
    public final ListenableWorker l;
    public final m m;
    public final a n;
    public static final String o;

    static {
        l.o = "WM-WorkForegroundRunnab";
    }

    public l(Context context0, i i0, ListenableWorker listenableWorker0, m m0, a a0) {
        this.i = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.j = context0;
        this.k = i0;
        this.l = listenableWorker0;
        this.m = m0;
        this.n = a0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final void run() {
        this.i.j(null);
    }
}

