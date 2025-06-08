package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendCompositorAtlas;", "", "atlasID", "", "transform", "createOn", "socket", "options", "resolutionScale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAtlasID", "()Ljava/lang/String;", "getCreateOn", "getOptions", "getResolutionScale", "getSocket", "getTransform", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendCompositorAtlas {
    private final String atlasID;
    private final String createOn;
    private final String options;
    private final String resolutionScale;
    private final String socket;
    private final String transform;

    public FrontendCompositorAtlas(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "atlasID");
        super();
        this.atlasID = s;
        this.transform = s1;
        this.createOn = s2;
        this.socket = s3;
        this.options = s4;
        this.resolutionScale = s5;
    }

    public final String component1() {
        return this.atlasID;
    }

    public final String component2() {
        return this.transform;
    }

    public final String component3() {
        return this.createOn;
    }

    public final String component4() {
        return this.socket;
    }

    public final String component5() {
        return this.options;
    }

    public final String component6() {
        return this.resolutionScale;
    }

    public final FrontendCompositorAtlas copy(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "atlasID");
        return new FrontendCompositorAtlas(s, s1, s2, s3, s4, s5);
    }

    public static FrontendCompositorAtlas copy$default(FrontendCompositorAtlas frontendCompositorAtlas0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendCompositorAtlas0.atlasID;
        }
        if((v & 2) != 0) {
            s1 = frontendCompositorAtlas0.transform;
        }
        if((v & 4) != 0) {
            s2 = frontendCompositorAtlas0.createOn;
        }
        if((v & 8) != 0) {
            s3 = frontendCompositorAtlas0.socket;
        }
        if((v & 16) != 0) {
            s4 = frontendCompositorAtlas0.options;
        }
        if((v & 0x20) != 0) {
            s5 = frontendCompositorAtlas0.resolutionScale;
        }
        return frontendCompositorAtlas0.copy(s, s1, s2, s3, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendCompositorAtlas)) {
            return false;
        }
        if(!j.a(this.atlasID, ((FrontendCompositorAtlas)object0).atlasID)) {
            return false;
        }
        if(!j.a(this.transform, ((FrontendCompositorAtlas)object0).transform)) {
            return false;
        }
        if(!j.a(this.createOn, ((FrontendCompositorAtlas)object0).createOn)) {
            return false;
        }
        if(!j.a(this.socket, ((FrontendCompositorAtlas)object0).socket)) {
            return false;
        }
        return j.a(this.options, ((FrontendCompositorAtlas)object0).options) ? j.a(this.resolutionScale, ((FrontendCompositorAtlas)object0).resolutionScale) : false;
    }

    public final String getAtlasID() {
        return this.atlasID;
    }

    public final String getCreateOn() {
        return this.createOn;
    }

    public final String getOptions() {
        return this.options;
    }

    public final String getResolutionScale() {
        return this.resolutionScale;
    }

    public final String getSocket() {
        return this.socket;
    }

    public final String getTransform() {
        return this.transform;
    }

    @Override
    public int hashCode() {
        int v = this.atlasID.hashCode();
        int v1 = 0;
        int v2 = this.transform == null ? 0 : this.transform.hashCode();
        int v3 = this.createOn == null ? 0 : this.createOn.hashCode();
        int v4 = this.socket == null ? 0 : this.socket.hashCode();
        int v5 = this.options == null ? 0 : this.options.hashCode();
        String s = this.resolutionScale;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendCompositorAtlas(atlasID=", this.atlasID, ", transform=", this.transform, ", createOn=");
        f.t(stringBuilder0, this.createOn, ", socket=", this.socket, ", options=");
        return e.i(stringBuilder0, this.options, ", resolutionScale=", this.resolutionScale, ")");
    }
}

