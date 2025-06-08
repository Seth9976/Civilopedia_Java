package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

public final class s1 extends Handler implements Runnable {
    public final zzayv i;
    public final zzayt j;
    public final int k;
    public final long l;
    public IOException m;
    public int n;
    public volatile Thread o;
    public volatile boolean p;
    public final zzayx q;

    public s1(zzayx zzayx0, Looper looper0, zzayv zzayv0, zzayt zzayt0, int v, long v1) {
        this.q = zzayx0;
        super(looper0);
        this.i = zzayv0;
        this.j = zzayt0;
        this.k = v;
        this.l = v1;
    }

    public final void a(boolean z) {
        this.p = z;
        this.m = null;
        if(this.hasMessages(0)) {
            this.removeMessages(0);
            if(!z) {
                this.sendEmptyMessage(1);
                return;
            }
        }
        else {
            this.i.zzb();
            if(this.o != null) {
                this.o.interrupt();
            }
            if(!z) {
                return;
            }
        }
        this.q.b = null;
        long v = SystemClock.elapsedRealtime();
        this.j.zzt(this.i, v, v - this.l, true);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(this.p) {
            return;
        }
        int v = message0.what;
        if(v == 0) {
            this.m = null;
            this.q.a.execute(this.q.b);
            return;
        }
        if(v != 4) {
            this.q.b = null;
            long v1 = SystemClock.elapsedRealtime();
            long v2 = v1 - this.l;
            if(this.i.zze()) {
                this.j.zzt(this.i, v1, v2, false);
                return;
            }
            boolean z = true;
            switch(message0.what) {
                case 1: {
                    this.j.zzt(this.i, v1, v2, false);
                    return;
                }
                case 2: {
                    this.j.zzu(this.i, v1, v2);
                    return;
                }
                case 3: {
                    this.m = (IOException)message0.obj;
                    int v3 = this.j.zzd(this.i, v1, v2, ((IOException)message0.obj));
                    if(v3 == 3) {
                        this.q.c = this.m;
                        return;
                    }
                    if(v3 != 2) {
                        int v4 = v3 == 1 ? 1 : this.n + 1;
                        this.n = v4;
                        long v5 = (long)Math.min((v4 - 1) * 1000, 5000);
                        zzayx zzayx0 = this.q;
                        if(zzayx0.b != null) {
                            z = false;
                        }
                        zzayz.zze(z);
                        zzayx0.b = this;
                        if(v5 > 0L) {
                            this.sendEmptyMessageDelayed(0, v5);
                            return;
                        }
                        this.m = null;
                        zzayx0.a.execute(this);
                    }
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw (Error)message0.obj;
    }

    @Override
    public final void run() {
        try {
            this.o = Thread.currentThread();
            if(!this.i.zze()) {
                zzazm.zza(("load:" + this.i.getClass().getSimpleName()));
                try {
                    this.i.zzc();
                }
                finally {
                    zzazm.zzb();
                }
            }
            if(!this.p) {
                this.sendEmptyMessage(2);
                return;
            label_19:
                if(!this.p) {
                    goto label_20;
                }
            }
            return;
        }
        catch(IOException iOException0) {
            goto label_19;
        }
        catch(InterruptedException unused_ex) {
            goto label_22;
        }
        catch(Exception exception0) {
            goto label_26;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_30;
        }
        catch(Error error0) {
            goto label_34;
        }
    label_20:
        this.obtainMessage(3, iOException0).sendToTarget();
        return;
    label_22:
        zzayz.zze(this.i.zze());
        if(!this.p) {
            this.sendEmptyMessage(2);
            return;
        label_26:
            Log.e("LoadTask", "Unexpected exception loading stream", exception0);
            if(!this.p) {
                this.obtainMessage(3, new zzayw(exception0)).sendToTarget();
                return;
            label_30:
                Log.e("LoadTask", "OutOfMemory error loading stream", outOfMemoryError0);
                if(!this.p) {
                    this.obtainMessage(3, new zzayw(outOfMemoryError0)).sendToTarget();
                    return;
                label_34:
                    Log.e("LoadTask", "Unexpected error loading stream", error0);
                    if(!this.p) {
                        this.obtainMessage(4, error0).sendToTarget();
                    }
                    throw error0;
                }
            }
        }
    }
}

