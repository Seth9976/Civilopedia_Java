package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

public final class x6 extends zzftt {
    public Task p;

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String d() {
        return this.p == null ? "" : this.p.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void e() {
        this.p = null;
    }
}

