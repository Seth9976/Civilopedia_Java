package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMapStartPositions;", "", "map", "", "plot", "", "type", "value", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getMap", "()Ljava/lang/String;", "getPlot", "()I", "getType", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMapStartPositions {
    private final String map;
    private final int plot;
    private final String type;
    private final String value;

    public FrontendMapStartPositions(String s, int v, String s1, String s2) {
        j.f(s, "map");
        j.f(s1, "type");
        super();
        this.map = s;
        this.plot = v;
        this.type = s1;
        this.value = s2;
    }

    public final String component1() {
        return this.map;
    }

    public final int component2() {
        return this.plot;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.value;
    }

    public final FrontendMapStartPositions copy(String s, int v, String s1, String s2) {
        j.f(s, "map");
        j.f(s1, "type");
        return new FrontendMapStartPositions(s, v, s1, s2);
    }

    public static FrontendMapStartPositions copy$default(FrontendMapStartPositions frontendMapStartPositions0, String s, int v, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendMapStartPositions0.map;
        }
        if((v1 & 2) != 0) {
            v = frontendMapStartPositions0.plot;
        }
        if((v1 & 4) != 0) {
            s1 = frontendMapStartPositions0.type;
        }
        if((v1 & 8) != 0) {
            s2 = frontendMapStartPositions0.value;
        }
        return frontendMapStartPositions0.copy(s, v, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendMapStartPositions)) {
            return false;
        }
        if(!j.a(this.map, ((FrontendMapStartPositions)object0).map)) {
            return false;
        }
        if(this.plot != ((FrontendMapStartPositions)object0).plot) {
            return false;
        }
        return j.a(this.type, ((FrontendMapStartPositions)object0).type) ? j.a(this.value, ((FrontendMapStartPositions)object0).value) : false;
    }

    public final String getMap() {
        return this.map;
    }

    public final int getPlot() {
        return this.plot;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = f.b((this.map.hashCode() * 0x1F + this.plot) * 0x1F, 0x1F, this.type);
        return this.value == null ? v : v + this.value.hashCode();
    }

    @Override
    public String toString() {
        return e.i(f.m(this.plot, "FrontendMapStartPositions(map=", this.map, ", plot=", ", type="), this.type, ", value=", this.value, ")");
    }
}

