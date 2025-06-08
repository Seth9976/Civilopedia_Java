package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\tJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ.\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001A\u0004\b\u001B\u0010\t¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7VictoryCinematics;", "Lo2/m;", "", "victoryType", "name", "victoryCinematicType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7VictoryCinematics;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVictoryType", "getName", "getVictoryCinematicType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7VictoryCinematics implements m {
    private final String name;
    private final String victoryCinematicType;
    private final String victoryType;

    public Civ7VictoryCinematics(String s, String s1, String s2) {
        j.f(s, "victoryType");
        j.f(s1, "name");
        j.f(s2, "victoryCinematicType");
        super();
        this.victoryType = s;
        this.name = s1;
        this.victoryCinematicType = s2;
    }

    public final String component1() {
        return this.victoryType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.victoryCinematicType;
    }

    public final Civ7VictoryCinematics copy(String s, String s1, String s2) {
        j.f(s, "victoryType");
        j.f(s1, "name");
        j.f(s2, "victoryCinematicType");
        return new Civ7VictoryCinematics(s, s1, s2);
    }

    public static Civ7VictoryCinematics copy$default(Civ7VictoryCinematics civ7VictoryCinematics0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7VictoryCinematics0.victoryType;
        }
        if((v & 2) != 0) {
            s1 = civ7VictoryCinematics0.name;
        }
        if((v & 4) != 0) {
            s2 = civ7VictoryCinematics0.victoryCinematicType;
        }
        return civ7VictoryCinematics0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7VictoryCinematics)) {
            return false;
        }
        if(!j.a(this.victoryType, ((Civ7VictoryCinematics)object0).victoryType)) {
            return false;
        }
        return j.a(this.name, ((Civ7VictoryCinematics)object0).name) ? j.a(this.victoryCinematicType, ((Civ7VictoryCinematics)object0).victoryCinematicType) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVictoryCinematicType() {
        return this.victoryCinematicType;
    }

    public final String getVictoryType() {
        return this.victoryType;
    }

    @Override
    public int hashCode() {
        return this.victoryCinematicType.hashCode() + f.b(this.victoryType.hashCode() * 0x1F, 0x1F, this.name);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.victoryType;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7VictoryCinematics(victoryType=", this.victoryType, ", name=", this.name, ", victoryCinematicType="), this.victoryCinematicType, ")");
    }
}

