package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000FJ2\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00072\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001A"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5EntityEvents;", "", "ID", "", "type", "", "updateFormation", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "getUpdateFormation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ5EntityEvents;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5EntityEvents {
    private final Integer ID;
    private final String type;
    private final Boolean updateFormation;

    public Civ5EntityEvents(Integer integer0, String s, Boolean boolean0) {
        this.ID = integer0;
        this.type = s;
        this.updateFormation = boolean0;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final Boolean component3() {
        return this.updateFormation;
    }

    public final Civ5EntityEvents copy(Integer integer0, String s, Boolean boolean0) {
        return new Civ5EntityEvents(integer0, s, boolean0);
    }

    public static Civ5EntityEvents copy$default(Civ5EntityEvents civ5EntityEvents0, Integer integer0, String s, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5EntityEvents0.ID;
        }
        if((v & 2) != 0) {
            s = civ5EntityEvents0.type;
        }
        if((v & 4) != 0) {
            boolean0 = civ5EntityEvents0.updateFormation;
        }
        return civ5EntityEvents0.copy(integer0, s, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5EntityEvents)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5EntityEvents)object0).ID)) {
            return false;
        }
        return j.a(this.type, ((Civ5EntityEvents)object0).type) ? j.a(this.updateFormation, ((Civ5EntityEvents)object0).updateFormation) : false;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getType() {
        return this.type;
    }

    public final Boolean getUpdateFormation() {
        return this.updateFormation;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.ID == null ? 0 : this.ID.hashCode();
        int v2 = this.type == null ? 0 : this.type.hashCode();
        Boolean boolean0 = this.updateFormation;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5EntityEvents(ID=", this.ID, ", type=", this.type, ", updateFormation=");
        stringBuilder0.append(this.updateFormation);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

