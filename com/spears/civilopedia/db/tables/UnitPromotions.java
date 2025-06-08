package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u000EJ\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJ\u0010\u0010\u0016\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0013JZ\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0013J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010 \u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010 \u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010$\u001A\u0004\b%\u0010\u0013R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010 \u001A\u0004\b&\u0010\u000ER\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010 \u001A\u0004\b\'\u0010\u000ER\u0017\u0010\n\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\n\u0010$\u001A\u0004\b(\u0010\u0013\u00A8\u0006)"}, d2 = {"Lcom/spears/civilopedia/db/tables/UnitPromotions;", "Lo2/m;", "", "unitPromotionType", "name", "description", "", "level", "specialization", "promotionClass", "column", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/UnitPromotions;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnitPromotionType", "getName", "getDescription", "I", "getLevel", "getSpecialization", "getPromotionClass", "getColumn", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UnitPromotions implements m {
    private final int column;
    private final String description;
    private final int level;
    private final String name;
    private final String promotionClass;
    private final String specialization;
    private final String unitPromotionType;

    public UnitPromotions(String s, String s1, String s2, int v, String s3, String s4, int v1) {
        j.f(s, "unitPromotionType");
        j.f(s1, "name");
        j.f(s2, "description");
        super();
        this.unitPromotionType = s;
        this.name = s1;
        this.description = s2;
        this.level = v;
        this.specialization = s3;
        this.promotionClass = s4;
        this.column = v1;
    }

    public final String component1() {
        return this.unitPromotionType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.level;
    }

    public final String component5() {
        return this.specialization;
    }

    public final String component6() {
        return this.promotionClass;
    }

    public final int component7() {
        return this.column;
    }

    public final UnitPromotions copy(String s, String s1, String s2, int v, String s3, String s4, int v1) {
        j.f(s, "unitPromotionType");
        j.f(s1, "name");
        j.f(s2, "description");
        return new UnitPromotions(s, s1, s2, v, s3, s4, v1);
    }

    public static UnitPromotions copy$default(UnitPromotions unitPromotions0, String s, String s1, String s2, int v, String s3, String s4, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = unitPromotions0.unitPromotionType;
        }
        if((v2 & 2) != 0) {
            s1 = unitPromotions0.name;
        }
        if((v2 & 4) != 0) {
            s2 = unitPromotions0.description;
        }
        if((v2 & 8) != 0) {
            v = unitPromotions0.level;
        }
        if((v2 & 16) != 0) {
            s3 = unitPromotions0.specialization;
        }
        if((v2 & 0x20) != 0) {
            s4 = unitPromotions0.promotionClass;
        }
        if((v2 & 0x40) != 0) {
            v1 = unitPromotions0.column;
        }
        return unitPromotions0.copy(s, s1, s2, v, s3, s4, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UnitPromotions)) {
            return false;
        }
        if(!j.a(this.unitPromotionType, ((UnitPromotions)object0).unitPromotionType)) {
            return false;
        }
        if(!j.a(this.name, ((UnitPromotions)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((UnitPromotions)object0).description)) {
            return false;
        }
        if(this.level != ((UnitPromotions)object0).level) {
            return false;
        }
        if(!j.a(this.specialization, ((UnitPromotions)object0).specialization)) {
            return false;
        }
        return j.a(this.promotionClass, ((UnitPromotions)object0).promotionClass) ? this.column == ((UnitPromotions)object0).column : false;
    }

    public final int getColumn() {
        return this.column;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPromotionClass() {
        return this.promotionClass;
    }

    public final String getSpecialization() {
        return this.specialization;
    }

    public final String getUnitPromotionType() {
        return this.unitPromotionType;
    }

    @Override
    public int hashCode() {
        int v = (f.b(f.b(this.unitPromotionType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.description) + this.level) * 0x1F;
        int v1 = 0;
        int v2 = this.specialization == null ? 0 : this.specialization.hashCode();
        String s = this.promotionClass;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + this.column;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.unitPromotionType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("UnitPromotions(unitPromotionType=", this.unitPromotionType, ", name=", this.name, ", description=");
        f.s(stringBuilder0, this.description, ", level=", this.level, ", specialization=");
        f.t(stringBuilder0, this.specialization, ", promotionClass=", this.promotionClass, ", column=");
        return e.g(stringBuilder0, this.column, ")");
    }
}

