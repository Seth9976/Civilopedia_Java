package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.aa;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class u0 extends AbstractMap {
    public final int i;
    public List j;
    public Map k;
    public boolean l;
    public volatile aa m;
    public Map n;
    public static final int o;

    public u0(int v) {
        this.i = v;
        this.j = Collections.emptyList();
        this.k = Collections.emptyMap();
        this.n = Collections.emptyMap();
    }

    public final Object b(Comparable comparable0, Object object0) {
        this.f();
        int v = this.c(comparable0);
        if(v >= 0) {
            return ((y0)this.j.get(v)).setValue(object0);
        }
        this.f();
        int v1 = this.i;
        if(this.j.isEmpty() && !(this.j instanceof ArrayList)) {
            this.j = new ArrayList(v1);
        }
        if(-(v + 1) >= v1) {
            return this.e().put(comparable0, object0);
        }
        if(this.j.size() == v1) {
            y0 y00 = (y0)this.j.remove(v1 - 1);
            this.e().put(y00.i, y00.j);
        }
        this.j.add(-(v + 1), new y0(this, comparable0, object0));
        return null;
    }

    public final int c(Comparable comparable0) {
        int v = this.j.size();
        int v1 = v - 1;
        int v2 = 0;
        if(v1 >= 0) {
            int v3 = comparable0.compareTo(((y0)this.j.get(v1)).i);
            if(v3 > 0) {
                return -(v + 1);
            }
            if(v3 == 0) {
                return v1;
            }
        }
        while(v2 <= v1) {
            int v4 = (v2 + v1) / 2;
            int v5 = comparable0.compareTo(((y0)this.j.get(v4)).i);
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v2 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v2 + 1);
    }

    @Override
    public final void clear() {
        this.f();
        if(!this.j.isEmpty()) {
            this.j.clear();
        }
        if(!this.k.isEmpty()) {
            this.k.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.c(((Comparable)object0)) >= 0 || this.k.containsKey(((Comparable)object0));
    }

    public final Object d(int v) {
        this.f();
        Object object0 = ((y0)this.j.remove(v)).j;
        if(!this.k.isEmpty()) {
            Iterator iterator0 = this.e().entrySet().iterator();
            List list0 = this.j;
            Object object1 = iterator0.next();
            list0.add(new y0(this, ((Comparable)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue()));
            iterator0.remove();
        }
        return object0;
    }

    public final SortedMap e() {
        this.f();
        if(this.k.isEmpty() && !(this.k instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.k = treeMap0;
            this.n = treeMap0.descendingMap();
        }
        return (SortedMap)this.k;
    }

    @Override
    public final Set entrySet() {
        if(this.m == null) {
            this.m = new aa(this, 1);
        }
        return this.m;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u0)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((u0)object0).size()) {
            return false;
        }
        int v1 = this.j.size();
        if(v1 == ((u0)object0).j.size()) {
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!((Map.Entry)this.j.get(v2)).equals(((Map.Entry)((u0)object0).j.get(v2)))) {
                    return false;
                }
            }
            return v1 == v ? true : this.k.equals(((u0)object0).k);
        }
        return this.entrySet().equals(((u0)object0).entrySet());
    }

    public final void f() {
        if(this.l) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final Object get(Object object0) {
        int v = this.c(((Comparable)object0));
        return v < 0 ? this.k.get(((Comparable)object0)) : ((y0)this.j.get(v)).j;
    }

    @Override
    public final int hashCode() {
        int v = this.j.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((y0)this.j.get(v1)).hashCode();
        }
        return this.k.size() <= 0 ? v2 : this.k.hashCode() + v2;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.b(((Comparable)object0), object1);
    }

    @Override
    public final Object remove(Object object0) {
        this.f();
        int v = this.c(((Comparable)object0));
        if(v >= 0) {
            return this.d(v);
        }
        return this.k.isEmpty() ? null : this.k.remove(((Comparable)object0));
    }

    @Override
    public final int size() {
        return this.k.size() + this.j.size();
    }
}

