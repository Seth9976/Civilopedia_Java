package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c implements Collection, Set {
    public int[] i;
    public Object[] j;
    public int k;
    public a l;
    public static final int[] m;
    public static final Object[] n;
    public static Object[] o;
    public static int p;
    public static Object[] q;
    public static int r;

    static {
        c.m = new int[0];
        c.n = new Object[0];
    }

    public c(int v) {
        if(v == 0) {
            this.i = c.m;
            this.j = c.n;
        }
        else {
            this.a(v);
        }
        this.k = 0;
    }

    public final void a(int v) {
        switch(v) {
            case 4: {
                Class class0 = c.class;
                synchronized(class0) {
                    Object[] arr_object = c.o;
                    if(arr_object != null) {
                        this.j = arr_object;
                        c.o = (Object[])arr_object[0];
                        this.i = (int[])arr_object[1];
                        arr_object[1] = null;
                        arr_object[0] = null;
                        --c.p;
                        return;
                    }
                }
                break;
            }
            case 8: {
                Class class1 = c.class;
                synchronized(class1) {
                    Object[] arr_object1 = c.q;
                    if(arr_object1 != null) {
                        this.j = arr_object1;
                        c.q = (Object[])arr_object1[0];
                        this.i = (int[])arr_object1[1];
                        arr_object1[1] = null;
                        arr_object1[0] = null;
                        --c.r;
                        return;
                    }
                }
            }
        }
        this.i = new int[v];
        this.j = new Object[v];
    }

    @Override
    public final boolean add(Object object0) {
        int v1;
        int v;
        if(object0 == null) {
            v = this.j();
            v1 = 0;
        }
        else {
            int v2 = object0.hashCode();
            v1 = v2;
            v = this.i(v2, object0);
        }
        if(v >= 0) {
            return false;
        }
        int v3 = 8;
        int v4 = this.k;
        int[] arr_v = this.i;
        if(v4 >= arr_v.length) {
            if(v4 >= 8) {
                v3 = (v4 >> 1) + v4;
            }
            else if(v4 < 4) {
                v3 = 4;
            }
            Object[] arr_object = this.j;
            this.a(v3);
            int[] arr_v1 = this.i;
            if(arr_v1.length > 0) {
                System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
                System.arraycopy(arr_object, 0, this.j, 0, arr_object.length);
            }
            c.h(arr_v, arr_object, this.k);
        }
        int v5 = this.k;
        if(~v < v5) {
            System.arraycopy(this.i, ~v, this.i, -v, v5 - ~v);
            System.arraycopy(this.j, ~v, this.j, -v, this.k - ~v);
        }
        this.i[~v] = v1;
        this.j[~v] = object0;
        ++this.k;
        return true;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        int v = collection0.size() + this.k;
        int[] arr_v = this.i;
        boolean z = false;
        if(arr_v.length < v) {
            Object[] arr_object = this.j;
            this.a(v);
            int v1 = this.k;
            if(v1 > 0) {
                System.arraycopy(arr_v, 0, this.i, 0, v1);
                System.arraycopy(arr_object, 0, this.j, 0, this.k);
            }
            c.h(arr_v, arr_object, this.k);
        }
        for(Object object0: collection0) {
            z |= this.add(object0);
        }
        return z;
    }

    @Override
    public final void clear() {
        int v = this.k;
        if(v != 0) {
            c.h(this.i, this.j, v);
            this.i = c.m;
            this.j = c.n;
            this.k = 0;
        }
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
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
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            if(this.k != set0.size()) {
                return false;
            }
            try {
                for(int v = 0; true; ++v) {
                    if(v >= this.k) {
                        return true;
                    }
                    if(!set0.contains(this.j[v])) {
                        return false;
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public static void h(int[] arr_v, Object[] arr_object, int v) {
        switch(arr_v.length) {
            case 4: {
                Class class0 = c.class;
                synchronized(class0) {
                    if(c.p < 10) {
                        arr_object[0] = c.o;
                        arr_object[1] = arr_v;
                        for(int v2 = v - 1; v2 >= 2; --v2) {
                            arr_object[v2] = null;
                        }
                        c.o = arr_object;
                        ++c.p;
                    }
                }
                return;
            }
            case 8: {
                Class class1 = c.class;
                synchronized(class1) {
                    if(c.r < 10) {
                        arr_object[0] = c.q;
                        arr_object[1] = arr_v;
                        for(int v4 = v - 1; v4 >= 2; --v4) {
                            arr_object[v4] = null;
                        }
                        c.q = arr_object;
                        ++c.r;
                    }
                }
            }
        }
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.i;
        int v = this.k;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    public final int i(int v, Object object0) {
        int v1 = this.k;
        if(v1 == 0) {
            return -1;
        }
        int v2 = d.a(v1, v, this.i);
        if(v2 < 0) {
            return v2;
        }
        if(object0.equals(this.j[v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.i[v3] == v; ++v3) {
            if(object0.equals(this.j[v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.i[v4] == v; --v4) {
            if(object0.equals(this.j[v4])) {
                return v4;
            }
        }
        return ~v3;
    }

    public final int indexOf(Object object0) {
        return object0 == null ? this.j() : this.i(object0.hashCode(), object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.k <= 0;
    }

    @Override
    public final Iterator iterator() {
        if(this.l == null) {
            this.l = new a(this, 1);
        }
        a a0 = this.l;
        if(((h)a0.c) == null) {
            a0.c = new h(a0, 1);
        }
        return ((h)a0.c).iterator();
    }

    public final int j() {
        int v = this.k;
        if(v == 0) {
            return -1;
        }
        int v1 = d.a(v, 0, this.i);
        if(v1 < 0) {
            return v1;
        }
        if(this.j[v1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.i[v2] == 0; ++v2) {
            if(this.j[v2] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.i[v3] == 0; --v3) {
            if(this.j[v3] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public final void k(int v) {
        Object[] arr_object = this.j;
        Object object0 = arr_object[v];
        int v1 = this.k;
        if(v1 <= 1) {
            c.h(this.i, arr_object, v1);
            this.i = c.m;
            this.j = c.n;
            this.k = 0;
            return;
        }
        int[] arr_v = this.i;
        int v2 = 8;
        if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
            this.k = v1 - 1;
            if(v < v1 - 1) {
                System.arraycopy(arr_v, v + 1, arr_v, v, v1 - 1 - v);
                System.arraycopy(this.j, v + 1, this.j, v, this.k - v);
            }
            this.j[this.k] = null;
        }
        else {
            if(v1 > 8) {
                v2 = v1 + (v1 >> 1);
            }
            this.a(v2);
            --this.k;
            if(v > 0) {
                System.arraycopy(arr_v, 0, this.i, 0, v);
                System.arraycopy(arr_object, 0, this.j, 0, v);
            }
            int v3 = this.k;
            if(v < v3) {
                System.arraycopy(arr_v, v + 1, this.i, v, v3 - v);
                System.arraycopy(arr_object, v + 1, this.j, v, this.k - v);
            }
        }
    }

    @Override
    public final boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.k(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        int v = this.k - 1;
        boolean z = false;
        while(v >= 0) {
            if(!collection0.contains(this.j[v])) {
                this.k(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override
    public final int size() {
        return this.k;
    }

    @Override
    public final Object[] toArray() {
        int v = this.k;
        Object[] arr_object = new Object[v];
        System.arraycopy(this.j, 0, arr_object, 0, v);
        return arr_object;
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        if(arr_object.length < this.k) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), this.k);
        }
        System.arraycopy(this.j, 0, arr_object, 0, this.k);
        int v = this.k;
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }

    @Override
    public final String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.k * 14);
        stringBuilder0.append('{');
        for(int v = 0; v < this.k; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.j[v];
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

