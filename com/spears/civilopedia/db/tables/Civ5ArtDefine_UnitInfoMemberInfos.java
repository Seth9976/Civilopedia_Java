package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5ArtDefine_UnitInfoMemberInfos;", "", "unitInfoType", "", "unitMemberInfoType", "(Ljava/lang/String;Ljava/lang/String;)V", "getUnitInfoType", "()Ljava/lang/String;", "getUnitMemberInfoType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5ArtDefine_UnitInfoMemberInfos {
    private final String unitInfoType;
    private final String unitMemberInfoType;

    public Civ5ArtDefine_UnitInfoMemberInfos(String s, String s1) {
        this.unitInfoType = s;
        this.unitMemberInfoType = s1;
    }

    public final String component1() {
        return this.unitInfoType;
    }

    public final String component2() {
        return this.unitMemberInfoType;
    }

    public final Civ5ArtDefine_UnitInfoMemberInfos copy(String s, String s1) {
        return new Civ5ArtDefine_UnitInfoMemberInfos(s, s1);
    }

    public static Civ5ArtDefine_UnitInfoMemberInfos copy$default(Civ5ArtDefine_UnitInfoMemberInfos civ5ArtDefine_UnitInfoMemberInfos0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5ArtDefine_UnitInfoMemberInfos0.unitInfoType;
        }
        if((v & 2) != 0) {
            s1 = civ5ArtDefine_UnitInfoMemberInfos0.unitMemberInfoType;
        }
        return civ5ArtDefine_UnitInfoMemberInfos0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5ArtDefine_UnitInfoMemberInfos)) {
            return false;
        }
        return j.a(this.unitInfoType, ((Civ5ArtDefine_UnitInfoMemberInfos)object0).unitInfoType) ? j.a(this.unitMemberInfoType, ((Civ5ArtDefine_UnitInfoMemberInfos)object0).unitMemberInfoType) : false;
    }

    public final String getUnitInfoType() {
        return this.unitInfoType;
    }

    public final String getUnitMemberInfoType() {
        return this.unitMemberInfoType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.unitInfoType == null ? 0 : this.unitInfoType.hashCode();
        String s = this.unitMemberInfoType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return f.k("Civ5ArtDefine_UnitInfoMemberInfos(unitInfoType=", this.unitInfoType, ", unitMemberInfoType=", this.unitMemberInfoType, ")");
    }
}

