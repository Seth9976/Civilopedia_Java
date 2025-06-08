package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001B\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\u0007\u0012\u0006\u0010\f\u001A\u00020\r\u00A2\u0006\u0002\u0010\u000EJ\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0007H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\tH\u00C6\u0003J\t\u0010 \u001A\u00020\tH\u00C6\u0003J\t\u0010!\u001A\u00020\u0007H\u00C6\u0003J\t\u0010\"\u001A\u00020\rH\u00C6\u0003J[\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\rH\u00C6\u0001J\u0013\u0010$\u001A\u00020\r2\b\u0010%\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010&\u001A\u00020\tH\u00D6\u0001J\t\u0010\'\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000B\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0010R\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0010\u00A8\u0006("}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiOperationTeams;", "", "operationName", "", "teamName", "condition", "initialStrengthAdvantage", "", "maxUnits", "", "minUnits", "ongoingStrengthAdvantage", "safeRallyPoint", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIIDZ)V", "getCondition", "()Ljava/lang/String;", "getInitialStrengthAdvantage", "()D", "getMaxUnits", "()I", "getMinUnits", "getOngoingStrengthAdvantage", "getOperationName", "getSafeRallyPoint", "()Z", "getTeamName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiOperationTeams {
    private final String condition;
    private final double initialStrengthAdvantage;
    private final int maxUnits;
    private final int minUnits;
    private final double ongoingStrengthAdvantage;
    private final String operationName;
    private final boolean safeRallyPoint;
    private final String teamName;

    public Civ7AiOperationTeams(String s, String s1, String s2, double f, int v, int v1, double f1, boolean z) {
        j.f(s, "operationName");
        j.f(s1, "teamName");
        super();
        this.operationName = s;
        this.teamName = s1;
        this.condition = s2;
        this.initialStrengthAdvantage = f;
        this.maxUnits = v;
        this.minUnits = v1;
        this.ongoingStrengthAdvantage = f1;
        this.safeRallyPoint = z;
    }

    public final String component1() {
        return this.operationName;
    }

    public final String component2() {
        return this.teamName;
    }

    public final String component3() {
        return this.condition;
    }

    public final double component4() {
        return this.initialStrengthAdvantage;
    }

    public final int component5() {
        return this.maxUnits;
    }

    public final int component6() {
        return this.minUnits;
    }

    public final double component7() {
        return this.ongoingStrengthAdvantage;
    }

    public final boolean component8() {
        return this.safeRallyPoint;
    }

    public final Civ7AiOperationTeams copy(String s, String s1, String s2, double f, int v, int v1, double f1, boolean z) {
        j.f(s, "operationName");
        j.f(s1, "teamName");
        return new Civ7AiOperationTeams(s, s1, s2, f, v, v1, f1, z);
    }

    public static Civ7AiOperationTeams copy$default(Civ7AiOperationTeams civ7AiOperationTeams0, String s, String s1, String s2, double f, int v, int v1, double f1, boolean z, int v2, Object object0) {
        String s3 = (v2 & 1) == 0 ? s : civ7AiOperationTeams0.operationName;
        String s4 = (v2 & 2) == 0 ? s1 : civ7AiOperationTeams0.teamName;
        String s5 = (v2 & 4) == 0 ? s2 : civ7AiOperationTeams0.condition;
        double f2 = (v2 & 8) == 0 ? f : civ7AiOperationTeams0.initialStrengthAdvantage;
        int v3 = (v2 & 16) == 0 ? v : civ7AiOperationTeams0.maxUnits;
        int v4 = (v2 & 0x20) == 0 ? v1 : civ7AiOperationTeams0.minUnits;
        double f3 = (v2 & 0x40) == 0 ? f1 : civ7AiOperationTeams0.ongoingStrengthAdvantage;
        return (v2 & 0x80) == 0 ? civ7AiOperationTeams0.copy(s3, s4, s5, f2, v3, v4, f3, z) : civ7AiOperationTeams0.copy(s3, s4, s5, f2, v3, v4, f3, civ7AiOperationTeams0.safeRallyPoint);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiOperationTeams)) {
            return false;
        }
        if(!j.a(this.operationName, ((Civ7AiOperationTeams)object0).operationName)) {
            return false;
        }
        if(!j.a(this.teamName, ((Civ7AiOperationTeams)object0).teamName)) {
            return false;
        }
        if(!j.a(this.condition, ((Civ7AiOperationTeams)object0).condition)) {
            return false;
        }
        if(Double.compare(this.initialStrengthAdvantage, ((Civ7AiOperationTeams)object0).initialStrengthAdvantage) != 0) {
            return false;
        }
        if(this.maxUnits != ((Civ7AiOperationTeams)object0).maxUnits) {
            return false;
        }
        if(this.minUnits != ((Civ7AiOperationTeams)object0).minUnits) {
            return false;
        }
        return Double.compare(this.ongoingStrengthAdvantage, ((Civ7AiOperationTeams)object0).ongoingStrengthAdvantage) == 0 ? this.safeRallyPoint == ((Civ7AiOperationTeams)object0).safeRallyPoint : false;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final double getInitialStrengthAdvantage() {
        return this.initialStrengthAdvantage;
    }

    public final int getMaxUnits() {
        return this.maxUnits;
    }

    public final int getMinUnits() {
        return this.minUnits;
    }

    public final double getOngoingStrengthAdvantage() {
        return this.ongoingStrengthAdvantage;
    }

    public final String getOperationName() {
        return this.operationName;
    }

    public final boolean getSafeRallyPoint() {
        return this.safeRallyPoint;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.initialStrengthAdvantage);
        long v1 = Double.doubleToLongBits(this.ongoingStrengthAdvantage);
        int v2 = (((((f.b(this.operationName.hashCode() * 0x1F, 0x1F, this.teamName) + (this.condition == null ? 0 : this.condition.hashCode())) * 0x1F + ((int)(v ^ v >>> 0x20))) * 0x1F + this.maxUnits) * 0x1F + this.minUnits) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F;
        return this.safeRallyPoint ? v2 + 0x4CF : v2 + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AiOperationTeams(operationName=", this.operationName, ", teamName=", this.teamName, ", condition=");
        stringBuilder0.append(this.condition);
        stringBuilder0.append(", initialStrengthAdvantage=");
        stringBuilder0.append(this.initialStrengthAdvantage);
        stringBuilder0.append(", maxUnits=");
        stringBuilder0.append(this.maxUnits);
        stringBuilder0.append(", minUnits=");
        stringBuilder0.append(this.minUnits);
        stringBuilder0.append(", ongoingStrengthAdvantage=");
        stringBuilder0.append(this.ongoingStrengthAdvantage);
        stringBuilder0.append(", safeRallyPoint=");
        return u9.g(stringBuilder0, this.safeRallyPoint, ")");
    }
}

