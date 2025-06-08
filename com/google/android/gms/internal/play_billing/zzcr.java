package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzcr implements Serializable, Map {
    public transient zzcv i;
    public transient zzcv j;
    public transient zzcj k;

    public abstract v b();

    public abstract t c();

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

    public abstract u d();

    @Override
    public final Set entrySet() {
        return this.zzf();
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
        int v = 0;
        for(Object object0: this.zzf()) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        zzcv zzcv0 = this.j;
        if(zzcv0 == null) {
            zzcv0 = this.d();
            this.j = zzcv0;
        }
        return zzcv0;
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
        if(v < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + v);
        }
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

    public final zzcj zzb() {
        zzcj zzcj0 = this.k;
        if(zzcj0 == null) {
            zzcj0 = this.b();
            this.k = zzcj0;
        }
        return zzcj0;
    }

    public static zzcr zzc(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        a.U("com.android.vending.billing.PURCHASES_UPDATED", object1);
        a.U("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", object3);
        a.U("com.android.vending.billing.ALTERNATIVE_BILLING", object5);
        return w.e(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", object1, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", object3, "com.android.vending.billing.ALTERNATIVE_BILLING", object5}, null);
    }

    public final zzcv zzf() {
        zzcv zzcv0 = this.i;
        if(zzcv0 == null) {
            zzcv0 = this.c();
            this.i = zzcv0;
        }
        return zzcv0;
    }
}

