package p;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;

public class f {
    public final LinkedHashMap a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public f(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = v;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public Object a(Object object0) {
        return null;
    }

    public final int createCount() {
        synchronized(this) {
        }
        return this.e;
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        synchronized(this) {
        }
        return this.f;
    }

    public final Object get(Object object0) {
        Object object3;
        Object object1;
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized(this) {
            object1 = this.a.get(object0);
            if(object1 != null) {
                ++this.g;
                return object1;
            }
            goto label_7;
        }
        return object1;
    label_7:
        ++this.h;
        Object object2 = this.a(object0);
        if(object2 == null) {
            return null;
        }
        synchronized(this) {
            ++this.e;
            object3 = this.a.put(object0, object2);
            if(object3 == null) {
                ++this.b;
            }
            else {
                this.a.put(object0, object3);
            }
        }
        if(object3 != null) {
            return object3;
        }
        this.trimToSize(this.c);
        return object2;
    }

    public final int hitCount() {
        synchronized(this) {
        }
        return this.g;
    }

    public final int maxSize() {
        synchronized(this) {
        }
        return this.c;
    }

    public final int missCount() {
        synchronized(this) {
        }
        return this.h;
    }

    public final Object put(Object object0, Object object1) {
        Object object2;
        if(object0 == null || object1 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized(this) {
            ++this.d;
            ++this.b;
            object2 = this.a.put(object0, object1);
            if(object2 != null) {
                --this.b;
            }
        }
        this.trimToSize(this.c);
        return object2;
    }

    public final int putCount() {
        synchronized(this) {
        }
        return this.d;
    }

    public final Object remove(Object object0) {
        if(object0 != null) {
            synchronized(this) {
                Object object1 = this.a.remove(object0);
                if(object1 != null) {
                    --this.b;
                }
                return object1;
            }
        }
        throw new NullPointerException("key == null");
    }

    public void resize(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized(this) {
            this.c = v;
        }
        this.trimToSize(v);
    }

    public final int size() {
        synchronized(this) {
        }
        return this.b;
    }

    public final Map snapshot() {
        synchronized(this) {
            return new LinkedHashMap(this.a);
        }
    }

    @Override
    public final String toString() {
        synchronized(this) {
            int v1 = this.h + this.g;
            int v2 = v1 == 0 ? 0 : this.g * 100 / v1;
            return "LruCache[maxSize=" + this.c + ",hits=" + this.g + ",misses=" + this.h + ",hitRate=" + v2 + "%]";
        }
    }

    public void trimToSize(int v) {
        int v1;
        while(true) {
            synchronized(this) {
                v1 = FIN.finallyOpen$NT();
                if(this.b < 0 || this.a.isEmpty() && this.b != 0) {
                    break;
                }
                if(this.b > v && !this.a.isEmpty()) {
                    Object object0 = this.a.entrySet().iterator().next();
                    Object object1 = ((Map.Entry)object0).getKey();
                    ((Map.Entry)object0).getValue();
                    this.a.remove(object1);
                    --this.b;
                    ++this.f;
                    FIN.finallyExec$NT(v1);
                    continue;
                }
                FIN.finallyCodeBegin$NT(v1);
            }
            FIN.finallyCodeEnd$NT(v1);
            return;
        }
        FIN.finallyExec$NT(v1);
        throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}

