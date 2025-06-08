package x1;

import B.c;
import E1.d;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f0.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import l.L0;
import q0.p;
import w3.k;
import z1.F;
import z1.G;
import z1.H;
import z1.J;
import z1.K;
import z1.r0;

public final class f implements Callable {
    public final long a;
    public final Throwable b;
    public final Thread c;
    public final d d;
    public final i e;

    public f(i i0, long v, Throwable throwable0, Thread thread0, d d0) {
        this.e = i0;
        this.a = v;
        this.b = throwable0;
        this.c = thread0;
        this.d = d0;
    }

    @Override
    public final Object call() {
        c c1;
        Iterator iterator2;
        long v = this.a;
        i i0 = this.e;
        NavigableSet navigableSet0 = ((C1.c)i0.k.k).c();
        String s = navigableSet0.isEmpty() ? null : ((String)navigableSet0.first());
        if(s == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        i0.c.l0();
        B.f f0 = i0.k;
        f0.getClass();
        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Persisting fatal event for session " + s, null);
        }
        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = null;
        m m0 = (m)f0.j;
        int v1 = m0.a.getResources().getConfiguration().orientation;
        String s1 = this.b.getLocalizedMessage();
        String s2 = this.b.getClass().getName();
        StackTraceElement[] arr_stackTraceElement = this.b.getStackTrace();
        c c0 = m0.d;
        StackTraceElement[] arr_stackTraceElement1 = c0.h(arr_stackTraceElement);
        Throwable throwable0 = this.b.getCause();
        g g0 = throwable0 == null ? null : new g(throwable0, c0);
        B.f f1 = new B.f(12);
        f1.j = "crash";
        f1.k = (long)(v / 1000L);
        L0 l00 = m0.c;
        List list0 = ((ActivityManager)m0.a.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo1 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo1.processName.equals(((String)l00.m))) {
                    activityManager$RunningAppProcessInfo0 = activityManager$RunningAppProcessInfo1;
                    break;
                }
            }
        }
        Boolean boolean0 = activityManager$RunningAppProcessInfo0 == null ? null : Boolean.valueOf(activityManager$RunningAppProcessInfo0.importance != 100);
        ArrayList arrayList0 = new ArrayList();
        Thread thread0 = this.c;
        arrayList0.add(m.e(thread0, arr_stackTraceElement1, 4));
        for(Iterator iterator1 = Thread.getAllStackTraces().entrySet().iterator(); iterator1.hasNext(); iterator1 = iterator2) {
            Object object1 = iterator1.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Thread thread1 = (Thread)map$Entry0.getKey();
            if(thread1.equals(thread0)) {
                iterator2 = iterator1;
                c1 = c0;
            }
            else {
                iterator2 = iterator1;
                c1 = c0;
                arrayList0.add(m.e(thread1, c0.h(((StackTraceElement[])map$Entry0.getValue())), 0));
            }
            c0 = c1;
        }
        f1.l = new G(new H(new r0(arrayList0), new J(s2, s1, new r0(m.d(arr_stackTraceElement1, 4)), (g0 == null ? null : m.c(g0, 1)), 0), null, new K("0", "0", 0L), m0.a()), null, null, boolean0, v1);
        f1.m = m0.b(v1);
        F f2 = B.f.a(f1.c(), ((y1.c)f0.m), ((p)f0.n));
        ((C1.c)f0.k).d(f2, s, true);
        try {
            i0.f.getClass();
            if(!new File(((File)i0.f.j), ".ae" + v).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        }
        catch(IOException iOException0) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", iOException0);
        }
        d d0 = this.d;
        i0.c(false, d0);
        new x1.c(i0.e);
        i.a(i0, x1.c.b);
        if(!i0.b.a()) {
            return Tasks.forResult(null);
        }
        ExecutorService executorService0 = (ExecutorService)i0.d.j;
        return ((TaskCompletionSource)((AtomicReference)d0.q).get()).getTask().onSuccessTask(executorService0, new k(this, executorService0, s));
    }
}

