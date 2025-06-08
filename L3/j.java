package L3;

import I2.b;
import V3.i;
import java.util.concurrent.ConcurrentHashMap;

public class j implements b {
    public final m i;
    public final ConcurrentHashMap j;
    public final b k;

    public j(m m0, ConcurrentHashMap concurrentHashMap0, b b0) {
        if(m0 != null) {
            super();
            this.i = m0;
            this.j = concurrentHashMap0;
            this.k = b0;
            return;
        }
        j.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 4 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "map";
                break;
            }
            case 2: {
                arr_object[0] = "compute";
                break;
            }
            case 3: 
            case 4: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "recursionDetected";
                break;
            }
            case 4: {
                arr_object[1] = "raceCondition";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            }
        }
        if(v != 3 && v != 4) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 3 || v == 4 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 4 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // I2.b
    public Object b(Object object0) {
        a a0;
        Object object6;
        Object object4;
        Object object3;
        Object object2;
        k k1;
        ConcurrentHashMap concurrentHashMap0 = this.j;
        Object object1 = concurrentHashMap0.get(object0);
        k k0 = k.j;
        i i0 = V3.k.a;
        AssertionError assertionError0 = null;
        if(object1 != null && object1 != k0) {
            V3.k.j(object1);
            return object1 == i0 ? null : object1;
        }
        m m0 = this.i;
        o o0 = m0.a;
        m0.a.q();
        try {
            k1 = concurrentHashMap0.get(object0);
            k k2 = k.k;
            if(k1 == k0) {
                l l0 = m0.d(object0, "");
                if(l0 == null) {
                    j.a(3);
                    throw null;
                }
                if(l0.b) {
                    k1 = k2;
                    goto label_24;
                }
                object2 = l0.c;
                goto label_22;
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_70;
        }
    label_22:
        o0.n();
        return object2;
        try {
        label_24:
            if(k1 == k2) {
                l l1 = m0.d(object0, "");
                if(l1 == null) {
                    j.a(3);
                    throw null;
                }
                if(!l1.b) {
                    object3 = l1.c;
                    goto label_31;
                }
            }
            goto label_33;
        }
        catch(Throwable throwable0) {
            goto label_70;
        }
    label_31:
        o0.n();
        return object3;
        try {
        label_33:
            if(k1 != null) {
                V3.k.j(k1);
                if(k1 != i0) {
                    goto label_36;
                }
                goto label_37;
            }
            goto label_39;
        }
        catch(Throwable throwable0) {
            goto label_70;
        }
    label_36:
        assertionError0 = k1;
    label_37:
        o0.n();
        return assertionError0;
        try {
        label_39:
            concurrentHashMap0.put(object0, k0);
            object4 = this.k.b(object0);
            if(object4 != null) {
                i0 = object4;
            }
            Object object5 = concurrentHashMap0.put(object0, i0);
            if(object5 != k0) {
                assertionError0 = this.f(object0, object5);
                throw assertionError0;
            }
            goto label_72;
        }
        catch(Throwable throwable1) {
            try {
                if(V3.k.h(throwable1)) {
                    goto label_49;
                }
                goto label_56;
            }
            catch(Throwable throwable0) {
                goto label_70;
            }
            try {
            label_49:
                object6 = concurrentHashMap0.remove(object0);
                goto label_53;
            }
            catch(Throwable throwable2) {
                try {
                    throw this.g(object0, throwable2);
                label_53:
                    if(object6 != k0) {
                        throw this.c(object0, object6);
                    }
                    throw (RuntimeException)throwable1;
                label_56:
                    a0 = m0.b;
                    if(throwable1 != assertionError0) {
                        Object object7 = concurrentHashMap0.put(object0, new V3.j(throwable1));
                        if(object7 != k0) {
                            throw this.f(object0, object7);
                        }
                        a0.getClass();
                        throw throwable1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_70;
                }
            }
            try {
                concurrentHashMap0.remove(object0);
                goto label_67;
            }
            catch(Throwable throwable3) {
                try {
                    throw this.g(object0, throwable3);
                label_67:
                    a0.getClass();
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
        }
    label_70:
        o0.n();
        throw throwable0;
    label_72:
        o0.n();
        return object4;
    }

    public final AssertionError c(Object object0, Object object1) {
        AssertionError assertionError0 = new AssertionError("Inconsistent key detected. " + k.j + " is expected, was: " + object1 + ", most probably race condition detected on input " + object0 + " under " + this.i);
        m.e(assertionError0);
        return assertionError0;
    }

    public final AssertionError f(Object object0, Object object1) {
        AssertionError assertionError0 = new AssertionError("Race condition detected on input " + object0 + ". Old value is " + object1 + " under " + this.i);
        m.e(assertionError0);
        return assertionError0;
    }

    public final AssertionError g(Object object0, Throwable throwable0) {
        AssertionError assertionError0 = new AssertionError("Unable to remove " + object0 + " under " + this.i, throwable0);
        m.e(assertionError0);
        return assertionError0;
    }
}

