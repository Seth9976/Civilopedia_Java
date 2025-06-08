package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001A\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001B\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001C\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010JT\u0010\u001D\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001EJ\u0013\u0010\u001F\u001A\u00020\t2\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\u0003HÖ\u0001J\t\u0010\"\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0015\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0013¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5EmphasizeInfos;", "", "ID", "", "type", "", "description", "strategy", "avoidGrowth", "", "greatPeople", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvoidGrowth", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "()Ljava/lang/String;", "getGreatPeople", "getStrategy", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ5EmphasizeInfos;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5EmphasizeInfos {
    private final Integer ID;
    private final Boolean avoidGrowth;
    private final String description;
    private final Boolean greatPeople;
    private final String strategy;
    private final String type;

    public Civ5EmphasizeInfos(Integer integer0, String s, String s1, String s2, Boolean boolean0, Boolean boolean1) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.description = s1;
        this.strategy = s2;
        this.avoidGrowth = boolean0;
        this.greatPeople = boolean1;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.strategy;
    }

    public final Boolean component5() {
        return this.avoidGrowth;
    }

    public final Boolean component6() {
        return this.greatPeople;
    }

    public final Civ5EmphasizeInfos copy(Integer integer0, String s, String s1, String s2, Boolean boolean0, Boolean boolean1) {
        j.f(s, "type");
        return new Civ5EmphasizeInfos(integer0, s, s1, s2, boolean0, boolean1);
    }

    public static Civ5EmphasizeInfos copy$default(Civ5EmphasizeInfos civ5EmphasizeInfos0, Integer integer0, String s, String s1, String s2, Boolean boolean0, Boolean boolean1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5EmphasizeInfos0.ID;
        }
        if((v & 2) != 0) {
            s = civ5EmphasizeInfos0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5EmphasizeInfos0.description;
        }
        if((v & 8) != 0) {
            s2 = civ5EmphasizeInfos0.strategy;
        }
        if((v & 16) != 0) {
            boolean0 = civ5EmphasizeInfos0.avoidGrowth;
        }
        if((v & 0x20) != 0) {
            boolean1 = civ5EmphasizeInfos0.greatPeople;
        }
        return civ5EmphasizeInfos0.copy(integer0, s, s1, s2, boolean0, boolean1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5EmphasizeInfos)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5EmphasizeInfos)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5EmphasizeInfos)object0).type)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5EmphasizeInfos)object0).description)) {
            return false;
        }
        if(!j.a(this.strategy, ((Civ5EmphasizeInfos)object0).strategy)) {
            return false;
        }
        return j.a(this.avoidGrowth, ((Civ5EmphasizeInfos)object0).avoidGrowth) ? j.a(this.greatPeople, ((Civ5EmphasizeInfos)object0).greatPeople) : false;
    }

    public final Boolean getAvoidGrowth() {
        return this.avoidGrowth;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getGreatPeople() {
        return this.greatPeople;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        int v2 = this.description == null ? 0 : this.description.hashCode();
        int v3 = this.strategy == null ? 0 : this.strategy.hashCode();
        int v4 = this.avoidGrowth == null ? 0 : this.avoidGrowth.hashCode();
        Boolean boolean0 = this.greatPeople;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5EmphasizeInfos(ID=", this.ID, ", type=", this.type, ", description=");
        f.t(stringBuilder0, this.description, ", strategy=", this.strategy, ", avoidGrowth=");
        stringBuilder0.append(this.avoidGrowth);
        stringBuilder0.append(", greatPeople=");
        stringBuilder0.append(this.greatPeople);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

