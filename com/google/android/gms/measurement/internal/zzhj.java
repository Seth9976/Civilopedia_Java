package com.google.android.gms.measurement.internal;

import T1.c;
import android.os.Bundle;
import i1.r;
import java.util.Iterator;
import java.util.TreeSet;

public final class zzhj implements Runnable {
    public final zzij zza;
    public final Bundle zzb;

    public zzhj(zzij zzij0, Bundle bundle0) {
        this.zza = zzij0;
        this.zzb = bundle0;
    }

    @Override
    public final void run() {
        c c0;
        zzij zzij0 = this.zza;
        Bundle bundle0 = this.zzb;
        zzge zzge0 = zzij0.a;
        if(bundle0 == null) {
            r r0 = zzge0.zzm();
            Bundle bundle1 = new Bundle();
            r0.v.zzb(bundle1);
            return;
        }
        Bundle bundle2 = zzge0.zzm().v.zza();
        Iterator iterator0 = bundle0.keySet().iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            c0 = zzij0.p;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if(object1 != null && !(object1 instanceof String) && !(object1 instanceof Long) && !(object1 instanceof Double)) {
                zzge0.zzv().getClass();
                if(zzln.w(object1)) {
                    zzge0.zzv().getClass();
                    zzln.l(c0, null, 27, null, null, 0);
                }
                zzge0.zzay().zzl().zzc("Invalid default event parameter type. Name, value", s, object1);
            }
            else if(zzln.y(s)) {
                zzge0.zzay().zzl().zzb("Invalid default event parameter name. Name", s);
            }
            else if(object1 == null) {
                bundle2.remove(s);
            }
            else if(zzge0.zzv().s("param", s, 100, object1)) {
                zzge0.zzv().m(bundle2, s, object1);
            }
        }
        zzge0.zzv();
        int v = zzge0.zzf().zzc();
        if(bundle2.size() > v) {
            int v1 = 0;
            for(Object object2: new TreeSet(bundle2.keySet())) {
                String s1 = (String)object2;
                ++v1;
                if(v1 > v) {
                    bundle2.remove(s1);
                }
            }
            zzge0.zzv().getClass();
            zzln.l(c0, null, 26, null, null, 0);
            zzge0.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzge0.zzm().v.zzb(bundle2);
        zzge0.zzt().zzH(bundle2);
    }
}

