package com.google.android.gms.internal.ads;

public final class zzaqi extends zzaqn {
    public static volatile Long h;
    public static final Object i;

    static {
        zzaqi.i = new Object();
    }

    public zzaqi(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "oSBV0gkM1yTotHLC+K1O/2QESKvM1OzdR7LLRpJm660IC9CZK+wk8pHl5h8TdV48", "A3Rh/mKF+88qDRUgTtU47eZJOyPh9v2tsYzP/5oF+dA=", zzali0, v, 33);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        if(zzaqi.h == null) {
            Object object0 = zzaqi.i;
            synchronized(object0) {
                if(zzaqi.h == null) {
                    zzaqi.h = (Long)this.e.invoke(null, null);
                }
            }
        }
        synchronized(this.d) {
            this.d.zzU(((long)zzaqi.h));
        }
    }
}

