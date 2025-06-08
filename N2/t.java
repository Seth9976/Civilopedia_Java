package n2;

import J2.j;
import O2.A;
import com.spears.civilopedia.planning.logic.Plot;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o2.J;
import x2.f;

public final class t implements Serializable {
    public int i;
    public int j;

    public t(int v, int v1) {
        this.i = v;
        this.j = v1;
    }

    public t(List list0) {
        j.f(list0, "array");
        this(((Number)list0.get(0)).intValue(), ((Number)list0.get(1)).intValue());
    }

    public static t a(t t0) {
        int v = t0.i;
        int v1 = t0.j;
        t0.getClass();
        return new t(v, v1);
    }

    public final int b(t t0) {
        j.f(t0, "to");
        int v = Math.abs(this.i - t0.i);
        int v1 = (v + 1 - (this.i & 1)) / 2;
        Integer integer0 = (int)(this.j - v1);
        Integer integer1 = (int)(this.j + v - v1);
        if(integer0.intValue() > t0.j) {
            return integer0.intValue() + v - t0.j;
        }
        return integer1.intValue() >= t0.j ? v : v + t0.j - integer1.intValue();
    }

    public final J c() {
        int v;
        if((this.i & 1) == 1) {
            Plot.Companion.getClass();
            v = Plot.itemSize.getWidth() / 2;
        }
        else {
            v = 0;
        }
        double f = (double)this.j;
        Plot.Companion.getClass();
        return new J(f * ((double)Plot.itemSize.getWidth()) + ((double)v), 0.0 * ((double)this.i) * 3.0 / 4.0, ((double)Plot.itemSize.getWidth()), ((double)Plot.itemSize.getHeight()));
    }

    public final ArrayList d(ArrayList arrayList0) {
        n2.j[] arr_j = n2.j.values();
        j.f(arr_j, "<this>");
        ArrayList arrayList1 = new ArrayList(new f(arr_j, false));
        ArrayList arrayList2 = new ArrayList();
        for(Object object0: arrayList0) {
            if(((t)object0).b(this) == 1) {
                arrayList2.add(object0);
            }
        }
        for(Object object1: arrayList2) {
            arrayList1.remove(A.T(this, ((t)object1)));
        }
        return arrayList1;
    }

    public final List e() {
        return x2.j.z(new Integer[]{this.i, this.j});
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof t && this.i == ((t)object0).i && this.j == ((t)object0).j;
    }

    @Override
    public final int hashCode() {
        return this.i * 0x1F + this.j;
    }

    @Override
    public final String toString() {
        return "PlotPosition(row=" + this.i + ", column=" + this.j + ")";
    }
}

