package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\bHÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003JE\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendDefeats;", "", "domain", "", "defeatType", "name", "description", "visible", "", "readOnly", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDefeatType", "()Ljava/lang/String;", "getDescription", "getDomain", "getName", "getReadOnly", "getVisible", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendDefeats {
    private final String defeatType;
    private final String description;
    private final String domain;
    private final String name;
    private final String readOnly;
    private final boolean visible;

    public FrontendDefeats(String s, String s1, String s2, String s3, boolean z, String s4) {
        j.f(s, "domain");
        j.f(s1, "defeatType");
        j.f(s2, "name");
        j.f(s3, "description");
        j.f(s4, "readOnly");
        super();
        this.domain = s;
        this.defeatType = s1;
        this.name = s2;
        this.description = s3;
        this.visible = z;
        this.readOnly = s4;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.defeatType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.visible;
    }

    public final String component6() {
        return this.readOnly;
    }

    public final FrontendDefeats copy(String s, String s1, String s2, String s3, boolean z, String s4) {
        j.f(s, "domain");
        j.f(s1, "defeatType");
        j.f(s2, "name");
        j.f(s3, "description");
        j.f(s4, "readOnly");
        return new FrontendDefeats(s, s1, s2, s3, z, s4);
    }

    public static FrontendDefeats copy$default(FrontendDefeats frontendDefeats0, String s, String s1, String s2, String s3, boolean z, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendDefeats0.domain;
        }
        if((v & 2) != 0) {
            s1 = frontendDefeats0.defeatType;
        }
        if((v & 4) != 0) {
            s2 = frontendDefeats0.name;
        }
        if((v & 8) != 0) {
            s3 = frontendDefeats0.description;
        }
        if((v & 16) != 0) {
            z = frontendDefeats0.visible;
        }
        if((v & 0x20) != 0) {
            s4 = frontendDefeats0.readOnly;
        }
        return frontendDefeats0.copy(s, s1, s2, s3, z, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendDefeats)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendDefeats)object0).domain)) {
            return false;
        }
        if(!j.a(this.defeatType, ((FrontendDefeats)object0).defeatType)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendDefeats)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((FrontendDefeats)object0).description)) {
            return false;
        }
        return this.visible == ((FrontendDefeats)object0).visible ? j.a(this.readOnly, ((FrontendDefeats)object0).readOnly) : false;
    }

    public final String getDefeatType() {
        return this.defeatType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReadOnly() {
        return this.readOnly;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.defeatType), 0x1F, this.name), 0x1F, this.description);
        return this.visible ? this.readOnly.hashCode() + (v + 0x4CF) * 0x1F : this.readOnly.hashCode() + (v + 0x4D5) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendDefeats(domain=", this.domain, ", defeatType=", this.defeatType, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", visible=");
        stringBuilder0.append(this.visible);
        stringBuilder0.append(", readOnly=");
        stringBuilder0.append(this.readOnly);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

