package com.google.android.gms.tasks;

import B.a;
import D3.b;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tasks.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.d;
import l1.j;

public final class Tasks {
    public static Object a(Task task0) {
        if(task0.isSuccessful()) {
            return task0.getResult();
        }
        if(!task0.isCanceled()) {
            throw new ExecutionException(task0.getException());
        }
        throw new CancellationException("Task is already canceled");
    }

    public static Object await(Task task0) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task0, "Task must not be null");
        if(task0.isComplete()) {
            return Tasks.a(task0);
        }
        d d0 = new d(4);
        task0.addOnSuccessListener(TaskExecutors.a, d0);
        task0.addOnFailureListener(TaskExecutors.a, d0);
        task0.addOnCanceledListener(TaskExecutors.a, d0);
        ((CountDownLatch)d0.j).await();
        return Tasks.a(task0);
    }

    public static Object await(Task task0, long v, TimeUnit timeUnit0) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task0, "Task must not be null");
        Preconditions.checkNotNull(timeUnit0, "TimeUnit must not be null");
        if(task0.isComplete()) {
            return Tasks.a(task0);
        }
        d d0 = new d(4);
        task0.addOnSuccessListener(TaskExecutors.a, d0);
        task0.addOnFailureListener(TaskExecutors.a, d0);
        task0.addOnCanceledListener(TaskExecutors.a, d0);
        if(!((CountDownLatch)d0.j).await(v, timeUnit0)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return Tasks.a(task0);
    }

    @Deprecated
    public static Task call(Callable callable0) {
        return Tasks.call(TaskExecutors.MAIN_THREAD, callable0);
    }

    @Deprecated
    public static Task call(Executor executor0, Callable callable0) {
        Preconditions.checkNotNull(executor0, "Executor must not be null");
        Preconditions.checkNotNull(callable0, "Callback must not be null");
        Task task0 = new j();
        executor0.execute(new a(25, task0, callable0));
        return task0;
    }

    public static Task forCanceled() {
        Task task0 = new j();
        ((j)task0).c();
        return task0;
    }

    public static Task forException(Exception exception0) {
        Task task0 = new j();
        ((j)task0).a(exception0);
        return task0;
    }

    public static Task forResult(Object object0) {
        Task task0 = new j();
        ((j)task0).b(object0);
        return task0;
    }

    public static Task whenAll(Collection collection0) {
        if(collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(((Task)object0) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
                if(false) {
                    break;
                }
            }
            Task task0 = new j();
            l1.a a0 = new l1.a(collection0.size(), ((j)task0));
            for(Object object1: collection0) {
                ((Task)object1).addOnSuccessListener(TaskExecutors.a, a0);
                ((Task)object1).addOnFailureListener(TaskExecutors.a, a0);
                ((Task)object1).addOnCanceledListener(TaskExecutors.a, a0);
            }
            return task0;
        }
        return Tasks.forResult(null);
    }

    public static Task whenAll(Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(null) : Tasks.whenAll(Arrays.asList(arr_task));
    }

    public static Task whenAllComplete(Collection collection0) {
        return Tasks.whenAllComplete(TaskExecutors.MAIN_THREAD, collection0);
    }

    public static Task whenAllComplete(Executor executor0, Collection collection0) {
        return collection0 == null || collection0.isEmpty() ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAll(collection0).continueWithTask(executor0, new b(collection0, 28));
    }

    public static Task whenAllComplete(Executor executor0, Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAllComplete(executor0, Arrays.asList(arr_task));
    }

    public static Task whenAllComplete(Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAllComplete(Arrays.asList(arr_task));
    }

    public static Task whenAllSuccess(Collection collection0) {
        return Tasks.whenAllSuccess(TaskExecutors.MAIN_THREAD, collection0);
    }

    public static Task whenAllSuccess(Executor executor0, Collection collection0) {
        return collection0 == null || collection0.isEmpty() ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAll(collection0).continueWith(executor0, new d(collection0, 3));
    }

    public static Task whenAllSuccess(Executor executor0, Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAllSuccess(executor0, Arrays.asList(arr_task));
    }

    public static Task whenAllSuccess(Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAllSuccess(Arrays.asList(arr_task));
    }

    public static Task withTimeout(Task task0, long v, TimeUnit timeUnit0) {
        Preconditions.checkNotNull(task0, "Task must not be null");
        Preconditions.checkArgument(v > 0L, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit0, "TimeUnit must not be null");
        l1.b b0 = new l1.b();
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource(b0);
        zza zza0 = new zza(Looper.getMainLooper());
        zza0.postDelayed(new zzx(taskCompletionSource0), timeUnit0.toMillis(v));
        task0.addOnCompleteListener(new zzy(zza0, taskCompletionSource0, b0));
        return taskCompletionSource0.getTask();
    }
}

