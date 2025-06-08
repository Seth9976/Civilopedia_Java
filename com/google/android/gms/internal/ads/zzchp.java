package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import jeb.synthetic.FIN;

public final class zzchp extends Thread implements SurfaceTexture.OnFrameAvailableListener, O2 {
    public final FloatBuffer A;
    public final CountDownLatch B;
    public final Object C;
    public EGL10 D;
    public EGLDisplay E;
    public EGLContext F;
    public EGLSurface G;
    public volatile boolean H;
    public volatile boolean I;
    public static final float[] J;
    public final P2 i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public float q;
    public float r;
    public float s;
    public int t;
    public int u;
    public SurfaceTexture v;
    public SurfaceTexture w;
    public int x;
    public int y;
    public int z;

    static {
        zzchp.J = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    }

    public zzchp(Context context0) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBuffer0 = ByteBuffer.allocateDirect(0x30).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.A = floatBuffer0;
        floatBuffer0.put(zzchp.J).position(0);
        this.j = new float[9];
        this.k = new float[9];
        this.l = new float[9];
        this.m = new float[9];
        this.n = new float[9];
        this.o = new float[9];
        this.p = new float[9];
        this.q = NaNf;
        P2 p20 = new P2(context0);
        this.i = p20;
        p20.h = this;
        this.B = new CountDownLatch(1);
        this.C = new Object();
    }

    public final void a() {
        EGLSurface eGLSurface0 = this.G;
        if(eGLSurface0 != null) {
            EGLSurface eGLSurface1 = EGL10.EGL_NO_SURFACE;
            if(eGLSurface0 != eGLSurface1) {
                this.D.eglMakeCurrent(this.E, eGLSurface1, eGLSurface1, EGL10.EGL_NO_CONTEXT);
                this.D.eglDestroySurface(this.E, this.G);
                this.G = null;
            }
        }
        EGLContext eGLContext0 = this.F;
        if(eGLContext0 != null) {
            this.D.eglDestroyContext(this.E, eGLContext0);
            this.F = null;
        }
        EGLDisplay eGLDisplay0 = this.E;
        if(eGLDisplay0 != null) {
            this.D.eglTerminate(eGLDisplay0);
            this.E = null;
        }
    }

    public static final void b(String s) {
        int v = GLES20.glGetError();
        if(v != 0) {
            Log.e("SphericalVideoRenderer", s + ": glError " + v);
        }
    }

    public static final void c(float[] arr_f, float[] arr_f1, float[] arr_f2) {
        float f = arr_f1[0] * arr_f2[0];
        float f1 = arr_f1[1];
        float f2 = arr_f2[3];
        float f3 = arr_f1[2];
        float f4 = arr_f2[6];
        arr_f[0] = f3 * f4 + (f1 * f2 + f);
        float f5 = arr_f1[0];
        float f6 = arr_f2[1] * f5;
        float f7 = arr_f2[4];
        float f8 = arr_f2[7];
        arr_f[1] = f3 * f8 + (f1 * f7 + f6);
        float f9 = f5 * arr_f2[2];
        float f10 = arr_f1[1];
        float f11 = arr_f2[5];
        float f12 = arr_f2[8];
        arr_f[2] = f3 * f12 + (f10 * f11 + f9);
        float f13 = arr_f1[3];
        float f14 = arr_f2[0];
        float f15 = arr_f1[4];
        float f16 = arr_f1[5];
        arr_f[3] = f16 * f4 + (f2 * f15 + f13 * f14);
        float f17 = arr_f1[3];
        float f18 = arr_f2[1];
        arr_f[4] = f16 * f8 + (f15 * f7 + f17 * f18);
        float f19 = arr_f2[2];
        arr_f[5] = f16 * f12 + (arr_f1[4] * f11 + f17 * f19);
        float f20 = arr_f1[6] * f14;
        float f21 = arr_f1[7];
        float f22 = arr_f2[3] * f21 + f20;
        float f23 = arr_f1[8];
        arr_f[6] = f4 * f23 + f22;
        float f24 = arr_f1[6];
        arr_f[7] = f8 * f23 + (f21 * arr_f2[4] + f18 * f24);
        arr_f[8] = f23 * f12 + (arr_f1[7] * arr_f2[5] + f24 * f19);
    }

    public static final void d(float[] arr_f, float f) {
        arr_f[0] = 1.0f;
        arr_f[1] = 0.0f;
        arr_f[2] = 0.0f;
        arr_f[3] = 0.0f;
        arr_f[4] = (float)Math.cos(f);
        arr_f[5] = (float)(-Math.sin(f));
        arr_f[6] = 0.0f;
        arr_f[7] = (float)Math.sin(f);
        arr_f[8] = (float)Math.cos(f);
    }

    public static final void e(float[] arr_f, float f) {
        arr_f[0] = (float)Math.cos(f);
        arr_f[1] = (float)(-Math.sin(f));
        arr_f[2] = 0.0f;
        arr_f[3] = (float)Math.sin(f);
        arr_f[4] = (float)Math.cos(f);
        arr_f[5] = 0.0f;
        arr_f[6] = 0.0f;
        arr_f[7] = 0.0f;
        arr_f[8] = 1.0f;
    }

    public static final int f(int v, String s) {
        int v1 = GLES20.glCreateShader(v);
        zzchp.b("createShader");
        if(v1 != 0) {
            GLES20.glShaderSource(v1, s);
            zzchp.b("shaderSource");
            GLES20.glCompileShader(v1);
            zzchp.b("compileShader");
            int[] arr_v = new int[1];
            GLES20.glGetShaderiv(v1, 0x8B81, arr_v, 0);
            zzchp.b("getShaderiv");
            if(arr_v[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + v + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(v1));
                GLES20.glDeleteShader(v1);
                zzchp.b("deleteShader");
                return 0;
            }
        }
        return v1;
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        ++this.z;
        synchronized(this.C) {
            this.C.notifyAll();
        }
    }

    @Override
    public final void run() {
        Object object0;
        int v2;
        boolean z;
        EGLConfig eGLConfig0;
        if(this.w != null) {
            EGL10 eGL100 = (EGL10)EGLContext.getEGL();
            this.D = eGL100;
            EGLDisplay eGLDisplay0 = eGL100.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.E = eGLDisplay0;
            if(eGLDisplay0 == EGL10.EGL_NO_DISPLAY) {
                z = false;
            }
            else if(this.D.eglInitialize(eGLDisplay0, new int[2])) {
                int[] arr_v = new int[1];
                EGLConfig[] arr_eGLConfig = new EGLConfig[1];
                if(!this.D.eglChooseConfig(this.E, new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3025, 16, 0x3038}, arr_eGLConfig, 1, arr_v)) {
                    eGLConfig0 = null;
                }
                else if(arr_v[0] > 0) {
                    eGLConfig0 = arr_eGLConfig[0];
                }
                else {
                    eGLConfig0 = null;
                }
                if(eGLConfig0 == null) {
                    z = false;
                }
                else {
                    EGLContext eGLContext0 = EGL10.EGL_NO_CONTEXT;
                    EGLContext eGLContext1 = this.D.eglCreateContext(this.E, eGLConfig0, eGLContext0, new int[]{0x3098, 2, 0x3038});
                    this.F = eGLContext1;
                    if(eGLContext1 == null || eGLContext1 == eGLContext0) {
                        z = false;
                    }
                    else {
                        EGLSurface eGLSurface0 = this.D.eglCreateWindowSurface(this.E, eGLConfig0, this.w, null);
                        this.G = eGLSurface0;
                        z = eGLSurface0 == null || eGLSurface0 == EGL10.EGL_NO_SURFACE || !this.D.eglMakeCurrent(this.E, eGLSurface0, eGLSurface0, this.F) ? false : true;
                    }
                }
            }
            else {
                z = false;
            }
            int v = zzchp.f(0x8B31, (((String)zzay.zzc().zzb(zzbhz.zzbc)).equals(zzbhz.zzbc.zzm()) ? "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}" : ((String)zzay.zzc().zzb(zzbhz.zzbc))));
            if(v == 0) {
                v2 = 0;
            }
            else {
                int v1 = zzchp.f(0x8B30, (((String)zzay.zzc().zzb(zzbhz.zzbd)).equals(zzbhz.zzbd.zzm()) ? "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}" : ((String)zzay.zzc().zzb(zzbhz.zzbd))));
                if(v1 == 0) {
                    v2 = 0;
                }
                else {
                    v2 = GLES20.glCreateProgram();
                    zzchp.b("createProgram");
                    if(v2 != 0) {
                        GLES20.glAttachShader(v2, v);
                        zzchp.b("attachShader");
                        GLES20.glAttachShader(v2, v1);
                        zzchp.b("attachShader");
                        GLES20.glLinkProgram(v2);
                        zzchp.b("linkProgram");
                        int[] arr_v1 = new int[1];
                        GLES20.glGetProgramiv(v2, 0x8B82, arr_v1, 0);
                        zzchp.b("getProgramiv");
                        if(arr_v1[0] == 1) {
                            GLES20.glValidateProgram(v2);
                            zzchp.b("validateProgram");
                        }
                        else {
                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(v2));
                            GLES20.glDeleteProgram(v2);
                            zzchp.b("deleteProgram");
                            v2 = 0;
                        }
                    }
                }
            }
            this.x = v2;
            GLES20.glUseProgram(v2);
            zzchp.b("useProgram");
            int v3 = GLES20.glGetAttribLocation(this.x, "aPosition");
            GLES20.glVertexAttribPointer(v3, 3, 0x1406, false, 12, this.A);
            zzchp.b("vertexAttribPointer");
            GLES20.glEnableVertexAttribArray(v3);
            zzchp.b("enableVertexAttribArray");
            int[] arr_v2 = new int[1];
            GLES20.glGenTextures(1, arr_v2, 0);
            zzchp.b("genTextures");
            int v4 = arr_v2[0];
            GLES20.glBindTexture(0x8D65, v4);
            zzchp.b("bindTextures");
            GLES20.glTexParameteri(0x8D65, 0x2800, 0x2601);
            zzchp.b("texParameteri");
            GLES20.glTexParameteri(0x8D65, 0x2801, 0x2601);
            zzchp.b("texParameteri");
            GLES20.glTexParameteri(0x8D65, 0x2802, 0x812F);
            zzchp.b("texParameteri");
            GLES20.glTexParameteri(0x8D65, 0x2803, 0x812F);
            zzchp.b("texParameteri");
            int v5 = GLES20.glGetUniformLocation(this.x, "uVMat");
            this.y = v5;
            GLES20.glUniformMatrix3fv(v5, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
            if(z && this.x != 0) {
                SurfaceTexture surfaceTexture0 = new SurfaceTexture(v4);
                this.v = surfaceTexture0;
                surfaceTexture0.setOnFrameAvailableListener(this);
                this.B.countDown();
                P2 p20 = this.i;
                if(p20.g == null) {
                    SensorManager sensorManager0 = p20.a;
                    Sensor sensor0 = sensorManager0.getDefaultSensor(11);
                    if(sensor0 == null) {
                        zzcfi.zzg("No Sensor of TYPE_ROTATION_VECTOR");
                    }
                    else {
                        HandlerThread handlerThread0 = new HandlerThread("OrientationMonitor");
                        handlerThread0.start();
                        zzfnw zzfnw0 = new zzfnw(handlerThread0.getLooper());
                        p20.g = zzfnw0;
                        if(!sensorManager0.registerListener(p20, sensor0, 0, zzfnw0)) {
                            zzcfi.zzg("SensorManager.registerListener failed.");
                            p20.a();
                        }
                    }
                }
                try {
                    this.H = true;
                }
                catch(IllegalStateException unused_ex) {
                    goto label_160;
                }
                catch(Throwable throwable0) {
                    goto label_159;
                }
                while(!this.I) {
                    try {
                        try {
                            while(this.z > 0) {
                                this.v.updateTexImage();
                                --this.z;
                            }
                            if(this.i.b(this.j)) {
                                if(Float.isNaN(this.q)) {
                                    new float[]{this.j[0] * 0.0f + this.j[1] * 1.0f + this.j[2] * 0.0f, this.j[3] * 0.0f + this.j[4] * 1.0f + this.j[5] * 0.0f, this.j[8] * 0.0f + (this.j[6] * 0.0f + this.j[7] * 1.0f)};
                                    float f = this.j[0] * 0.0f + this.j[1] * 1.0f + this.j[2] * 0.0f;
                                    float f1 = this.j[3] * 0.0f + this.j[4] * 1.0f + this.j[5] * 0.0f;
                                    float f2 = this.j[8] * 0.0f + (this.j[6] * 0.0f + this.j[7] * 1.0f);
                                    this.q = -(((float)Math.atan2(f1, f)) - 1.570796f);
                                }
                                zzchp.e(this.o, this.q + this.r);
                            }
                            else {
                                zzchp.d(this.j, -1.570796f);
                                zzchp.e(this.o, this.r);
                            }
                            zzchp.d(this.k, 1.570796f);
                            zzchp.c(this.l, this.o, this.k);
                            zzchp.c(this.m, this.j, this.l);
                            zzchp.d(this.n, this.s);
                            zzchp.c(this.p, this.n, this.m);
                            GLES20.glUniformMatrix3fv(this.y, 1, false, this.p, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            zzchp.b("drawArrays");
                            GLES20.glFinish();
                            this.D.eglSwapBuffers(this.E, this.G);
                            if(this.H) {
                                GLES20.glViewport(0, 0, this.u, this.t);
                                zzchp.b("viewport");
                                int v6 = GLES20.glGetUniformLocation(this.x, "uFOVx");
                                int v7 = GLES20.glGetUniformLocation(this.x, "uFOVy");
                                int v8 = this.u;
                                int v9 = this.t;
                                if(v8 > v9) {
                                    GLES20.glUniform1f(v6, 0.872665f);
                                    GLES20.glUniform1f(v7, ((float)this.t) * 0.872665f / ((float)this.u));
                                }
                                else {
                                    GLES20.glUniform1f(v6, ((float)v8) * 0.872665f / ((float)v9));
                                    GLES20.glUniform1f(v7, 0.872665f);
                                }
                                this.H = false;
                            }
                            try {
                                object0 = this.C;
                                __monitor_enter(object0);
                            }
                            catch(InterruptedException unused_ex) {
                                continue;
                            }
                            int v10 = FIN.finallyOpen$NT();
                            if(this.I || this.H || this.z != 0) {
                                goto label_154;
                            }
                            else {
                                try {
                                    this.C.wait();
                                label_154:
                                    FIN.finallyCodeBegin$NT(v10);
                                    __monitor_exit(object0);
                                    FIN.finallyCodeEnd$NT(v10);
                                }
                                catch(InterruptedException unused_ex) {
                                }
                                continue;
                            }
                        label_159:
                            goto label_166;
                        }
                        catch(IllegalStateException unused_ex) {
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_159;
                    }
                    try {
                    label_160:
                        zzcfi.zzj("SphericalVideoProcessor halted unexpectedly.");
                    }
                    catch(Throwable throwable1) {
                        goto label_170;
                    }
                    this.i.a();
                    this.v.setOnFrameAvailableListener(null);
                    this.v = null;
                    this.a();
                    return;
                    try {
                    label_166:
                        zzcfi.zzh("SphericalVideoProcessor died.", throwable0);
                        zzt.zzo().zzt(throwable0, "SphericalVideoProcessor.run.2");
                    }
                    catch(Throwable throwable1) {
                    label_170:
                        this.i.a();
                        this.v.setOnFrameAvailableListener(null);
                        this.v = null;
                        this.a();
                        throw throwable1;
                    }
                    this.i.a();
                    this.v.setOnFrameAvailableListener(null);
                    this.v = null;
                    this.a();
                    return;
                }
                this.i.a();
                this.v.setOnFrameAvailableListener(null);
                this.v = null;
                this.a();
                return;
            }
            String s = "EGL initialization failed: " + GLUtils.getEGLErrorString(this.D.eglGetError());
            zzcfi.zzg(s);
            zzt.zzo().zzt(new Throwable(s), "SphericalVideoProcessor.run.1");
            this.a();
            this.B.countDown();
            return;
        }
        zzcfi.zzg("SphericalVideoProcessor started with no output texture.");
        this.B.countDown();
    }

    @Override  // com.google.android.gms.internal.ads.O2
    public final void zza() {
        synchronized(this.C) {
            this.C.notifyAll();
        }
    }

    public final SurfaceTexture zzb() {
        if(this.w == null) {
            return null;
        }
        try {
            this.B.await();
        }
        catch(InterruptedException unused_ex) {
        }
        return this.v;
    }

    public final void zzc(int v, int v1) {
        synchronized(this.C) {
            this.u = v;
            this.t = v1;
            this.H = true;
            this.C.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.u = v;
        this.t = v1;
        this.w = surfaceTexture0;
    }

    public final void zze() {
        synchronized(this.C) {
            this.I = true;
            this.w = null;
            this.C.notifyAll();
        }
    }

    public final void zzf(float f, float f1) {
        float f2 = this.u <= this.t ? ((float)this.t) : ((float)this.u);
        this.r -= f * 1.745329f / f2;
        float f3 = this.s - f1 * 1.745329f / f2;
        this.s = f3;
        if(f3 < -1.570796f) {
            this.s = -1.570796f;
            f3 = -1.570796f;
        }
        if(f3 > 1.570796f) {
            this.s = 1.570796f;
        }
    }
}

