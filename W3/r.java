package w3;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class r extends AbstractList implements RandomAccess, s {
    public final ArrayList i;
    public static final G j;

    static {
        r.j = new G(new r());
    }

    public r() {
        this.i = new ArrayList();
    }

    public r(s s0) {
        this.i = new ArrayList(s0.size());
        this.addAll(s0);
    }

    @Override
    public final void add(int v, Object object0) {
        this.i.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        if(collection0 instanceof s) {
            collection0 = ((s)collection0).g();
        }
        boolean z = this.i.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.i.size(), collection0);
    }

    @Override  // w3.s
    public final e b(int v) {
        e e0;
        ArrayList arrayList0 = this.i;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof e) {
            e0 = (e)object0;
        }
        else if(object0 instanceof String) {
            String s = (String)object0;
            try {
                e0 = new u(s.getBytes("UTF-8"));
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
            }
        }
        else {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            e0 = new u(arr_b);
        }
        if(e0 != object0) {
            arrayList0.set(v, e0);
        }
        return e0;
    }

    @Override
    public final void clear() {
        this.i.clear();
        ++this.modCount;
    }

    @Override  // w3.s
    public final G d() {
        return new G(this);
    }

    @Override  // w3.s
    public final void f(u u0) {
        this.i.add(u0);
        ++this.modCount;
    }

    @Override  // w3.s
    public final List g() {
        return Collections.unmodifiableList(this.i);
    }

    @Override
    public final Object get(int v) {
        String s;
        ArrayList arrayList0 = this.i;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof e) {
            s = ((e)object0).s();
            if(((e)object0).m()) {
                arrayList0.set(v, s);
                return s;
            }
        }
        else {
            byte[] arr_b = (byte[])object0;
            try {
                s = new String(arr_b, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
            }
            if(D.c(arr_b, 0, arr_b.length) == 0) {
                arrayList0.set(v, s);
                return s;
            }
        }
        return s;
    }

    @Override
    public final Object remove(int v) {
        Object object0 = this.i.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof e) {
            return ((e)object0).s();
        }
        byte[] arr_b = (byte[])object0;
        try {
            return new String(arr_b, "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
        }
    }

    @Override
    public final Object set(int v, Object object0) {
        Object object1 = this.i.set(v, ((String)object0));
        if(object1 instanceof String) {
            return (String)object1;
        }
        if(object1 instanceof e) {
            return ((e)object1).s();
        }
        byte[] arr_b = (byte[])object1;
        try {
            return new String(arr_b, "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
        }
    }

    @Override
    public final int size() {
        return this.i.size();
    }
}

