package i1;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgb;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import jeb.synthetic.FIN;

public final class v extends Thread {
    public final Object i;
    public final AbstractQueue j;
    public boolean k;
    public final zzgb l;

    public v(zzgb zzgb0, String s, BlockingQueue blockingQueue0) {
        this.l = zzgb0;
        super();
        this.k = false;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(blockingQueue0);
        this.i = new Object();
        this.j = (AbstractQueue)blockingQueue0;
        this.setName(s);
    }

    public final void a() {
        synchronized(this.i) {
            this.i.notifyAll();
        }
    }

    public final void b() {
        synchronized(this.l.i) {
            if(!this.k) {
                this.l.j.release();
                this.l.i.notifyAll();
                zzgb zzgb0 = this.l;
                if(this == zzgb0.c) {
                    zzgb0.c = null;
                }
                else if(this == zzgb0.d) {
                    zzgb0.d = null;
                }
                else {
                    zzgb0.a.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                }
                this.k = true;
            }
        }
    }

    @Override
    public final void run() {
        for(boolean z = false; !z; z = true) {
            try {
                this.l.j.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.l.a.zzay().zzk().zzb(this.getName() + " was interrupted", interruptedException0);
            }
        }
        int v = FIN.finallyOpen$NT();
        int v1 = Process.getThreadPriority(Process.myTid());
        while(true) {
            u u0 = (u)this.j.poll();
            if(u0 == null) {
                Object object0 = this.i;
                __monitor_enter(object0);
                try {
                    if(this.j.peek() == null) {
                        this.l.getClass();
                        try {
                            this.i.wait(30000L);
                        }
                        catch(InterruptedException interruptedException1) {
                            this.l.a.zzay().zzk().zzb(this.getName() + " was interrupted", interruptedException1);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    FIN.finallyExec$NT(v);
                    throw throwable0;
                }
                __monitor_exit(object0);
                Object object1 = this.l.i;
                __monitor_enter(object1);
                try {
                    if(this.j.peek() == null) {
                        this.b();
                        goto label_38;
                    }
                    goto label_43;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(object1);
                    FIN.finallyExec$NT(v);
                    throw throwable1;
                }
            label_38:
                __monitor_exit(object1);
                FIN.finallyCodeBegin$NT(v);
                this.b();
                FIN.finallyCodeEnd$NT(v);
                return;
            label_43:
                __monitor_exit(object1);
            }
            else {
                Process.setThreadPriority((u0.j ? v1 : 10));
                u0.run();
            }
        }
    }
}

