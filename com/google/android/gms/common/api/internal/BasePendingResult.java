package com.google.android.gms.common.api.internal;

import L2.b;
import M0.B;
import M0.F;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
public abstract class BasePendingResult extends PendingResult {
    public static class CallbackHandler extends zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public final void handleMessage(Message message0) {
            int v = message0.what;
            switch(v) {
                case 1: {
                    Pair pair0 = (Pair)message0.obj;
                    ResultCallback resultCallback0 = (ResultCallback)pair0.first;
                    Result result0 = (Result)pair0.second;
                    try {
                        resultCallback0.onResult(result0);
                        return;
                    }
                    catch(RuntimeException runtimeException0) {
                        BasePendingResult.zal(result0);
                        throw runtimeException0;
                    }
                }
                case 2: {
                    ((BasePendingResult)message0.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                }
                default: {
                    Log.wtf("BasePendingResult", "Don\'t know how to handle message: " + v, new Exception());
                }
            }
        }

        public final void zaa(ResultCallback resultCallback0, Result result0) {
            this.sendMessage(this.obtainMessage(1, new Pair(((ResultCallback)Preconditions.checkNotNull(resultCallback0)), result0)));
        }
    }

    public final Object a;
    public final CallbackHandler b;
    public final WeakReference c;
    public final CountDownLatch d;
    public final ArrayList e;
    public ResultCallback f;
    public final AtomicReference g;
    public Result h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public volatile zada m;
    public boolean n;
    public static final b o;
    @KeepName
    private F resultGuardian;
    public static final int zad;

    static {
        BasePendingResult.o = new b(1);
    }

    public BasePendingResult(Looper looper0) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.n = false;
        this.b = new CallbackHandler(looper0);
        this.c = new WeakReference(null);
    }

    public BasePendingResult(GoogleApiClient googleApiClient0) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.n = false;
        this.b = new CallbackHandler((googleApiClient0 == null ? Looper.getMainLooper() : googleApiClient0.getLooper()));
        this.c = new WeakReference(googleApiClient0);
    }

    public final Result a() {
        Result result0;
        synchronized(this.a) {
            Preconditions.checkState(!this.j, "Result has already been consumed.");
            Preconditions.checkState(this.isReady(), "Result is not ready.");
            result0 = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        B b0 = (B)this.g.getAndSet(null);
        if(b0 != null) {
            b0.a.a.remove(this);
        }
        return (Result)Preconditions.checkNotNull(result0);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(StatusListener pendingResult$StatusListener0) {
        Preconditions.checkArgument(pendingResult$StatusListener0 != null, "Callback cannot be null.");
        synchronized(this.a) {
            if(this.isReady()) {
                pendingResult$StatusListener0.onComplete(this.i);
            }
            else {
                this.e.add(pendingResult$StatusListener0);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    public final Result await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.j, "Result has already been consumed");
        if(this.m != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.d.await();
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.a();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    public final Result await(long v, TimeUnit timeUnit0) {
        if(v > 0L) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.j, "Result has already been consumed.");
        if(this.m != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if(!this.d.await(v, timeUnit0)) {
                this.forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.a();
    }

    public final void b(Result result0) {
        this.h = result0;
        this.i = result0.getStatus();
        this.d.countDown();
        if(this.k) {
            this.f = null;
        }
        else {
            ResultCallback resultCallback0 = this.f;
            if(resultCallback0 != null) {
                this.b.removeMessages(2);
                Result result1 = this.a();
                this.b.zaa(resultCallback0, result1);
            }
            else if(this.h instanceof Releasable) {
                this.resultGuardian = new F(this);
            }
        }
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((StatusListener)arrayList0.get(v1)).onComplete(this.i);
        }
        arrayList0.clear();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized(this.a) {
            if(!this.k && !this.j) {
                BasePendingResult.zal(this.h);
                this.k = true;
                this.b(this.createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    public abstract Result createFailedResult(Status arg1);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(Status status0) {
        synchronized(this.a) {
            if(!this.isReady()) {
                this.setResult(this.createFailedResult(status0));
                this.l = true;
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        synchronized(this.a) {
        }
        return this.k;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.d.getCount() == 0L;
    }

    @KeepForSdk
    public final void setResult(Result result0) {
        synchronized(this.a) {
            if(!this.l && !this.k) {
                this.isReady();
                Preconditions.checkState(!this.isReady(), "Results have already been set");
                Preconditions.checkState(!this.j, "Result has already been consumed");
                this.b(result0);
                return;
            }
            BasePendingResult.zal(result0);
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback resultCallback0) {
        synchronized(this.a) {
            if(resultCallback0 == null) {
                this.f = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.j, "Result has already been consumed.");
            if(this.m != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if(this.isCanceled()) {
                return;
            }
            if(this.isReady()) {
                Result result0 = this.a();
                this.b.zaa(resultCallback0, result0);
            }
            else {
                this.f = resultCallback0;
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback resultCallback0, long v, TimeUnit timeUnit0) {
        synchronized(this.a) {
            if(resultCallback0 == null) {
                this.f = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.j, "Result has already been consumed.");
            if(this.m != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if(this.isCanceled()) {
                return;
            }
            if(this.isReady()) {
                Result result0 = this.a();
                this.b.zaa(resultCallback0, result0);
            }
            else {
                this.f = resultCallback0;
                long v2 = timeUnit0.toMillis(v);
                Message message0 = this.b.obtainMessage(2, this);
                this.b.sendMessageDelayed(message0, v2);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final TransformedResult then(ResultTransform resultTransform0) {
        boolean z = false;
        Preconditions.checkState(!this.j, "Result has already been consumed.");
        synchronized(this.a) {
            Preconditions.checkState(this.m == null, "Cannot call then() twice.");
            if(this.f == null) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(!this.k, "Cannot call then() if result was canceled.");
            this.n = true;
            this.m = new zada(this.c);
            TransformedResult transformedResult0 = this.m.then(resultTransform0);
            if(this.isReady()) {
                zada zada0 = this.m;
                Result result0 = this.a();
                this.b.zaa(zada0, result0);
            }
            else {
                this.f = this.m;
            }
            return transformedResult0;
        }
    }

    public final void zak() {
        this.n = this.n || ((Boolean)BasePendingResult.o.get()).booleanValue();
    }

    public static void zal(Result result0) {
        if(result0 instanceof Releasable) {
            try {
                ((Releasable)result0).release();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("BasePendingResult", "Unable to release " + result0, runtimeException0);
            }
        }
    }

    public final boolean zam() {
        synchronized(this.a) {
            if(((GoogleApiClient)this.c.get()) == null || !this.n) {
                this.cancel();
            }
        }
        return this.isCanceled();
    }

    public final void zan(B b0) {
        this.g.set(b0);
    }
}

