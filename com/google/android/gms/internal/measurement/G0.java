package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

public final class g0 {
    public static final void a(Object object0, Object object1) {
        zzle zzle0 = (zzle)object1;
        if(!((zzlf)object0).isEmpty()) {
            Iterator iterator0 = ((zzlf)object0).entrySet().iterator();
            if(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                ((Map.Entry)object2).getKey();
                ((Map.Entry)object2).getValue();
                throw null;
            }
        }
    }

    public static final zzlf b(Object object0, Object object1) {
        zzlf zzlf0 = (zzlf)object0;
        if(!((zzlf)object1).isEmpty()) {
            if(!zzlf0.zze()) {
                zzlf0 = zzlf0.zzb();
            }
            zzlf0.zzd(((zzlf)object1));
        }
        return zzlf0;
    }
}

