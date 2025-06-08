package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\n¢\u0006\u0002\u0010\u000BJ\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\nHÆ\u0003JW\u0010\u001C\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\nHÆ\u0001J\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001A\u00020\nHÖ\u0001J\t\u0010!\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\rR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDomainValues;", "", "key1", "", "key2", "domain", "name", "description", "icon", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getDomain", "getIcon", "getKey1", "getKey2", "getName", "getSortIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDomainValues {
    private final String description;
    private final String domain;
    private final String icon;
    private final String key1;
    private final String key2;
    private final String name;
    private final int sortIndex;

    public FrontendDomainValues(String s, String s1, String s2, String s3, String s4, String s5, int v) {
        j.f(s2, "domain");
        j.f(s3, "name");
        super();
        this.key1 = s;
        this.key2 = s1;
        this.domain = s2;
        this.name = s3;
        this.description = s4;
        this.icon = s5;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.key1;
    }

    public final String component2() {
        return this.key2;
    }

    public final String component3() {
        return this.domain;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.icon;
    }

    public final int component7() {
        return this.sortIndex;
    }

    public final FrontendDomainValues copy(String s, String s1, String s2, String s3, String s4, String s5, int v) {
        j.f(s2, "domain");
        j.f(s3, "name");
        return new FrontendDomainValues(s, s1, s2, s3, s4, s5, v);
    }

    public static FrontendDomainValues copy$default(FrontendDomainValues frontendDomainValues0, String s, String s1, String s2, String s3, String s4, String s5, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendDomainValues0.key1;
        }
        if((v1 & 2) != 0) {
            s1 = frontendDomainValues0.key2;
        }
        if((v1 & 4) != 0) {
            s2 = frontendDomainValues0.domain;
        }
        if((v1 & 8) != 0) {
            s3 = frontendDomainValues0.name;
        }
        if((v1 & 16) != 0) {
            s4 = frontendDomainValues0.description;
        }
        if((v1 & 0x20) != 0) {
            s5 = frontendDomainValues0.icon;
        }
        if((v1 & 0x40) != 0) {
            v = frontendDomainValues0.sortIndex;
        }
        return frontendDomainValues0.copy(s, s1, s2, s3, s4, s5, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendDomainValues)) {
            return false;
        }
        if(!j.a(this.key1, ((FrontendDomainValues)object0).key1)) {
            return false;
        }
        if(!j.a(this.key2, ((FrontendDomainValues)object0).key2)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendDomainValues)object0).domain)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendDomainValues)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((FrontendDomainValues)object0).description)) {
            return false;
        }
        return j.a(this.icon, ((FrontendDomainValues)object0).icon) ? this.sortIndex == ((FrontendDomainValues)object0).sortIndex : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getKey1() {
        return this.key1;
    }

    public final String getKey2() {
        return this.key2;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(f.b(((this.key1 == null ? 0 : this.key1.hashCode()) * 0x1F + (this.key2 == null ? 0 : this.key2.hashCode())) * 0x1F, 0x1F, this.domain), 0x1F, this.name);
        int v2 = this.description == null ? 0 : this.description.hashCode();
        String s = this.icon;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + v2) * 0x1F + v) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendDomainValues(key1=", this.key1, ", key2=", this.key2, ", domain=");
        f.t(stringBuilder0, this.domain, ", name=", this.name, ", description=");
        f.t(stringBuilder0, this.description, ", icon=", this.icon, ", sortIndex=");
        return e.g(stringBuilder0, this.sortIndex, ")");
    }
}

