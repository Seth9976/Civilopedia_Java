package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Policy_FreePromotionUnitCombats;", "", "policyType", "", "unitCombatType", "promotionType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPolicyType", "()Ljava/lang/String;", "getPromotionType", "getUnitCombatType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Policy_FreePromotionUnitCombats {
    private final String policyType;
    private final String promotionType;
    private final String unitCombatType;

    public Civ5Policy_FreePromotionUnitCombats(String s, String s1, String s2) {
        this.policyType = s;
        this.unitCombatType = s1;
        this.promotionType = s2;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.unitCombatType;
    }

    public final String component3() {
        return this.promotionType;
    }

    public final Civ5Policy_FreePromotionUnitCombats copy(String s, String s1, String s2) {
        return new Civ5Policy_FreePromotionUnitCombats(s, s1, s2);
    }

    public static Civ5Policy_FreePromotionUnitCombats copy$default(Civ5Policy_FreePromotionUnitCombats civ5Policy_FreePromotionUnitCombats0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Policy_FreePromotionUnitCombats0.policyType;
        }
        if((v & 2) != 0) {
            s1 = civ5Policy_FreePromotionUnitCombats0.unitCombatType;
        }
        if((v & 4) != 0) {
            s2 = civ5Policy_FreePromotionUnitCombats0.promotionType;
        }
        return civ5Policy_FreePromotionUnitCombats0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Policy_FreePromotionUnitCombats)) {
            return false;
        }
        if(!j.a(this.policyType, ((Civ5Policy_FreePromotionUnitCombats)object0).policyType)) {
            return false;
        }
        return j.a(this.unitCombatType, ((Civ5Policy_FreePromotionUnitCombats)object0).unitCombatType) ? j.a(this.promotionType, ((Civ5Policy_FreePromotionUnitCombats)object0).promotionType) : false;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public final String getUnitCombatType() {
        return this.unitCombatType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.policyType == null ? 0 : this.policyType.hashCode();
        int v2 = this.unitCombatType == null ? 0 : this.unitCombatType.hashCode();
        String s = this.promotionType;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5Policy_FreePromotionUnitCombats(policyType=", this.policyType, ", unitCombatType=", this.unitCombatType, ", promotionType="), this.promotionType, ")");
    }
}

