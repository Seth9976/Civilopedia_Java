package Y;

import A.f;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public abstract class t {
    public static final String a;

    static {
        t.a = "WM-WorkerFactory";
    }

    public final ListenableWorker a(Context context0, String s, WorkerParameters workerParameters0) {
        Class class0;
        ListenableWorker listenableWorker0;
        String s1;
        try {
            s1 = t.a;
            listenableWorker0 = null;
            class0 = Class.forName(s).asSubclass(ListenableWorker.class);
        }
        catch(Throwable throwable0) {
            m.d().b(s1, "Invalid class: " + s, new Throwable[]{throwable0});
            class0 = null;
        }
        if(class0 != null) {
            try {
                listenableWorker0 = (ListenableWorker)class0.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context0, workerParameters0);
            }
            catch(Throwable throwable1) {
                m.d().b(s1, "Could not instantiate " + s, new Throwable[]{throwable1});
            }
        }
        if(listenableWorker0 != null && listenableWorker0.isUsed()) {
            throw new IllegalStateException(f.k("WorkerFactory (", this.getClass().getName(), ") returned an instance of a ListenableWorker (", s, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
        }
        return listenableWorker0;
    }
}

