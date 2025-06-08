package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {
    public boolean i;
    public final LinkedBlockingQueue j;

    public BlockingServiceConnection() {
        this.i = false;
        this.j = new LinkedBlockingQueue();
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if(this.i) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.i = true;
        return (IBinder)this.j.take();
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public IBinder getServiceWithTimeout(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if(this.i) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.i = true;
        IBinder iBinder0 = (IBinder)this.j.poll(v, timeUnit0);
        if(iBinder0 == null) {
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        return iBinder0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.j.add(iBinder0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
    }
}

