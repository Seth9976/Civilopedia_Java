package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\r¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5UnitPromotions_UnitCombatMods;", "", "promotionType", "", "unitCombatType", "modifier", "", "pediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getModifier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPediaType", "()Ljava/lang/String;", "getPromotionType", "getUnitCombatType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5UnitPromotions_UnitCombatMods;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5UnitPromotions_UnitCombatMods {
    private final Integer modifier;
    private final String pediaType;
    private final String promotionType;
    private final String unitCombatType;

    public Civ5UnitPromotions_UnitCombatMods(String s, String s1, Integer integer0, String s2) {
        this.promotionType = s;
        this.unitCombatType = s1;
        this.modifier = integer0;
        this.pediaType = s2;
    }

    public final String component1() {
        return this.promotionType;
    }

    public final String component2() {
        return this.unitCombatType;
    }

    public final Integer component3() {
        return this.modifier;
    }

    public final String component4() {
        return this.pediaType;
    }

    public final Civ5UnitPromotions_UnitCombatMods copy(String s, String s1, Integer integer0, String s2) {
        return new Civ5UnitPromotions_UnitCombatMods(s, s1, integer0, s2);
    }

    public static Civ5UnitPromotions_UnitCombatMods copy$default(Civ5UnitPromotions_UnitCombatMods civ5UnitPromotions_UnitCombatMods0, String s, String s1, Integer integer0, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5UnitPromotions_UnitCombatMods0.promotionType;
        }
        if((v & 2) != 0) {
            s1 = civ5UnitPromotions_UnitCombatMods0.unitCombatType;
        }
        if((v & 4) != 0) {
            integer0 = civ5UnitPromotions_UnitCombatMods0.modifier;
        }
        if((v & 8) != 0) {
            s2 = civ5UnitPromotions_UnitCombatMods0.pediaType;
        }
        return civ5UnitPromotions_UnitCombatMods0.copy(s, s1, integer0, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5UnitPromotions_UnitCombatMods)) {
            return false;
        }
        if(!j.a(this.promotionType, ((Civ5UnitPromotions_UnitCombatMods)object0).promotionType)) {
            return false;
        }
        if(!j.a(this.unitCombatType, ((Civ5UnitPromotions_UnitCombatMods)object0).unitCombatType)) {
            return false;
        }
        return j.a(this.modifier, ((Civ5UnitPromotions_UnitCombatMods)object0).modifier) ? j.a(this.pediaType, ((Civ5UnitPromotions_UnitCombatMods)object0).pediaType) : false;
    }

    public final Integer getModifier() {
        return this.modifier;
    }

    public final String getPediaType() {
        return this.pediaType;
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
        int v1 = this.promotionType == null ? 0 : this.promotionType.hashCode();
        int v2 = this.unitCombatType == null ? 0 : this.unitCombatType.hashCode();
        int v3 = this.modifier == null ? 0 : this.modifier.hashCode();
        String s = this.pediaType;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5UnitPromotions_UnitCombatMods(promotionType=", this.promotionType, ", unitCombatType=", this.unitCombatType, ", modifier=");
        stringBuilder0.append(this.modifier);
        stringBuilder0.append(", pediaType=");
        stringBuilder0.append(this.pediaType);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

