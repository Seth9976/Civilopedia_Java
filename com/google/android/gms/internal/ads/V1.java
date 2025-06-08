package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;

public final class v1 implements Handler.Callback, Choreographer.FrameCallback {
    public volatile long i;
    public final Handler j;
    public Choreographer k;
    public int l;
    public static final v1 m;

    static {
        v1.m = new v1();
    }

    public v1() {
        HandlerThread handlerThread0 = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread0.start();
        Handler handler0 = new Handler(handlerThread0.getLooper(), this);
        this.j = handler0;
        handler0.sendEmptyMessage(0);
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.i = v;
        this.k.postFrameCallbackDelayed(this, 500L);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v = message0.what;
        switch(v) {
            case 0: {
                this.k = Choreographer.getInstance();
                return true;
            }
            case 1: {
                int v2 = this.l + 1;
                this.l = v2;
                if(v2 == 1) {
                    this.k.postFrameCallback(this);
                }
                return true;
            }
            default: {
                if(v != 2) {
                    return false;
                }
                int v1 = this.l - 1;
                this.l = v1;
                if(v1 == 0) {
                    this.k.removeFrameCallback(this);
                    this.i = 0L;
                }
                return true;
            }
        }
    }
}

