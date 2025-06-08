package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003J0\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5UnitCombatInfos;", "", "ID", "", "type", "", "description", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5UnitCombatInfos;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5UnitCombatInfos {
    private final Integer ID;
    private final String description;
    private final String type;

    public Civ5UnitCombatInfos(Integer integer0, String s, String s1) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.description = s1;
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

    public final Civ5UnitCombatInfos copy(Integer integer0, String s, String s1) {
        j.f(s, "type");
        return new Civ5UnitCombatInfos(integer0, s, s1);
    }

    public static Civ5UnitCombatInfos copy$default(Civ5UnitCombatInfos civ5UnitCombatInfos0, Integer integer0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5UnitCombatInfos0.ID;
        }
        if((v & 2) != 0) {
            s = civ5UnitCombatInfos0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5UnitCombatInfos0.description;
        }
        return civ5UnitCombatInfos0.copy(integer0, s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5UnitCombatInfos)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5UnitCombatInfos)object0).ID)) {
            return false;
        }
        return j.a(this.type, ((Civ5UnitCombatInfos)object0).type) ? j.a(this.description, ((Civ5UnitCombatInfos)object0).description) : false;
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

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        String s = this.description;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        return e.h(u9.h("Civ5UnitCombatInfos(ID=", this.ID, ", type=", this.type, ", description="), this.description, ")");
    }
}

