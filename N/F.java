package n;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class f implements Iterable {
    public c i;
    public c j;
    public final WeakHashMap k;
    public int l;

    public f() {
        this.k = new WeakHashMap();
        this.l = 0;
    }

    public c a(Object object0) {
        c c0;
        for(c0 = this.i; c0 != null && !c0.i.equals(object0); c0 = c0.k) {
        }
        return c0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(this.l != ((f)object0).l) {
            return false;
        }
        Iterator iterator0 = this.iterator();
        Iterator iterator1 = ((f)object0).iterator();
        while(((b)iterator0).hasNext() && ((b)iterator1).hasNext()) {
            Map.Entry map$Entry0 = (Map.Entry)((b)iterator0).next();
            Object object1 = ((b)iterator1).next();
            if(map$Entry0 == null && object1 != null || map$Entry0 != null && !map$Entry0.equals(object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !((b)iterator0).hasNext() && !((b)iterator1).hasNext();
    }

    public Object h(Object object0) {
        c c0 = this.a(object0);
        if(c0 == null) {
            return null;
        }
        --this.l;
        WeakHashMap weakHashMap0 = this.k;
        if(!weakHashMap0.isEmpty()) {
            for(Object object1: weakHashMap0.keySet()) {
                ((e)object1).a(c0);
            }
        }
        c c1 = c0.l;
        if(c1 == null) {
            this.i = c0.k;
        }
        else {
            c1.k = c0.k;
        }
        c c2 = c0.k;
        if(c2 == null) {
            this.j = c1;
        }
        else {
            c2.l = c1;
        }
        c0.k = null;
        c0.l = null;
        return c0.j;
    }

    @Override
    public final int hashCode() {
        Iterator iterator0 = this.iterator();
        int v;
        for(v = 0; ((b)iterator0).hasNext(); v += ((Map.Entry)((b)iterator0).next()).hashCode()) {
        }
        return v;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = new b(this.i, this.j, 0);
        this.k.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Iterator iterator0 = this.iterator();
        while(((b)iterator0).hasNext()) {
            stringBuilder0.append(((Map.Entry)((b)iterator0).next()).toString());
            if(((b)iterator0).hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

