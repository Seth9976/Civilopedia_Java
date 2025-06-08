package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {
    public int[] i;
    public Object[] j;
    public int k;
    public static Object[] l;
    public static int m;
    public static Object[] n;
    public static int o;

    public k() {
        this.i = d.a;
        this.j = d.b;
        this.k = 0;
    }

    public k(k k0) {
        int v = k0.k;
        this.c(v);
        if(this.k != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.put(k0.i(v1), k0.k(v1));
            }
        }
        else if(v > 0) {
            System.arraycopy(k0.i, 0, this.i, 0, v);
            System.arraycopy(k0.j, 0, this.j, 0, v << 1);
            this.k = v;
        }
    }

    public final void b(int v) {
        switch(v) {
            case 4: {
                Class class0 = k.class;
                synchronized(class0) {
                    Object[] arr_object = k.l;
                    if(arr_object != null) {
                        this.j = arr_object;
                        k.l = (Object[])arr_object[0];
                        this.i = (int[])arr_object[1];
                        arr_object[1] = null;
                        arr_object[0] = null;
                        --k.m;
                        return;
                    }
                }
                break;
            }
            case 8: {
                Class class1 = k.class;
                synchronized(class1) {
                    Object[] arr_object1 = k.n;
                    if(arr_object1 != null) {
                        this.j = arr_object1;
                        k.n = (Object[])arr_object1[0];
                        this.i = (int[])arr_object1[1];
                        arr_object1[1] = null;
                        arr_object1[0] = null;
                        --k.o;
                        return;
                    }
                }
            }
        }
        this.i = new int[v];
        this.j = new Object[v << 1];
    }

    public final void c(int v) {
        int v1 = this.k;
        int[] arr_v = this.i;
        if(arr_v.length < v) {
            Object[] arr_object = this.j;
            this.b(v);
            if(this.k > 0) {
                System.arraycopy(arr_v, 0, this.i, 0, v1);
                System.arraycopy(arr_object, 0, this.j, 0, v1 << 1);
            }
            k.d(arr_v, arr_object, v1);
        }
        if(this.k != v1) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int v = this.k;
        if(v > 0) {
            int[] arr_v = this.i;
            Object[] arr_object = this.j;
            this.i = d.a;
            this.j = d.b;
            this.k = 0;
            k.d(arr_v, arr_object, v);
        }
        if(this.k > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object object0) {
        return this.f(object0) >= 0;
    }

    public final boolean containsValue(Object object0) {
        return this.h(object0) >= 0;
    }

    public static void d(int[] arr_v, Object[] arr_object, int v) {
        switch(arr_v.length) {
            case 4: {
                Class class0 = k.class;
                synchronized(class0) {
                    if(k.m < 10) {
                        arr_object[0] = k.l;
                        arr_object[1] = arr_v;
                        for(int v2 = (v << 1) - 1; v2 >= 2; --v2) {
                            arr_object[v2] = null;
                        }
                        k.l = arr_object;
                        ++k.m;
                    }
                }
                return;
            }
            case 8: {
                Class class1 = k.class;
                synchronized(class1) {
                    if(k.o < 10) {
                        arr_object[0] = k.n;
                        arr_object[1] = arr_v;
                        for(int v4 = (v << 1) - 1; v4 >= 2; --v4) {
                            arr_object[v4] = null;
                        }
                        k.n = arr_object;
                        ++k.o;
                    }
                }
            }
        }
    }

    public final int e(int v, Object object0) {
        int v2;
        int v1 = this.k;
        if(v1 == 0) {
            return -1;
        }
        try {
            v2 = d.a(v1, v, this.i);
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new ConcurrentModificationException();
        }
        if(v2 < 0) {
            return v2;
        }
        if(object0.equals(this.j[v2 << 1])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.i[v3] == v; ++v3) {
            if(object0.equals(this.j[v3 << 1])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.i[v4] == v; --v4) {
            if(object0.equals(this.j[v4 << 1])) {
                return v4;
            }
        }
        return ~v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof k) {
            k k0 = (k)object0;
            if(this.k != k0.k) {
                return false;
            }
            try {
                for(int v = 0; true; ++v) {
                    if(v >= this.k) {
                        return true;
                    }
                    Object object1 = this.i(v);
                    Object object2 = this.k(v);
                    Object object3 = k0.getOrDefault(object1, null);
                    if(object2 != null) {
                        if(object2.equals(object3)) {
                            continue;
                        }
                        break;
                    }
                    else if(object3 != null || !k0.containsKey(object1)) {
                        return false;
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
            return false;
        }
        if(object0 instanceof Map) {
            Map map0 = (Map)object0;
            if(this.k != map0.size()) {
                return false;
            }
            try {
                for(int v1 = 0; v1 < this.k; ++v1) {
                    Object object4 = this.i(v1);
                    Object object5 = this.k(v1);
                    Object object6 = map0.get(object4);
                    if(object5 == null) {
                        if(object6 != null || !map0.containsKey(object4)) {
                            return false;
                        }
                    }
                    else if(!object5.equals(object6)) {
                        return false;
                    }
                }
                return true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public final int f(Object object0) {
        return object0 == null ? this.g() : this.e(object0.hashCode(), object0);
    }

    public final int g() {
        int v1;
        int v = this.k;
        if(v == 0) {
            return -1;
        }
        try {
            v1 = d.a(v, 0, this.i);
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new ConcurrentModificationException();
        }
        if(v1 < 0) {
            return v1;
        }
        if(this.j[v1 << 1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.i[v2] == 0; ++v2) {
            if(this.j[v2 << 1] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.i[v3] == 0; --v3) {
            if(this.j[v3 << 1] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public final Object get(Object object0) {
        return this.getOrDefault(object0, null);
    }

    public final Object getOrDefault(Object object0, Object object1) {
        int v = this.f(object0);
        return v < 0 ? object1 : this.j[(v << 1) + 1];
    }

    public final int h(Object object0) {
        int v = this.k * 2;
        Object[] arr_object = this.j;
        if(object0 == null) {
            for(int v1 = 1; v1 < v; v1 += 2) {
                if(arr_object[v1] == null) {
                    return v1 >> 1;
                }
            }
            return -1;
        }
        for(int v2 = 1; v2 < v; v2 += 2) {
            if(object0.equals(arr_object[v2])) {
                return v2 >> 1;
            }
        }
        return -1;
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.i;
        Object[] arr_object = this.j;
        int v = this.k;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    public final Object i(int v) {
        return this.j[v << 1];
    }

    public final boolean isEmpty() {
        return this.k <= 0;
    }

    public final Object j(int v) {
        Object[] arr_object = this.j;
        Object object0 = arr_object[(v << 1) + 1];
        int v1 = this.k;
        int v2 = 0;
        if(v1 <= 1) {
            k.d(this.i, arr_object, v1);
            this.i = d.a;
            this.j = d.b;
        }
        else {
            int[] arr_v = this.i;
            int v3 = 8;
            if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
                if(v < v1 - 1) {
                    int v5 = v1 - 1 - v;
                    System.arraycopy(arr_v, v + 1, arr_v, v, v5);
                    System.arraycopy(this.j, v + 1 << 1, this.j, v << 1, v5 << 1);
                }
                Object[] arr_object1 = this.j;
                int v6 = v1 - 1 << 1;
                arr_object1[v6] = null;
                arr_object1[v6 + 1] = null;
            }
            else {
                if(v1 > 8) {
                    v3 = v1 + (v1 >> 1);
                }
                this.b(v3);
                if(v1 != this.k) {
                    throw new ConcurrentModificationException();
                }
                if(v > 0) {
                    System.arraycopy(arr_v, 0, this.i, 0, v);
                    System.arraycopy(arr_object, 0, this.j, 0, v << 1);
                }
                if(v < v1 - 1) {
                    int v4 = v1 - 1 - v;
                    System.arraycopy(arr_v, v + 1, this.i, v, v4);
                    System.arraycopy(arr_object, v + 1 << 1, this.j, v << 1, v4 << 1);
                }
            }
            v2 = v1 - 1;
        }
        if(v1 != this.k) {
            throw new ConcurrentModificationException();
        }
        this.k = v2;
        return object0;
    }

    public final Object k(int v) {
        return this.j[(v << 1) + 1];
    }

    public final Object put(Object object0, Object object1) {
        int v2;
        int v1;
        int v = this.k;
        if(object0 == null) {
            v1 = this.g();
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = this.e(v3, object0);
        }
        if(v1 >= 0) {
            int v4 = (v1 << 1) + 1;
            Object[] arr_object = this.j;
            Object object2 = arr_object[v4];
            arr_object[v4] = object1;
            return object2;
        }
        int v5 = 8;
        int[] arr_v = this.i;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v5 = (v >> 1) + v;
            }
            else if(v < 4) {
                v5 = 4;
            }
            Object[] arr_object1 = this.j;
            this.b(v5);
            if(v != this.k) {
                throw new ConcurrentModificationException();
            }
            int[] arr_v1 = this.i;
            if(arr_v1.length > 0) {
                System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
                System.arraycopy(arr_object1, 0, this.j, 0, arr_object1.length);
            }
            k.d(arr_v, arr_object1, v);
        }
        if(~v1 < v) {
            System.arraycopy(this.i, ~v1, this.i, -v1, v - ~v1);
            System.arraycopy(this.j, ~v1 << 1, this.j, -v1 << 1, this.k - ~v1 << 1);
        }
        int v6 = this.k;
        if(v == v6) {
            int[] arr_v2 = this.i;
            if(~v1 < arr_v2.length) {
                arr_v2[~v1] = v2;
                Object[] arr_object2 = this.j;
                arr_object2[~v1 << 1] = object0;
                arr_object2[(~v1 << 1) + 1] = object1;
                this.k = v6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object object0, Object object1) {
        Object object2 = this.getOrDefault(object0, null);
        return object2 == null ? this.put(object0, object1) : object2;
    }

    public final Object remove(Object object0) {
        int v = this.f(object0);
        return v < 0 ? null : this.j(v);
    }

    public final boolean remove(Object object0, Object object1) {
        int v = this.f(object0);
        if(v >= 0) {
            Object object2 = this.k(v);
            if(object1 == object2 || object1 != null && object1.equals(object2)) {
                this.j(v);
                return true;
            }
        }
        return false;
    }

    public final Object replace(Object object0, Object object1) {
        int v = this.f(object0);
        if(v >= 0) {
            int v1 = (v << 1) + 1;
            Object[] arr_object = this.j;
            Object object2 = arr_object[v1];
            arr_object[v1] = object1;
            return object2;
        }
        return null;
    }

    public final boolean replace(Object object0, Object object1, Object object2) {
        int v = this.f(object0);
        if(v >= 0) {
            Object object3 = this.k(v);
            if(object3 == object1 || object1 != null && object1.equals(object3)) {
                int v1 = (v << 1) + 1;
                Object[] arr_object = this.j;
                Object object4 = arr_object[v1];
                arr_object[v1] = object2;
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.k;
    }

    @Override
    public final String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.k * 28);
        stringBuilder0.append('{');
        for(int v = 0; v < this.k; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.i(v);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.k(v);
            if(object1 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

