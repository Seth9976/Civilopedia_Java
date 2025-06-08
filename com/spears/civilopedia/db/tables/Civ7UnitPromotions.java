package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000BJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00042\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001D\u001A\u0004\b\u001E\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001B\u001A\u0004\b\u001F\u0010\u000BR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001B\u001A\u0004\b \u0010\u000B¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitPromotions;", "Lo2/m;", "", "unitPromotionType", "", "commendation", "description", "name", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7UnitPromotions;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnitPromotionType", "Z", "getCommendation", "getDescription", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitPromotions implements m {
    private final boolean commendation;
    private final String description;
    private final String name;
    private final String unitPromotionType;

    public Civ7UnitPromotions(String s, boolean z, String s1, String s2) {
        j.f(s, "unitPromotionType");
        j.f(s1, "description");
        j.f(s2, "name");
        super();
        this.unitPromotionType = s;
        this.commendation = z;
        this.description = s1;
        this.name = s2;
    }

    public final String component1() {
        return this.unitPromotionType;
    }

    public final boolean component2() {
        return this.commendation;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7UnitPromotions copy(String s, boolean z, String s1, String s2) {
        j.f(s, "unitPromotionType");
        j.f(s1, "description");
        j.f(s2, "name");
        return new Civ7UnitPromotions(s, z, s1, s2);
    }

    public static Civ7UnitPromotions copy$default(Civ7UnitPromotions civ7UnitPromotions0, String s, boolean z, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitPromotions0.unitPromotionType;
        }
        if((v & 2) != 0) {
            z = civ7UnitPromotions0.commendation;
        }
        if((v & 4) != 0) {
            s1 = civ7UnitPromotions0.description;
        }
        if((v & 8) != 0) {
            s2 = civ7UnitPromotions0.name;
        }
        return civ7UnitPromotions0.copy(s, z, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitPromotions)) {
            return false;
        }
        if(!j.a(this.unitPromotionType, ((Civ7UnitPromotions)object0).unitPromotionType)) {
            return false;
        }
        if(this.commendation != ((Civ7UnitPromotions)object0).commendation) {
            return false;
        }
        return j.a(this.description, ((Civ7UnitPromotions)object0).description) ? j.a(this.name, ((Civ7UnitPromotions)object0).name) : false;
    }

    public final boolean getCommendation() {
        return this.commendation;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUnitPromotionType() {
        return this.unitPromotionType;
    }

    @Override
    public int hashCode() {
        int v = this.unitPromotionType.hashCode();
        return this.commendation ? this.name.hashCode() + f.b((v * 0x1F + 0x4CF) * 0x1F, 0x1F, this.description) : this.name.hashCode() + f.b((v * 0x1F + 0x4D5) * 0x1F, 0x1F, this.description);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.unitPromotionType;
    }

    @Override
    public String toString() {
        return e.i(u9.j("Civ7UnitPromotions(unitPromotionType=", this.unitPromotionType, this.commendation, ", commendation=", ", description="), this.description, ", name=", this.name, ")");
    }
}

