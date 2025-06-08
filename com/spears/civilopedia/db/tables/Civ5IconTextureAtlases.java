package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5IconTextureAtlases;", "", "atlas", "", "iconSize", "", "filename", "iconsPerRow", "iconsPerColumn", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAtlas", "()Ljava/lang/String;", "getFilename", "getIconSize", "()I", "getIconsPerColumn", "getIconsPerRow", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5IconTextureAtlases {
    private final String atlas;
    private final String filename;
    private final int iconSize;
    private final String iconsPerColumn;
    private final String iconsPerRow;

    public Civ5IconTextureAtlases(String s, int v, String s1, String s2, String s3) {
        j.f(s, "atlas");
        j.f(s1, "filename");
        j.f(s2, "iconsPerRow");
        j.f(s3, "iconsPerColumn");
        super();
        this.atlas = s;
        this.iconSize = v;
        this.filename = s1;
        this.iconsPerRow = s2;
        this.iconsPerColumn = s3;
    }

    public final String component1() {
        return this.atlas;
    }

    public final int component2() {
        return this.iconSize;
    }

    public final String component3() {
        return this.filename;
    }

    public final String component4() {
        return this.iconsPerRow;
    }

    public final String component5() {
        return this.iconsPerColumn;
    }

    public final Civ5IconTextureAtlases copy(String s, int v, String s1, String s2, String s3) {
        j.f(s, "atlas");
        j.f(s1, "filename");
        j.f(s2, "iconsPerRow");
        j.f(s3, "iconsPerColumn");
        return new Civ5IconTextureAtlases(s, v, s1, s2, s3);
    }

    public static Civ5IconTextureAtlases copy$default(Civ5IconTextureAtlases civ5IconTextureAtlases0, String s, int v, String s1, String s2, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5IconTextureAtlases0.atlas;
        }
        if((v1 & 2) != 0) {
            v = civ5IconTextureAtlases0.iconSize;
        }
        if((v1 & 4) != 0) {
            s1 = civ5IconTextureAtlases0.filename;
        }
        if((v1 & 8) != 0) {
            s2 = civ5IconTextureAtlases0.iconsPerRow;
        }
        if((v1 & 16) != 0) {
            s3 = civ5IconTextureAtlases0.iconsPerColumn;
        }
        return civ5IconTextureAtlases0.copy(s, v, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5IconTextureAtlases)) {
            return false;
        }
        if(!j.a(this.atlas, ((Civ5IconTextureAtlases)object0).atlas)) {
            return false;
        }
        if(this.iconSize != ((Civ5IconTextureAtlases)object0).iconSize) {
            return false;
        }
        if(!j.a(this.filename, ((Civ5IconTextureAtlases)object0).filename)) {
            return false;
        }
        return j.a(this.iconsPerRow, ((Civ5IconTextureAtlases)object0).iconsPerRow) ? j.a(this.iconsPerColumn, ((Civ5IconTextureAtlases)object0).iconsPerColumn) : false;
    }

    public final String getAtlas() {
        return this.atlas;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getIconSize() {
        return this.iconSize;
    }

    public final String getIconsPerColumn() {
        return this.iconsPerColumn;
    }

    public final String getIconsPerRow() {
        return this.iconsPerRow;
    }

    @Override
    public int hashCode() {
        return this.iconsPerColumn.hashCode() + f.b(f.b((this.atlas.hashCode() * 0x1F + this.iconSize) * 0x1F, 0x1F, this.filename), 0x1F, this.iconsPerRow);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.iconSize, "Civ5IconTextureAtlases(atlas=", this.atlas, ", iconSize=", ", filename=");
        f.t(stringBuilder0, this.filename, ", iconsPerRow=", this.iconsPerRow, ", iconsPerColumn=");
        return e.h(stringBuilder0, this.iconsPerColumn, ")");
    }
}

