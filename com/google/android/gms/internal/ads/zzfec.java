package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class zzfec {
    public final HashMap a;

    public zzfec() {
        this.a = new HashMap();
    }

    public final zzfeb zza(zzfds zzfds0, Context context0, zzfdk zzfdk0, zzfei zzfei0) {
        HashMap hashMap0 = this.a;
        zzfeb zzfeb0 = (zzfeb)hashMap0.get(zzfds0);
        if(zzfeb0 == null) {
            S8 s80 = new S8(zzfdv.zza(zzfds0, context0));
            zzfeb zzfeb1 = new zzfeb(s80, new zzfek(s80, zzfdk0, zzfei0));
            hashMap0.put(zzfds0, zzfeb1);
            return zzfeb1;
        }
        return zzfeb0;
    }
}

