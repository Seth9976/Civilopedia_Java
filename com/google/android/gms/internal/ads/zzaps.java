package com.google.android.gms.internal.ads;

public final class zzaps extends zzaqn {
    public final long h;

    public zzaps(zzapc zzapc0, String s, String s1, zzali zzali0, long v, int v1, int v2) {
        super(zzapc0, "FmiCZESJMiUiPEVFp8/sySGg9zk5i1lJsy88E60+KsD4lJB1UVftaJnD830H1Cnc", "B8qnIZWGEs7xms3SbQDilR0QM+SibSnQfZbTzlo06bE=", zzali0, v1, 25);
        this.h = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        long v = (long)(((Long)this.e.invoke(null, null)));
        synchronized(this.d) {
            this.d.zzs(v);
            long v2 = this.h;
            if(v2 != 0L) {
                this.d.zzS(v - v2);
                this.d.zzT(this.h);
            }
        }
    }
}

