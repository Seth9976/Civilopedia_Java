package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0011JV\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001B\u001A\u00020\u001AH\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u00042\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010!\u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010#\u001A\u0004\b$\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010#\u001A\u0004\b%\u0010\u0011R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010#\u001A\u0004\b&\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010#\u001A\u0004\b\'\u0010\u0011R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\t\u0010#\u001A\u0004\b(\u0010\u0011R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010#\u001A\u0004\b)\u0010\u0011\u00A8\u0006*"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilizationLevels;", "Lo2/m;", "", "civilizationLevelType", "", "canBuildWonders", "canEarnGreatPeople", "canFoundCities", "canGiveInfluence", "canReceiveInfluence", "ignoresUnitStrategicResourceRequirements", "<init>", "(Ljava/lang/String;ZZZZZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ZZZZZZ)Lcom/spears/civilopedia/db/tables/Civ7CivilizationLevels;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCivilizationLevelType", "Z", "getCanBuildWonders", "getCanEarnGreatPeople", "getCanFoundCities", "getCanGiveInfluence", "getCanReceiveInfluence", "getIgnoresUnitStrategicResourceRequirements", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilizationLevels implements m {
    private final boolean canBuildWonders;
    private final boolean canEarnGreatPeople;
    private final boolean canFoundCities;
    private final boolean canGiveInfluence;
    private final boolean canReceiveInfluence;
    private final String civilizationLevelType;
    private final boolean ignoresUnitStrategicResourceRequirements;

    public Civ7CivilizationLevels(String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        j.f(s, "civilizationLevelType");
        super();
        this.civilizationLevelType = s;
        this.canBuildWonders = z;
        this.canEarnGreatPeople = z1;
        this.canFoundCities = z2;
        this.canGiveInfluence = z3;
        this.canReceiveInfluence = z4;
        this.ignoresUnitStrategicResourceRequirements = z5;
    }

    public final String component1() {
        return this.civilizationLevelType;
    }

    public final boolean component2() {
        return this.canBuildWonders;
    }

    public final boolean component3() {
        return this.canEarnGreatPeople;
    }

    public final boolean component4() {
        return this.canFoundCities;
    }

    public final boolean component5() {
        return this.canGiveInfluence;
    }

    public final boolean component6() {
        return this.canReceiveInfluence;
    }

    public final boolean component7() {
        return this.ignoresUnitStrategicResourceRequirements;
    }

    public final Civ7CivilizationLevels copy(String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        j.f(s, "civilizationLevelType");
        return new Civ7CivilizationLevels(s, z, z1, z2, z3, z4, z5);
    }

    public static Civ7CivilizationLevels copy$default(Civ7CivilizationLevels civ7CivilizationLevels0, String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7CivilizationLevels0.civilizationLevelType;
        }
        if((v & 2) != 0) {
            z = civ7CivilizationLevels0.canBuildWonders;
        }
        if((v & 4) != 0) {
            z1 = civ7CivilizationLevels0.canEarnGreatPeople;
        }
        if((v & 8) != 0) {
            z2 = civ7CivilizationLevels0.canFoundCities;
        }
        if((v & 16) != 0) {
            z3 = civ7CivilizationLevels0.canGiveInfluence;
        }
        if((v & 0x20) != 0) {
            z4 = civ7CivilizationLevels0.canReceiveInfluence;
        }
        if((v & 0x40) != 0) {
            z5 = civ7CivilizationLevels0.ignoresUnitStrategicResourceRequirements;
        }
        return civ7CivilizationLevels0.copy(s, z, z1, z2, z3, z4, z5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilizationLevels)) {
            return false;
        }
        if(!j.a(this.civilizationLevelType, ((Civ7CivilizationLevels)object0).civilizationLevelType)) {
            return false;
        }
        if(this.canBuildWonders != ((Civ7CivilizationLevels)object0).canBuildWonders) {
            return false;
        }
        if(this.canEarnGreatPeople != ((Civ7CivilizationLevels)object0).canEarnGreatPeople) {
            return false;
        }
        if(this.canFoundCities != ((Civ7CivilizationLevels)object0).canFoundCities) {
            return false;
        }
        if(this.canGiveInfluence != ((Civ7CivilizationLevels)object0).canGiveInfluence) {
            return false;
        }
        return this.canReceiveInfluence == ((Civ7CivilizationLevels)object0).canReceiveInfluence ? this.ignoresUnitStrategicResourceRequirements == ((Civ7CivilizationLevels)object0).ignoresUnitStrategicResourceRequirements : false;
    }

    public final boolean getCanBuildWonders() {
        return this.canBuildWonders;
    }

    public final boolean getCanEarnGreatPeople() {
        return this.canEarnGreatPeople;
    }

    public final boolean getCanFoundCities() {
        return this.canFoundCities;
    }

    public final boolean getCanGiveInfluence() {
        return this.canGiveInfluence;
    }

    public final boolean getCanReceiveInfluence() {
        return this.canReceiveInfluence;
    }

    public final String getCivilizationLevelType() {
        return this.civilizationLevelType;
    }

    public final boolean getIgnoresUnitStrategicResourceRequirements() {
        return this.ignoresUnitStrategicResourceRequirements;
    }

    @Override
    public int hashCode() {
        int v = this.civilizationLevelType.hashCode();
        int v1 = 0x4D5;
        int v2 = this.canBuildWonders ? 0x4CF : 0x4D5;
        int v3 = this.canEarnGreatPeople ? 0x4CF : 0x4D5;
        int v4 = this.canFoundCities ? 0x4CF : 0x4D5;
        int v5 = this.canGiveInfluence ? 0x4CF : 0x4D5;
        int v6 = this.canReceiveInfluence ? 0x4CF : 0x4D5;
        if(this.ignoresUnitStrategicResourceRequirements) {
            v1 = 0x4CF;
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.civilizationLevelType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7CivilizationLevels(civilizationLevelType=", this.civilizationLevelType, this.canBuildWonders, ", canBuildWonders=", ", canEarnGreatPeople=");
        u9.A(stringBuilder0, this.canEarnGreatPeople, ", canFoundCities=", this.canFoundCities, ", canGiveInfluence=");
        u9.A(stringBuilder0, this.canGiveInfluence, ", canReceiveInfluence=", this.canReceiveInfluence, ", ignoresUnitStrategicResourceRequirements=");
        return u9.g(stringBuilder0, this.ignoresUnitStrategicResourceRequirements, ")");
    }
}

