package com.spears.civilopedia.planning.logic.storage;

import J2.j;
import com.spears.civilopedia.planning.logic.Plot;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/spears/civilopedia/planning/logic/storage/SimplifiedPlot;", "", "Lcom/spears/civilopedia/planning/logic/Plot;", "plot", "Lcom/spears/civilopedia/planning/logic/Plot;", "a", "()Lcom/spears/civilopedia/planning/logic/Plot;", "", "", "position", "Ljava/util/List;", "b", "()Ljava/util/List;", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SimplifiedPlot {
    private final Plot plot;
    private final List position;

    public SimplifiedPlot(Plot plot0, List list0) {
        j.f(plot0, "plot");
        super();
        this.plot = plot0;
        this.position = list0;
    }

    public final Plot a() {
        return this.plot;
    }

    public final List b() {
        return this.position;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SimplifiedPlot)) {
            return false;
        }
        return j.a(this.plot, ((SimplifiedPlot)object0).plot) ? j.a(this.position, ((SimplifiedPlot)object0).position) : false;
    }

    @Override
    public final int hashCode() {
        return this.position.hashCode() + this.plot.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "SimplifiedPlot(plot=" + this.plot + ", position=" + this.position + ")";
    }
}

