package androidx.lifecycle;

import com.spears.civilopedia.MyApplication_LifecycleAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public abstract class r {
    public static final HashMap a;
    public static final HashMap b;

    static {
        r.a = new HashMap();
        r.b = new HashMap();
    }

    public static MyApplication_LifecycleAdapter a(Constructor constructor0, m m0) {
        try {
            return (MyApplication_LifecycleAdapter)constructor0.newInstance(m0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    public static String b(String s) {
        return s.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class class0) {
        int v2;
        Class[] arr_class;
        boolean z;
        Constructor constructor0;
        ArrayList arrayList0;
        int v = 1;
        HashMap hashMap0 = r.a;
        Integer integer0 = (Integer)hashMap0.get(class0);
        if(integer0 != null) {
            return (int)integer0;
        }
        if(class0.getCanonicalName() != null) {
            try {
                arrayList0 = null;
                Package package0 = class0.getPackage();
                String s = class0.getCanonicalName();
                String s1 = package0 == null ? "" : package0.getName();
                if(!s1.isEmpty()) {
                    s = s.substring(s1.length() + 1);
                }
                String s2 = r.b(s);
                if(!s1.isEmpty()) {
                    s2 = s1 + "." + s2;
                }
                constructor0 = Class.forName(s2).getDeclaredConstructor(class0);
                if(!constructor0.isAccessible()) {
                    constructor0.setAccessible(true);
                }
                goto label_24;
            }
            catch(ClassNotFoundException unused_ex) {
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException(noSuchMethodException0);
            }
            constructor0 = null;
        label_24:
            HashMap hashMap1 = r.b;
            if(constructor0 == null) {
                c c0 = c.c;
                HashMap hashMap2 = c0.b;
                Boolean boolean0 = (Boolean)hashMap2.get(class0);
                if(boolean0 == null) {
                    Method[] arr_method = class0.getDeclaredMethods();
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= arr_method.length) {
                            hashMap2.put(class0, Boolean.FALSE);
                            z = false;
                            break;
                        }
                        if(((v)arr_method[v1].getAnnotation(v.class)) != null) {
                            c0.a(class0, arr_method);
                            z = true;
                            break;
                        }
                    }
                }
                else {
                    z = boolean0.booleanValue();
                }
                if(!z) {
                    Class class1 = class0.getSuperclass();
                    Class class2 = m.class;
                    if(class1 == null || !class2.isAssignableFrom(class1)) {
                        arr_class = class0.getInterfaces();
                        v2 = 0;
                    label_58:
                        while(v2 < arr_class.length) {
                            Class class3 = arr_class[v2];
                            if(class3 != null && class2.isAssignableFrom(class3)) {
                                if(r.c(class3) == 1) {
                                    hashMap0.put(class0, v);
                                    return v;
                                }
                                if(arrayList0 == null) {
                                    arrayList0 = new ArrayList();
                                }
                                arrayList0.addAll(((Collection)hashMap1.get(class3)));
                            }
                            ++v2;
                        }
                        if(arrayList0 != null) {
                            hashMap1.put(class0, arrayList0);
                            v = 2;
                        }
                    }
                    else if(r.c(class1) != 1) {
                        arrayList0 = new ArrayList(((Collection)hashMap1.get(class1)));
                        arr_class = class0.getInterfaces();
                        v2 = 0;
                        goto label_58;
                    }
                }
            }
            else {
                hashMap1.put(class0, Collections.singletonList(constructor0));
                v = 2;
            }
        }
        hashMap0.put(class0, v);
        return v;
    }
}

