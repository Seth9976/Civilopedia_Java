package com.google.android.gms.internal.ads;

public final class zzaqh extends zzaqn {
    public final zzapj h;
    public final long i;

    public zzaqh(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, zzapj zzapj0) {
        super(zzapc0, "03Rb8b+VDPWNz2ZsdwvaSzyRMvfwK65RukwsWnYSmw87NOTFb26HoizUZBquofyN", "4NlIZpWANWCeruMUGSc5tEkf3o6K0hyRt+/1nSu0QU8=", zzali0, v, 53);
        this.h = zzapj0;
        if(zzapj0 != null) {
            this.i = zzapj0.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        if(this.h != null) {
            long v = (long)(((Long)this.e.invoke(null, this.i)));
            this.d.zzO(v);
        }
    }
}

