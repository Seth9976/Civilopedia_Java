package l1;

import android.app.Activity;
import com.google.android.gms.tasks.OnCanceledListener;
import f0.g;
import l.L;
import m0.n;
import m0.y;

public final class d implements Runnable {
    public final int i;
    public final Object j;

    public d(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override
    public final void run() {
        switch(this.i) {
            case 0: {
                Object object0 = ((e)this.j).k;
                synchronized(object0) {
                    OnCanceledListener onCanceledListener0 = (OnCanceledListener)((e)this.j).l;
                    if(onCanceledListener0 != null) {
                        onCanceledListener0.onCanceled();
                    }
                }
                return;
            }
            case 1: {
                ((n)this.j).j.m(0);
                ((n)this.j).j.u(24, 6, y.l);
                ((n)this.j).a(y.l);
                return;
            }
            case 2: {
                Activity activity0 = (Activity)this.j;
                if(!activity0.isFinishing() && !u.e.a(activity0)) {
                    activity0.recreate();
                }
                return;
            }
            case 3: {
                ((L)this.j).getClass();
                return;
            }
            default: {
                ((ThreadLocal)((g)this.j).m).set(Boolean.TRUE);
            }
        }
    }
}

