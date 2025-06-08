package com.google.android.gms.internal.ads;

public final class zzapw extends zzaqn {
    public static volatile Long h;
    public static final Object i;

    static {
        zzapw.i = new Object();
    }

    public zzapw(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "zo8V8X8kshYkxeE23t3OyXdoh3FPhn0ETnxP8vKAUZieFhalf6x5LNoDw8Q1oLRS", "Hf8oHWnCgsj7Y9XZDlAl+qeEGkjuhCtSnXpSHq9fewc=", zzali0, v, 22);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        if(zzapw.h == null) {
            Object object0 = zzapw.i;
            synchronized(object0) {
                if(zzapw.h == null) {
                    zzapw.h = (Long)this.e.invoke(null, null);
                }
            }
        }
        synchronized(this.d) {
            this.d.zzx(((long)zzapw.h));
        }
    }
}

