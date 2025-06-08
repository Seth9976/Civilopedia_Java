package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzfpk {
    public static final Object a;

    static {
        Object object0;
        Method method0 = null;
        try {
            object0 = null;
            object0 = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
            goto label_6;
        }
        catch(ThreadDeath threadDeath0) {
            throw threadDeath0;
        }
        catch(Throwable unused_ex) {
        label_6:
            zzfpk.a = object0;
            Class class0 = Throwable.class;
            if(object0 != null) {
                try {
                    Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", class0, Integer.TYPE);
                    goto label_13;
                }
                catch(ThreadDeath threadDeath1) {
                }
                catch(Throwable unused_ex) {
                    goto label_13;
                }
                throw threadDeath1;
            }
        label_13:
            if(object0 != null) {
                try {
                    method0 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", class0);
                    goto label_18;
                }
                catch(ThreadDeath threadDeath2) {
                }
                catch(Throwable unused_ex) {
                    goto label_18;
                }
                try {
                    throw threadDeath2;
                label_18:
                    if(method0 != null) {
                        method0.invoke(object0, new Throwable());
                    }
                }
                catch(UnsupportedOperationException | IllegalAccessException | InvocationTargetException unused_ex) {
                }
            }
        }
    }

    public static String zza(Throwable throwable0) {
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0));
        return stringWriter0.toString();
    }
}

