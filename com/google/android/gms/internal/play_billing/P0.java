package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.u9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class p0 {
    public final L0 a;
    public boolean b;
    public boolean c;
    public static final p0 d;

    static {
        p0.d = new p0(0);
    }

    public p0() {
        this.a = new L0();
    }

    public p0(int v) {
        L0 l00 = new L0();
        super();
        this.a = l00;
        this.c();
        this.c();
    }

    public static int a(zzha zzha0, Object object0) {
        zzha0.zzb();
        int v = zzha0.zza();
        if(!zzha0.zze()) {
            throw zzju.zzj != null || !(((zzim)object0) instanceof zzfw) ? null : null;
        }
        int v1 = ((List)object0).size();
        if(zzha0.zzd()) {
            if(!((List)object0).isEmpty()) {
                if(v1 <= 0) {
                    return zzgr.zzz(v << 3) + 1;
                }
                ((List)object0).get(0);
                throw null;
            }
            return 0;
        }
        if(v1 <= 0) {
            return 0;
        }
        Object object1 = ((List)object0).get(0);
        throw zzju.zzj != null || !(((zzim)object1) instanceof zzfw) ? null : null;
    }

    public final Iterator b() {
        L0 l00 = this.a;
        if(l00.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new t0(((aa)l00.entrySet()).iterator()) : ((aa)l00.entrySet()).iterator();
    }

    public final void c() {
        if(this.b) {
            return;
        }
        L0 l00 = this.a;
        int v = l00.j;
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = l00.e(v2).j;
            if(object0 instanceof zzhk) {
                ((zzhk)object0).getClass();
                Class class0 = ((zzhk)object0).getClass();
                F0.c.a(class0).zzf(((zzhk)object0));
                ((zzhk)object0).g();
            }
        }
        for(Object object1: l00.c()) {
            Object object2 = ((Map.Entry)object1).getValue();
            if(object2 instanceof zzhk) {
                ((zzhk)object2).getClass();
                Class class1 = ((zzhk)object2).getClass();
                F0.c.a(class1).zzf(((zzhk)object2));
                ((zzhk)object2).g();
            }
        }
        if(!l00.l) {
            for(int v1 = 0; v1 < l00.j; ++v1) {
                M0 m00 = l00.e(v1);
                if(((zzha)m00.i).zze()) {
                    m00.setValue(Collections.unmodifiableList(((List)m00.j)));
                }
            }
            for(Object object3: l00.c()) {
                Map.Entry map$Entry0 = (Map.Entry)object3;
                if(((zzha)map$Entry0.getKey()).zze()) {
                    map$Entry0.setValue(Collections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
        }
        if(!l00.l) {
            l00.k = l00.k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(l00.k);
            l00.n = l00.n.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(l00.n);
            l00.l = true;
        }
        this.b = true;
    }

    @Override
    public final Object clone() {
        p0 p00 = new p0();
        L0 l00 = this.a;
        int v = l00.j;
        for(int v1 = 0; v1 < v; ++v1) {
            M0 m00 = l00.e(v1);
            p00.d(((zzha)m00.i), m00.j);
        }
        for(Object object0: l00.c()) {
            p00.d(((zzha)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        p00.c = this.c;
        return p00;
    }

    public final void d(zzha zzha0, Object object0) {
        if(zzha0.zze()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list0 = (List)object0;
            int v = list0.size();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = list0.get(v1);
                p0.h(zzha0, object1);
                arrayList0.add(object1);
            }
            object0 = arrayList0;
        }
        else {
            p0.h(zzha0, object0);
        }
        if(object0 instanceof zzhw) {
            this.c = true;
        }
        this.a.d(zzha0, object0);
    }

    public final boolean e() {
        L0 l00 = this.a;
        int v = l00.j;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!p0.f(l00.e(v1))) {
                return false;
            }
        }
        for(Object object0: l00.c()) {
            if(!p0.f(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p0 ? this.a.equals(((p0)object0).a) : false;
    }

    public static boolean f(Map.Entry map$Entry0) {
        boolean z;
        zzha zzha0 = (zzha)map$Entry0.getKey();
        if(zzha0.zzc() == zzjv.zzi) {
            if(zzha0.zze()) {
                List list0 = (List)map$Entry0.getValue();
                int v = list0.size();
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= v) {
                        return true;
                    }
                    Object object0 = list0.get(v1);
                    if(object0 instanceof zzin) {
                        z = ((zzin)object0).zzl();
                    }
                    else {
                        if(!(object0 instanceof zzhw)) {
                            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                        }
                        z = true;
                    }
                    if(!z) {
                        return false;
                    }
                }
            }
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof zzin) {
                return ((zzin)object1).zzl();
            }
            if(!(object1 instanceof zzhw)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    public static final int g(Map.Entry map$Entry0) {
        int v;
        zzha zzha0 = (zzha)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zzha0.zzc() == zzjv.zzi && !zzha0.zze() && !zzha0.zzd()) {
            if(object0 instanceof zzhw) {
                v = zzgr.zzz(((zzha)map$Entry0.getKey()).zza()) + 1;
                int v1 = ((zzhw)object0).zza();
                return u9.D(v1, v1, 1) + 2 + v;
            }
            v = zzgr.zzz(((zzha)map$Entry0.getKey()).zza()) + 1;
            int v2 = ((zzim)object0).zzk();
            return u9.D(v2, v2, 1) + v + 2;
        }
        return p0.a(zzha0, object0);
    }

    public static final void h(zzha zzha0, Object object0) {
        boolean z;
        zzju zzju0 = zzha0.zzb();
        object0.getClass();
        switch(zzju0.zza().ordinal()) {
            case 0: {
                z = object0 instanceof Integer;
                goto label_15;
            }
            case 1: {
                z = object0 instanceof Long;
                goto label_15;
            }
            case 2: {
                z = object0 instanceof Float;
                goto label_15;
            }
            case 3: {
                z = object0 instanceof Double;
                goto label_15;
            }
            case 4: {
                z = object0 instanceof Boolean;
                goto label_15;
            }
            case 5: {
                z = object0 instanceof String;
            label_15:
                if(z) {
                    return;
                }
                break;
            }
            case 6: {
                if(object0 instanceof zzgk || object0 instanceof byte[]) {
                    return;
                }
                break;
            }
            case 7: {
                if(object0 instanceof Integer || object0 instanceof zzkn) {
                    return;
                }
                break;
            }
            case 8: {
                if(object0 instanceof zzim || object0 instanceof zzhw) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzha0.zza(), zzha0.zzb().zza(), object0.getClass().getName()));
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

