package M3;

import I2.b;
import J2.j;
import java.util.Comparator;
import o2.C;

public final class u implements Comparator {
    public final b i;

    public u(b b0) {
        this.i = b0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        j.c(((w)object0));
        String s = this.i.b(((w)object0)).toString();
        j.c(((w)object1));
        return C.c(s, this.i.b(((w)object1)).toString());
    }
}

