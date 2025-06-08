package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0012\u0010\r\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J<\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001B\u001A\u0004\b\u001D\u0010\u000BR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001B\u001A\u0004\b\u001E\u0010\u000BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001F\u001A\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Traits;", "Lo2/m;", "", "traitType", "name", "description", "", "internalOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/spears/civilopedia/db/tables/Traits;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTraitType", "getName", "getDescription", "Z", "getInternalOnly", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Traits implements m {
    private final String description;
    private final boolean internalOnly;
    private final String name;
    private final String traitType;

    public Traits(String s, String s1, String s2, boolean z) {
        j.f(s, "traitType");
        super();
        this.traitType = s;
        this.name = s1;
        this.description = s2;
        this.internalOnly = z;
    }

    public final String component1() {
        return this.traitType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.internalOnly;
    }

    public final Traits copy(String s, String s1, String s2, boolean z) {
        j.f(s, "traitType");
        return new Traits(s, s1, s2, z);
    }

    public static Traits copy$default(Traits traits0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = traits0.traitType;
        }
        if((v & 2) != 0) {
            s1 = traits0.name;
        }
        if((v & 4) != 0) {
            s2 = traits0.description;
        }
        if((v & 8) != 0) {
            z = traits0.internalOnly;
        }
        return traits0.copy(s, s1, s2, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Traits)) {
            return false;
        }
        if(!j.a(this.traitType, ((Traits)object0).traitType)) {
            return false;
        }
        if(!j.a(this.name, ((Traits)object0).name)) {
            return false;
        }
        return j.a(this.description, ((Traits)object0).description) ? this.internalOnly == ((Traits)object0).internalOnly : false;
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
        int v2 = this.name == null ? 0 : this.name.hashCode();
        String s = this.description;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.internalOnly ? ((v * 0x1F + v2) * 0x1F + v1) * 0x1F + 0x4CF : ((v * 0x1F + v2) * 0x1F + v1) * 0x1F + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.traitType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Traits(traitType=", this.traitType, ", name=", this.name, ", description=");
        stringBuilder0.append(this.description);
        stringBuilder0.append(", internalOnly=");
        stringBuilder0.append(this.internalOnly);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

