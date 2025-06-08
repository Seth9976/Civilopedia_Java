package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Attributes;", "", "attributeType", "", "description", "name", "progressionTreeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttributeType", "()Ljava/lang/String;", "getDescription", "getName", "getProgressionTreeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Attributes {
    private final String attributeType;
    private final String description;
    private final String name;
    private final String progressionTreeType;

    public Civ7Attributes(String s, String s1, String s2, String s3) {
        j.f(s, "attributeType");
        j.f(s2, "name");
        super();
        this.attributeType = s;
        this.description = s1;
        this.name = s2;
        this.progressionTreeType = s3;
    }

    public final String component1() {
        return this.attributeType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.progressionTreeType;
    }

    public final Civ7Attributes copy(String s, String s1, String s2, String s3) {
        j.f(s, "attributeType");
        j.f(s2, "name");
        return new Civ7Attributes(s, s1, s2, s3);
    }

    public static Civ7Attributes copy$default(Civ7Attributes civ7Attributes0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Attributes0.attributeType;
        }
        if((v & 2) != 0) {
            s1 = civ7Attributes0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7Attributes0.name;
        }
        if((v & 8) != 0) {
            s3 = civ7Attributes0.progressionTreeType;
        }
        return civ7Attributes0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Attributes)) {
            return false;
        }
        if(!j.a(this.attributeType, ((Civ7Attributes)object0).attributeType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Attributes)object0).description)) {
            return false;
        }
        return j.a(this.name, ((Civ7Attributes)object0).name) ? j.a(this.progressionTreeType, ((Civ7Attributes)object0).progressionTreeType) : false;
    }

    public final String getAttributeType() {
        return this.attributeType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProgressionTreeType() {
        return this.progressionTreeType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.attributeType.hashCode() * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F, 0x1F, this.name);
        String s = this.progressionTreeType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7Attributes(attributeType=", this.attributeType, ", description=", this.description, ", name="), this.name, ", progressionTreeType=", this.progressionTreeType, ")");
    }
}

