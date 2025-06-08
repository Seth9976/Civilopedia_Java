package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzfrm implements Serializable, Map {
    public transient zzfro i;
    public transient zzfro j;
    public transient zzfre k;

    public abstract x7 b();

    public abstract v7 c();

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(@CheckForNull Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final boolean containsValue(@CheckForNull Object object0) {
        return this.zzb().contains(object0);
    }

    public abstract w7 d();

    @Override
    public final Set entrySet() {
        return this.zzg();
    }

    @Override
    public final boolean equals(@CheckForNull Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Map ? this.entrySet().equals(((Map)object0).entrySet()) : false;
    }

    @Override
    @CheckForNull
    public abstract Object get(@CheckForNull Object arg1);

    @Override
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object object0, @CheckForNull Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    @Override
    public final int hashCode() {
        return zzfte.a(this.zzg());
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        zzfro zzfro0 = this.j;
        if(zzfro0 == null) {
            zzfro0 = this.d();
            this.j = zzfro0;
        }
        return zzfro0;
    }

    @Override
    @Deprecated
    @CheckForNull
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(Map map0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    @CheckForNull
    public final Object remove(@CheckForNull Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        int v = this.size();
        h.h(v, "size");
        StringBuilder stringBuilder0 = new StringBuilder(((int)Math.min(((long)v) * 8L, 0x40000000L)));
        stringBuilder0.append('{');
        boolean z = true;
        for(Object object0: this.entrySet()) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('=');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            z = false;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    @Override
    public final Collection values() {
        return this.zzb();
    }

    public final zzfre zzb() {
        zzfre zzfre0 = this.k;
        if(zzfre0 == null) {
            zzfre0 = this.b();
            this.k = zzfre0;
        }
        return zzfre0;
    }

    public static zzfrm zzc(Map map0) {
        Set set0 = map0.entrySet();
        zzfrl zzfrl0 = new zzfrl((set0 instanceof Collection ? set0.size() : 4));
        zzfrl0.zzb(set0);
        return zzfrl0.zzc();
    }

    public static zzfrm zzd() {
        return y7.o;
    }

    public final zzfro zzg() {
        zzfro zzfro0 = this.i;
        if(zzfro0 == null) {
            zzfro0 = this.c();
            this.i = zzfro0;
        }
        return zzfro0;
    }
}

