package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5ArtDefine_StrategicView;", "", "strategicViewType", "", "tileType", "asset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Ljava/lang/String;", "getStrategicViewType", "getTileType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5ArtDefine_StrategicView {
    private final String asset;
    private final String strategicViewType;
    private final String tileType;

    public Civ5ArtDefine_StrategicView(String s, String s1, String s2) {
        j.f(s1, "tileType");
        j.f(s2, "asset");
        super();
        this.strategicViewType = s;
        this.tileType = s1;
        this.asset = s2;
    }

    public final String component1() {
        return this.strategicViewType;
    }

    public final String component2() {
        return this.tileType;
    }

    public final String component3() {
        return this.asset;
    }

    public final Civ5ArtDefine_StrategicView copy(String s, String s1, String s2) {
        j.f(s1, "tileType");
        j.f(s2, "asset");
        return new Civ5ArtDefine_StrategicView(s, s1, s2);
    }

    public static Civ5ArtDefine_StrategicView copy$default(Civ5ArtDefine_StrategicView civ5ArtDefine_StrategicView0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5ArtDefine_StrategicView0.strategicViewType;
        }
        if((v & 2) != 0) {
            s1 = civ5ArtDefine_StrategicView0.tileType;
        }
        if((v & 4) != 0) {
            s2 = civ5ArtDefine_StrategicView0.asset;
        }
        return civ5ArtDefine_StrategicView0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5ArtDefine_StrategicView)) {
            return false;
        }
        if(!j.a(this.strategicViewType, ((Civ5ArtDefine_StrategicView)object0).strategicViewType)) {
            return false;
        }
        return j.a(this.tileType, ((Civ5ArtDefine_StrategicView)object0).tileType) ? j.a(this.asset, ((Civ5ArtDefine_StrategicView)object0).asset) : false;
    }

    public final String getAsset() {
        return this.asset;
    }

    public final String getStrategicViewType() {
        return this.strategicViewType;
    }

    public final String getTileType() {
        return this.tileType;
    }

    @Override
    public int hashCode() {
        return this.strategicViewType == null ? this.asset.hashCode() + f.b(0, 0x1F, this.tileType) : this.asset.hashCode() + f.b(this.strategicViewType.hashCode() * 0x1F, 0x1F, this.tileType);
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5ArtDefine_StrategicView(strategicViewType=", this.strategicViewType, ", tileType=", this.tileType, ", asset="), this.asset, ")");
    }
}

