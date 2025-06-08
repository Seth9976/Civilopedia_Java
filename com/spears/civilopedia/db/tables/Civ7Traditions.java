package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001A\u00020\u00072\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\f¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Traditions;", "", "traditionType", "", "ageType", "description", "isCrisis", "", "name", "traitType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAgeType", "()Ljava/lang/String;", "getDescription", "()Z", "getName", "getTraditionType", "getTraitType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Traditions {
    private final String ageType;
    private final String description;
    private final boolean isCrisis;
    private final String name;
    private final String traditionType;
    private final String traitType;

    public Civ7Traditions(String s, String s1, String s2, boolean z, String s3, String s4) {
        j.f(s, "traditionType");
        j.f(s3, "name");
        super();
        this.traditionType = s;
        this.ageType = s1;
        this.description = s2;
        this.isCrisis = z;
        this.name = s3;
        this.traitType = s4;
    }

    public final String component1() {
        return this.traditionType;
    }

    public final String component2() {
        return this.ageType;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.isCrisis;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.traitType;
    }

    public final Civ7Traditions copy(String s, String s1, String s2, boolean z, String s3, String s4) {
        j.f(s, "traditionType");
        j.f(s3, "name");
        return new Civ7Traditions(s, s1, s2, z, s3, s4);
    }

    public static Civ7Traditions copy$default(Civ7Traditions civ7Traditions0, String s, String s1, String s2, boolean z, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Traditions0.traditionType;
        }
        if((v & 2) != 0) {
            s1 = civ7Traditions0.ageType;
        }
        if((v & 4) != 0) {
            s2 = civ7Traditions0.description;
        }
        if((v & 8) != 0) {
            z = civ7Traditions0.isCrisis;
        }
        if((v & 16) != 0) {
            s3 = civ7Traditions0.name;
        }
        if((v & 0x20) != 0) {
            s4 = civ7Traditions0.traitType;
        }
        return civ7Traditions0.copy(s, s1, s2, z, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Traditions)) {
            return false;
        }
        if(!j.a(this.traditionType, ((Civ7Traditions)object0).traditionType)) {
            return false;
        }
        if(!j.a(this.ageType, ((Civ7Traditions)object0).ageType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Traditions)object0).description)) {
            return false;
        }
        if(this.isCrisis != ((Civ7Traditions)object0).isCrisis) {
            return false;
        }
        return j.a(this.name, ((Civ7Traditions)object0).name) ? j.a(this.traitType, ((Civ7Traditions)object0).traitType) : false;
    }

    public final String getAgeType() {
        return this.ageType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTraditionType() {
        return this.traditionType;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((((this.traditionType.hashCode() * 0x1F + (this.ageType == null ? 0 : this.ageType.hashCode())) * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.isCrisis ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.name);
        String s = this.traitType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    public final boolean isCrisis() {
        return this.isCrisis;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Traditions(traditionType=", this.traditionType, ", ageType=", this.ageType, ", description=");
        u9.x(stringBuilder0, this.description, ", isCrisis=", this.isCrisis, ", name=");
        return e.i(stringBuilder0, this.name, ", traitType=", this.traitType, ")");
    }
}

