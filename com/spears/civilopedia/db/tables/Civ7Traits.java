package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00062\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Traits;", "", "traitType", "", "description", "internalOnly", "", "name", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getInternalOnly", "()Z", "getName", "getTraitType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Traits {
    private final String description;
    private final boolean internalOnly;
    private final String name;
    private final String traitType;

    public Civ7Traits(String s, String s1, boolean z, String s2) {
        j.f(s, "traitType");
        super();
        this.traitType = s;
        this.description = s1;
        this.internalOnly = z;
        this.name = s2;
    }

    public final String component1() {
        return this.traitType;
    }

    public final String component2() {
        return this.description;
    }

    public final boolean component3() {
        return this.internalOnly;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7Traits copy(String s, String s1, boolean z, String s2) {
        j.f(s, "traitType");
        return new Civ7Traits(s, s1, z, s2);
    }

    public static Civ7Traits copy$default(Civ7Traits civ7Traits0, String s, String s1, boolean z, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Traits0.traitType;
        }
        if((v & 2) != 0) {
            s1 = civ7Traits0.description;
        }
        if((v & 4) != 0) {
            z = civ7Traits0.internalOnly;
        }
        if((v & 8) != 0) {
            s2 = civ7Traits0.name;
        }
        return civ7Traits0.copy(s, s1, z, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Traits)) {
            return false;
        }
        if(!j.a(this.traitType, ((Civ7Traits)object0).traitType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Traits)object0).description)) {
            return false;
        }
        return this.internalOnly == ((Civ7Traits)object0).internalOnly ? j.a(this.name, ((Civ7Traits)object0).name) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getInternalOnly() {
        return this.internalOnly;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    @Override
    public int hashCode() {
        int v = this.traitType.hashCode();
        int v1 = 0;
        int v2 = this.description == null ? 0 : this.description.hashCode();
        int v3 = this.internalOnly ? 0x4CF : 0x4D5;
        String s = this.name;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Traits(traitType=", this.traitType, ", description=", this.description, ", internalOnly=");
        stringBuilder0.append(this.internalOnly);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

