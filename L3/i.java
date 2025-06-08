package L3;

import I2.a;

public class i extends h implements n {
    public i(m m0, a a0) {
        if(m0 != null) {
            super(m0, a0);
            return;
        }
        i.a(0);
        throw null;
    }

    @Override  // L3.h
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "computable";
                break;
            }
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = v == 2 ? "invoke" : "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        if(v != 2) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // L3.h, I2.a
    public final Object invoke() {
        Object object0 = super.invoke();
        if(object0 != null) {
            return object0;
        }
        i.a(2);
        throw null;
    }
}

