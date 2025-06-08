package w3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class n {
    public final l a;
    public final Object b;
    public final o c;
    public final m d;
    public final Method e;

    public n(l l0, Object object0, o o0, m m0, Class class0) {
        if(l0 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if(m0.j == L.n && o0 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = l0;
        this.b = object0;
        this.c = o0;
        this.d = m0;
        if(p.class.isAssignableFrom(class0)) {
            try {
                this.e = class0.getMethod("valueOf", Integer.TYPE);
                return;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException("Generated message class \"" + class0.getName() + "\" missing method \"valueOf\".", noSuchMethodException0);
            }
        }
        this.e = null;
    }

    public final Object a(Object object0) {
        if(this.d.j.i == M.q) {
            Object[] arr_object = {((Integer)object0)};
            try {
                return this.e.invoke(null, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                Throwable throwable0 = invocationTargetException0.getCause();
                if(throwable0 instanceof RuntimeException) {
                    throw (RuntimeException)throwable0;
                }
                if(throwable0 instanceof Error) {
                    throw (Error)throwable0;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
            }
        }
        return object0;
    }

    public final Object b(Object object0) {
        return this.d.j.i == M.q ? ((p)object0).a() : object0;
    }
}

