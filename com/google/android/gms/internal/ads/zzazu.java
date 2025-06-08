package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

@TargetApi(17)
public final class zzazu extends Surface {
    public final u1 i;
    public boolean j;
    public static boolean k;
    public static boolean l;

    public zzazu(u1 u10, SurfaceTexture surfaceTexture0) {
        super(surfaceTexture0);
        this.i = u10;
    }

    @Override  // android.view.Surface
    public final void release() {
        super.release();
        synchronized(this.i) {
            if(!this.j) {
                this.i.j.sendEmptyMessage(3);
                this.j = true;
            }
        }
    }

    public static zzazu zza(Context context0, boolean z) {
        boolean z1 = false;
        zzayz.zze(!z || zzazu.zzb(context0));
        u1 u10 = new u1();
        u10.start();
        u10.j = new Handler(u10.getLooper(), u10);
        synchronized(u10) {
            u10.j.obtainMessage(1, ((int)z), 0).sendToTarget();
            while(u10.n == null && u10.m == null && u10.l == null) {
                try {
                    u10.wait();
                }
                catch(InterruptedException unused_ex) {
                    z1 = true;
                }
            }
        }
        if(z1) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException0 = u10.m;
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
        Error error0 = u10.l;
        if(error0 != null) {
            throw error0;
        }
        return u10.n;
    }

    public static boolean zzb(Context context0) {
        synchronized(zzazu.class) {
            if(!zzazu.l) {
                boolean z = false;
                String s = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 0x3055);
                if(s != null && s.contains("EGL_EXT_protected_content")) {
                    z = true;
                }
                zzazu.k = z;
                zzazu.l = true;
            }
            return zzazu.k;
        }
    }
}

