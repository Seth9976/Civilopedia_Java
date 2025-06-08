package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

public final class i8 extends b8 {
    public h8 x;

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void h() {
        h8 h80 = this.x;
        if(h80 != null) {
            h80.g();
        }
    }

    @Override  // com.google.android.gms.internal.ads.b8
    public final void r(int v, Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.b8
    public final void s() {
        h8 h80 = this.x;
        if(h80 != null) {
            try {
                h80.k.execute(h80);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                h80.l.zze(rejectedExecutionException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.b8
    public final void u(int v) {
        this.t = null;
        if(v == 1) {
            this.x = null;
        }
    }
}

