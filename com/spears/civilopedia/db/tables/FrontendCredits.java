package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendCredits;", "", "package", "", "displayName", "credits", "sortOrder", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCredits", "()Ljava/lang/String;", "getDisplayName", "getPackage", "getSortOrder", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendCredits {
    private final String credits;
    private final String displayName;
    private final String package;
    private final int sortOrder;

    public FrontendCredits(String s, String s1, String s2, int v) {
        j.f(s, "package");
        j.f(s1, "displayName");
        j.f(s2, "credits");
        super();
        this.package = s;
        this.displayName = s1;
        this.credits = s2;
        this.sortOrder = v;
    }

    public final String component1() {
        return this.package;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.credits;
    }

    public final int component4() {
        return this.sortOrder;
    }

    public final FrontendCredits copy(String s, String s1, String s2, int v) {
        j.f(s, "package");
        j.f(s1, "displayName");
        j.f(s2, "credits");
        return new FrontendCredits(s, s1, s2, v);
    }

    public static FrontendCredits copy$default(FrontendCredits frontendCredits0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendCredits0.package;
        }
        if((v1 & 2) != 0) {
            s1 = frontendCredits0.displayName;
        }
        if((v1 & 4) != 0) {
            s2 = frontendCredits0.credits;
        }
        if((v1 & 8) != 0) {
            v = frontendCredits0.sortOrder;
        }
        return frontendCredits0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendCredits)) {
            return false;
        }
        if(!j.a(this.package, ((FrontendCredits)object0).package)) {
            return false;
        }
        if(!j.a(this.displayName, ((FrontendCredits)object0).displayName)) {
            return false;
        }
        return j.a(this.credits, ((FrontendCredits)object0).credits) ? this.sortOrder == ((FrontendCredits)object0).sortOrder : false;
    }

    public final String getCredits() {
        return this.credits;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPackage() {
        return this.package;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(this.package.hashCode() * 0x1F, 0x1F, this.displayName), 0x1F, this.credits) + this.sortOrder;
    }

    @Override
    public String toString() {
        return f.l(e.j("FrontendCredits(package=", this.package, ", displayName=", this.displayName, ", credits="), this.sortOrder, this.credits, ", sortOrder=", ")");
    }
}

