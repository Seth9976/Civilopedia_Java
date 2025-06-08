package com.google.android.gms.internal.ads;

public final class zzaqf extends zzaqn {
    public final StackTraceElement[] h;

    public zzaqf(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, StackTraceElement[] arr_stackTraceElement) {
        super(zzapc0, "aZvf8nokSQAvHIIdmzwu8civ2+qb07zM1ZEz6qZf1UzLfoKt8BndVgmiOXFGATXV", "1Q5N5QhnMtop76rkewUHBq0dfu+Fpixkwg9xHoBYaMc=", zzali0, v, 45);
        this.h = arr_stackTraceElement;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        int v = 1;
        StackTraceElement[] arr_stackTraceElement = this.h;
        if(arr_stackTraceElement != null) {
            zzaou zzaou0 = new zzaou(((String)this.e.invoke(null, arr_stackTraceElement)));
            synchronized(this.d) {
                this.d.zzE(((long)zzaou0.zza));
                if(zzaou0.zzb.booleanValue()) {
                    zzali zzali1 = this.d;
                    if(!zzaou0.zzc.booleanValue()) {
                        v = 2;
                    }
                    zzali1.zzab(v);
                }
                else {
                    this.d.zzab(3);
                }
            }
        }
    }
}

