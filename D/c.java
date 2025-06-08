package D;

public final class c {
    public final Object[] a;
    public int b;

    public c() {
        this.a = new Object[0x100];
    }

    public c(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[v];
    }

    public Object a() {
        int v = this.b;
        if(v > 0) {
            Object object0 = this.a[v - 1];
            this.a[v - 1] = null;
            this.b = v - 1;
            return object0;
        }
        return null;
    }

    public void b(Object object0) {
        Object[] arr_object;
        int v1;
        for(int v = 0; true; ++v) {
            v1 = this.b;
            arr_object = this.a;
            if(v >= v1) {
                break;
            }
            if(arr_object[v] == object0) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        if(v1 < arr_object.length) {
            arr_object[v1] = object0;
            this.b = v1 + 1;
        }
    }
}

