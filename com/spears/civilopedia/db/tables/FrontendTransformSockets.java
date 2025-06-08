package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J?\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendTransformSockets;", "", "ID", "", "scene", "laterality", "space", "transform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/String;", "getLaterality", "getScene", "getSpace", "getTransform", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendTransformSockets {
    private final String ID;
    private final String laterality;
    private final String scene;
    private final String space;
    private final String transform;

    public FrontendTransformSockets(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "ID");
        j.f(s3, "space");
        j.f(s4, "transform");
        super();
        this.ID = s;
        this.scene = s1;
        this.laterality = s2;
        this.space = s3;
        this.transform = s4;
    }

    public final String component1() {
        return this.ID;
    }

    public final String component2() {
        return this.scene;
    }

    public final String component3() {
        return this.laterality;
    }

    public final String component4() {
        return this.space;
    }

    public final String component5() {
        return this.transform;
    }

    public final FrontendTransformSockets copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "ID");
        j.f(s3, "space");
        j.f(s4, "transform");
        return new FrontendTransformSockets(s, s1, s2, s3, s4);
    }

    public static FrontendTransformSockets copy$default(FrontendTransformSockets frontendTransformSockets0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendTransformSockets0.ID;
        }
        if((v & 2) != 0) {
            s1 = frontendTransformSockets0.scene;
        }
        if((v & 4) != 0) {
            s2 = frontendTransformSockets0.laterality;
        }
        if((v & 8) != 0) {
            s3 = frontendTransformSockets0.space;
        }
        if((v & 16) != 0) {
            s4 = frontendTransformSockets0.transform;
        }
        return frontendTransformSockets0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendTransformSockets)) {
            return false;
        }
        if(!j.a(this.ID, ((FrontendTransformSockets)object0).ID)) {
            return false;
        }
        if(!j.a(this.scene, ((FrontendTransformSockets)object0).scene)) {
            return false;
        }
        if(!j.a(this.laterality, ((FrontendTransformSockets)object0).laterality)) {
            return false;
        }
        return j.a(this.space, ((FrontendTransformSockets)object0).space) ? j.a(this.transform, ((FrontendTransformSockets)object0).transform) : false;
    }

    public final String getID() {
        return this.ID;
    }

    public final String getLaterality() {
        return this.laterality;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSpace() {
        return this.space;
    }

    public final String getTransform() {
        return this.transform;
    }

    @Override
    public int hashCode() {
        int v = this.ID.hashCode();
        int v1 = 0;
        int v2 = this.scene == null ? 0 : this.scene.hashCode();
        String s = this.laterality;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.transform.hashCode() + f.b(((v * 0x1F + v2) * 0x1F + v1) * 0x1F, 0x1F, this.space);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendTransformSockets(ID=", this.ID, ", scene=", this.scene, ", laterality=");
        f.t(stringBuilder0, this.laterality, ", space=", this.space, ", transform=");
        return e.h(stringBuilder0, this.transform, ")");
    }
}

