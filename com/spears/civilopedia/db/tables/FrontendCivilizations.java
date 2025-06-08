package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000BJ\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001C\u001A\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JX\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001EJ\u0013\u0010\u001F\u001A\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001A\u00020\nHÖ\u0001J\t\u0010#\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0015\u0010\t\u001A\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001A\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendCivilizations;", "", "domain", "", "civilizationType", "civilizationName", "civilizationFullName", "civilizationDescription", "civilizationIcon", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCivilizationDescription", "()Ljava/lang/String;", "getCivilizationFullName", "getCivilizationIcon", "getCivilizationName", "getCivilizationType", "getDomain", "getSortIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/FrontendCivilizations;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendCivilizations {
    private final String civilizationDescription;
    private final String civilizationFullName;
    private final String civilizationIcon;
    private final String civilizationName;
    private final String civilizationType;
    private final String domain;
    private final Integer sortIndex;

    public FrontendCivilizations(String s, String s1, String s2, String s3, String s4, String s5, Integer integer0) {
        j.f(s, "domain");
        j.f(s1, "civilizationType");
        j.f(s2, "civilizationName");
        j.f(s3, "civilizationFullName");
        j.f(s4, "civilizationDescription");
        super();
        this.domain = s;
        this.civilizationType = s1;
        this.civilizationName = s2;
        this.civilizationFullName = s3;
        this.civilizationDescription = s4;
        this.civilizationIcon = s5;
        this.sortIndex = integer0;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.civilizationType;
    }

    public final String component3() {
        return this.civilizationName;
    }

    public final String component4() {
        return this.civilizationFullName;
    }

    public final String component5() {
        return this.civilizationDescription;
    }

    public final String component6() {
        return this.civilizationIcon;
    }

    public final Integer component7() {
        return this.sortIndex;
    }

    public final FrontendCivilizations copy(String s, String s1, String s2, String s3, String s4, String s5, Integer integer0) {
        j.f(s, "domain");
        j.f(s1, "civilizationType");
        j.f(s2, "civilizationName");
        j.f(s3, "civilizationFullName");
        j.f(s4, "civilizationDescription");
        return new FrontendCivilizations(s, s1, s2, s3, s4, s5, integer0);
    }

    public static FrontendCivilizations copy$default(FrontendCivilizations frontendCivilizations0, String s, String s1, String s2, String s3, String s4, String s5, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendCivilizations0.domain;
        }
        if((v & 2) != 0) {
            s1 = frontendCivilizations0.civilizationType;
        }
        if((v & 4) != 0) {
            s2 = frontendCivilizations0.civilizationName;
        }
        if((v & 8) != 0) {
            s3 = frontendCivilizations0.civilizationFullName;
        }
        if((v & 16) != 0) {
            s4 = frontendCivilizations0.civilizationDescription;
        }
        if((v & 0x20) != 0) {
            s5 = frontendCivilizations0.civilizationIcon;
        }
        if((v & 0x40) != 0) {
            integer0 = frontendCivilizations0.sortIndex;
        }
        return frontendCivilizations0.copy(s, s1, s2, s3, s4, s5, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendCivilizations)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendCivilizations)object0).domain)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((FrontendCivilizations)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.civilizationName, ((FrontendCivilizations)object0).civilizationName)) {
            return false;
        }
        if(!j.a(this.civilizationFullName, ((FrontendCivilizations)object0).civilizationFullName)) {
            return false;
        }
        if(!j.a(this.civilizationDescription, ((FrontendCivilizations)object0).civilizationDescription)) {
            return false;
        }
        return j.a(this.civilizationIcon, ((FrontendCivilizations)object0).civilizationIcon) ? j.a(this.sortIndex, ((FrontendCivilizations)object0).sortIndex) : false;
    }

    public final String getCivilizationDescription() {
        return this.civilizationDescription;
    }

    public final String getCivilizationFullName() {
        return this.civilizationFullName;
    }

    public final String getCivilizationIcon() {
        return this.civilizationIcon;
    }

    public final String getCivilizationName() {
        return this.civilizationName;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Integer getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.civilizationType), 0x1F, this.civilizationName), 0x1F, this.civilizationFullName), 0x1F, this.civilizationDescription);
        int v1 = 0;
        int v2 = this.civilizationIcon == null ? 0 : this.civilizationIcon.hashCode();
        Integer integer0 = this.sortIndex;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendCivilizations(domain=", this.domain, ", civilizationType=", this.civilizationType, ", civilizationName=");
        f.t(stringBuilder0, this.civilizationName, ", civilizationFullName=", this.civilizationFullName, ", civilizationDescription=");
        f.t(stringBuilder0, this.civilizationDescription, ", civilizationIcon=", this.civilizationIcon, ", sortIndex=");
        return u9.f(stringBuilder0, this.sortIndex, ")");
    }
}

