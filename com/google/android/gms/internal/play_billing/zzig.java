package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzig extends LinkedHashMap {
    public boolean i;
    public static final zzig j;

    static {
        zzig zzig0 = new zzig();
        zzig.j = zzig0;
        zzig0.i = false;
    }

    public zzig() {
        this.i = true;
    }

    public static int b(Object object0) {
        if(object0 instanceof byte[]) {
            int v1 = ((byte[])object0).length;
            for(int v = 0; v < ((byte[])object0).length; ++v) {
                v1 = v1 * 0x1F + ((byte[])object0)[v];
            }
            return v1 == 0 ? 1 : v1;
        }
        if(object0 instanceof zzkn) {
            throw new UnsupportedOperationException();
        }
        return object0.hashCode();
    }

    public final void c() {
        if(!this.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        this.c();
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
        int v = 0;
        for(Object object0: this.entrySet()) {
            int v1 = zzig.b(((Map.Entry)object0).getKey());
            v += zzig.b(((Map.Entry)object0).getValue()) ^ v1;
        }
        return v;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.c();
        object0.getClass();
        object1.getClass();
        return super.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.c();
        for(Object object0: map0.keySet()) {
            object0.getClass();
            map0.get(object0).getClass();
        }
        super.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        this.c();
        return super.remove(object0);
    }

    public static zzig zza() {
        return zzig.j;
    }

    public final zzig zzb() {
        if(this.isEmpty()) {
            return new zzig();
        }
        zzig zzig0 = new zzig(this);  // 初始化器: Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
        zzig0.i = true;
        return zzig0;
    }

    public final void zzc() {
        this.i = false;
    }

    public final void zzd(zzig zzig0) {
        this.c();
        if(!zzig0.isEmpty()) {
            this.putAll(zzig0);
        }
    }

    public final boolean zze() {
        return this.i;
    }
}

