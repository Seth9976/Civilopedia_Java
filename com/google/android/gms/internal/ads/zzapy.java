package com.google.android.gms.internal.ads;

public final class zzapy extends zzaqn {
    public final zzaog h;
    public final long i;
    public final long j;

    public zzapy(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, zzaog zzaog0, long v2, long v3) {
        super(zzapc0, "XdACBmHPjNtNHtvuxJIzO5INAuD0sY2N7kIXkPlZf2/7KHZWQ+7Wr4DDubVydJNF", "y+g//F0lHk9VQdkf/Jc605unsex1+WIt3b6Nn2DqnLo=", zzali0, v, 11);
        this.h = zzaog0;
        this.i = v2;
        this.j = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        zzaog zzaog0 = this.h;
        if(zzaog0 != null) {
            zzaoe zzaoe0 = new zzaoe(((String)this.e.invoke(null, zzaog0.zzb(), this.i, this.j)));
            synchronized(this.d) {
                this.d.zzy(((long)zzaoe0.zza));
                if(((long)zzaoe0.zzb) >= 0L) {
                    this.d.zzP(((long)zzaoe0.zzb));
                }
                if(((long)zzaoe0.zzc) >= 0L) {
                    this.d.zzf(((long)zzaoe0.zzc));
                }
            }
        }
    }
}

