package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u001F\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiTactics;", "", "tacticType", "", "defaultPriority", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultPriority", "()Ljava/lang/String;", "getTacticType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiTactics {
    private final String defaultPriority;
    private final String tacticType;

    public Civ7AiTactics(String s, String s1) {
        j.f(s, "tacticType");
        super();
        this.tacticType = s;
        this.defaultPriority = s1;
    }

    public final String component1() {
        return this.tacticType;
    }

    public final String component2() {
        return this.defaultPriority;
    }

    public final Civ7AiTactics copy(String s, String s1) {
        j.f(s, "tacticType");
        return new Civ7AiTactics(s, s1);
    }

    public static Civ7AiTactics copy$default(Civ7AiTactics civ7AiTactics0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AiTactics0.tacticType;
        }
        if((v & 2) != 0) {
            s1 = civ7AiTactics0.defaultPriority;
        }
        return civ7AiTactics0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiTactics)) {
            return false;
        }
        return j.a(this.tacticType, ((Civ7AiTactics)object0).tacticType) ? j.a(this.defaultPriority, ((Civ7AiTactics)object0).defaultPriority) : false;
    }

    public final String getDefaultPriority() {
        return this.defaultPriority;
    }

    public final String getTacticType() {
        return this.tacticType;
    }

    @Override
    public int hashCode() {
        int v = this.tacticType.hashCode();
        return this.defaultPriority == null ? v * 0x1F : v * 0x1F + this.defaultPriority.hashCode();
    }

    @Override
    public String toString() {
        return f.k("Civ7AiTactics(tacticType=", this.tacticType, ", defaultPriority=", this.defaultPriority, ")");
    }
}

