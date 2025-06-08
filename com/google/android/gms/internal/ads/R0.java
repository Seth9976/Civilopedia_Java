package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

public final class r0 {
    public final ArrayList a;
    public boolean b;
    public static final boolean c;

    static {
        r0.c = zzajn.zzb;
    }

    public r0() {
        this.a = new ArrayList();
        this.b = false;
    }

    public final void a(String s, long v) {
        synchronized(this) {
            if(!this.b) {
                q0 q00 = new q0(s, v, SystemClock.elapsedRealtime());
                this.a.add(q00);
                return;
            }
        }
        throw new IllegalStateException("Marker added to finished log");
    }

    public final void b(String s) {
        long v1;
        synchronized(this) {
            this.b = true;
            if(this.a.size() == 0) {
                v1 = 0L;
            }
            else {
                long v2 = ((q0)this.a.get(0)).c;
                v1 = ((q0)this.a.get(this.a.size() - 1)).c - v2;
            }
            if(v1 <= 0L) {
                return;
            }
            long v3 = ((q0)this.a.get(0)).c;
            zzajn.zza("(%-4d ms) %s", new Object[]{v1, s});
            for(Object object0: this.a) {
                zzajn.zza("(+%-4d) [%2d] %s", new Object[]{((long)(((q0)object0).c - v3)), ((q0)object0).b, ((q0)object0).a});
                v3 = ((q0)object0).c;
            }
        }
    }

    @Override
    public final void finalize() {
        if(!this.b) {
            this.b("Request on the loose");
            zzajn.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}

