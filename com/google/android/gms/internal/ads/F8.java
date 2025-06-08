package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f8 extends b8 {
    public List x;

    @Override  // com.google.android.gms.internal.ads.b8
    public final void r(int v, Object object0) {
        List list0 = this.x;
        if(list0 != null) {
            list0.set(v, new g8(object0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.b8
    public final void s() {
        List list0 = this.x;
        if(list0 != null) {
            ArrayList arrayList0 = zzfrx.zza(list0.size());
            for(Object object0: list0) {
                g8 g80 = (g8)object0;
                arrayList0.add((g80 == null ? null : g80.a));
            }
            this.zzd(Collections.unmodifiableList(arrayList0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.b8
    public final void u(int v) {
        this.t = null;
        this.x = null;
    }
}

