package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7IPropertyTypes;", "", "type", "", "kindOf", "definition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefinition", "()Ljava/lang/String;", "getKindOf", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7IPropertyTypes {
    private final String definition;
    private final String kindOf;
    private final String type;

    public Civ7IPropertyTypes(String s, String s1, String s2) {
        j.f(s, "type");
        super();
        this.type = s;
        this.kindOf = s1;
        this.definition = s2;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.kindOf;
    }

    public final String component3() {
        return this.definition;
    }

    public final Civ7IPropertyTypes copy(String s, String s1, String s2) {
        j.f(s, "type");
        return new Civ7IPropertyTypes(s, s1, s2);
    }

    public static Civ7IPropertyTypes copy$default(Civ7IPropertyTypes civ7IPropertyTypes0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7IPropertyTypes0.type;
        }
        if((v & 2) != 0) {
            s1 = civ7IPropertyTypes0.kindOf;
        }
        if((v & 4) != 0) {
            s2 = civ7IPropertyTypes0.definition;
        }
        return civ7IPropertyTypes0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7IPropertyTypes)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7IPropertyTypes)object0).type)) {
            return false;
        }
        return j.a(this.kindOf, ((Civ7IPropertyTypes)object0).kindOf) ? j.a(this.definition, ((Civ7IPropertyTypes)object0).definition) : false;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final String getKindOf() {
        return this.kindOf;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = this.type.hashCode();
        int v1 = 0;
        int v2 = this.kindOf == null ? 0 : this.kindOf.hashCode();
        String s = this.definition;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7IPropertyTypes(type=", this.type, ", kindOf=", this.kindOf, ", definition="), this.definition, ")");
    }
}

