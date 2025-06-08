package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5ArtDefine_UnitInfos;", "", "type", "", "formation", "unitFlagAtlas", "iconAtlas", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFormation", "()Ljava/lang/String;", "getIconAtlas", "getType", "getUnitFlagAtlas", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5ArtDefine_UnitInfos {
    private final String formation;
    private final String iconAtlas;
    private final String type;
    private final String unitFlagAtlas;

    public Civ5ArtDefine_UnitInfos(String s, String s1, String s2, String s3) {
        j.f(s, "type");
        super();
        this.type = s;
        this.formation = s1;
        this.unitFlagAtlas = s2;
        this.iconAtlas = s3;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.formation;
    }

    public final String component3() {
        return this.unitFlagAtlas;
    }

    public final String component4() {
        return this.iconAtlas;
    }

    public final Civ5ArtDefine_UnitInfos copy(String s, String s1, String s2, String s3) {
        j.f(s, "type");
        return new Civ5ArtDefine_UnitInfos(s, s1, s2, s3);
    }

    public static Civ5ArtDefine_UnitInfos copy$default(Civ5ArtDefine_UnitInfos civ5ArtDefine_UnitInfos0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5ArtDefine_UnitInfos0.type;
        }
        if((v & 2) != 0) {
            s1 = civ5ArtDefine_UnitInfos0.formation;
        }
        if((v & 4) != 0) {
            s2 = civ5ArtDefine_UnitInfos0.unitFlagAtlas;
        }
        if((v & 8) != 0) {
            s3 = civ5ArtDefine_UnitInfos0.iconAtlas;
        }
        return civ5ArtDefine_UnitInfos0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5ArtDefine_UnitInfos)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5ArtDefine_UnitInfos)object0).type)) {
            return false;
        }
        if(!j.a(this.formation, ((Civ5ArtDefine_UnitInfos)object0).formation)) {
            return false;
        }
        return j.a(this.unitFlagAtlas, ((Civ5ArtDefine_UnitInfos)object0).unitFlagAtlas) ? j.a(this.iconAtlas, ((Civ5ArtDefine_UnitInfos)object0).iconAtlas) : false;
    }

    public final String getFormation() {
        return this.formation;
    }

    public final String getIconAtlas() {
        return this.iconAtlas;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnitFlagAtlas() {
        return this.unitFlagAtlas;
    }

    @Override
    public int hashCode() {
        int v = this.type.hashCode();
        int v1 = 0;
        int v2 = this.formation == null ? 0 : this.formation.hashCode();
        int v3 = this.unitFlagAtlas == null ? 0 : this.unitFlagAtlas.hashCode();
        String s = this.iconAtlas;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return e.i(e.j("Civ5ArtDefine_UnitInfos(type=", this.type, ", formation=", this.formation, ", unitFlagAtlas="), this.unitFlagAtlas, ", iconAtlas=", this.iconAtlas, ")");
    }
}

