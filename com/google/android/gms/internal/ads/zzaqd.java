package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzaqd extends zzaqn {
    public List h;

    public zzaqd(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "EQnlrBUlHjk2AEt0zmKDh6D/4LKq1nD5m8E6B+NGkhfc83YRi+bdMQpWJDofZ7UC", "vT7QqRHPYW89dMOJkMQAS7XgxAAvbeOb6ybNiPRYWg8=", zzali0, v, 0x1F);
        this.h = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        this.d.zzV(-1L);
        this.d.zzR(-1L);
        if(this.h == null) {
            this.h = (List)this.e.invoke(null, this.a.zzb());
        }
        if(this.h != null && this.h.size() == 2) {
            synchronized(this.d) {
                long v1 = (long)(((Long)this.h.get(0)));
                this.d.zzV(v1);
                long v2 = (long)(((Long)this.h.get(1)));
                this.d.zzR(v2);
            }
        }
    }
}

