package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001A\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\f\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\tH\u00C6\u0003J\t\u0010\u001F\u001A\u00020\tH\u00C6\u0003J\t\u0010 \u001A\u00020\fH\u00C6\u0003J]\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u00C6\u0001J\u0013\u0010\"\u001A\u00020\t2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010$\u001A\u00020\fH\u00D6\u0001J\t\u0010%\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0011\u0010\u000B\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0017\u00A8\u0006&"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMaps;", "", "domain", "", "file", "name", "description", "image", "staticMap", "", "worldBuilderOnly", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V", "getDescription", "()Ljava/lang/String;", "getDomain", "getFile", "getImage", "getName", "getSortIndex", "()I", "getStaticMap", "()Z", "getWorldBuilderOnly", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMaps {
    private final String description;
    private final String domain;
    private final String file;
    private final String image;
    private final String name;
    private final int sortIndex;
    private final boolean staticMap;
    private final boolean worldBuilderOnly;

    public FrontendMaps(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, int v) {
        j.f(s, "domain");
        j.f(s1, "file");
        j.f(s2, "name");
        super();
        this.domain = s;
        this.file = s1;
        this.name = s2;
        this.description = s3;
        this.image = s4;
        this.staticMap = z;
        this.worldBuilderOnly = z1;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.file;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.image;
    }

    public final boolean component6() {
        return this.staticMap;
    }

    public final boolean component7() {
        return this.worldBuilderOnly;
    }

    public final int component8() {
        return this.sortIndex;
    }

    public final FrontendMaps copy(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, int v) {
        j.f(s, "domain");
        j.f(s1, "file");
        j.f(s2, "name");
        return new FrontendMaps(s, s1, s2, s3, s4, z, z1, v);
    }

    public static FrontendMaps copy$default(FrontendMaps frontendMaps0, String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, int v, int v1, Object object0) {
        String s5 = (v1 & 1) == 0 ? s : frontendMaps0.domain;
        String s6 = (v1 & 2) == 0 ? s1 : frontendMaps0.file;
        String s7 = (v1 & 4) == 0 ? s2 : frontendMaps0.name;
        String s8 = (v1 & 8) == 0 ? s3 : frontendMaps0.description;
        String s9 = (v1 & 16) == 0 ? s4 : frontendMaps0.image;
        boolean z2 = (v1 & 0x20) == 0 ? z : frontendMaps0.staticMap;
        boolean z3 = (v1 & 0x40) == 0 ? z1 : frontendMaps0.worldBuilderOnly;
        return (v1 & 0x80) == 0 ? frontendMaps0.copy(s5, s6, s7, s8, s9, z2, z3, v) : frontendMaps0.copy(s5, s6, s7, s8, s9, z2, z3, frontendMaps0.sortIndex);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendMaps)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendMaps)object0).domain)) {
            return false;
        }
        if(!j.a(this.file, ((FrontendMaps)object0).file)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendMaps)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((FrontendMaps)object0).description)) {
            return false;
        }
        if(!j.a(this.image, ((FrontendMaps)object0).image)) {
            return false;
        }
        if(this.staticMap != ((FrontendMaps)object0).staticMap) {
            return false;
        }
        return this.worldBuilderOnly == ((FrontendMaps)object0).worldBuilderOnly ? this.sortIndex == ((FrontendMaps)object0).sortIndex : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final boolean getStaticMap() {
        return this.staticMap;
    }

    public final boolean getWorldBuilderOnly() {
        return this.worldBuilderOnly;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.file), 0x1F, this.name);
        int v1 = 0;
        int v2 = this.description == null ? 0 : this.description.hashCode();
        String s = this.image;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v3 = 0x4D5;
        int v4 = this.staticMap ? 0x4CF : 0x4D5;
        if(this.worldBuilderOnly) {
            v3 = 0x4CF;
        }
        return ((((v + v2) * 0x1F + v1) * 0x1F + v4) * 0x1F + v3) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendMaps(domain=", this.domain, ", file=", this.file, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", image=");
        u9.x(stringBuilder0, this.image, ", staticMap=", this.staticMap, ", worldBuilderOnly=");
        stringBuilder0.append(this.worldBuilderOnly);
        stringBuilder0.append(", sortIndex=");
        stringBuilder0.append(this.sortIndex);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

