package androidx.work;

import O.i;
import Y.f;
import Y.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public final class OverwritingInputMerger extends h {
    @Override  // Y.h
    public final f a(ArrayList arrayList0) {
        i i0 = new i();
        HashMap hashMap0 = new HashMap();
        for(Object object0: arrayList0) {
            hashMap0.putAll(Collections.unmodifiableMap(((f)object0).a));
        }
        i0.a(hashMap0);
        f f0 = new f(i0.a);
        f.b(f0);
        return f0;
    }
}

