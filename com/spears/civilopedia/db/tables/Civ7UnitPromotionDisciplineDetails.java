package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitPromotionDisciplineDetails;", "", "prereqUnitPromotion", "", "unitPromotionDisciplineType", "unitPromotionType", "grantsCommendation", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getGrantsCommendation", "()Z", "getPrereqUnitPromotion", "()Ljava/lang/String;", "getUnitPromotionDisciplineType", "getUnitPromotionType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitPromotionDisciplineDetails {
    private final boolean grantsCommendation;
    private final String prereqUnitPromotion;
    private final String unitPromotionDisciplineType;
    private final String unitPromotionType;

    public Civ7UnitPromotionDisciplineDetails(String s, String s1, String s2, boolean z) {
        j.f(s1, "unitPromotionDisciplineType");
        j.f(s2, "unitPromotionType");
        super();
        this.prereqUnitPromotion = s;
        this.unitPromotionDisciplineType = s1;
        this.unitPromotionType = s2;
        this.grantsCommendation = z;
    }

    public final String component1() {
        return this.prereqUnitPromotion;
    }

    public final String component2() {
        return this.unitPromotionDisciplineType;
    }

    public final String component3() {
        return this.unitPromotionType;
    }

    public final boolean component4() {
        return this.grantsCommendation;
    }

    public final Civ7UnitPromotionDisciplineDetails copy(String s, String s1, String s2, boolean z) {
        j.f(s1, "unitPromotionDisciplineType");
        j.f(s2, "unitPromotionType");
        return new Civ7UnitPromotionDisciplineDetails(s, s1, s2, z);
    }

    public static Civ7UnitPromotionDisciplineDetails copy$default(Civ7UnitPromotionDisciplineDetails civ7UnitPromotionDisciplineDetails0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitPromotionDisciplineDetails0.prereqUnitPromotion;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitPromotionDisciplineDetails0.unitPromotionDisciplineType;
        }
        if((v & 4) != 0) {
            s2 = civ7UnitPromotionDisciplineDetails0.unitPromotionType;
        }
        if((v & 8) != 0) {
            z = civ7UnitPromotionDisciplineDetails0.grantsCommendation;
        }
        return civ7UnitPromotionDisciplineDetails0.copy(s, s1, s2, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitPromotionDisciplineDetails)) {
            return false;
        }
        if(!j.a(this.prereqUnitPromotion, ((Civ7UnitPromotionDisciplineDetails)object0).prereqUnitPromotion)) {
            return false;
        }
        if(!j.a(this.unitPromotionDisciplineType, ((Civ7UnitPromotionDisciplineDetails)object0).unitPromotionDisciplineType)) {
            return false;
        }
        return j.a(this.unitPromotionType, ((Civ7UnitPromotionDisciplineDetails)object0).unitPromotionType) ? this.grantsCommendation == ((Civ7UnitPromotionDisciplineDetails)object0).grantsCommendation : false;
    }

    public final boolean getGrantsCommendation() {
        return this.grantsCommendation;
    }

    public final String getPrereqUnitPromotion() {
        return this.prereqUnitPromotion;
    }

    public final String getUnitPromotionDisciplineType() {
        return this.unitPromotionDisciplineType;
    }

    public final String getUnitPromotionType() {
        return this.unitPromotionType;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b((this.prereqUnitPromotion == null ? 0 : this.prereqUnitPromotion.hashCode()) * 0x1F, 0x1F, this.unitPromotionDisciplineType), 0x1F, this.unitPromotionType);
        return this.grantsCommendation ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7UnitPromotionDisciplineDetails(prereqUnitPromotion=", this.prereqUnitPromotion, ", unitPromotionDisciplineType=", this.unitPromotionDisciplineType, ", unitPromotionType=");
        stringBuilder0.append(this.unitPromotionType);
        stringBuilder0.append(", grantsCommendation=");
        stringBuilder0.append(this.grantsCommendation);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

