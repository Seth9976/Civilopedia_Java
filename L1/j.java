package l1;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class j extends Task {
    public final Object a;
    public final g b;
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public j() {
        this.a = new Object();
        this.b = new g();
    }

    public final void a(Exception exception0) {
        Preconditions.checkNotNull(exception0, "Exception must not be null");
        synchronized(this.a) {
            if(!this.c) {
                this.c = true;
                this.f = exception0;
                this.b.c(this);
                return;
            }
        }
        throw DuplicateTaskCompletionException.of(this);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity0, OnCanceledListener onCanceledListener0) {
        e e0 = new e(TaskExecutors.MAIN_THREAD, onCanceledListener0);
        this.b.b(e0);
        i.b(activity0).c(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener0) {
        this.addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener0);
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor0, OnCanceledListener onCanceledListener0) {
        e e0 = new e(executor0, onCanceledListener0);
        this.b.b(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity0, OnCompleteListener onCompleteListener0) {
        e e0 = new e(TaskExecutors.MAIN_THREAD, onCompleteListener0);
        this.b.b(e0);
        i.b(activity0).c(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener0) {
        e e0 = new e(TaskExecutors.MAIN_THREAD, onCompleteListener0);
        this.b.b(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor0, OnCompleteListener onCompleteListener0) {
        e e0 = new e(executor0, onCompleteListener0);
        this.b.b(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity0, OnFailureListener onFailureListener0) {
        e e0 = new e(TaskExecutors.MAIN_THREAD, onFailureListener0);
        this.b.b(e0);
        i.b(activity0).c(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener0) {
        this.addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener0);
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor0, OnFailureListener onFailureListener0) {
        e e0 = new e(executor0, onFailureListener0);
        this.b.b(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity0, OnSuccessListener onSuccessListener0) {
        e e0 = new e(TaskExecutors.MAIN_THREAD, onSuccessListener0);
        this.b.b(e0);
        i.b(activity0).c(e0);
        this.e();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener0) {
        this.addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener0);
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor0, OnSuccessListener onSuccessListener0) {
        e e0 = new e(executor0, onSuccessListener0);
        this.b.b(e0);
        this.e();
        return this;
    }

    public final void b(Object object0) {
        synchronized(this.a) {
            if(!this.c) {
                this.c = true;
                this.e = object0;
                this.b.c(this);
                return;
            }
        }
        throw DuplicateTaskCompletionException.of(this);
    }

    public final void c() {
        synchronized(this.a) {
            if(this.c) {
                return;
            }
            this.c = true;
            this.d = true;
        }
        this.b.c(this);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation0) {
        return this.continueWith(TaskExecutors.MAIN_THREAD, continuation0);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor0, Continuation continuation0) {
        Task task0 = new j();
        c c0 = new c(executor0, continuation0, ((j)task0), 0);
        this.b.b(c0);
        this.e();
        return task0;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation0) {
        return this.continueWithTask(TaskExecutors.MAIN_THREAD, continuation0);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor0, Continuation continuation0) {
        Task task0 = new j();
        c c0 = new c(executor0, continuation0, ((j)task0), 1);
        this.b.b(c0);
        this.e();
        return task0;
    }

    public final boolean d(Object object0) {
        synchronized(this.a) {
            if(this.c) {
                return false;
            }
            this.c = true;
            this.e = object0;
        }
        this.b.c(this);
        return true;
    }

    public final void e() {
        synchronized(this.a) {
            if(!this.c) {
                return;
            }
        }
        this.b.c(this);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Exception getException() {
        synchronized(this.a) {
        }
        return this.f;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Object getResult() {
        synchronized(this.a) {
            Preconditions.checkState(this.c, "Task is not yet complete");
            if(!this.d) {
                Exception exception0 = this.f;
                if(exception0 != null) {
                    throw new RuntimeExecutionException(exception0);
                }
                return this.e;
            }
        }
        throw new CancellationException("Task is already canceled.");
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Object getResult(Class class0) {
        synchronized(this.a) {
            Preconditions.checkState(this.c, "Task is not yet complete");
            if(!this.d) {
                if(class0.isInstance(this.f)) {
                    throw (Throwable)class0.cast(this.f);
                }
                Exception exception0 = this.f;
                if(exception0 != null) {
                    throw new RuntimeExecutionException(exception0);
                }
                return this.e;
            }
        }
        throw new CancellationException("Task is already canceled.");
    }

    @Override  // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.d;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        synchronized(this.a) {
        }
        return this.c;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z = false;
        synchronized(this.a) {
            if(this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation0) {
        Task task0 = new j();
        e e0 = new e(TaskExecutors.MAIN_THREAD, successContinuation0, ((j)task0));
        this.b.b(e0);
        this.e();
        return task0;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor0, SuccessContinuation successContinuation0) {
        Task task0 = new j();
        e e0 = new e(executor0, successContinuation0, ((j)task0));
        this.b.b(e0);
        this.e();
        return task0;
    }
}

