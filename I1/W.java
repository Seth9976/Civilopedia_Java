package i1;

import com.google.android.gms.measurement.internal.zzgw;
import java.util.concurrent.Callable;

public final class w implements Callable {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final zzgw e;

    public w(zzgw zzgw0, String s, String s1, String s2, int v) {
        this.a = v;
        this.e = zzgw0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                this.e.i.a();
                return this.e.i.zzi().B(this.b, this.c, this.d);
            }
            case 1: {
                this.e.i.a();
                return this.e.i.zzi().B(this.b, this.c, this.d);
            }
            case 2: {
                this.e.i.a();
                return this.e.i.zzi().y(this.b, this.c, this.d);
            }
            default: {
                this.e.i.a();
                return this.e.i.zzi().y(this.b, this.c, this.d);
            }
        }
    }
}

