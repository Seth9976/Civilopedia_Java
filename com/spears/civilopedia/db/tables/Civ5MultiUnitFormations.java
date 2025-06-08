package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JH\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\t2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001F\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0015\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000F¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MultiUnitFormations;", "", "ID", "", "type", "", "description", "name", "requiresNavalUnitConsistency", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getName", "getRequiresNavalUnitConsistency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ5MultiUnitFormations;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MultiUnitFormations {
    private final Integer ID;
    private final String description;
    private final String name;
    private final Boolean requiresNavalUnitConsistency;
    private final String type;

    public Civ5MultiUnitFormations(Integer integer0, String s, String s1, String s2, Boolean boolean0) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.description = s1;
        this.name = s2;
        this.requiresNavalUnitConsistency = boolean0;
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
        return this.name;
    }

    public final Boolean component5() {
        return this.requiresNavalUnitConsistency;
    }

    public final Civ5MultiUnitFormations copy(Integer integer0, String s, String s1, String s2, Boolean boolean0) {
        j.f(s, "type");
        return new Civ5MultiUnitFormations(integer0, s, s1, s2, boolean0);
    }

    public static Civ5MultiUnitFormations copy$default(Civ5MultiUnitFormations civ5MultiUnitFormations0, Integer integer0, String s, String s1, String s2, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5MultiUnitFormations0.ID;
        }
        if((v & 2) != 0) {
            s = civ5MultiUnitFormations0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5MultiUnitFormations0.description;
        }
        if((v & 8) != 0) {
            s2 = civ5MultiUnitFormations0.name;
        }
        if((v & 16) != 0) {
            boolean0 = civ5MultiUnitFormations0.requiresNavalUnitConsistency;
        }
        return civ5MultiUnitFormations0.copy(integer0, s, s1, s2, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MultiUnitFormations)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5MultiUnitFormations)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5MultiUnitFormations)object0).type)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5MultiUnitFormations)object0).description)) {
            return false;
        }
        return j.a(this.name, ((Civ5MultiUnitFormations)object0).name) ? j.a(this.requiresNavalUnitConsistency, ((Civ5MultiUnitFormations)object0).requiresNavalUnitConsistency) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getRequiresNavalUnitConsistency() {
        return this.requiresNavalUnitConsistency;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        int v2 = this.description == null ? 0 : this.description.hashCode();
        int v3 = this.name == null ? 0 : this.name.hashCode();
        Boolean boolean0 = this.requiresNavalUnitConsistency;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5MultiUnitFormations(ID=", this.ID, ", type=", this.type, ", description=");
        f.t(stringBuilder0, this.description, ", name=", this.name, ", requiresNavalUnitConsistency=");
        stringBuilder0.append(this.requiresNavalUnitConsistency);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

