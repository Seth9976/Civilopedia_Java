package Z;

import Y.b;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import h0.i;
import java.util.ArrayList;
import java.util.List;

public abstract class d {
    public static final String a;

    static {
        d.a = "WM-Schedulers";
    }

    public static void a(b b0, WorkDatabase workDatabase0, List list0) {
        ArrayList arrayList1;
        ArrayList arrayList0;
        if(list0 != null && list0.size() != 0) {
            E1.d d0 = workDatabase0.n();
            workDatabase0.c();
            try {
                arrayList0 = d0.f((Build.VERSION.SDK_INT == 23 ? b0.h / 2 : b0.h));
                arrayList1 = d0.d();
                if(arrayList0.size() > 0) {
                    long v1 = System.currentTimeMillis();
                    for(Object object0: arrayList0) {
                        d0.o(((i)object0).a, v1);
                    }
                }
                workDatabase0.h();
            }
            finally {
                workDatabase0.f();
            }
            if(arrayList0.size() > 0) {
                i[] arr_i = (i[])arrayList0.toArray(new i[arrayList0.size()]);
                for(Object object1: list0) {
                    c c0 = (c)object1;
                    if(c0.f()) {
                        c0.d(arr_i);
                    }
                }
            }
            if(arrayList1.size() > 0) {
                i[] arr_i1 = (i[])arrayList1.toArray(new i[arrayList1.size()]);
                for(Object object2: list0) {
                    c c1 = (c)object2;
                    if(!c1.f()) {
                        c1.d(arr_i1);
                    }
                }
            }
        }
    }
}

