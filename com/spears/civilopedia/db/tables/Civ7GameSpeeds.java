package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GameSpeeds;", "", "gameSpeedType", "", "costMultiplier", "", "description", "name", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCostMultiplier", "()I", "getDescription", "()Ljava/lang/String;", "getGameSpeedType", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GameSpeeds {
    private final int costMultiplier;
    private final String description;
    private final String gameSpeedType;
    private final String name;

    public Civ7GameSpeeds(String s, int v, String s1, String s2) {
        j.f(s, "gameSpeedType");
        j.f(s2, "name");
        super();
        this.gameSpeedType = s;
        this.costMultiplier = v;
        this.description = s1;
        this.name = s2;
    }

    public final String component1() {
        return this.gameSpeedType;
    }

    public final int component2() {
        return this.costMultiplier;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7GameSpeeds copy(String s, int v, String s1, String s2) {
        j.f(s, "gameSpeedType");
        j.f(s2, "name");
        return new Civ7GameSpeeds(s, v, s1, s2);
    }

    public static Civ7GameSpeeds copy$default(Civ7GameSpeeds civ7GameSpeeds0, String s, int v, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7GameSpeeds0.gameSpeedType;
        }
        if((v1 & 2) != 0) {
            v = civ7GameSpeeds0.costMultiplier;
        }
        if((v1 & 4) != 0) {
            s1 = civ7GameSpeeds0.description;
        }
        if((v1 & 8) != 0) {
            s2 = civ7GameSpeeds0.name;
        }
        return civ7GameSpeeds0.copy(s, v, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GameSpeeds)) {
            return false;
        }
        if(!j.a(this.gameSpeedType, ((Civ7GameSpeeds)object0).gameSpeedType)) {
            return false;
        }
        if(this.costMultiplier != ((Civ7GameSpeeds)object0).costMultiplier) {
            return false;
        }
        return j.a(this.description, ((Civ7GameSpeeds)object0).description) ? j.a(this.name, ((Civ7GameSpeeds)object0).name) : false;
    }

    public final int getCostMultiplier() {
        return this.costMultiplier;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGameSpeedType() {
        return this.gameSpeedType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = (this.gameSpeedType.hashCode() * 0x1F + this.costMultiplier) * 0x1F;
        return this.description == null ? this.name.hashCode() + v * 0x1F : this.name.hashCode() + (v + this.description.hashCode()) * 0x1F;
    }

    @Override
    public String toString() {
        return e.i(f.m(this.costMultiplier, "Civ7GameSpeeds(gameSpeedType=", this.gameSpeedType, ", costMultiplier=", ", description="), this.description, ", name=", this.name, ")");
    }
}

