package m0;

import D1.b;
import f2.J;
import java.util.ArrayList;
import java.util.function.Consumer;

public final class o implements Consumer {
    public final int a;
    public final Object b;

    public o(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void accept(Object object0) {
        switch(this.a) {
            case 0: {
                ArrayList arrayList0 = new ArrayList();
                ((J)this.b).e(((e)object0), arrayList0);
                return;
            }
            case 1: {
                ((b)this.b).e(((e)object0));
                return;
            }
            default: {
                ((t)this.b).w(((e)object0));
            }
        }
    }
}

