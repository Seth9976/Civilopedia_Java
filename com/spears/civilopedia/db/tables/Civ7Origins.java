package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Origins;", "", "originType", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getOriginType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Origins {
    private final String description;
    private final String name;
    private final String originType;

    public Civ7Origins(String s, String s1, String s2) {
        j.f(s, "originType");
        j.f(s2, "name");
        super();
        this.originType = s;
        this.description = s1;
        this.name = s2;
    }

    public final String component1() {
        return this.originType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.name;
    }

    public final Civ7Origins copy(String s, String s1, String s2) {
        j.f(s, "originType");
        j.f(s2, "name");
        return new Civ7Origins(s, s1, s2);
    }

    public static Civ7Origins copy$default(Civ7Origins civ7Origins0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Origins0.originType;
        }
        if((v & 2) != 0) {
            s1 = civ7Origins0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7Origins0.name;
        }
        return civ7Origins0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Origins)) {
            return false;
        }
        if(!j.a(this.originType, ((Civ7Origins)object0).originType)) {
            return false;
        }
        return j.a(this.description, ((Civ7Origins)object0).description) ? j.a(this.name, ((Civ7Origins)object0).name) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginType() {
        return this.originType;
    }

    @Override
    public int hashCode() {
        int v = this.originType.hashCode();
        return this.description == null ? this.name.hashCode() + v * 961 : this.name.hashCode() + (v * 0x1F + this.description.hashCode()) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7Origins(originType=", this.originType, ", description=", this.description, ", name="), this.name, ")");
    }
}

