package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import g1.b;
import l1.j;

public class TaskCompletionSource {
    public final j a;

    public TaskCompletionSource() {
        this.a = new j();
    }

    public TaskCompletionSource(CancellationToken cancellationToken0) {
        this.a = new j();
        cancellationToken0.onCanceledRequested(new b(this));
    }

    public Task getTask() {
        return this.a;
    }

    public void setException(Exception exception0) {
        this.a.a(exception0);
    }

    public void setResult(Object object0) {
        this.a.b(object0);
    }

    public boolean trySetException(Exception exception0) {
        j j0 = this.a;
        j0.getClass();
        Preconditions.checkNotNull(exception0, "Exception must not be null");
        synchronized(j0.a) {
            if(j0.c) {
                return false;
            }
            j0.c = true;
            j0.f = exception0;
        }
        j0.b.c(j0);
        return true;
    }

    public boolean trySetResult(Object object0) {
        return this.a.d(object0);
    }
}

