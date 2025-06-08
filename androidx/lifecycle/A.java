package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class a {
    public final HashMap a;
    public final HashMap b;

    public a(HashMap hashMap0) {
        this.b = hashMap0;
        this.a = new HashMap();
        for(Object object0: hashMap0.entrySet()) {
            g g0 = (g)((Map.Entry)object0).getValue();
            List list0 = (List)this.a.get(g0);
            if(list0 == null) {
                list0 = new ArrayList();
                this.a.put(g0, list0);
            }
            list0.add(((Map.Entry)object0).getKey());
        }
    }

    public static void a(List list0, n n0, g g0, m m0) {
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                b b0 = (b)list0.get(v);
                b0.getClass();
                Method method0 = b0.b;
                try {
                    switch(b0.a) {
                        case 0: {
                            method0.invoke(m0, null);
                            continue;
                        }
                        case 1: {
                            method0.invoke(m0, n0);
                            continue;
                        }
                        case 2: {
                            method0.invoke(m0, n0, g0);
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                catch(InvocationTargetException invocationTargetException0) {
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException(illegalAccessException0);
                }
                throw new RuntimeException("Failed to call observer method", invocationTargetException0.getCause());
            }
        }
    }
}

