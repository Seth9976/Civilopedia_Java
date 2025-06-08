package f0;

import A.c;
import android.content.Context;
import e0.b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k0.a;

public abstract class d {
    public final a a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;
    public static final String f;

    static {
        d.f = "WM-ConstraintTracker";
    }

    public d(Context context0, a a0) {
        this.c = new Object();
        this.d = new LinkedHashSet();
        this.b = context0.getApplicationContext();
        this.a = a0;
    }

    public abstract Object a();

    public final void b(b b0) {
        synchronized(this.c) {
            if(this.d.remove(b0) && this.d.isEmpty()) {
                this.e();
            }
        }
    }

    public final void c(Object object0) {
        synchronized(this.c) {
            if(this.e != object0 && (this.e == null || !this.e.equals(object0))) {
                this.e = object0;
                ArrayList arrayList0 = new ArrayList(this.d);
                ((c)((B1.a)this.a).l).execute(new B.a(this, arrayList0, 7, false));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}

