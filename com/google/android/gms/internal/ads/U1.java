package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

public final class u1 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    public final int[] i;
    public Handler j;
    public SurfaceTexture k;
    public Error l;
    public RuntimeException m;
    public zzazu n;

    public u1() {
        super("dummySurface");
        this.i = new int[1];
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v = message0.what;
        switch(v) {
            case 1: {
                try {
                    try {
                        boolean z = message0.arg1 != 0;
                        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
                        zzayz.zzf(eGLDisplay0 != null, "eglGetDisplay failed");
                        int[] arr_v = new int[2];
                        zzayz.zzf(EGL14.eglInitialize(eGLDisplay0, arr_v, 0, arr_v, 1), "eglInitialize failed");
                        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
                        int[] arr_v1 = new int[1];
                        zzayz.zzf(EGL14.eglChooseConfig(eGLDisplay0, new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3025, 0, 0x3027, 0x3038, 0x3033, 4, 0x3038}, 0, arr_eGLConfig, 0, 1, arr_v1, 0) && arr_v1[0] > 0 && arr_eGLConfig[0] != null, "eglChooseConfig failed");
                        EGLConfig eGLConfig0 = arr_eGLConfig[0];
                        EGLContext eGLContext0 = EGL14.eglCreateContext(eGLDisplay0, eGLConfig0, EGL14.EGL_NO_CONTEXT, (z ? new int[]{0x3098, 2, 0x32C0, 1, 0x3038} : new int[]{0x3098, 2, 0x3038}), 0);
                        zzayz.zzf(eGLContext0 != null, "eglCreateContext failed");
                        EGLSurface eGLSurface0 = EGL14.eglCreatePbufferSurface(eGLDisplay0, eGLConfig0, (z ? new int[]{0x3057, 1, 0x3056, 1, 0x32C0, 1, 0x3038} : new int[]{0x3057, 1, 0x3056, 1, 0x3038}), 0);
                        zzayz.zzf(eGLSurface0 != null, "eglCreatePbufferSurface failed");
                        zzayz.zzf(EGL14.eglMakeCurrent(eGLDisplay0, eGLSurface0, eGLSurface0, eGLContext0), "eglMakeCurrent failed");
                        GLES20.glGenTextures(1, this.i, 0);
                        SurfaceTexture surfaceTexture0 = new SurfaceTexture(this.i[0]);
                        this.k = surfaceTexture0;
                        surfaceTexture0.setOnFrameAvailableListener(this);
                        this.n = new zzazu(this, this.k);
                        goto label_71;
                    }
                    catch(RuntimeException runtimeException0) {
                    }
                    catch(Error error0) {
                        goto label_53;
                    }
                    Log.e("DummySurface", "Failed to initialize dummy surface", runtimeException0);
                    this.m = runtimeException0;
                }
                catch(Throwable throwable1) {
                    goto label_63;
                }
                synchronized(this) {
                    this.notify();
                }
                return true;
                try {
                label_53:
                    Log.e("DummySurface", "Failed to initialize dummy surface", error0);
                    this.l = error0;
                }
                catch(Throwable throwable1) {
                    goto label_63;
                }
                synchronized(this) {
                    this.notify();
                }
                return true;
            label_63:
                synchronized(this) {
                    this.notify();
                }
                throw throwable1;
            label_71:
                synchronized(this) {
                    this.notify();
                }
                return true;
            }
            case 2: {
                this.k.updateTexImage();
                return true;
            }
            default: {
                if(v != 3) {
                    return true;
                }
                try {
                    try {
                        this.k.release();
                    }
                    finally {
                        this.n = null;
                        this.k = null;
                        GLES20.glDeleteTextures(1, this.i, 0);
                    }
                }
                catch(Throwable throwable0) {
                    Log.e("DummySurface", "Failed to release dummy surface", throwable0);
                }
                finally {
                    this.quit();
                }
                return true;
            }
        }
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        this.j.sendEmptyMessage(2);
    }
}

