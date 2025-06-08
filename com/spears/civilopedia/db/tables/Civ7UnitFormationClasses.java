package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitFormationClasses;", "Lo2/m;", "", "formationClassType", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7UnitFormationClasses;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormationClassType", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitFormationClasses implements m {
    private final String formationClassType;
    private final String name;

    public Civ7UnitFormationClasses(String s, String s1) {
        j.f(s, "formationClassType");
        j.f(s1, "name");
        super();
        this.formationClassType = s;
        this.name = s1;
    }

    public final String component1() {
        return this.formationClassType;
    }

    public final String component2() {
        return this.name;
    }

    public final Civ7UnitFormationClasses copy(String s, String s1) {
        j.f(s, "formationClassType");
        j.f(s1, "name");
        return new Civ7UnitFormationClasses(s, s1);
    }

    public static Civ7UnitFormationClasses copy$default(Civ7UnitFormationClasses civ7UnitFormationClasses0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitFormationClasses0.formationClassType;
        }
        if((v & 2) != 0) {
            s1 = civ7UnitFormationClasses0.name;
        }
        return civ7UnitFormationClasses0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitFormationClasses)) {
            return false;
        }
        return j.a(this.formationClassType, ((Civ7UnitFormationClasses)object0).formationClassType) ? j.a(this.name, ((Civ7UnitFormationClasses)object0).name) : false;
    }

    public final String getFormationClassType() {
        return this.formationClassType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.formationClassType.hashCode() * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.formationClassType;
    }

    @Override
    public String toString() {
        return f.k("Civ7UnitFormationClasses(formationClassType=", this.formationClassType, ", name=", this.name, ")");
    }
}

