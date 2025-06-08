package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Era_NewEraVOs;", "", "eraType", "", "vOScript", "(Ljava/lang/String;Ljava/lang/String;)V", "getEraType", "()Ljava/lang/String;", "getVOScript", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Era_NewEraVOs {
    private final String eraType;
    private final String vOScript;

    public Civ5Era_NewEraVOs(String s, String s1) {
        this.eraType = s;
        this.vOScript = s1;
    }

    public final String component1() {
        return this.eraType;
    }

    public final String component2() {
        return this.vOScript;
    }

    public final Civ5Era_NewEraVOs copy(String s, String s1) {
        return new Civ5Era_NewEraVOs(s, s1);
    }

    public static Civ5Era_NewEraVOs copy$default(Civ5Era_NewEraVOs civ5Era_NewEraVOs0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Era_NewEraVOs0.eraType;
        }
        if((v & 2) != 0) {
            s1 = civ5Era_NewEraVOs0.vOScript;
        }
        return civ5Era_NewEraVOs0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Era_NewEraVOs)) {
            return false;
        }
        return j.a(this.eraType, ((Civ5Era_NewEraVOs)object0).eraType) ? j.a(this.vOScript, ((Civ5Era_NewEraVOs)object0).vOScript) : false;
    }

    public final String getEraType() {
        return this.eraType;
    }

    public final String getVOScript() {
        return this.vOScript;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.eraType == null ? 0 : this.eraType.hashCode();
        String s = this.vOScript;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return f.k("Civ5Era_NewEraVOs(eraType=", this.eraType, ", vOScript=", this.vOScript, ")");
    }
}

