package androidx.work;

import Y.f;
import Y.g;
import Y.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.d3;
import i0.m;
import i0.n;
import i0.o;
import j0.j;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n1.a;

public abstract class ListenableWorker {
    public final Context i;
    public final WorkerParameters j;
    public volatile boolean k;
    public boolean l;
    public boolean m;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context0, WorkerParameters workerParameters0) {
        if(context0 == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if(workerParameters0 == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.i = context0;
        this.j = workerParameters0;
    }

    public final Context getApplicationContext() {
        return this.i;
    }

    public Executor getBackgroundExecutor() {
        return this.j.f;
    }

    public a getForegroundInfoAsync() {
        a a0 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        ((j)a0).k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return a0;
    }

    public final UUID getId() {
        return this.j.a;
    }

    public final f getInputData() {
        return this.j.b;
    }

    public final Network getNetwork() {
        return (Network)this.j.d.l;
    }

    public final int getRunAttemptCount() {
        return this.j.e;
    }

    public final Set getTags() {
        return this.j.c;
    }

    public k0.a getTaskExecutor() {
        return this.j.g;
    }

    public final List getTriggeredContentAuthorities() {
        return (List)this.j.d.j;
    }

    public final List getTriggeredContentUris() {
        return (List)this.j.d.k;
    }

    public t getWorkerFactory() {
        return this.j.h;
    }

    public boolean isRunInForeground() {
        return this.m;
    }

    public final boolean isStopped() {
        return this.k;
    }

    public final boolean isUsed() {
        return this.l;
    }

    public void onStopped() {
    }

    public final a setForegroundAsync(g g0) {
        this.m = true;
        m m0 = this.j.j;
        m0.getClass();
        a a0 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        d3 d30 = new d3(m0, a0, this.getId(), g0, this.getApplicationContext(), 1);
        m0.a.k(d30);
        return a0;
    }

    public a setProgressAsync(f f0) {
        o o0 = this.j.i;
        o0.getClass();
        a a0 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        n n0 = new n(o0, this.getId(), f0, a0, 0);
        o0.b.k(n0);
        return a0;
    }

    public void setRunInForeground(boolean z) {
        this.m = z;
    }

    public final void setUsed() {
        this.l = true;
    }

    public abstract a startWork();

    public final void stop() {
        this.k = true;
        this.onStopped();
    }
}

