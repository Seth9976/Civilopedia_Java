package l1;

import B.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public final class c implements OnCanceledListener, OnFailureListener, OnSuccessListener, f {
    public final int i;
    public final Executor j;
    public final Continuation k;
    public final j l;

    public c(Executor executor0, Continuation continuation0, j j0, int v) {
        this.i = v;
        this.j = executor0;
        this.k = continuation0;
        this.l = j0;
        super();
    }

    @Override  // l1.f
    public final void a(Task task0) {
        if(this.i != 0) {
            a a0 = new a(this, task0, 20, false);
            this.j.execute(a0);
            return;
        }
        a a1 = new a(this, task0, 19, false);
        this.j.execute(a1);
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        this.l.c();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        this.l.a(exception0);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        this.l.b(object0);
    }

    @Override  // l1.f
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}

