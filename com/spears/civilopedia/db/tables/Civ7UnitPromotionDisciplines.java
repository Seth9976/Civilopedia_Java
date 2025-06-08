package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitPromotionDisciplines;", "", "unitPromotionDisciplineType", "", "backgroundImage", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundImage", "()Ljava/lang/String;", "getName", "getUnitPromotionDisciplineType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitPromotionDisciplines {
    private final String backgroundImage;
    private final String name;
    private final String unitPromotionDisciplineType;

    public Civ7UnitPromotionDisciplines(String s, String s1, String s2) {
        j.f(s, "unitPromotionDisciplineType");
        j.f(s2, "name");
        super();
        this.unitPromotionDisciplineType = s;
        this.backgroundImage = s1;
        this.name = s2;
    }

    public final String component1() {
        return this.unitPromotionDisciplineType;
    }

    public final String component2() {
        return this.backgroundImage;
    }

    public final String component3() {
        return this.name;
    }

    public final Civ7UnitPromotionDisciplines copy(String s, String s1, String s2) {
        j.f(s, "unitPromotionDisciplineType");
        j.f(s2, "name");
        return new Civ7UnitPromotionDisciplines(s, s1, s2);
    }

    public static Civ7UnitPromotionDisciplines copy$default(Civ7UnitPromotionDisciplines civ7UnitPromotionDisciplines0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitPromotionDisciplines0.unitPromotionDisciplineType;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitPromotionDisciplines0.backgroundImage;
        }
        if((v & 4) != 0) {
            s2 = civ7UnitPromotionDisciplines0.name;
        }
        return civ7UnitPromotionDisciplines0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitPromotionDisciplines)) {
            return false;
        }
        if(!j.a(this.unitPromotionDisciplineType, ((Civ7UnitPromotionDisciplines)object0).unitPromotionDisciplineType)) {
            return false;
        }
        return j.a(this.backgroundImage, ((Civ7UnitPromotionDisciplines)object0).backgroundImage) ? j.a(this.name, ((Civ7UnitPromotionDisciplines)object0).name) : false;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUnitPromotionDisciplineType() {
        return this.unitPromotionDisciplineType;
    }

    @Override
    public int hashCode() {
        int v = this.unitPromotionDisciplineType.hashCode();
        return this.backgroundImage == null ? this.name.hashCode() + v * 961 : this.name.hashCode() + (v * 0x1F + this.backgroundImage.hashCode()) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7UnitPromotionDisciplines(unitPromotionDisciplineType=", this.unitPromotionDisciplineType, ", backgroundImage=", this.backgroundImage, ", name="), this.name, ")");
    }
}

