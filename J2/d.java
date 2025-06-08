package j2;

import J2.j;
import com.spears.civilopedia.db.tables.Types;
import java.text.Collator;
import java.util.Comparator;
import o2.f;
import o2.k;
import o2.t;
import o2.x;

public final class d implements Comparator {
    public final int i;
    public final Object j;

    public d(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.i) {
            case 0: {
                j.f(((b)this.j), "this$0");
                f f0 = ((b)this.j).m();
                j.c(((k)object0).d);
                Types types0 = (Types)f0.D1.h(((k)object0).d);
                f f1 = ((b)this.j).m();
                j.c(((k)object1).d);
                Types types1 = (Types)f1.D1.h(((k)object1).d);
                if(types0 != null && types1 != null) {
                    if(j.a(types0.getKind(), types1.getKind())) {
                        j.c(((k)object0).b);
                        j.c(((k)object1).b);
                        return Collator.getInstance().compare(((k)object0).b, ((k)object1).b);
                    }
                    return types0.getKind().compareTo(types1.getKind()) >= 0 ? 1 : -1;
                }
                return 1;
            }
            case 1: {
                j.f(((j2.f)this.j), "this$0");
                f f2 = ((j2.f)this.j).m();
                j.c(((k)object0).d);
                Types types2 = (Types)f2.D1.h(((k)object0).d);
                f f3 = ((j2.f)this.j).m();
                j.c(((k)object1).d);
                Types types3 = (Types)f3.D1.h(((k)object1).d);
                if(types2 != null && types3 != null) {
                    if(j.a(types2.getKind(), types3.getKind())) {
                        j.c(((k)object0).b);
                        j.c(((k)object1).b);
                        Collator.getInstance().compare(((k)object0).b, ((k)object1).b);
                        return 1;
                    }
                    return types2.getKind().compareTo(types3.getKind()) >= 0 ? 1 : -1;
                }
                return 1;
            }
            default: {
                j.f(((x)this.j), "this$0");
                return ((t)object0).d >= ((t)object1).d ? 1 : -1;
            }
        }
    }
}

