package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitPromotionClassSets;", "", "promotionClassType", "", "unitPromotionDisciplineType", "(Ljava/lang/String;Ljava/lang/String;)V", "getPromotionClassType", "()Ljava/lang/String;", "getUnitPromotionDisciplineType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitPromotionClassSets {
    private final String promotionClassType;
    private final String unitPromotionDisciplineType;

    public Civ7UnitPromotionClassSets(String s, String s1) {
        j.f(s, "promotionClassType");
        j.f(s1, "unitPromotionDisciplineType");
        super();
        this.promotionClassType = s;
        this.unitPromotionDisciplineType = s1;
    }

    public final String component1() {
        return this.promotionClassType;
    }

    public final String component2() {
        return this.unitPromotionDisciplineType;
    }

    public final Civ7UnitPromotionClassSets copy(String s, String s1) {
        j.f(s, "promotionClassType");
        j.f(s1, "unitPromotionDisciplineType");
        return new Civ7UnitPromotionClassSets(s, s1);
    }

    public static Civ7UnitPromotionClassSets copy$default(Civ7UnitPromotionClassSets civ7UnitPromotionClassSets0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitPromotionClassSets0.promotionClassType;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitPromotionClassSets0.unitPromotionDisciplineType;
        }
        return civ7UnitPromotionClassSets0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitPromotionClassSets)) {
            return false;
        }
        return j.a(this.promotionClassType, ((Civ7UnitPromotionClassSets)object0).promotionClassType) ? j.a(this.unitPromotionDisciplineType, ((Civ7UnitPromotionClassSets)object0).unitPromotionDisciplineType) : false;
    }

    public final String getPromotionClassType() {
        return this.promotionClassType;
    }

    public final String getUnitPromotionDisciplineType() {
        return this.unitPromotionDisciplineType;
    }

    @Override
    public int hashCode() {
        return this.unitPromotionDisciplineType.hashCode() + this.promotionClassType.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("Civ7UnitPromotionClassSets(promotionClassType=", this.promotionClassType, ", unitPromotionDisciplineType=", this.unitPromotionDisciplineType, ")");
    }
}

