package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\u0006HÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\b\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000E\u0010\fR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000F\u0010\fR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5UnitPromotions_UnitClasses;", "", "promotionType", "", "unitClassType", "modifier", "", "attack", "defense", "pediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAttack", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefense", "getModifier", "getPediaType", "()Ljava/lang/String;", "getPromotionType", "getUnitClassType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5UnitPromotions_UnitClasses;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5UnitPromotions_UnitClasses {
    private final Integer attack;
    private final Integer defense;
    private final Integer modifier;
    private final String pediaType;
    private final String promotionType;
    private final String unitClassType;

    public Civ5UnitPromotions_UnitClasses(String s, String s1, Integer integer0, Integer integer1, Integer integer2, String s2) {
        this.promotionType = s;
        this.unitClassType = s1;
        this.modifier = integer0;
        this.attack = integer1;
        this.defense = integer2;
        this.pediaType = s2;
    }

    public final String component1() {
        return this.promotionType;
    }

    public final String component2() {
        return this.unitClassType;
    }

    public final Integer component3() {
        return this.modifier;
    }

    public final Integer component4() {
        return this.attack;
    }

    public final Integer component5() {
        return this.defense;
    }

    public final String component6() {
        return this.pediaType;
    }

    public final Civ5UnitPromotions_UnitClasses copy(String s, String s1, Integer integer0, Integer integer1, Integer integer2, String s2) {
        return new Civ5UnitPromotions_UnitClasses(s, s1, integer0, integer1, integer2, s2);
    }

    public static Civ5UnitPromotions_UnitClasses copy$default(Civ5UnitPromotions_UnitClasses civ5UnitPromotions_UnitClasses0, String s, String s1, Integer integer0, Integer integer1, Integer integer2, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5UnitPromotions_UnitClasses0.promotionType;
        }
        if((v & 2) != 0) {
            s1 = civ5UnitPromotions_UnitClasses0.unitClassType;
        }
        if((v & 4) != 0) {
            integer0 = civ5UnitPromotions_UnitClasses0.modifier;
        }
        if((v & 8) != 0) {
            integer1 = civ5UnitPromotions_UnitClasses0.attack;
        }
        if((v & 16) != 0) {
            integer2 = civ5UnitPromotions_UnitClasses0.defense;
        }
        if((v & 0x20) != 0) {
            s2 = civ5UnitPromotions_UnitClasses0.pediaType;
        }
        return civ5UnitPromotions_UnitClasses0.copy(s, s1, integer0, integer1, integer2, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5UnitPromotions_UnitClasses)) {
            return false;
        }
        if(!j.a(this.promotionType, ((Civ5UnitPromotions_UnitClasses)object0).promotionType)) {
            return false;
        }
        if(!j.a(this.unitClassType, ((Civ5UnitPromotions_UnitClasses)object0).unitClassType)) {
            return false;
        }
        if(!j.a(this.modifier, ((Civ5UnitPromotions_UnitClasses)object0).modifier)) {
            return false;
        }
        if(!j.a(this.attack, ((Civ5UnitPromotions_UnitClasses)object0).attack)) {
            return false;
        }
        return j.a(this.defense, ((Civ5UnitPromotions_UnitClasses)object0).defense) ? j.a(this.pediaType, ((Civ5UnitPromotions_UnitClasses)object0).pediaType) : false;
    }

    public final Integer getAttack() {
        return this.attack;
    }

    public final Integer getDefense() {
        return this.defense;
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

    public final String getUnitClassType() {
        return this.unitClassType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.promotionType == null ? 0 : this.promotionType.hashCode();
        int v2 = this.unitClassType == null ? 0 : this.unitClassType.hashCode();
        int v3 = this.modifier == null ? 0 : this.modifier.hashCode();
        int v4 = this.attack == null ? 0 : this.attack.hashCode();
        int v5 = this.defense == null ? 0 : this.defense.hashCode();
        String s = this.pediaType;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5UnitPromotions_UnitClasses(promotionType=", this.promotionType, ", unitClassType=", this.unitClassType, ", modifier=");
        u9.w(stringBuilder0, this.modifier, ", attack=", this.attack, ", defense=");
        stringBuilder0.append(this.defense);
        stringBuilder0.append(", pediaType=");
        stringBuilder0.append(this.pediaType);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

