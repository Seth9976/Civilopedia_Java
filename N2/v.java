package n2;

import J2.j;
import com.spears.civilopedia.planning.logic.Plot;

public final class v {
    public final t a;
    public Plot b;

    public v(t t0, Plot plot0) {
        j.f(plot0, "plot");
        super();
        this.a = t0;
        this.b = plot0;
    }

    public static v a(v v0, Plot plot0) {
        v0.getClass();
        return new v(v0.a, plot0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        return j.a(this.a, ((v)object0).a) ? j.a(this.b, ((v)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "PlotWithPosition(position=" + this.a + ", plot=" + this.b + ")";
    }
}

