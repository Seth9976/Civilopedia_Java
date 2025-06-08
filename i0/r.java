package i0;

import Y.m;
import b0.e;

public final class r implements Runnable {
    public final s i;
    public final String j;

    public r(s s0, String s1) {
        this.i = s0;
        this.j = s1;
    }

    @Override
    public final void run() {
        synchronized(this.i.d) {
            if(((r)this.i.b.remove(this.j)) == null) {
                m.d().a("WrkTimerRunnable", "Timer with " + this.j + " is already marked as complete.", new Throwable[0]);
            }
            else {
                q q0 = (q)this.i.c.remove(this.j);
                if(q0 != null) {
                    m.d().a("WM-DelayMetCommandHandl", "Exceeded time limits on execution for " + this.j, new Throwable[0]);
                    ((e)q0).f();
                }
            }
        }
    }
}

