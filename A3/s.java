package a3;

import I2.a;
import J2.j;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import q3.P;
import q3.Q;
import q3.X;
import x2.k;

public final class s implements a, RemoteCall {
    public final List i;

    public s(List list0) {
        this.i = list0;
        super();
    }

    public s(X x0) {
        j.f(x0, "typeTable");
        super();
        List list0 = x0.k;
        if((x0.j & 1) == 1) {
            int v = x0.l;
            j.e(list0, "getTypeList(...)");
            ArrayList arrayList0 = new ArrayList(k.E(list0));
            int v1 = 0;
            for(Object object0: list0) {
                if(v1 >= 0) {
                    Q q0 = (Q)object0;
                    if(v1 >= v) {
                        q0.getClass();
                        P p0 = Q.r(q0);
                        p0.l |= 2;
                        p0.n = true;
                        q0 = p0.g();
                        if(!q0.b()) {
                            throw new UninitializedMessageException();
                        }
                    }
                    arrayList0.add(q0);
                    ++v1;
                    continue;
                }
                x2.j.D();
                throw null;
            }
            list0 = arrayList0;
        }
        j.e(list0, "run(...)");
        this.i = list0;
    }

    public Q a(int v) {
        return (Q)this.i.get(v);
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object object0, Object object1) {
        g1.k k0 = new g1.k(((TaskCompletionSource)object1));
        ((zzaz)object0).zzy(this.i, k0);
    }

    @Override  // I2.a
    public Object invoke() {
        return this.i;
    }
}

