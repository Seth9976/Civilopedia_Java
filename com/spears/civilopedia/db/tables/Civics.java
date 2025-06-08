package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001E\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0007\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0007\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0013J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0013J\u0010\u0010\u001C\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0013J\u0010\u0010 \u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u0013J\u0086\u0001\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00072\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00072\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u0013J\u0010\u0010%\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u0017J\u001A\u0010(\u001A\u00020\u00072\b\u0010\'\u001A\u0004\u0018\u00010&H\u00D6\u0003\u00A2\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010*\u001A\u0004\b+\u0010\u0013R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010*\u001A\u0004\b,\u0010\u0013R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010-\u001A\u0004\b.\u0010\u0017R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b\b\u0010/\u001A\u0004\b0\u0010\u0019R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010*\u001A\u0004\b1\u0010\u0013R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010*\u001A\u0004\b2\u0010\u0013R\u0017\u0010\u000B\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010/\u001A\u0004\b3\u0010\u0019R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\f\u00104\u001A\u0004\b5\u0010\u001ER\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\r\u0010*\u001A\u0004\b6\u0010\u0013R\u0017\u0010\u000E\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010/\u001A\u0004\b7\u0010\u0019R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010*\u001A\u0004\b8\u0010\u0013\u00A8\u00069"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civics;", "Lo2/m;", "", "civicType", "name", "", "cost", "", "repeatable", "description", "eraType", "barbarianFree", "uITreeRow", "advisorType", "embarkAll", "embarkUnitType", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "()Z", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civics;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCivicType", "getName", "I", "getCost", "Z", "getRepeatable", "getDescription", "getEraType", "getBarbarianFree", "Ljava/lang/Integer;", "getUITreeRow", "getAdvisorType", "getEmbarkAll", "getEmbarkUnitType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civics implements m {
    private final String advisorType;
    private final boolean barbarianFree;
    private final String civicType;
    private final int cost;
    private final String description;
    private final boolean embarkAll;
    private final String embarkUnitType;
    private final String eraType;
    private final String name;
    private final boolean repeatable;
    private final Integer uITreeRow;

    public Civics(String s, String s1, int v, boolean z, String s2, String s3, boolean z1, Integer integer0, String s4, boolean z2, String s5) {
        j.f(s, "civicType");
        j.f(s1, "name");
        j.f(s3, "eraType");
        super();
        this.civicType = s;
        this.name = s1;
        this.cost = v;
        this.repeatable = z;
        this.description = s2;
        this.eraType = s3;
        this.barbarianFree = z1;
        this.uITreeRow = integer0;
        this.advisorType = s4;
        this.embarkAll = z2;
        this.embarkUnitType = s5;
    }

    public final String component1() {
        return this.civicType;
    }

    public final boolean component10() {
        return this.embarkAll;
    }

    public final String component11() {
        return this.embarkUnitType;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.cost;
    }

    public final boolean component4() {
        return this.repeatable;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.eraType;
    }

    public final boolean component7() {
        return this.barbarianFree;
    }

    public final Integer component8() {
        return this.uITreeRow;
    }

    public final String component9() {
        return this.advisorType;
    }

    public final Civics copy(String s, String s1, int v, boolean z, String s2, String s3, boolean z1, Integer integer0, String s4, boolean z2, String s5) {
        j.f(s, "civicType");
        j.f(s1, "name");
        j.f(s3, "eraType");
        return new Civics(s, s1, v, z, s2, s3, z1, integer0, s4, z2, s5);
    }

    public static Civics copy$default(Civics civics0, String s, String s1, int v, boolean z, String s2, String s3, boolean z1, Integer integer0, String s4, boolean z2, String s5, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : civics0.civicType;
        String s7 = (v1 & 2) == 0 ? s1 : civics0.name;
        int v2 = (v1 & 4) == 0 ? v : civics0.cost;
        boolean z3 = (v1 & 8) == 0 ? z : civics0.repeatable;
        String s8 = (v1 & 16) == 0 ? s2 : civics0.description;
        String s9 = (v1 & 0x20) == 0 ? s3 : civics0.eraType;
        boolean z4 = (v1 & 0x40) == 0 ? z1 : civics0.barbarianFree;
        Integer integer1 = (v1 & 0x80) == 0 ? integer0 : civics0.uITreeRow;
        String s10 = (v1 & 0x100) == 0 ? s4 : civics0.advisorType;
        boolean z5 = (v1 & 0x200) == 0 ? z2 : civics0.embarkAll;
        return (v1 & 0x400) == 0 ? civics0.copy(s6, s7, v2, z3, s8, s9, z4, integer1, s10, z5, s5) : civics0.copy(s6, s7, v2, z3, s8, s9, z4, integer1, s10, z5, civics0.embarkUnitType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civics)) {
            return false;
        }
        if(!j.a(this.civicType, ((Civics)object0).civicType)) {
            return false;
        }
        if(!j.a(this.name, ((Civics)object0).name)) {
            return false;
        }
        if(this.cost != ((Civics)object0).cost) {
            return false;
        }
        if(this.repeatable != ((Civics)object0).repeatable) {
            return false;
        }
        if(!j.a(this.description, ((Civics)object0).description)) {
            return false;
        }
        if(!j.a(this.eraType, ((Civics)object0).eraType)) {
            return false;
        }
        if(this.barbarianFree != ((Civics)object0).barbarianFree) {
            return false;
        }
        if(!j.a(this.uITreeRow, ((Civics)object0).uITreeRow)) {
            return false;
        }
        if(!j.a(this.advisorType, ((Civics)object0).advisorType)) {
            return false;
        }
        return this.embarkAll == ((Civics)object0).embarkAll ? j.a(this.embarkUnitType, ((Civics)object0).embarkUnitType) : false;
    }

    public final String getAdvisorType() {
        return this.advisorType;
    }

    public final boolean getBarbarianFree() {
        return this.barbarianFree;
    }

    public final String getCivicType() {
        return this.civicType;
    }

    public final int getCost() {
        return this.cost;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEmbarkAll() {
        return this.embarkAll;
    }

    public final String getEmbarkUnitType() {
        return this.embarkUnitType;
    }

    public final String getEraType() {
        return this.eraType;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getRepeatable() {
        return this.repeatable;
    }

    public final Integer getUITreeRow() {
        return this.uITreeRow;
    }

    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = 0;
        int v2 = f.b((((f.b(this.civicType.hashCode() * 0x1F, 0x1F, this.name) + this.cost) * 0x1F + (this.repeatable ? 0x4CF : 0x4D5)) * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F, 0x1F, this.eraType);
        int v3 = this.barbarianFree ? 0x4CF : 0x4D5;
        int v4 = this.uITreeRow == null ? 0 : this.uITreeRow.hashCode();
        int v5 = this.advisorType == null ? 0 : this.advisorType.hashCode();
        if(this.embarkAll) {
            v = 0x4CF;
        }
        String s = this.embarkUnitType;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v) * 0x1F + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.civicType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civics(civicType=", this.civicType, ", name=", this.name, ", cost=");
        u9.r(stringBuilder0, this.cost, ", repeatable=", this.repeatable, ", description=");
        f.t(stringBuilder0, this.description, ", eraType=", this.eraType, ", barbarianFree=");
        stringBuilder0.append(this.barbarianFree);
        stringBuilder0.append(", uITreeRow=");
        stringBuilder0.append(this.uITreeRow);
        stringBuilder0.append(", advisorType=");
        u9.x(stringBuilder0, this.advisorType, ", embarkAll=", this.embarkAll, ", embarkUnitType=");
        return e.h(stringBuilder0, this.embarkUnitType, ")");
    }
}

