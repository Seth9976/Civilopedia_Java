package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public final class s9 {
    public final V9 a;
    public boolean b;
    public static final int c;

    static {
        new s9(0);
    }

    public s9() {
        this.a = new V9(16);
    }

    public s9(int v) {
        V9 v90 = new V9(0);
        super();
        this.a = v90;
        this.a();
        this.a();
    }

    public final void a() {
        if(this.b) {
            return;
        }
        V9 v90 = this.a;
        if(!v90.l) {
            for(int v = 0; v < v90.j.size(); ++v) {
                Map.Entry map$Entry0 = (Map.Entry)v90.j.get(v);
                if(((zzgkg)map$Entry0.getKey()).zzc()) {
                    map$Entry0.setValue(Collections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            X9 x90 = v90.k.isEmpty() ? h.l : v90.k.entrySet();
            for(Object object0: x90) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((zzgkg)map$Entry1.getKey()).zzc()) {
                    map$Entry1.setValue(Collections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        if(!v90.l) {
            v90.k = v90.k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(v90.k);
            v90.n = v90.n.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(v90.n);
            v90.l = true;
        }
        this.b = true;
    }

    public final void b(zzgkg zzgkg0, Object object0) {
        if(zzgkg0.zzc()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                s9.c(zzgkg0, arrayList0.get(v1));
            }
            object0 = arrayList0;
        }
        else {
            s9.c(zzgkg0, object0);
        }
        this.a.b(zzgkg0, object0);
    }

    public static final void c(zzgkg zzgkg0, Object object0) {
        boolean z;
        zzgoa zzgoa0 = zzgkg0.zzb();
        object0.getClass();
        switch(zzgoa0.zza().ordinal()) {
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
                if(object0 instanceof zzgji || object0 instanceof byte[]) {
                    return;
                }
                break;
            }
            case 7: {
                if(object0 instanceof Integer || object0 instanceof zzgks) {
                    return;
                }
                break;
            }
            case 8: {
                if(object0 instanceof zzgma || object0 instanceof zzglf) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzgkg0.zza(), zzgkg0.zzb().zza(), object0.getClass().getName()));
    }

    @Override
    public final Object clone() {
        V9 v90;
        s9 s90 = new s9();
        for(int v = 0; true; ++v) {
            v90 = this.a;
            if(v >= v90.j.size()) {
                break;
            }
            Map.Entry map$Entry0 = (Map.Entry)v90.j.get(v);
            s90.b(((zzgkg)map$Entry0.getKey()), map$Entry0.getValue());
        }
        X9 x90 = v90.k.isEmpty() ? h.l : v90.k.entrySet();
        for(Object object0: x90) {
            s90.b(((zzgkg)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return s90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s9 ? this.a.equals(((s9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

