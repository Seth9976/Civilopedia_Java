package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.e;

public abstract class zzhe {
    public abstract zzgw a();

    public static zzgw b() {
        zzhe zzhe0;
        String s;
        Class class0 = zzhe.class;
        ClassLoader classLoader0 = class0.getClassLoader();
        Class class1 = zzgw.class;
        if(class1.equals(class1)) {
            s = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
            goto label_8;
        }
        if(class1.getPackage().equals(class0.getPackage())) {
            s = e.b(class1.getPackage().getName(), ".BlazeGeneratedzzgwLoader");
            try {
            label_8:
                Class class2 = Class.forName(s, true, classLoader0);
                try {
                    zzhe0 = (zzhe)class2.getConstructor(null).newInstance(null);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new IllegalStateException(noSuchMethodException0);
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
                return (zzgw)class1.cast(zzhe0.a());
            }
            catch(ClassNotFoundException unused_ex) {
                Iterator iterator0 = ServiceLoader.load(class0, classLoader0).iterator();
                ArrayList arrayList0 = new ArrayList();
                while(iterator0.hasNext()) {
                    try {
                        Object object0 = iterator0.next();
                        arrayList0.add(((zzgw)class1.cast(((zzhe)object0).a())));
                    }
                    catch(ServiceConfigurationError serviceConfigurationError0) {
                        Logger.getLogger("com.google.android.gms.internal.play_billing.zzgr").logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load zzgw", serviceConfigurationError0);
                    }
                }
                switch(arrayList0.size()) {
                    case 0: {
                        return null;
                    }
                    case 1: {
                        return (zzgw)arrayList0.get(0);
                    }
                    default: {
                        try {
                            return (zzgw)class1.getMethod("combine", Collection.class).invoke(null, arrayList0);
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
        }
        throw new IllegalArgumentException(class1.getName());
    }
}

