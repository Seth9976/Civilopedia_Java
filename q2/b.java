package q2;

import J2.j;
import N1.a;
import android.app.job.JobParameters;
import com.android.billingclient.api.Purchase;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import s1.m;
import s1.n;

public final class b implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;

    public b(int v, Object object0, Object object1) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        super();
    }

    private final void a() {
        m m0 = (m)this.j;
        N1.b b0 = (N1.b)this.k;
        synchronized(m0) {
            if(m0.b == null) {
                m0.a.add(b0);
            }
            else {
                m0.b.add(b0.get());
            }
        }
    }

    @Override
    public final void run() {
        a a0;
        switch(this.i) {
            case 0: {
                j.f(((e)this.j), "this$0");
                j.f(((Purchase)this.k), "$purchase");
                ((e)this.j).a(((Purchase)this.k));
                return;
            }
            case 1: {
                n n0 = (n)this.j;
                N1.b b0 = (N1.b)this.k;
                if(n0.b != n.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized(n0) {
                    a0 = n0.a;
                    n0.a = null;
                    n0.b = b0;
                }
                a0.b(b0);
                return;
            }
            case 2: {
                this.a();
                return;
            }
            default: {
                ((JobInfoSchedulerService)this.j).jobFinished(((JobParameters)this.k), false);
            }
        }
    }
}

