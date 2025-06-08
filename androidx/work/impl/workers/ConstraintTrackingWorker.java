package androidx.work.impl.workers;

import Y.m;
import Z.k;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import d0.b;
import j0.j;
import java.util.ArrayList;
import java.util.List;
import k0.a;

public class ConstraintTrackingWorker extends ListenableWorker implements b {
    public final WorkerParameters n;
    public final Object o;
    public volatile boolean p;
    public final j q;
    public ListenableWorker r;
    public static final String s;

    static {
        ConstraintTrackingWorker.s = "WM-ConstraintTrkngWrkr";
    }

    public ConstraintTrackingWorker(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.n = workerParameters0;
        this.o = new Object();
        this.p = false;
        this.q = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // d0.b
    public final void c(ArrayList arrayList0) {
        m.d().a("WM-ConstraintTrkngWrkr", String.format("Constraints changed for %s", arrayList0), new Throwable[0]);
        synchronized(this.o) {
            this.p = true;
        }
    }

    @Override  // d0.b
    public final void e(List list0) {
    }

    @Override  // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return k.U(this.getApplicationContext()).n;
    }

    @Override  // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        return this.r != null && this.r.isRunInForeground();
    }

    @Override  // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        if(this.r != null && !this.r.isStopped()) {
            this.r.stop();
        }
    }

    @Override  // androidx.work.ListenableWorker
    public final n1.a startWork() {
        this.getBackgroundExecutor().execute(new B.b(this, 29));
        return this.q;
    }
}

