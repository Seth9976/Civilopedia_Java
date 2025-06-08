package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010JB\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001A\u0010\u001B\u001A\u00020\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001D\u001A\u0004\b\u001E\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001F\u001A\u0004\b \u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001A\u0004\b\"\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001D\u001A\u0004\b#\u0010\rR\u0017\u0010\t\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001F\u001A\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionMilestones;", "Lo2/m;", "", "ageProgressionMilestoneType", "", "ageProgressionAmount", "", "finalMilestone", "legacyPathType", "requiredPathPoints", "<init>", "(Ljava/lang/String;IZLjava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;IZLjava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionMilestones;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgeProgressionMilestoneType", "I", "getAgeProgressionAmount", "Z", "getFinalMilestone", "getLegacyPathType", "getRequiredPathPoints", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeProgressionMilestones implements m {
    private final int ageProgressionAmount;
    private final String ageProgressionMilestoneType;
    private final boolean finalMilestone;
    private final String legacyPathType;
    private final int requiredPathPoints;

    public Civ7AgeProgressionMilestones(String s, int v, boolean z, String s1, int v1) {
        j.f(s, "ageProgressionMilestoneType");
        j.f(s1, "legacyPathType");
        super();
        this.ageProgressionMilestoneType = s;
        this.ageProgressionAmount = v;
        this.finalMilestone = z;
        this.legacyPathType = s1;
        this.requiredPathPoints = v1;
    }

    public final String component1() {
        return this.ageProgressionMilestoneType;
    }

    public final int component2() {
        return this.ageProgressionAmount;
    }

    public final boolean component3() {
        return this.finalMilestone;
    }

    public final String component4() {
        return this.legacyPathType;
    }

    public final int component5() {
        return this.requiredPathPoints;
    }

    public final Civ7AgeProgressionMilestones copy(String s, int v, boolean z, String s1, int v1) {
        j.f(s, "ageProgressionMilestoneType");
        j.f(s1, "legacyPathType");
        return new Civ7AgeProgressionMilestones(s, v, z, s1, v1);
    }

    public static Civ7AgeProgressionMilestones copy$default(Civ7AgeProgressionMilestones civ7AgeProgressionMilestones0, String s, int v, boolean z, String s1, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7AgeProgressionMilestones0.ageProgressionMilestoneType;
        }
        if((v2 & 2) != 0) {
            v = civ7AgeProgressionMilestones0.ageProgressionAmount;
        }
        if((v2 & 4) != 0) {
            z = civ7AgeProgressionMilestones0.finalMilestone;
        }
        if((v2 & 8) != 0) {
            s1 = civ7AgeProgressionMilestones0.legacyPathType;
        }
        if((v2 & 16) != 0) {
            v1 = civ7AgeProgressionMilestones0.requiredPathPoints;
        }
        return civ7AgeProgressionMilestones0.copy(s, v, z, s1, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeProgressionMilestones)) {
            return false;
        }
        if(!j.a(this.ageProgressionMilestoneType, ((Civ7AgeProgressionMilestones)object0).ageProgressionMilestoneType)) {
            return false;
        }
        if(this.ageProgressionAmount != ((Civ7AgeProgressionMilestones)object0).ageProgressionAmount) {
            return false;
        }
        if(this.finalMilestone != ((Civ7AgeProgressionMilestones)object0).finalMilestone) {
            return false;
        }
        return j.a(this.legacyPathType, ((Civ7AgeProgressionMilestones)object0).legacyPathType) ? this.requiredPathPoints == ((Civ7AgeProgressionMilestones)object0).requiredPathPoints : false;
    }

    public final int getAgeProgressionAmount() {
        return this.ageProgressionAmount;
    }

    public final String getAgeProgressionMilestoneType() {
        return this.ageProgressionMilestoneType;
    }

    public final boolean getFinalMilestone() {
        return this.finalMilestone;
    }

    public final String getLegacyPathType() {
        return this.legacyPathType;
    }

    public final int getRequiredPathPoints() {
        return this.requiredPathPoints;
    }

    @Override
    public int hashCode() {
        int v = (this.ageProgressionMilestoneType.hashCode() * 0x1F + this.ageProgressionAmount) * 0x1F;
        return this.finalMilestone ? f.b((v + 0x4CF) * 0x1F, 0x1F, this.legacyPathType) + this.requiredPathPoints : f.b((v + 0x4D5) * 0x1F, 0x1F, this.legacyPathType) + this.requiredPathPoints;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.ageProgressionMilestoneType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.ageProgressionAmount, "Civ7AgeProgressionMilestones(ageProgressionMilestoneType=", this.ageProgressionMilestoneType, ", ageProgressionAmount=", ", finalMilestone=");
        u9.z(stringBuilder0, this.finalMilestone, ", legacyPathType=", this.legacyPathType, ", requiredPathPoints=");
        return e.g(stringBuilder0, this.requiredPathPoints, ")");
    }
}

