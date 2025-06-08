package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Unit_ShadowReplacements;", "", "tag", "", "unitType", "coreClass", "domain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoreClass", "()Ljava/lang/String;", "getDomain", "getTag", "getUnitType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Unit_ShadowReplacements {
    private final String coreClass;
    private final String domain;
    private final String tag;
    private final String unitType;

    public Civ7Unit_ShadowReplacements(String s, String s1, String s2, String s3) {
        j.f(s, "tag");
        j.f(s1, "unitType");
        j.f(s2, "coreClass");
        j.f(s3, "domain");
        super();
        this.tag = s;
        this.unitType = s1;
        this.coreClass = s2;
        this.domain = s3;
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.unitType;
    }

    public final String component3() {
        return this.coreClass;
    }

    public final String component4() {
        return this.domain;
    }

    public final Civ7Unit_ShadowReplacements copy(String s, String s1, String s2, String s3) {
        j.f(s, "tag");
        j.f(s1, "unitType");
        j.f(s2, "coreClass");
        j.f(s3, "domain");
        return new Civ7Unit_ShadowReplacements(s, s1, s2, s3);
    }

    public static Civ7Unit_ShadowReplacements copy$default(Civ7Unit_ShadowReplacements civ7Unit_ShadowReplacements0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Unit_ShadowReplacements0.tag;
        }
        if((v & 2) != 0) {
            s1 = civ7Unit_ShadowReplacements0.unitType;
        }
        if((v & 4) != 0) {
            s2 = civ7Unit_ShadowReplacements0.coreClass;
        }
        if((v & 8) != 0) {
            s3 = civ7Unit_ShadowReplacements0.domain;
        }
        return civ7Unit_ShadowReplacements0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Unit_ShadowReplacements)) {
            return false;
        }
        if(!j.a(this.tag, ((Civ7Unit_ShadowReplacements)object0).tag)) {
            return false;
        }
        if(!j.a(this.unitType, ((Civ7Unit_ShadowReplacements)object0).unitType)) {
            return false;
        }
        return j.a(this.coreClass, ((Civ7Unit_ShadowReplacements)object0).coreClass) ? j.a(this.domain, ((Civ7Unit_ShadowReplacements)object0).domain) : false;
    }

    public final String getCoreClass() {
        return this.coreClass;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        return this.domain.hashCode() + f.b(f.b(this.tag.hashCode() * 0x1F, 0x1F, this.unitType), 0x1F, this.coreClass);
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ7Unit_ShadowReplacements(tag=", this.tag, ", unitType=", this.unitType, ", coreClass="), this.coreClass, ", domain=", this.domain, ")");
    }
}

