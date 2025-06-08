package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0005HÆ\u0003J<\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\r¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MultiUnitPositions;", "", "ID", "", "type", "", "description", "name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getName", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5MultiUnitPositions;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MultiUnitPositions {
    private final Integer ID;
    private final String description;
    private final String name;
    private final String type;

    public Civ5MultiUnitPositions(Integer integer0, String s, String s1, String s2) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.description = s1;
        this.name = s2;
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

    public final Civ5MultiUnitPositions copy(Integer integer0, String s, String s1, String s2) {
        j.f(s, "type");
        return new Civ5MultiUnitPositions(integer0, s, s1, s2);
    }

    public static Civ5MultiUnitPositions copy$default(Civ5MultiUnitPositions civ5MultiUnitPositions0, Integer integer0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5MultiUnitPositions0.ID;
        }
        if((v & 2) != 0) {
            s = civ5MultiUnitPositions0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5MultiUnitPositions0.description;
        }
        if((v & 8) != 0) {
            s2 = civ5MultiUnitPositions0.name;
        }
        return civ5MultiUnitPositions0.copy(integer0, s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MultiUnitPositions)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5MultiUnitPositions)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5MultiUnitPositions)object0).type)) {
            return false;
        }
        return j.a(this.description, ((Civ5MultiUnitPositions)object0).description) ? j.a(this.name, ((Civ5MultiUnitPositions)object0).name) : false;
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

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        int v2 = this.description == null ? 0 : this.description.hashCode();
        String s = this.name;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return e.i(u9.h("Civ5MultiUnitPositions(ID=", this.ID, ", type=", this.type, ", description="), this.description, ", name=", this.name, ")");
    }
}

