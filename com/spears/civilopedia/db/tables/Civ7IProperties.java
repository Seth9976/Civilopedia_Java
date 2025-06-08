package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0016\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003Jc\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001J\u0013\u0010\u001E\u001A\u00020\u001F2\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010!\u001A\u00020\"H\u00D6\u0001J\t\u0010#\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\rR\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\r\u00A8\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7IProperties;", "", "collection", "", "name", "type", "container", "access", "definition", "initializeBy", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccess", "()Ljava/lang/String;", "getCollection", "getContainer", "getDefinition", "getInitializeBy", "getName", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7IProperties {
    private final String access;
    private final String collection;
    private final String container;
    private final String definition;
    private final String initializeBy;
    private final String name;
    private final String type;
    private final String value;

    public Civ7IProperties(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        j.f(s, "collection");
        j.f(s1, "name");
        j.f(s2, "type");
        super();
        this.collection = s;
        this.name = s1;
        this.type = s2;
        this.container = s3;
        this.access = s4;
        this.definition = s5;
        this.initializeBy = s6;
        this.value = s7;
    }

    public final String component1() {
        return this.collection;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.container;
    }

    public final String component5() {
        return this.access;
    }

    public final String component6() {
        return this.definition;
    }

    public final String component7() {
        return this.initializeBy;
    }

    public final String component8() {
        return this.value;
    }

    public final Civ7IProperties copy(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        j.f(s, "collection");
        j.f(s1, "name");
        j.f(s2, "type");
        return new Civ7IProperties(s, s1, s2, s3, s4, s5, s6, s7);
    }

    public static Civ7IProperties copy$default(Civ7IProperties civ7IProperties0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, Object object0) {
        String s8 = (v & 1) == 0 ? s : civ7IProperties0.collection;
        String s9 = (v & 2) == 0 ? s1 : civ7IProperties0.name;
        String s10 = (v & 4) == 0 ? s2 : civ7IProperties0.type;
        String s11 = (v & 8) == 0 ? s3 : civ7IProperties0.container;
        String s12 = (v & 16) == 0 ? s4 : civ7IProperties0.access;
        String s13 = (v & 0x20) == 0 ? s5 : civ7IProperties0.definition;
        String s14 = (v & 0x40) == 0 ? s6 : civ7IProperties0.initializeBy;
        return (v & 0x80) == 0 ? civ7IProperties0.copy(s8, s9, s10, s11, s12, s13, s14, s7) : civ7IProperties0.copy(s8, s9, s10, s11, s12, s13, s14, civ7IProperties0.value);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7IProperties)) {
            return false;
        }
        if(!j.a(this.collection, ((Civ7IProperties)object0).collection)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7IProperties)object0).name)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7IProperties)object0).type)) {
            return false;
        }
        if(!j.a(this.container, ((Civ7IProperties)object0).container)) {
            return false;
        }
        if(!j.a(this.access, ((Civ7IProperties)object0).access)) {
            return false;
        }
        if(!j.a(this.definition, ((Civ7IProperties)object0).definition)) {
            return false;
        }
        return j.a(this.initializeBy, ((Civ7IProperties)object0).initializeBy) ? j.a(this.value, ((Civ7IProperties)object0).value) : false;
    }

    public final String getAccess() {
        return this.access;
    }

    public final String getCollection() {
        return this.collection;
    }

    public final String getContainer() {
        return this.container;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final String getInitializeBy() {
        return this.initializeBy;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.collection.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.type);
        int v1 = 0;
        int v2 = this.container == null ? 0 : this.container.hashCode();
        int v3 = this.access == null ? 0 : this.access.hashCode();
        int v4 = this.definition == null ? 0 : this.definition.hashCode();
        int v5 = this.initializeBy == null ? 0 : this.initializeBy.hashCode();
        String s = this.value;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7IProperties(collection=", this.collection, ", name=", this.name, ", type=");
        f.t(stringBuilder0, this.type, ", container=", this.container, ", access=");
        f.t(stringBuilder0, this.access, ", definition=", this.definition, ", initializeBy=");
        return e.i(stringBuilder0, this.initializeBy, ", value=", this.value, ")");
    }
}

