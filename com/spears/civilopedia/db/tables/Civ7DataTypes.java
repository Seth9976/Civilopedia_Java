package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DataTypes;", "", "dataId", "", "typeName", "", "(ILjava/lang/String;)V", "getDataId", "()I", "getTypeName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DataTypes {
    private final int dataId;
    private final String typeName;

    public Civ7DataTypes(int v, String s) {
        j.f(s, "typeName");
        super();
        this.dataId = v;
        this.typeName = s;
    }

    public final int component1() {
        return this.dataId;
    }

    public final String component2() {
        return this.typeName;
    }

    public final Civ7DataTypes copy(int v, String s) {
        j.f(s, "typeName");
        return new Civ7DataTypes(v, s);
    }

    public static Civ7DataTypes copy$default(Civ7DataTypes civ7DataTypes0, int v, String s, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = civ7DataTypes0.dataId;
        }
        if((v1 & 2) != 0) {
            s = civ7DataTypes0.typeName;
        }
        return civ7DataTypes0.copy(v, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DataTypes)) {
            return false;
        }
        return this.dataId == ((Civ7DataTypes)object0).dataId ? j.a(this.typeName, ((Civ7DataTypes)object0).typeName) : false;
    }

    public final int getDataId() {
        return this.dataId;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    @Override
    public int hashCode() {
        return this.typeName.hashCode() + this.dataId * 0x1F;
    }

    @Override
    public String toString() {
        return "Civ7DataTypes(dataId=" + this.dataId + ", typeName=" + this.typeName + ")";
    }
}

