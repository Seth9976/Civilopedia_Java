package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.e;

public abstract class v9 {
    public static final Logger a;
    public static final String b;

    static {
        v9.a = Logger.getLogger("com.google.android.gms.internal.ads.zzgjx");
        v9.b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }

    public static zzgkc a() {
        Iterator iterator0;
        String s;
        Class class0 = v9.class;
        ClassLoader classLoader0 = class0.getClassLoader();
        Class class1 = zzgkc.class;
        if(class1.equals(class1)) {
            s = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        else {
            if(!class1.getPackage().equals(class0.getPackage())) {
                throw new IllegalArgumentException(class1.getName());
            }
            s = e.b(class1.getPackage().getName(), ".BlazeGeneratedzzgkcLoader");
        }
        try {
            Class class2 = Class.forName(s, true, classLoader0);
            try {
                u9.q(class2.getConstructor(null).newInstance(null));
                throw null;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(InstantiationException instantiationException0) {
                throw new IllegalStateException(instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalStateException(illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new IllegalStateException(invocationTargetException0);
            }
            throw new IllegalStateException(noSuchMethodException0);
        }
        catch(ClassNotFoundException unused_ex) {
            try {
                iterator0 = Arrays.asList(new v9[0]).iterator();
            }
            catch(Throwable throwable0) {
                throw new ServiceConfigurationError(throwable0.getMessage(), throwable0);
            }
            ArrayList arrayList0 = new ArrayList();
            while(true) {
                if(!iterator0.hasNext()) {
                    switch(arrayList0.size()) {
                        case 0: {
                            return null;
                        }
                        case 1: {
                            return (zzgkc)arrayList0.get(0);
                        }
                        default: {
                            try {
                                return (zzgkc)class1.getMethod("combine", Collection.class).invoke(null, arrayList0);
                            }
                            catch(NoSuchMethodException noSuchMethodException1) {
                                throw new IllegalStateException(noSuchMethodException1);
                            }
                            catch(IllegalAccessException illegalAccessException1) {
                                throw new IllegalStateException(illegalAccessException1);
                            }
                            catch(InvocationTargetException invocationTargetException1) {
                                throw new IllegalStateException(invocationTargetException1);
                            }
                        }
                    }
                }
                try {
                    Object object0 = iterator0.next();
                    if(object0 != null) {
                        throw new ClassCastException();
                    }
                    break;
                }
                catch(ServiceConfigurationError serviceConfigurationError0) {
                    v9.a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load zzgkc", serviceConfigurationError0);
                }
            }
            throw null;
        }
        throw null;
    }
}

