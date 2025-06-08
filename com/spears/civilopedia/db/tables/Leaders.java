package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\t\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001A\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0018Jd\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0010J\u0010\u0010\u001E\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u0018J\u001A\u0010!\u001A\u00020\u00062\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u00D6\u0003\u00A2\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010#\u001A\u0004\b$\u0010\u0010R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010#\u001A\u0004\b%\u0010\u0010R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010#\u001A\u0004\b&\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010\'\u001A\u0004\b\u0007\u0010\u0015R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010#\u001A\u0004\b(\u0010\u0010R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\n\u0010)\u001A\u0004\b*\u0010\u0018R\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010#\u001A\u0004\b+\u0010\u0010R\u0017\u0010\f\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\f\u0010)\u001A\u0004\b,\u0010\u0018\u00A8\u0006-"}, d2 = {"Lcom/spears/civilopedia/db/tables/Leaders;", "Lo2/m;", "", "leaderType", "name", "operationList", "", "isBarbarianLeader", "inheritFrom", "", "sceneLayers", "sex", "sameSexPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Z", "component5", "component6", "()I", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;I)Lcom/spears/civilopedia/db/tables/Leaders;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeaderType", "getName", "getOperationList", "Z", "getInheritFrom", "I", "getSceneLayers", "getSex", "getSameSexPercentage", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Leaders implements m {
    private final String inheritFrom;
    private final boolean isBarbarianLeader;
    private final String leaderType;
    private final String name;
    private final String operationList;
    private final int sameSexPercentage;
    private final int sceneLayers;
    private final String sex;

    public Leaders(String s, String s1, String s2, boolean z, String s3, int v, String s4, int v1) {
        j.f(s, "leaderType");
        j.f(s1, "name");
        j.f(s4, "sex");
        super();
        this.leaderType = s;
        this.name = s1;
        this.operationList = s2;
        this.isBarbarianLeader = z;
        this.inheritFrom = s3;
        this.sceneLayers = v;
        this.sex = s4;
        this.sameSexPercentage = v1;
    }

    public final String component1() {
        return this.leaderType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.operationList;
    }

    public final boolean component4() {
        return this.isBarbarianLeader;
    }

    public final String component5() {
        return this.inheritFrom;
    }

    public final int component6() {
        return this.sceneLayers;
    }

    public final String component7() {
        return this.sex;
    }

    public final int component8() {
        return this.sameSexPercentage;
    }

    public final Leaders copy(String s, String s1, String s2, boolean z, String s3, int v, String s4, int v1) {
        j.f(s, "leaderType");
        j.f(s1, "name");
        j.f(s4, "sex");
        return new Leaders(s, s1, s2, z, s3, v, s4, v1);
    }

    public static Leaders copy$default(Leaders leaders0, String s, String s1, String s2, boolean z, String s3, int v, String s4, int v1, int v2, Object object0) {
        String s5 = (v2 & 1) == 0 ? s : leaders0.leaderType;
        String s6 = (v2 & 2) == 0 ? s1 : leaders0.name;
        String s7 = (v2 & 4) == 0 ? s2 : leaders0.operationList;
        boolean z1 = (v2 & 8) == 0 ? z : leaders0.isBarbarianLeader;
        String s8 = (v2 & 16) == 0 ? s3 : leaders0.inheritFrom;
        int v3 = (v2 & 0x20) == 0 ? v : leaders0.sceneLayers;
        String s9 = (v2 & 0x40) == 0 ? s4 : leaders0.sex;
        return (v2 & 0x80) == 0 ? leaders0.copy(s5, s6, s7, z1, s8, v3, s9, v1) : leaders0.copy(s5, s6, s7, z1, s8, v3, s9, leaders0.sameSexPercentage);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Leaders)) {
            return false;
        }
        if(!j.a(this.leaderType, ((Leaders)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.name, ((Leaders)object0).name)) {
            return false;
        }
        if(!j.a(this.operationList, ((Leaders)object0).operationList)) {
            return false;
        }
        if(this.isBarbarianLeader != ((Leaders)object0).isBarbarianLeader) {
            return false;
        }
        if(!j.a(this.inheritFrom, ((Leaders)object0).inheritFrom)) {
            return false;
        }
        if(this.sceneLayers != ((Leaders)object0).sceneLayers) {
            return false;
        }
        return j.a(this.sex, ((Leaders)object0).sex) ? this.sameSexPercentage == ((Leaders)object0).sameSexPercentage : false;
    }

    public final String getInheritFrom() {
        return this.inheritFrom;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOperationList() {
        return this.operationList;
    }

    public final int getSameSexPercentage() {
        return this.sameSexPercentage;
    }

    public final int getSceneLayers() {
        return this.sceneLayers;
    }

    public final String getSex() {
        return this.sex;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.leaderType.hashCode() * 0x1F, 0x1F, this.name);
        int v1 = 0;
        int v2 = this.operationList == null ? 0 : this.operationList.hashCode();
        int v3 = this.isBarbarianLeader ? 0x4CF : 0x4D5;
        String s = this.inheritFrom;
        if(s != null) {
            v1 = s.hashCode();
        }
        return f.b(((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.sceneLayers) * 0x1F, 0x1F, this.sex) + this.sameSexPercentage;
    }

    public final boolean isBarbarianLeader() {
        return this.isBarbarianLeader;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.leaderType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Leaders(leaderType=", this.leaderType, ", name=", this.name, ", operationList=");
        u9.x(stringBuilder0, this.operationList, ", isBarbarianLeader=", this.isBarbarianLeader, ", inheritFrom=");
        f.s(stringBuilder0, this.inheritFrom, ", sceneLayers=", this.sceneLayers, ", sex=");
        return f.l(stringBuilder0, this.sameSexPercentage, this.sex, ", sameSexPercentage=", ")");
    }
}

