package l1;

import B.a;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public final class e implements OnCanceledListener, OnFailureListener, OnSuccessListener, f {
    public final int i;
    public final Executor j;
    public final Object k;
    public Object l;

    public e(Executor executor0, OnCanceledListener onCanceledListener0) {
        this.i = 0;
        super();
        this.k = new Object();
        this.j = executor0;
        this.l = onCanceledListener0;
    }

    public e(Executor executor0, OnCompleteListener onCompleteListener0) {
        this.i = 1;
        super();
        this.k = new Object();
        this.j = executor0;
        this.l = onCompleteListener0;
    }

    public e(Executor executor0, OnFailureListener onFailureListener0) {
        this.i = 2;
        super();
        this.k = new Object();
        this.j = executor0;
        this.l = onFailureListener0;
    }

    public e(Executor executor0, OnSuccessListener onSuccessListener0) {
        this.i = 3;
        super();
        this.k = new Object();
        this.j = executor0;
        this.l = onSuccessListener0;
    }

    public e(Executor executor0, SuccessContinuation successContinuation0, j j0) {
        this.i = 4;
        super();
        this.j = executor0;
        this.k = successContinuation0;
        this.l = j0;
    }

    @Override  // l1.f
    public final void a(Task task0) {
        switch(this.i) {
            case 0: {
                if(task0.isCanceled()) {
                    Object object0 = this.k;
                    synchronized(object0) {
                        if(((OnCanceledListener)this.l) == null) {
                            return;
                        }
                    }
                    d d0 = new d(this, 0);
                    this.j.execute(d0);
                }
                return;
            }
            case 1: {
                this.e(task0);
                return;
            }
            case 2: {
                this.f(task0);
                return;
            }
            case 3: {
                this.g(task0);
                return;
            }
            default: {
                a a0 = new a(this, task0, 24, false);
                this.j.execute(a0);
            }
        }
    }

    private final void b() {
        synchronized(this.k) {
            this.l = null;
        }
    }

    private final void c() {
        synchronized(this.k) {
            this.l = null;
        }
    }

    private final void d() {
        synchronized(this.k) {
            this.l = null;
        }
    }

    private final void e(Task task0) {
        synchronized(this.k) {
            if(((OnCompleteListener)this.l) == null) {
                return;
            }
        }
        a a0 = new a(this, task0, 21, false);
        this.j.execute(a0);
    }

    private final void f(Task task0) {
        if(!task0.isSuccessful() && !task0.isCanceled()) {
            Object object0 = this.k;
            synchronized(object0) {
                if(((OnFailureListener)this.l) == null) {
                    return;
                }
            }
            a a0 = new a(this, task0, 22, false);
            this.j.execute(a0);
        }
    }

    private final void g(Task task0) {
        if(task0.isSuccessful()) {
            Object object0 = this.k;
            synchronized(object0) {
                if(((OnSuccessListener)this.l) == null) {
                    return;
                }
            }
            a a0 = new a(this, task0, 23, false);
            this.j.execute(a0);
        }
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((j)this.l).c();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        ((j)this.l).a(exception0);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        ((j)this.l).b(object0);
    }

    @Override  // l1.f
    public final void zzc() {
        switch(this.i) {
            case 0: {
                synchronized(this.k) {
                    this.l = null;
                }
                return;
            }
            case 1: {
                this.b();
                return;
            }
            case 2: {
                this.c();
                return;
            }
            case 3: {
                this.d();
                return;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}

