package R2;

import w2.f;

public abstract class a {
    public static final int a;

    static {
        Class class0;
        try {
            class0 = Class.forName("java.lang.ClassValue");
        }
        catch(Throwable throwable0) {
            class0 = new f(throwable0);
        }
        if(!(class0 instanceof f)) {
            class0 = Boolean.TRUE;
        }
        if(class0 instanceof f) {
            class0 = Boolean.FALSE;
        }
        Boolean boolean0 = (Boolean)class0;
    }
}

