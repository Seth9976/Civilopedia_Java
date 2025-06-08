package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;

public final class zzde implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public final Handler i;
    public final int[] j;
    public EGLDisplay k;
    public EGLContext l;
    public EGLSurface m;
    public SurfaceTexture n;
    public static final int[] o;

    static {
        zzde.o = new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3025, 0, 0x3027, 0x3038, 0x3033, 4, 0x3038};
    }

    public zzde(Handler handler0, zzdd zzdd0) {
        this.i = handler0;
        this.j = new int[1];
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        this.i.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture0 = this.n;
        if(surfaceTexture0 != null) {
            try {
                surfaceTexture0.updateTexImage();
            }
            catch(RuntimeException unused_ex) {
            }
        }
    }

    public final SurfaceTexture zza() {
        SurfaceTexture surfaceTexture0 = this.n;
        surfaceTexture0.getClass();
        return surfaceTexture0;
    }

    public final void zzb(int v) {
        EGLSurface eGLSurface0;
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        if(eGLDisplay0 == null) {
            throw new zzdc("eglGetDisplay failed");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        int[] arr_v = new int[2];
        if(!EGL14.eglInitialize(eGLDisplay0, arr_v, 0, arr_v, 1)) {
            throw new zzdc("eglInitialize failed");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.k = eGLDisplay0;
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        int[] arr_v1 = new int[1];
        boolean z = EGL14.eglChooseConfig(eGLDisplay0, zzde.o, 0, arr_eGLConfig, 0, 1, arr_v1, 0);
        if(z && arr_v1[0] > 0) {
            EGLConfig eGLConfig0 = arr_eGLConfig[0];
            if(eGLConfig0 != null) {
                EGLContext eGLContext0 = EGL14.eglCreateContext(this.k, eGLConfig0, EGL14.EGL_NO_CONTEXT, (v == 0 ? new int[]{0x3098, 2, 0x3038} : new int[]{0x3098, 2, 0x32C0, 1, 0x3038}), 0);
                if(eGLContext0 == null) {
                    throw new zzdc("eglCreateContext failed");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                this.l = eGLContext0;
                EGLDisplay eGLDisplay1 = this.k;
                if(v == 1) {
                    eGLSurface0 = EGL14.EGL_NO_SURFACE;
                }
                else {
                    eGLSurface0 = EGL14.eglCreatePbufferSurface(eGLDisplay1, eGLConfig0, (v == 2 ? new int[]{0x3057, 1, 0x3056, 1, 0x32C0, 1, 0x3038} : new int[]{0x3057, 1, 0x3056, 1, 0x3038}), 0);
                    if(eGLSurface0 == null) {
                        throw new zzdc("eglCreatePbufferSurface failed");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                }
                if(!EGL14.eglMakeCurrent(eGLDisplay1, eGLSurface0, eGLSurface0, eGLContext0)) {
                    throw new zzdc("eglMakeCurrent failed");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                this.m = eGLSurface0;
                int[] arr_v2 = this.j;
                GLES20.glGenTextures(1, arr_v2, 0);
                int v1 = 0;
                int v2;
                while((v2 = GLES20.glGetError()) != 0) {
                    Log.e("GlUtil", "glError: " + GLU.gluErrorString(v2));
                    v1 = v2;
                }
                if(v1 != 0) {
                    Log.e("GlUtil", "glError: " + GLU.gluErrorString(v1));
                }
                SurfaceTexture surfaceTexture0 = new SurfaceTexture(arr_v2[0]);
                this.n = surfaceTexture0;
                surfaceTexture0.setOnFrameAvailableListener(this);
                return;
            }
        }
        throw new zzdc(zzeg.zzH("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(z), ((int)arr_v1[0]), arr_eGLConfig[0]}));  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }

    public final void zzc() {
        this.i.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture0 = this.n;
            if(surfaceTexture0 != null) {
                surfaceTexture0.release();
                GLES20.glDeleteTextures(1, this.j, 0);
            }
        }
        finally {
            if(this.k != null && !this.k.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.k, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            if(this.m != null && !this.m.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.k, this.m);
            }
            EGLContext eGLContext0 = this.l;
            if(eGLContext0 != null) {
                EGL14.eglDestroyContext(this.k, eGLContext0);
            }
            EGL14.eglReleaseThread();
            if(this.k != null && !this.k.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.k);
            }
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
    }
}

