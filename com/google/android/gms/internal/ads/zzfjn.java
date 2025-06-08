package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class zzfjn implements zzfjl {
    public final zzfjl a;

    public zzfjn(zzfjl zzfjl0) {
        this.a = zzfjl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfjl
    public final JSONObject zza(View view0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(View view0, JSONObject jSONObject0, zzfjk zzfjk0, boolean z) {
        int v2;
        int v1;
        ArrayList arrayList0 = new ArrayList();
        zzfjc zzfjc0 = zzfjc.zza();
        if(zzfjc0 != null) {
            Collection collection0 = zzfjc0.zzb();
            IdentityHashMap identityHashMap0 = new IdentityHashMap(collection0.size() * 2 + 3);
            Iterator iterator0 = collection0.iterator();
        label_6:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                View view1 = ((zzfir)object0).zzf();
                if(view1 != null && view1.isAttachedToWindow() && view1.isShown()) {
                    View view2 = view1;
                    while(view2 != null) {
                        if(view2.getAlpha() == 0.0f) {
                            continue label_6;
                        }
                        ViewParent viewParent0 = view2.getParent();
                        view2 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                    }
                    View view3 = view1.getRootView();
                    if(view3 != null && !identityHashMap0.containsKey(view3)) {
                        identityHashMap0.put(view3, view3);
                        float f = zzfjw.zza(view3);
                        int v;
                        for(v = arrayList0.size(); v > 0 && zzfjw.zza(((View)arrayList0.get(v - 1))) > f; --v) {
                        }
                        arrayList0.add(v, view3);
                    }
                }
            }
        }
        v1 = arrayList0.size();
        for(v2 = 0; v2 < v1; ++v2) {
            zzfjk0.zza(((View)arrayList0.get(v2)), this.a, jSONObject0);
        }
    }
}

