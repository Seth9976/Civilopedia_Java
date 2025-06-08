package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J3\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendCompositorResources;", "", "atlasID", "", "sectionID", "type", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAtlasID", "()Ljava/lang/String;", "getPath", "getSectionID", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendCompositorResources {
    private final String atlasID;
    private final String path;
    private final String sectionID;
    private final String type;

    public FrontendCompositorResources(String s, String s1, String s2, String s3) {
        j.f(s, "atlasID");
        j.f(s2, "type");
        j.f(s3, "path");
        super();
        this.atlasID = s;
        this.sectionID = s1;
        this.type = s2;
        this.path = s3;
    }

    public final String component1() {
        return this.atlasID;
    }

    public final String component2() {
        return this.sectionID;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.path;
    }

    public final FrontendCompositorResources copy(String s, String s1, String s2, String s3) {
        j.f(s, "atlasID");
        j.f(s2, "type");
        j.f(s3, "path");
        return new FrontendCompositorResources(s, s1, s2, s3);
    }

    public static FrontendCompositorResources copy$default(FrontendCompositorResources frontendCompositorResources0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendCompositorResources0.atlasID;
        }
        if((v & 2) != 0) {
            s1 = frontendCompositorResources0.sectionID;
        }
        if((v & 4) != 0) {
            s2 = frontendCompositorResources0.type;
        }
        if((v & 8) != 0) {
            s3 = frontendCompositorResources0.path;
        }
        return frontendCompositorResources0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendCompositorResources)) {
            return false;
        }
        if(!j.a(this.atlasID, ((FrontendCompositorResources)object0).atlasID)) {
            return false;
        }
        if(!j.a(this.sectionID, ((FrontendCompositorResources)object0).sectionID)) {
            return false;
        }
        return j.a(this.type, ((FrontendCompositorResources)object0).type) ? j.a(this.path, ((FrontendCompositorResources)object0).path) : false;
    }

    public final String getAtlasID() {
        return this.atlasID;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSectionID() {
        return this.sectionID;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = this.atlasID.hashCode();
        return this.sectionID == null ? this.path.hashCode() + f.b(v * 961, 0x1F, this.type) : this.path.hashCode() + f.b((v * 0x1F + this.sectionID.hashCode()) * 0x1F, 0x1F, this.type);
    }

    @Override
    public String toString() {
        return e.i(e.j("FrontendCompositorResources(atlasID=", this.atlasID, ", sectionID=", this.sectionID, ", type="), this.type, ", path=", this.path, ")");
    }
}

