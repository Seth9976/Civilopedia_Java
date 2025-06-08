package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7ShapeDefinitions;", "", "shapeId", "", "description", "", "maxChildren", "minChildren", "shapeName", "(ILjava/lang/String;IILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getMaxChildren", "()I", "getMinChildren", "getShapeId", "getShapeName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7ShapeDefinitions {
    private final String description;
    private final int maxChildren;
    private final int minChildren;
    private final int shapeId;
    private final String shapeName;

    public Civ7ShapeDefinitions(int v, String s, int v1, int v2, String s1) {
        j.f(s, "description");
        j.f(s1, "shapeName");
        super();
        this.shapeId = v;
        this.description = s;
        this.maxChildren = v1;
        this.minChildren = v2;
        this.shapeName = s1;
    }

    public final int component1() {
        return this.shapeId;
    }

    public final String component2() {
        return this.description;
    }

    public final int component3() {
        return this.maxChildren;
    }

    public final int component4() {
        return this.minChildren;
    }

    public final String component5() {
        return this.shapeName;
    }

    public final Civ7ShapeDefinitions copy(int v, String s, int v1, int v2, String s1) {
        j.f(s, "description");
        j.f(s1, "shapeName");
        return new Civ7ShapeDefinitions(v, s, v1, v2, s1);
    }

    public static Civ7ShapeDefinitions copy$default(Civ7ShapeDefinitions civ7ShapeDefinitions0, int v, String s, int v1, int v2, String s1, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = civ7ShapeDefinitions0.shapeId;
        }
        if((v3 & 2) != 0) {
            s = civ7ShapeDefinitions0.description;
        }
        if((v3 & 4) != 0) {
            v1 = civ7ShapeDefinitions0.maxChildren;
        }
        if((v3 & 8) != 0) {
            v2 = civ7ShapeDefinitions0.minChildren;
        }
        if((v3 & 16) != 0) {
            s1 = civ7ShapeDefinitions0.shapeName;
        }
        return civ7ShapeDefinitions0.copy(v, s, v1, v2, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7ShapeDefinitions)) {
            return false;
        }
        if(this.shapeId != ((Civ7ShapeDefinitions)object0).shapeId) {
            return false;
        }
        if(!j.a(this.description, ((Civ7ShapeDefinitions)object0).description)) {
            return false;
        }
        if(this.maxChildren != ((Civ7ShapeDefinitions)object0).maxChildren) {
            return false;
        }
        return this.minChildren == ((Civ7ShapeDefinitions)object0).minChildren ? j.a(this.shapeName, ((Civ7ShapeDefinitions)object0).shapeName) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMaxChildren() {
        return this.maxChildren;
    }

    public final int getMinChildren() {
        return this.minChildren;
    }

    public final int getShapeId() {
        return this.shapeId;
    }

    public final String getShapeName() {
        return this.shapeName;
    }

    @Override
    public int hashCode() {
        return this.shapeName.hashCode() + ((f.b(this.shapeId * 0x1F, 0x1F, this.description) + this.maxChildren) * 0x1F + this.minChildren) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7ShapeDefinitions(shapeId=");
        stringBuilder0.append(this.shapeId);
        stringBuilder0.append(", description=");
        stringBuilder0.append(this.description);
        stringBuilder0.append(", maxChildren=");
        f.q(stringBuilder0, this.maxChildren, ", minChildren=", this.minChildren, ", shapeName=");
        return e.h(stringBuilder0, this.shapeName, ")");
    }
}

