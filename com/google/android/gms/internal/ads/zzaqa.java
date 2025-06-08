package com.google.android.gms.internal.ads;

public final class zzaqa extends zzaqn {
    public static volatile String h;
    public static final Object i;

    static {
        zzaqa.i = new Object();
    }

    public zzaqa(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "DNoIUzNgQ+tGaWufI617pdeOeFxPy3ypVgJRNb/REDqvDPWkZ+hwt80uPBr78PA1", "keEhYPq98yaHF5Dzpggt8ckKDSAXe9vFpWufiQ8oXDY=", zzali0, v, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        this.d.zzA("E");
        if(zzaqa.h == null) {
            synchronized(zzaqa.i) {
                if(zzaqa.h == null) {
                    zzaqa.h = (String)this.e.invoke(null, null);
                }
            }
        }
        synchronized(this.d) {
            this.d.zzA(zzaqa.h);
        }
    }
}

