package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TypeProperties;", "", "name", "", "type", "propertyType", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPropertyType", "getType", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TypeProperties {
    private final String name;
    private final String propertyType;
    private final String type;
    private final String value;

    public Civ7TypeProperties(String s, String s1, String s2, String s3) {
        j.f(s, "name");
        j.f(s1, "type");
        j.f(s2, "propertyType");
        j.f(s3, "value");
        super();
        this.name = s;
        this.type = s1;
        this.propertyType = s2;
        this.value = s3;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.propertyType;
    }

    public final String component4() {
        return this.value;
    }

    public final Civ7TypeProperties copy(String s, String s1, String s2, String s3) {
        j.f(s, "name");
        j.f(s1, "type");
        j.f(s2, "propertyType");
        j.f(s3, "value");
        return new Civ7TypeProperties(s, s1, s2, s3);
    }

    public static Civ7TypeProperties copy$default(Civ7TypeProperties civ7TypeProperties0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7TypeProperties0.name;
        }
        if((v & 2) != 0) {
            s1 = civ7TypeProperties0.type;
        }
        if((v & 4) != 0) {
            s2 = civ7TypeProperties0.propertyType;
        }
        if((v & 8) != 0) {
            s3 = civ7TypeProperties0.value;
        }
        return civ7TypeProperties0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TypeProperties)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7TypeProperties)object0).name)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7TypeProperties)object0).type)) {
            return false;
        }
        return j.a(this.propertyType, ((Civ7TypeProperties)object0).propertyType) ? j.a(this.value, ((Civ7TypeProperties)object0).value) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPropertyType() {
        return this.propertyType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode() + f.b(f.b(this.name.hashCode() * 0x1F, 0x1F, this.type), 0x1F, this.propertyType);
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7TypeProperties(name=", this.name, ", type=", this.type, ", propertyType="), this.propertyType, ", value=", this.value, ")");
    }
}

