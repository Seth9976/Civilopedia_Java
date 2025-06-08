package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7VisArt_PlotEffectModifiers;", "", "plotEffectSource", "", "plotEffectType", "addDelay", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAddDelay", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlotEffectSource", "()Ljava/lang/String;", "getPlotEffectType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ7VisArt_PlotEffectModifiers;", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7VisArt_PlotEffectModifiers {
    private final Double addDelay;
    private final String plotEffectSource;
    private final String plotEffectType;

    public Civ7VisArt_PlotEffectModifiers(String s, String s1, Double double0) {
        j.f(s, "plotEffectSource");
        j.f(s1, "plotEffectType");
        super();
        this.plotEffectSource = s;
        this.plotEffectType = s1;
        this.addDelay = double0;
    }

    public final String component1() {
        return this.plotEffectSource;
    }

    public final String component2() {
        return this.plotEffectType;
    }

    public final Double component3() {
        return this.addDelay;
    }

    public final Civ7VisArt_PlotEffectModifiers copy(String s, String s1, Double double0) {
        j.f(s, "plotEffectSource");
        j.f(s1, "plotEffectType");
        return new Civ7VisArt_PlotEffectModifiers(s, s1, double0);
    }

    public static Civ7VisArt_PlotEffectModifiers copy$default(Civ7VisArt_PlotEffectModifiers civ7VisArt_PlotEffectModifiers0, String s, String s1, Double double0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7VisArt_PlotEffectModifiers0.plotEffectSource;
        }
        if((v & 2) != 0) {
            s1 = civ7VisArt_PlotEffectModifiers0.plotEffectType;
        }
        if((v & 4) != 0) {
            double0 = civ7VisArt_PlotEffectModifiers0.addDelay;
        }
        return civ7VisArt_PlotEffectModifiers0.copy(s, s1, double0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7VisArt_PlotEffectModifiers)) {
            return false;
        }
        if(!j.a(this.plotEffectSource, ((Civ7VisArt_PlotEffectModifiers)object0).plotEffectSource)) {
            return false;
        }
        return j.a(this.plotEffectType, ((Civ7VisArt_PlotEffectModifiers)object0).plotEffectType) ? j.a(this.addDelay, ((Civ7VisArt_PlotEffectModifiers)object0).addDelay) : false;
    }

    public final Double getAddDelay() {
        return this.addDelay;
    }

    public final String getPlotEffectSource() {
        return this.plotEffectSource;
    }

    public final String getPlotEffectType() {
        return this.plotEffectType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.plotEffectSource.hashCode() * 0x1F, 0x1F, this.plotEffectType);
        return this.addDelay == null ? v : v + this.addDelay.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7VisArt_PlotEffectModifiers(plotEffectSource=", this.plotEffectSource, ", plotEffectType=", this.plotEffectType, ", addDelay=");
        stringBuilder0.append(this.addDelay);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

