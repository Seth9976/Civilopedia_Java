package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzfqz extends zzfra implements Map {
    @Override  // com.google.android.gms.internal.ads.zzfra
    public Object b() {
        throw null;
    }

    public abstract Map c();

    @Override
    public final void clear() {
        this.c().clear();
    }

    @Override
    public boolean containsKey(@CheckForNull Object object0) {
        return this.c().containsKey(object0);
    }

    @Override
    public boolean containsValue(@CheckForNull Object object0) {
        return this.c().containsValue(object0);
    }

    @Override
    public Set entrySet() {
        return this.c().entrySet();
    }

    @Override
    public boolean equals(@CheckForNull Object object0) {
        return object0 == this || this.c().equals(object0);
    }

    @Override
    @CheckForNull
    public Object get(@CheckForNull Object object0) {
        return this.c().get(object0);
    }

    @Override
    public int hashCode() {
        return this.c().hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.c().isEmpty();
    }

    @Override
    public Set keySet() {
        return this.c().keySet();
    }

    @Override
    @CheckForNull
    public final Object put(Object object0, Object object1) {
        return this.c().put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.c().putAll(map0);
    }

    @Override
    @CheckForNull
    public final Object remove(@CheckForNull Object object0) {
        return this.c().remove(object0);
    }

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public final Collection values() {
        return this.c().values();
    }
}

