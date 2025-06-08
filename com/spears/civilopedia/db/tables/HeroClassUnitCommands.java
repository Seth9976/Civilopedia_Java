package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000BJ.\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/HeroClassUnitCommands;", "", "heroClassType", "", "unitCommandType", "passive", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHeroClassType", "()Ljava/lang/String;", "getPassive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUnitCommandType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/HeroClassUnitCommands;", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HeroClassUnitCommands {
    private final String heroClassType;
    private final Boolean passive;
    private final String unitCommandType;

    public HeroClassUnitCommands(String s, String s1, Boolean boolean0) {
        j.f(s, "heroClassType");
        j.f(s1, "unitCommandType");
        super();
        this.heroClassType = s;
        this.unitCommandType = s1;
        this.passive = boolean0;
    }

    public final String component1() {
        return this.heroClassType;
    }

    public final String component2() {
        return this.unitCommandType;
    }

    public final Boolean component3() {
        return this.passive;
    }

    public final HeroClassUnitCommands copy(String s, String s1, Boolean boolean0) {
        j.f(s, "heroClassType");
        j.f(s1, "unitCommandType");
        return new HeroClassUnitCommands(s, s1, boolean0);
    }

    public static HeroClassUnitCommands copy$default(HeroClassUnitCommands heroClassUnitCommands0, String s, String s1, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            s = heroClassUnitCommands0.heroClassType;
        }
        if((v & 2) != 0) {
            s1 = heroClassUnitCommands0.unitCommandType;
        }
        if((v & 4) != 0) {
            boolean0 = heroClassUnitCommands0.passive;
        }
        return heroClassUnitCommands0.copy(s, s1, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HeroClassUnitCommands)) {
            return false;
        }
        if(!j.a(this.heroClassType, ((HeroClassUnitCommands)object0).heroClassType)) {
            return false;
        }
        return j.a(this.unitCommandType, ((HeroClassUnitCommands)object0).unitCommandType) ? j.a(this.passive, ((HeroClassUnitCommands)object0).passive) : false;
    }

    public final String getHeroClassType() {
        return this.heroClassType;
    }

    public final Boolean getPassive() {
        return this.passive;
    }

    public final String getUnitCommandType() {
        return this.unitCommandType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.heroClassType.hashCode() * 0x1F, 0x1F, this.unitCommandType);
        return this.passive == null ? v : v + this.passive.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("HeroClassUnitCommands(heroClassType=", this.heroClassType, ", unitCommandType=", this.unitCommandType, ", passive=");
        stringBuilder0.append(this.passive);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

