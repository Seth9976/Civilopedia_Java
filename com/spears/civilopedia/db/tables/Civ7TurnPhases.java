package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0005HÆ\u0003JN\u0010\u001B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001CJ\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001A\u00020\u0003HÖ\u0001J\t\u0010!\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000F¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TurnPhases;", "", "ID", "", "activeSegmentType", "", "inactiveSegmentType", "phaseOrder", "turnMode", "turnPhaseType", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActiveSegmentType", "()Ljava/lang/String;", "getInactiveSegmentType", "getPhaseOrder", "()I", "getTurnMode", "getTurnPhaseType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7TurnPhases;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TurnPhases {
    private final Integer ID;
    private final String activeSegmentType;
    private final String inactiveSegmentType;
    private final int phaseOrder;
    private final String turnMode;
    private final String turnPhaseType;

    public Civ7TurnPhases(Integer integer0, String s, String s1, int v, String s2, String s3) {
        j.f(s, "activeSegmentType");
        j.f(s2, "turnMode");
        j.f(s3, "turnPhaseType");
        super();
        this.ID = integer0;
        this.activeSegmentType = s;
        this.inactiveSegmentType = s1;
        this.phaseOrder = v;
        this.turnMode = s2;
        this.turnPhaseType = s3;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.activeSegmentType;
    }

    public final String component3() {
        return this.inactiveSegmentType;
    }

    public final int component4() {
        return this.phaseOrder;
    }

    public final String component5() {
        return this.turnMode;
    }

    public final String component6() {
        return this.turnPhaseType;
    }

    public final Civ7TurnPhases copy(Integer integer0, String s, String s1, int v, String s2, String s3) {
        j.f(s, "activeSegmentType");
        j.f(s2, "turnMode");
        j.f(s3, "turnPhaseType");
        return new Civ7TurnPhases(integer0, s, s1, v, s2, s3);
    }

    public static Civ7TurnPhases copy$default(Civ7TurnPhases civ7TurnPhases0, Integer integer0, String s, String s1, int v, String s2, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            integer0 = civ7TurnPhases0.ID;
        }
        if((v1 & 2) != 0) {
            s = civ7TurnPhases0.activeSegmentType;
        }
        if((v1 & 4) != 0) {
            s1 = civ7TurnPhases0.inactiveSegmentType;
        }
        if((v1 & 8) != 0) {
            v = civ7TurnPhases0.phaseOrder;
        }
        if((v1 & 16) != 0) {
            s2 = civ7TurnPhases0.turnMode;
        }
        if((v1 & 0x20) != 0) {
            s3 = civ7TurnPhases0.turnPhaseType;
        }
        return civ7TurnPhases0.copy(integer0, s, s1, v, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TurnPhases)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ7TurnPhases)object0).ID)) {
            return false;
        }
        if(!j.a(this.activeSegmentType, ((Civ7TurnPhases)object0).activeSegmentType)) {
            return false;
        }
        if(!j.a(this.inactiveSegmentType, ((Civ7TurnPhases)object0).inactiveSegmentType)) {
            return false;
        }
        if(this.phaseOrder != ((Civ7TurnPhases)object0).phaseOrder) {
            return false;
        }
        return j.a(this.turnMode, ((Civ7TurnPhases)object0).turnMode) ? j.a(this.turnPhaseType, ((Civ7TurnPhases)object0).turnPhaseType) : false;
    }

    public final String getActiveSegmentType() {
        return this.activeSegmentType;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getInactiveSegmentType() {
        return this.inactiveSegmentType;
    }

    public final int getPhaseOrder() {
        return this.phaseOrder;
    }

    public final String getTurnMode() {
        return this.turnMode;
    }

    public final String getTurnPhaseType() {
        return this.turnPhaseType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.activeSegmentType);
        String s = this.inactiveSegmentType;
        if(s != null) {
            v = s.hashCode();
        }
        return this.turnPhaseType.hashCode() + f.b(((v1 + v) * 0x1F + this.phaseOrder) * 0x1F, 0x1F, this.turnMode);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ7TurnPhases(ID=", this.ID, ", activeSegmentType=", this.activeSegmentType, ", inactiveSegmentType=");
        f.s(stringBuilder0, this.inactiveSegmentType, ", phaseOrder=", this.phaseOrder, ", turnMode=");
        return e.i(stringBuilder0, this.turnMode, ", turnPhaseType=", this.turnPhaseType, ")");
    }
}

