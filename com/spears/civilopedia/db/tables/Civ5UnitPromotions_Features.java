package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\rJ\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010\u001D\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000FJ\u0010\u0010\u001E\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000FJ\u0010\u0010\u001F\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0013J\u0010\u0010 \u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0013J\u000B\u0010!\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\"\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003Jn\u0010#\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001\u00A2\u0006\u0002\u0010$J\u0013\u0010%\u001A\u00020\t2\b\u0010&\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010\'\u001A\u00020\u0006H\u00D6\u0001J\t\u0010(\u001A\u00020\u0003H\u00D6\u0001R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u0011\u0010\u000FR\u0015\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0017\u0010\u0013R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0016R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0016\u00A8\u0006)"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5UnitPromotions_Features;", "", "promotionType", "", "featureType", "attack", "", "defense", "doubleMove", "", "impassable", "passableTech", "pediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAttack", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefense", "getDoubleMove", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeatureType", "()Ljava/lang/String;", "getImpassable", "getPassableTech", "getPediaType", "getPromotionType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5UnitPromotions_Features;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5UnitPromotions_Features {
    private final Integer attack;
    private final Integer defense;
    private final Boolean doubleMove;
    private final String featureType;
    private final Boolean impassable;
    private final String passableTech;
    private final String pediaType;
    private final String promotionType;

    public Civ5UnitPromotions_Features(String s, String s1, Integer integer0, Integer integer1, Boolean boolean0, Boolean boolean1, String s2, String s3) {
        this.promotionType = s;
        this.featureType = s1;
        this.attack = integer0;
        this.defense = integer1;
        this.doubleMove = boolean0;
        this.impassable = boolean1;
        this.passableTech = s2;
        this.pediaType = s3;
    }

    public final String component1() {
        return this.promotionType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final Integer component3() {
        return this.attack;
    }

    public final Integer component4() {
        return this.defense;
    }

    public final Boolean component5() {
        return this.doubleMove;
    }

    public final Boolean component6() {
        return this.impassable;
    }

    public final String component7() {
        return this.passableTech;
    }

    public final String component8() {
        return this.pediaType;
    }

    public final Civ5UnitPromotions_Features copy(String s, String s1, Integer integer0, Integer integer1, Boolean boolean0, Boolean boolean1, String s2, String s3) {
        return new Civ5UnitPromotions_Features(s, s1, integer0, integer1, boolean0, boolean1, s2, s3);
    }

    public static Civ5UnitPromotions_Features copy$default(Civ5UnitPromotions_Features civ5UnitPromotions_Features0, String s, String s1, Integer integer0, Integer integer1, Boolean boolean0, Boolean boolean1, String s2, String s3, int v, Object object0) {
        String s4 = (v & 1) == 0 ? s : civ5UnitPromotions_Features0.promotionType;
        String s5 = (v & 2) == 0 ? s1 : civ5UnitPromotions_Features0.featureType;
        Integer integer2 = (v & 4) == 0 ? integer0 : civ5UnitPromotions_Features0.attack;
        Integer integer3 = (v & 8) == 0 ? integer1 : civ5UnitPromotions_Features0.defense;
        Boolean boolean2 = (v & 16) == 0 ? boolean0 : civ5UnitPromotions_Features0.doubleMove;
        Boolean boolean3 = (v & 0x20) == 0 ? boolean1 : civ5UnitPromotions_Features0.impassable;
        String s6 = (v & 0x40) == 0 ? s2 : civ5UnitPromotions_Features0.passableTech;
        return (v & 0x80) == 0 ? civ5UnitPromotions_Features0.copy(s4, s5, integer2, integer3, boolean2, boolean3, s6, s3) : civ5UnitPromotions_Features0.copy(s4, s5, integer2, integer3, boolean2, boolean3, s6, civ5UnitPromotions_Features0.pediaType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5UnitPromotions_Features)) {
            return false;
        }
        if(!j.a(this.promotionType, ((Civ5UnitPromotions_Features)object0).promotionType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ5UnitPromotions_Features)object0).featureType)) {
            return false;
        }
        if(!j.a(this.attack, ((Civ5UnitPromotions_Features)object0).attack)) {
            return false;
        }
        if(!j.a(this.defense, ((Civ5UnitPromotions_Features)object0).defense)) {
            return false;
        }
        if(!j.a(this.doubleMove, ((Civ5UnitPromotions_Features)object0).doubleMove)) {
            return false;
        }
        if(!j.a(this.impassable, ((Civ5UnitPromotions_Features)object0).impassable)) {
            return false;
        }
        return j.a(this.passableTech, ((Civ5UnitPromotions_Features)object0).passableTech) ? j.a(this.pediaType, ((Civ5UnitPromotions_Features)object0).pediaType) : false;
    }

    public final Integer getAttack() {
        return this.attack;
    }

    public final Integer getDefense() {
        return this.defense;
    }

    public final Boolean getDoubleMove() {
        return this.doubleMove;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final Boolean getImpassable() {
        return this.impassable;
    }

    public final String getPassableTech() {
        return this.passableTech;
    }

    public final String getPediaType() {
        return this.pediaType;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.promotionType == null ? 0 : this.promotionType.hashCode();
        int v2 = this.featureType == null ? 0 : this.featureType.hashCode();
        int v3 = this.attack == null ? 0 : this.attack.hashCode();
        int v4 = this.defense == null ? 0 : this.defense.hashCode();
        int v5 = this.doubleMove == null ? 0 : this.doubleMove.hashCode();
        int v6 = this.impassable == null ? 0 : this.impassable.hashCode();
        int v7 = this.passableTech == null ? 0 : this.passableTech.hashCode();
        String s = this.pediaType;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5UnitPromotions_Features(promotionType=", this.promotionType, ", featureType=", this.featureType, ", attack=");
        u9.w(stringBuilder0, this.attack, ", defense=", this.defense, ", doubleMove=");
        u9.s(stringBuilder0, this.doubleMove, ", impassable=", this.impassable, ", passableTech=");
        return e.i(stringBuilder0, this.passableTech, ", pediaType=", this.pediaType, ")");
    }
}

