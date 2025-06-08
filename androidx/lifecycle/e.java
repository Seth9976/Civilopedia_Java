package androidx.lifecycle;

public abstract class e {
    static {
        int[] arr_v = new int[g.values().length];
        e.a = arr_v;
        try {
            arr_v[g.ON_CREATE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[g.ON_START.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[g.ON_RESUME.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[g.ON_PAUSE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[g.ON_STOP.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[g.ON_DESTROY.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[g.ON_ANY.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

