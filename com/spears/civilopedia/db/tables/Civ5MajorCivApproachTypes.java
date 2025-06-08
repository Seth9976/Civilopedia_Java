package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001A\u00020\u0005HÆ\u0003J$\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000FJ\u0013\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MajorCivApproachTypes;", "", "ID", "", "type", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5MajorCivApproachTypes;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MajorCivApproachTypes {
    private final Integer ID;
    private final String type;

    public Civ5MajorCivApproachTypes(Integer integer0, String s) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final Civ5MajorCivApproachTypes copy(Integer integer0, String s) {
        j.f(s, "type");
        return new Civ5MajorCivApproachTypes(integer0, s);
    }

    public static Civ5MajorCivApproachTypes copy$default(Civ5MajorCivApproachTypes civ5MajorCivApproachTypes0, Integer integer0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5MajorCivApproachTypes0.ID;
        }
        if((v & 2) != 0) {
            s = civ5MajorCivApproachTypes0.type;
        }
        return civ5MajorCivApproachTypes0.copy(integer0, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MajorCivApproachTypes)) {
            return false;
        }
        return j.a(this.ID, ((Civ5MajorCivApproachTypes)object0).ID) ? j.a(this.type, ((Civ5MajorCivApproachTypes)object0).type) : false;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.ID == null ? this.type.hashCode() : this.type.hashCode() + this.ID.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return "Civ5MajorCivApproachTypes(ID=" + this.ID + ", type=" + this.type + ")";
    }
}

