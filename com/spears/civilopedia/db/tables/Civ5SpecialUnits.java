package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000FJ\u0010\u0010\u0019\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000FJJ\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\b2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001F\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u0014\u0010\u000F¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5SpecialUnits;", "", "ID", "", "type", "", "description", "valid", "", "cityLoad", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCityLoad", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "()Ljava/lang/String;", "getType", "getValid", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ5SpecialUnits;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5SpecialUnits {
    private final Integer ID;
    private final Boolean cityLoad;
    private final String description;
    private final String type;
    private final Boolean valid;

    public Civ5SpecialUnits(Integer integer0, String s, String s1, Boolean boolean0, Boolean boolean1) {
        this.ID = integer0;
        this.type = s;
        this.description = s1;
        this.valid = boolean0;
        this.cityLoad = boolean1;
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

    public final Boolean component4() {
        return this.valid;
    }

    public final Boolean component5() {
        return this.cityLoad;
    }

    public final Civ5SpecialUnits copy(Integer integer0, String s, String s1, Boolean boolean0, Boolean boolean1) {
        return new Civ5SpecialUnits(integer0, s, s1, boolean0, boolean1);
    }

    public static Civ5SpecialUnits copy$default(Civ5SpecialUnits civ5SpecialUnits0, Integer integer0, String s, String s1, Boolean boolean0, Boolean boolean1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5SpecialUnits0.ID;
        }
        if((v & 2) != 0) {
            s = civ5SpecialUnits0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5SpecialUnits0.description;
        }
        if((v & 8) != 0) {
            boolean0 = civ5SpecialUnits0.valid;
        }
        if((v & 16) != 0) {
            boolean1 = civ5SpecialUnits0.cityLoad;
        }
        return civ5SpecialUnits0.copy(integer0, s, s1, boolean0, boolean1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5SpecialUnits)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5SpecialUnits)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5SpecialUnits)object0).type)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5SpecialUnits)object0).description)) {
            return false;
        }
        return j.a(this.valid, ((Civ5SpecialUnits)object0).valid) ? j.a(this.cityLoad, ((Civ5SpecialUnits)object0).cityLoad) : false;
    }

    public final Boolean getCityLoad() {
        return this.cityLoad;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getType() {
        return this.type;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.ID == null ? 0 : this.ID.hashCode();
        int v2 = this.type == null ? 0 : this.type.hashCode();
        int v3 = this.description == null ? 0 : this.description.hashCode();
        int v4 = this.valid == null ? 0 : this.valid.hashCode();
        Boolean boolean0 = this.cityLoad;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5SpecialUnits(ID=", this.ID, ", type=", this.type, ", description=");
        stringBuilder0.append(this.description);
        stringBuilder0.append(", valid=");
        stringBuilder0.append(this.valid);
        stringBuilder0.append(", cityLoad=");
        stringBuilder0.append(this.cityLoad);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

