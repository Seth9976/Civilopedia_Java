package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzbyr {
    public View a;
    public final HashMap b;

    public zzbyr() {
        this.b = new HashMap();
    }

    public final zzbyr zzb(View view0) {
        this.a = view0;
        return this;
    }

    public final zzbyr zzc(Map map0) {
        HashMap hashMap0 = this.b;
        hashMap0.clear();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            View view0 = (View)map$Entry0.getValue();
            if(view0 != null) {
                hashMap0.put(((String)map$Entry0.getKey()), new WeakReference(view0));
            }
        }
        return this;
    }
}

