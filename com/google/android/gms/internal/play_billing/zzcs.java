package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class zzcs {
    public final ArrayList a;

    public zzcs() {
        this.a = new ArrayList();
    }

    public final zzcs zza(zzdh zzdh0) {
        if(zzdh0.zzd()) {
            throw new IllegalArgumentException(zzbf.zza("range must not be empty, but was %s", new Object[]{zzdh0}));
        }
        this.a.add(zzdh0);
        return this;
    }

    public final zzct zzc() {
        zzck zzck0 = new zzck(this.a.size());  // 初始化器: Lcom/google/android/gms/internal/play_billing/g;-><init>(I)V
        Collections.sort(this.a, p.i);
        Iterator iterator0 = this.a.iterator();
        l l0 = iterator0 instanceof l ? ((l)iterator0) : new l(iterator0);
        while(l0.hasNext()) {
            zzdh zzdh0;
            for(zzdh0 = (zzdh)l0.next(); l0.hasNext(); zzdh0 = zzdh0.zzc(((zzdh)l0.next()))) {
                zzdh zzdh1 = (zzdh)l0.zza();
                if(zzdh0.i.a(zzdh1.j) > 0 || zzdh1.i.a(zzdh0.j) > 0) {
                    break;
                }
                zzbe.zzd(zzdh0.zzb(zzdh1).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdh0, zzdh1);
            }
            zzck0.zzd(zzdh0);
        }
        zzco zzco0 = zzck0.zze();
        if(zzco0.isEmpty()) {
            return zzct.zzb();
        }
        if(zzco0.size() == 1) {
            zzdx zzdx0 = zzco0.zzn(0);
            Object object0 = zzdx0.next();
            if(!zzdx0.hasNext()) {
                return ((zzdh)object0).equals(zzdh.zza()) ? zzct.k : new zzct(zzco0);
            }
            StringBuilder stringBuilder0 = new StringBuilder("expected one element but was: <");
            stringBuilder0.append(object0);
            for(int v = 0; v < 4 && zzdx0.hasNext(); ++v) {
                stringBuilder0.append(", ");
                Object object1 = zzdx0.next();
                stringBuilder0.append(object1);
            }
            if(zzdx0.hasNext()) {
                stringBuilder0.append(", ...");
            }
            stringBuilder0.append('>');
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
        return new zzct(zzco0);
    }
}

