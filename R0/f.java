package r0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import g1.n;
import java.util.HashMap;

public final class f {
    public final n a;
    public final d b;
    public final HashMap c;

    public f(Context context0, d d0) {
        n n0 = new n(context0, 22);
        super();
        this.c = new HashMap();
        this.a = n0;
        this.b = d0;
    }

    public final g a(String s) {
        synchronized(this) {
            if(this.c.containsKey(s)) {
                return (g)this.c.get(s);
            }
            CctBackendFactory cctBackendFactory0 = this.a.f(s);
            if(cctBackendFactory0 == null) {
                return null;
            }
            g g1 = cctBackendFactory0.create(new b(this.b.a, this.b.b, this.b.c, s));
            this.c.put(s, g1);
            return g1;
        }
    }
}

