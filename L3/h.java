package L3;

import I2.a;
import V3.j;

public class h implements a {
    public final m i;
    public final a j;
    public volatile Object k;

    public h(m m0, a a0) {
        if(m0 != null) {
            super();
            this.k = k.i;
            this.i = m0;
            this.j = a0;
            return;
        }
        h.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 || v == 3 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "computable";
                break;
            }
            case 2: 
            case 3: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 2: {
                arr_object[1] = "recursionDetected";
                break;
            }
            case 3: {
                arr_object[1] = "renderDebugInformation";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            }
        }
        if(v != 2 && v != 3) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 2 || v == 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 2 || v == 3 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public void b(Object object0) {
    }

    public l c(boolean z) {
        l l0 = this.i.d(null, "in a lazy value");
        if(l0 != null) {
            return l0;
        }
        h.a(2);
        throw null;
    }

    @Override  // I2.a
    public Object invoke() {
        Object object0 = this.k;
        if(!(object0 instanceof k)) {
            V3.k.j(object0);
            return object0;
        }
        this.i.a.q();
        try {
            Object object1 = this.k;
            if(object1 instanceof k) {
                k k0 = k.j;
                k k1 = k.k;
                if(object1 == k0) {
                    this.k = k1;
                    l l0 = this.c(true);
                    if(!l0.b) {
                        return l0.c;
                    }
                    goto label_18;
                }
                else {
                label_18:
                    if(object1 == k1) {
                        l l1 = this.c(false);
                        if(!l1.b) {
                            return l1.c;
                        }
                        goto label_23;
                    }
                    else {
                        try {
                        label_23:
                            this.k = k0;
                            object1 = this.j.invoke();
                            this.b(object1);
                            this.k = object1;
                        }
                        catch(Throwable throwable0) {
                            if(!V3.k.h(throwable0)) {
                                if(this.k == k0) {
                                    this.k = new j(throwable0);
                                }
                                this.i.b.getClass();
                                throw throwable0;
                            }
                            this.k = k.i;
                            throw (RuntimeException)throwable0;
                        }
                    }
                }
            }
            else {
                V3.k.j(object1);
            }
            return object1;
        }
        finally {
            this.i.a.n();
        }
    }
}

