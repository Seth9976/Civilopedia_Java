package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Map_Sizes;", "", "mapType", "", "worldSizeType", "fileName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getMapType", "getWorldSizeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Map_Sizes {
    private final String fileName;
    private final String mapType;
    private final String worldSizeType;

    public Civ5Map_Sizes(String s, String s1, String s2) {
        j.f(s, "mapType");
        j.f(s1, "worldSizeType");
        j.f(s2, "fileName");
        super();
        this.mapType = s;
        this.worldSizeType = s1;
        this.fileName = s2;
    }

    public final String component1() {
        return this.mapType;
    }

    public final String component2() {
        return this.worldSizeType;
    }

    public final String component3() {
        return this.fileName;
    }

    public final Civ5Map_Sizes copy(String s, String s1, String s2) {
        j.f(s, "mapType");
        j.f(s1, "worldSizeType");
        j.f(s2, "fileName");
        return new Civ5Map_Sizes(s, s1, s2);
    }

    public static Civ5Map_Sizes copy$default(Civ5Map_Sizes civ5Map_Sizes0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Map_Sizes0.mapType;
        }
        if((v & 2) != 0) {
            s1 = civ5Map_Sizes0.worldSizeType;
        }
        if((v & 4) != 0) {
            s2 = civ5Map_Sizes0.fileName;
        }
        return civ5Map_Sizes0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Map_Sizes)) {
            return false;
        }
        if(!j.a(this.mapType, ((Civ5Map_Sizes)object0).mapType)) {
            return false;
        }
        return j.a(this.worldSizeType, ((Civ5Map_Sizes)object0).worldSizeType) ? j.a(this.fileName, ((Civ5Map_Sizes)object0).fileName) : false;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMapType() {
        return this.mapType;
    }

    public final String getWorldSizeType() {
        return this.worldSizeType;
    }

    @Override
    public int hashCode() {
        return this.fileName.hashCode() + f.b(this.mapType.hashCode() * 0x1F, 0x1F, this.worldSizeType);
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5Map_Sizes(mapType=", this.mapType, ", worldSizeType=", this.worldSizeType, ", fileName="), this.fileName, ")");
    }
}

