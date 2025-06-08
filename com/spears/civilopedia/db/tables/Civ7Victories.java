package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u001C\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\u0006\u0010\u000B\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u0019\u001A\u00020\u0006H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\u0006H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J[\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\u0003H\u00C6\u0001J\u0013\u0010 \u001A\u00020\u00062\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010\"\u001A\u00020#H\u00D6\u0001J\t\u0010$\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000ER\u0011\u0010\t\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0011\u0010\n\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000B\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E\u00A8\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Victories;", "", "victoryType", "", "description", "enabledByDefault", "", "legacyPathClassType", "name", "requirementSetId", "requiresMultipleTeams", "victoryClassType", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getEnabledByDefault", "()Z", "getLegacyPathClassType", "getName", "getRequirementSetId", "getRequiresMultipleTeams", "getVictoryClassType", "getVictoryType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Victories {
    private final String description;
    private final boolean enabledByDefault;
    private final String legacyPathClassType;
    private final String name;
    private final String requirementSetId;
    private final boolean requiresMultipleTeams;
    private final String victoryClassType;
    private final String victoryType;

    public Civ7Victories(String s, String s1, boolean z, String s2, String s3, String s4, boolean z1, String s5) {
        j.f(s, "victoryType");
        j.f(s2, "legacyPathClassType");
        j.f(s3, "name");
        j.f(s4, "requirementSetId");
        j.f(s5, "victoryClassType");
        super();
        this.victoryType = s;
        this.description = s1;
        this.enabledByDefault = z;
        this.legacyPathClassType = s2;
        this.name = s3;
        this.requirementSetId = s4;
        this.requiresMultipleTeams = z1;
        this.victoryClassType = s5;
    }

    public final String component1() {
        return this.victoryType;
    }

    public final String component2() {
        return this.description;
    }

    public final boolean component3() {
        return this.enabledByDefault;
    }

    public final String component4() {
        return this.legacyPathClassType;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.requirementSetId;
    }

    public final boolean component7() {
        return this.requiresMultipleTeams;
    }

    public final String component8() {
        return this.victoryClassType;
    }

    public final Civ7Victories copy(String s, String s1, boolean z, String s2, String s3, String s4, boolean z1, String s5) {
        j.f(s, "victoryType");
        j.f(s2, "legacyPathClassType");
        j.f(s3, "name");
        j.f(s4, "requirementSetId");
        j.f(s5, "victoryClassType");
        return new Civ7Victories(s, s1, z, s2, s3, s4, z1, s5);
    }

    public static Civ7Victories copy$default(Civ7Victories civ7Victories0, String s, String s1, boolean z, String s2, String s3, String s4, boolean z1, String s5, int v, Object object0) {
        String s6 = (v & 1) == 0 ? s : civ7Victories0.victoryType;
        String s7 = (v & 2) == 0 ? s1 : civ7Victories0.description;
        boolean z2 = (v & 4) == 0 ? z : civ7Victories0.enabledByDefault;
        String s8 = (v & 8) == 0 ? s2 : civ7Victories0.legacyPathClassType;
        String s9 = (v & 16) == 0 ? s3 : civ7Victories0.name;
        String s10 = (v & 0x20) == 0 ? s4 : civ7Victories0.requirementSetId;
        boolean z3 = (v & 0x40) == 0 ? z1 : civ7Victories0.requiresMultipleTeams;
        return (v & 0x80) == 0 ? civ7Victories0.copy(s6, s7, z2, s8, s9, s10, z3, s5) : civ7Victories0.copy(s6, s7, z2, s8, s9, s10, z3, civ7Victories0.victoryClassType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Victories)) {
            return false;
        }
        if(!j.a(this.victoryType, ((Civ7Victories)object0).victoryType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Victories)object0).description)) {
            return false;
        }
        if(this.enabledByDefault != ((Civ7Victories)object0).enabledByDefault) {
            return false;
        }
        if(!j.a(this.legacyPathClassType, ((Civ7Victories)object0).legacyPathClassType)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7Victories)object0).name)) {
            return false;
        }
        if(!j.a(this.requirementSetId, ((Civ7Victories)object0).requirementSetId)) {
            return false;
        }
        return this.requiresMultipleTeams == ((Civ7Victories)object0).requiresMultipleTeams ? j.a(this.victoryClassType, ((Civ7Victories)object0).victoryClassType) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    public final String getLegacyPathClassType() {
        return this.legacyPathClassType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequirementSetId() {
        return this.requirementSetId;
    }

    public final boolean getRequiresMultipleTeams() {
        return this.requiresMultipleTeams;
    }

    public final String getVictoryClassType() {
        return this.victoryClassType;
    }

    public final String getVictoryType() {
        return this.victoryType;
    }

    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = f.b(f.b(f.b(((this.victoryType.hashCode() * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.enabledByDefault ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.legacyPathClassType), 0x1F, this.name), 0x1F, this.requirementSetId);
        if(this.requiresMultipleTeams) {
            v = 0x4CF;
        }
        return this.victoryClassType.hashCode() + (v1 + v) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Victories(victoryType=", this.victoryType, ", description=", this.description, ", enabledByDefault=");
        u9.z(stringBuilder0, this.enabledByDefault, ", legacyPathClassType=", this.legacyPathClassType, ", name=");
        f.t(stringBuilder0, this.name, ", requirementSetId=", this.requirementSetId, ", requiresMultipleTeams=");
        stringBuilder0.append(this.requiresMultipleTeams);
        stringBuilder0.append(", victoryClassType=");
        stringBuilder0.append(this.victoryClassType);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

