package t1;

import E1.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import i1.y;
import java.util.concurrent.Callable;
import m0.B;
import x1.l;

public final class b implements Callable {
    public final boolean a;
    public final l b;
    public final d c;

    public b(boolean z, l l0, d d0) {
        this.a = z;
        this.b = l0;
        this.c = d0;
    }

    @Override
    public final Object call() {
        if(this.a) {
            B b0 = new B(6, new y(5, this.b, this.c), new TaskCompletionSource());
            this.b.l.execute(b0);
        }
        return null;
    }
}

