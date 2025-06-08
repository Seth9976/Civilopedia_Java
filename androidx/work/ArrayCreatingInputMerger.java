package androidx.work;

import O.i;
import Y.f;
import Y.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends h {
    @Override  // Y.h
    public final f a(ArrayList arrayList0) {
        Object object4;
        Object object6;
        i i0 = new i();
        HashMap hashMap0 = new HashMap();
        for(Object object0: arrayList0) {
            for(Object object1: Collections.unmodifiableMap(((f)object0).a).entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                Object object2 = ((Map.Entry)object1).getValue();
                Class class0 = object2.getClass();
                Object object3 = hashMap0.get(s);
                if(object3 != null) {
                    Class class1 = object3.getClass();
                    if(!class1.equals(class0)) {
                        if(!class1.isArray() || !class1.getComponentType().equals(class0)) {
                            if(!class0.isArray() || !class0.getComponentType().equals(class1)) {
                                throw new IllegalArgumentException();
                            }
                            int v3 = Array.getLength(object2);
                            object6 = Array.newInstance(object3.getClass(), v3 + 1);
                            System.arraycopy(object2, 0, object6, 0, v3);
                            Array.set(object6, v3, object3);
                        }
                        else {
                            int v2 = Array.getLength(object3);
                            object6 = Array.newInstance(object2.getClass(), v2 + 1);
                            System.arraycopy(object3, 0, object6, 0, v2);
                            Array.set(object6, v2, object2);
                        }
                        object2 = object6;
                    }
                    else if(class1.isArray()) {
                        int v = Array.getLength(object3);
                        int v1 = Array.getLength(object2);
                        Object object5 = Array.newInstance(object3.getClass().getComponentType(), v + v1);
                        System.arraycopy(object3, 0, object5, 0, v);
                        System.arraycopy(object2, 0, object5, v, v1);
                        object2 = object5;
                    }
                    else {
                        object4 = Array.newInstance(object3.getClass(), 2);
                        Array.set(object4, 0, object3);
                        Array.set(object4, 1, object2);
                        object2 = object4;
                    }
                }
                else if(!class0.isArray()) {
                    object4 = Array.newInstance(object2.getClass(), 1);
                    Array.set(object4, 0, object2);
                    object2 = object4;
                }
                hashMap0.put(s, object2);
            }
        }
        i0.a(hashMap0);
        f f0 = new f(i0.a);
        f.b(f0);
        return f0;
    }
}

