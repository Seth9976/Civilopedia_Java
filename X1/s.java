package x1;

import com.google.android.gms.tasks.Task;
import f2.J;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class s {
    public static final ExecutorService a;

    static {
        s.a = e.a("awaitEvenIfOnMainThread task continuation executor");
    }

    public static Object a(Task task0) {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        J j0 = new J(countDownLatch0, 11);
        task0.continueWith(s.a, j0);
        countDownLatch0.await(4L, TimeUnit.SECONDS);
        if(task0.isSuccessful()) {
            return task0.getResult();
        }
        if(task0.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if(!task0.isComplete()) {
            throw new TimeoutException();
        }
        throw new IllegalStateException(task0.getException());
    }
}

