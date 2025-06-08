package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003JA\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiLists;", "", "leaderType", "", "listType", "maxDifficulty", "minDifficulty", "system", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLeaderType", "()Ljava/lang/String;", "getListType", "getMaxDifficulty", "getMinDifficulty", "getSystem", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiLists {
    private final String leaderType;
    private final String listType;
    private final String maxDifficulty;
    private final String minDifficulty;
    private final String system;

    public Civ7AiLists(String s, String s1, String s2, String s3, String s4) {
        j.f(s1, "listType");
        j.f(s4, "system");
        super();
        this.leaderType = s;
        this.listType = s1;
        this.maxDifficulty = s2;
        this.minDifficulty = s3;
        this.system = s4;
    }

    public final String component1() {
        return this.leaderType;
    }

    public final String component2() {
        return this.listType;
    }

    public final String component3() {
        return this.maxDifficulty;
    }

    public final String component4() {
        return this.minDifficulty;
    }

    public final String component5() {
        return this.system;
    }

    public final Civ7AiLists copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s1, "listType");
        j.f(s4, "system");
        return new Civ7AiLists(s, s1, s2, s3, s4);
    }

    public static Civ7AiLists copy$default(Civ7AiLists civ7AiLists0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AiLists0.leaderType;
        }
        if((v & 2) != 0) {
            s1 = civ7AiLists0.listType;
        }
        if((v & 4) != 0) {
            s2 = civ7AiLists0.maxDifficulty;
        }
        if((v & 8) != 0) {
            s3 = civ7AiLists0.minDifficulty;
        }
        if((v & 16) != 0) {
            s4 = civ7AiLists0.system;
        }
        return civ7AiLists0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiLists)) {
            return false;
        }
        if(!j.a(this.leaderType, ((Civ7AiLists)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.listType, ((Civ7AiLists)object0).listType)) {
            return false;
        }
        if(!j.a(this.maxDifficulty, ((Civ7AiLists)object0).maxDifficulty)) {
            return false;
        }
        return j.a(this.minDifficulty, ((Civ7AiLists)object0).minDifficulty) ? j.a(this.system, ((Civ7AiLists)object0).system) : false;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final String getListType() {
        return this.listType;
    }

    public final String getMaxDifficulty() {
        return this.maxDifficulty;
    }

    public final String getMinDifficulty() {
        return this.minDifficulty;
    }

    public final String getSystem() {
        return this.system;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.leaderType == null ? 0 : this.leaderType.hashCode()) * 0x1F, 0x1F, this.listType);
        int v2 = this.maxDifficulty == null ? 0 : this.maxDifficulty.hashCode();
        String s = this.minDifficulty;
        if(s != null) {
            v = s.hashCode();
        }
        return this.system.hashCode() + ((v1 + v2) * 0x1F + v) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AiLists(leaderType=", this.leaderType, ", listType=", this.listType, ", maxDifficulty=");
        f.t(stringBuilder0, this.maxDifficulty, ", minDifficulty=", this.minDifficulty, ", system=");
        return e.h(stringBuilder0, this.system, ")");
    }
}

