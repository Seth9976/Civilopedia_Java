package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J3\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Governments;", "", "governmentType", "", "celebrationName", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCelebrationName", "()Ljava/lang/String;", "getDescription", "getGovernmentType", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Governments {
    private final String celebrationName;
    private final String description;
    private final String governmentType;
    private final String name;

    public Civ7Governments(String s, String s1, String s2, String s3) {
        j.f(s, "governmentType");
        j.f(s1, "celebrationName");
        j.f(s3, "name");
        super();
        this.governmentType = s;
        this.celebrationName = s1;
        this.description = s2;
        this.name = s3;
    }

    public final String component1() {
        return this.governmentType;
    }

    public final String component2() {
        return this.celebrationName;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7Governments copy(String s, String s1, String s2, String s3) {
        j.f(s, "governmentType");
        j.f(s1, "celebrationName");
        j.f(s3, "name");
        return new Civ7Governments(s, s1, s2, s3);
    }

    public static Civ7Governments copy$default(Civ7Governments civ7Governments0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Governments0.governmentType;
        }
        if((v & 2) != 0) {
            s1 = civ7Governments0.celebrationName;
        }
        if((v & 4) != 0) {
            s2 = civ7Governments0.description;
        }
        if((v & 8) != 0) {
            s3 = civ7Governments0.name;
        }
        return civ7Governments0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Governments)) {
            return false;
        }
        if(!j.a(this.governmentType, ((Civ7Governments)object0).governmentType)) {
            return false;
        }
        if(!j.a(this.celebrationName, ((Civ7Governments)object0).celebrationName)) {
            return false;
        }
        return j.a(this.description, ((Civ7Governments)object0).description) ? j.a(this.name, ((Civ7Governments)object0).name) : false;
    }

    public final String getCelebrationName() {
        return this.celebrationName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGovernmentType() {
        return this.governmentType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.governmentType.hashCode() * 0x1F, 0x1F, this.celebrationName);
        return this.description == null ? this.name.hashCode() + v * 0x1F : this.name.hashCode() + (v + this.description.hashCode()) * 0x1F;
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7Governments(governmentType=", this.governmentType, ", celebrationName=", this.celebrationName, ", description="), this.description, ", name=", this.name, ")");
    }
}

