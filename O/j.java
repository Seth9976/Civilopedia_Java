package O;

import R.c;
import R.d;
import S.b;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class j {
    public volatile b a;
    public Executor b;
    public c c;
    public final e d;
    public boolean e;
    public boolean f;
    public ArrayList g;
    public final ReentrantReadWriteLock h;
    public final ThreadLocal i;

    public j() {
        this.h = new ReentrantReadWriteLock();
        this.i = new ThreadLocal();
        new ConcurrentHashMap();
        this.d = this.d();
    }

    public final void a() {
        if(this.e) {
            return;
        }
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if(!((SQLiteDatabase)this.c.h().j).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        this.a();
        b b0 = this.c.h();
        this.d.c(b0);
        b0.a();
    }

    public abstract e d();

    public abstract c e(a arg1);

    public final void f() {
        this.c.h().f();
        if(!((SQLiteDatabase)this.c.h().j).inTransaction()) {
            e e0 = this.d;
            if(e0.d.compareAndSet(false, true)) {
                e0.c.b.execute(e0.i);
            }
        }
    }

    public final Cursor g(d d0) {
        this.a();
        this.b();
        return this.c.h().i(d0);
    }

    public final void h() {
        this.c.h().k();
    }
}

