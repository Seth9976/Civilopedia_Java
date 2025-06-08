package l1;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

public final class a implements OnCanceledListener, OnFailureListener, OnSuccessListener {
    public final Object i;
    public final int j;
    public final j k;
    public int l;
    public int m;
    public int n;
    public Exception o;
    public boolean p;

    public a(int v, j j0) {
        this.i = new Object();
        this.j = v;
        this.k = j0;
    }

    public final void a() {
        int v = this.j;
        if(this.l + this.m + this.n == v) {
            j j0 = this.k;
            if(this.o != null) {
                j0.a(new ExecutionException(this.m + " out of " + v + " underlying tasks failed", this.o));
                return;
            }
            if(this.p) {
                j0.c();
                return;
            }
            j0.b(null);
        }
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized(this.i) {
            ++this.n;
            this.p = true;
            this.a();
        }
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        synchronized(this.i) {
            ++this.m;
            this.o = exception0;
            this.a();
        }
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        synchronized(this.i) {
            ++this.l;
            this.a();
        }
    }
}

