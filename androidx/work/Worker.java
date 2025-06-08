package androidx.work;

import B.b;
import Y.l;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import j0.j;
import n1.a;

public abstract class Worker extends ListenableWorker {
    public j n;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
    }

    public abstract l doWork();

    @Override  // androidx.work.ListenableWorker
    public final a startWork() {
        this.n = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.getBackgroundExecutor().execute(new b(this, 13));
        return this.n;
    }
}

