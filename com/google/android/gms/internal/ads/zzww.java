package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

public final class zzww extends Surface {
    public final Lb i;
    public boolean j;
    public static int k;
    public static boolean l;
    public final boolean zza;

    public zzww(Lb lb0, SurfaceTexture surfaceTexture0, boolean z) {
        super(surfaceTexture0);
        this.i = lb0;
        this.zza = z;
    }

    @Override  // android.view.Surface
    public final void release() {
        super.release();
        synchronized(this.i) {
            if(!this.j) {
                Handler handler0 = this.i.j;
                handler0.getClass();
                handler0.sendEmptyMessage(2);
                this.j = true;
            }
        }
    }

    public static zzww zza(Context context0, boolean z) {
        boolean z1 = false;
        zzcw.zzf(!z || zzww.zzb(context0));
        Lb lb0 = new Lb("ExoPlayer:PlaceholderSurface");  // 初始化器: Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
        int v = z ? zzww.k : 0;
        lb0.start();
        Handler handler0 = new Handler(lb0.getLooper(), lb0);
        lb0.j = handler0;
        lb0.i = new zzde(handler0, null);
        synchronized(lb0) {
            lb0.j.obtainMessage(1, v, 0).sendToTarget();
            while(lb0.m == null && lb0.l == null && lb0.k == null) {
                try {
                    lb0.wait();
                }
                catch(InterruptedException unused_ex) {
                    z1 = true;
                }
            }
        }
        if(z1) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException0 = lb0.l;
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
        Error error0 = lb0.k;
        if(error0 != null) {
            throw error0;
        }
        zzww zzww0 = lb0.m;
        zzww0.getClass();
        return zzww0;
    }

    public static boolean zzb(Context context0) {
        int v2;
        synchronized(zzww.class) {
            if(!zzww.l) {
                int v1 = zzeg.zza;
                if(v1 < 24) {
                    v2 = 0;
                }
                else if((v1 >= 26 || !"samsung".equals(zzeg.zzc) && !"XT1650".equals(zzeg.zzd)) && (v1 >= 26 || context0.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                    String s = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 0x3055);
                    if(s == null || !s.contains("EGL_EXT_protected_content")) {
                        v2 = 0;
                    }
                    else {
                        String s1 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 0x3055);
                        v2 = 2;
                        if(s1 != null && s1.contains("EGL_KHR_surfaceless_context")) {
                            v2 = 1;
                        }
                    }
                }
                else {
                    v2 = 0;
                }
                zzww.k = v2;
                zzww.l = true;
            }
            return zzww.k != 0;
        }
    }
}

