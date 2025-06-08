package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzglu extends LinkedHashMap {
    public boolean i;
    public static final zzglu j;

    static {
        zzglu zzglu0 = new zzglu();
        zzglu.j = zzglu0;
        zzglu0.i = false;
    }

    public zzglu() {
        this.i = true;
    }

    public final void b() {
        if(!this.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        this.b();
        super.clear();
    }

    // 去混淆评级： 低(20)
    @Override
    public final Set entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map) {
            if(this == ((Map)object0)) {
                return true;
            }
            if(this.size() == ((Map)object0).size()) {
                for(Object object1: this.entrySet()) {
                    if(!((Map)object0).containsKey(((Map.Entry)object1).getKey())) {
                        return false;
                    }
                    Object object2 = ((Map.Entry)object1).getValue();
                    Object object3 = ((Map)object0).get(((Map.Entry)object1).getKey());
                    if((!(object2 instanceof byte[]) || !(object3 instanceof byte[]) ? object2.equals(object3) : Arrays.equals(((byte[])object2), ((byte[])object3)))) {
                        continue;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v2;
        int v1;
        int v = 0;
        for(Object object0: this.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 instanceof byte[]) {
                v1 = zzgla.zzb(((byte[])object1));
            }
            else {
                if(object1 instanceof zzgks) {
                    throw new UnsupportedOperationException();
                }
                v1 = object1.hashCode();
            }
            Object object2 = ((Map.Entry)object0).getValue();
            if(object2 instanceof byte[]) {
                v2 = zzgla.zzb(((byte[])object2));
            }
            else {
                if(object2 instanceof zzgks) {
                    throw new UnsupportedOperationException();
                }
                v2 = object2.hashCode();
            }
            v += v2 ^ v1;
        }
        return v;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.b();
        object0.getClass();
        object1.getClass();
        return super.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.b();
        for(Object object0: map0.keySet()) {
            object0.getClass();
            map0.get(object0).getClass();
        }
        super.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        this.b();
        return super.remove(object0);
    }

    public static zzglu zza() {
        return zzglu.j;
    }

    public final zzglu zzb() {
        if(this.isEmpty()) {
            return new zzglu();
        }
        zzglu zzglu0 = new zzglu(this);  // 初始化器: Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
        zzglu0.i = true;
        return zzglu0;
    }

    public final void zzc() {
        this.i = false;
    }

    public final void zzd(zzglu zzglu0) {
        this.b();
        if(!zzglu0.isEmpty()) {
            this.putAll(zzglu0);
        }
    }

    public final boolean zze() {
        return this.i;
    }
}

