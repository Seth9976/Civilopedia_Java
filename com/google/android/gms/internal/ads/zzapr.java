package com.google.android.gms.internal.ads;

public final class zzapr extends zzaqn {
    public static volatile Long h;
    public static final Object i;

    static {
        zzapr.i = new Object();
    }

    public zzapr(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "NuaVE443qhtP6/N+u8tA8HilHNLFyQFq7pn4MjW5OGwcdLTSMQ1k8XjYehsxVeon", "z5NXQuc0uiNSVbndYdMaUlJv3uv2TfesAU8D9T9pl4E=", zzali0, v, 44);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        if(zzapr.h == null) {
            Object object0 = zzapr.i;
            synchronized(object0) {
                if(zzapr.h == null) {
                    zzapr.h = (Long)this.e.invoke(null, null);
                }
            }
        }
        synchronized(this.d) {
            this.d.zzn(((long)zzapr.h));
        }
    }
}

