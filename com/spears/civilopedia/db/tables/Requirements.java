package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\u0005\u0012\u0006\u0010\r\u001A\u00020\b\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u0010\u0010\u001B\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0010\u0010\u001C\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0018Jj\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\bH\u00C6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0011J\u0010\u0010 \u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u0015J\u001A\u0010#\u001A\u00020\b2\b\u0010\"\u001A\u0004\u0018\u00010!H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010%\u001A\u0004\b&\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010%\u001A\u0004\b\'\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010(\u001A\u0004\b)\u0010\u0015R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010(\u001A\u0004\b*\u0010\u0015R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\t\u0010+\u001A\u0004\b,\u0010\u0018R\u0017\u0010\n\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\n\u0010+\u001A\u0004\b-\u0010\u0018R\u0017\u0010\u000B\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010+\u001A\u0004\b.\u0010\u0018R\u0017\u0010\f\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\f\u0010(\u001A\u0004\b/\u0010\u0015R\u0017\u0010\r\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\r\u0010+\u001A\u0004\b0\u0010\u0018\u00A8\u00061"}, d2 = {"Lcom/spears/civilopedia/db/tables/Requirements;", "Lo2/m;", "", "requirementId", "requirementType", "", "likeliness", "impact", "", "inverse", "reverse", "persistent", "progressWeight", "triggered", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZZZIZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IIZZZIZ)Lcom/spears/civilopedia/db/tables/Requirements;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequirementId", "getRequirementType", "I", "getLikeliness", "getImpact", "Z", "getInverse", "getReverse", "getPersistent", "getProgressWeight", "getTriggered", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Requirements implements m {
    private final int impact;
    private final boolean inverse;
    private final int likeliness;
    private final boolean persistent;
    private final int progressWeight;
    private final String requirementId;
    private final String requirementType;
    private final boolean reverse;
    private final boolean triggered;

    public Requirements(String s, String s1, int v, int v1, boolean z, boolean z1, boolean z2, int v2, boolean z3) {
        j.f(s, "requirementId");
        j.f(s1, "requirementType");
        super();
        this.requirementId = s;
        this.requirementType = s1;
        this.likeliness = v;
        this.impact = v1;
        this.inverse = z;
        this.reverse = z1;
        this.persistent = z2;
        this.progressWeight = v2;
        this.triggered = z3;
    }

    public final String component1() {
        return this.requirementId;
    }

    public final String component2() {
        return this.requirementType;
    }

    public final int component3() {
        return this.likeliness;
    }

    public final int component4() {
        return this.impact;
    }

    public final boolean component5() {
        return this.inverse;
    }

    public final boolean component6() {
        return this.reverse;
    }

    public final boolean component7() {
        return this.persistent;
    }

    public final int component8() {
        return this.progressWeight;
    }

    public final boolean component9() {
        return this.triggered;
    }

    public final Requirements copy(String s, String s1, int v, int v1, boolean z, boolean z1, boolean z2, int v2, boolean z3) {
        j.f(s, "requirementId");
        j.f(s1, "requirementType");
        return new Requirements(s, s1, v, v1, z, z1, z2, v2, z3);
    }

    public static Requirements copy$default(Requirements requirements0, String s, String s1, int v, int v1, boolean z, boolean z1, boolean z2, int v2, boolean z3, int v3, Object object0) {
        String s2 = (v3 & 1) == 0 ? s : requirements0.requirementId;
        String s3 = (v3 & 2) == 0 ? s1 : requirements0.requirementType;
        int v4 = (v3 & 4) == 0 ? v : requirements0.likeliness;
        int v5 = (v3 & 8) == 0 ? v1 : requirements0.impact;
        boolean z4 = (v3 & 16) == 0 ? z : requirements0.inverse;
        boolean z5 = (v3 & 0x20) == 0 ? z1 : requirements0.reverse;
        boolean z6 = (v3 & 0x40) == 0 ? z2 : requirements0.persistent;
        int v6 = (v3 & 0x80) == 0 ? v2 : requirements0.progressWeight;
        return (v3 & 0x100) == 0 ? requirements0.copy(s2, s3, v4, v5, z4, z5, z6, v6, z3) : requirements0.copy(s2, s3, v4, v5, z4, z5, z6, v6, requirements0.triggered);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Requirements)) {
            return false;
        }
        if(!j.a(this.requirementId, ((Requirements)object0).requirementId)) {
            return false;
        }
        if(!j.a(this.requirementType, ((Requirements)object0).requirementType)) {
            return false;
        }
        if(this.likeliness != ((Requirements)object0).likeliness) {
            return false;
        }
        if(this.impact != ((Requirements)object0).impact) {
            return false;
        }
        if(this.inverse != ((Requirements)object0).inverse) {
            return false;
        }
        if(this.reverse != ((Requirements)object0).reverse) {
            return false;
        }
        if(this.persistent != ((Requirements)object0).persistent) {
            return false;
        }
        return this.progressWeight == ((Requirements)object0).progressWeight ? this.triggered == ((Requirements)object0).triggered : false;
    }

    public final int getImpact() {
        return this.impact;
    }

    public final boolean getInverse() {
        return this.inverse;
    }

    public final int getLikeliness() {
        return this.likeliness;
    }

    public final boolean getPersistent() {
        return this.persistent;
    }

    public final int getProgressWeight() {
        return this.progressWeight;
    }

    public final String getRequirementId() {
        return this.requirementId;
    }

    public final String getRequirementType() {
        return this.requirementType;
    }

    public final boolean getReverse() {
        return this.reverse;
    }

    public final boolean getTriggered() {
        return this.triggered;
    }

    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = ((((((f.b(this.requirementId.hashCode() * 0x1F, 0x1F, this.requirementType) + this.likeliness) * 0x1F + this.impact) * 0x1F + (this.inverse ? 0x4CF : 0x4D5)) * 0x1F + (this.reverse ? 0x4CF : 0x4D5)) * 0x1F + (this.persistent ? 0x4CF : 0x4D5)) * 0x1F + this.progressWeight) * 0x1F;
        if(this.triggered) {
            v = 0x4CF;
        }
        return v1 + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.requirementId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Requirements(requirementId=", this.requirementId, ", requirementType=", this.requirementType, ", likeliness=");
        f.q(stringBuilder0, this.likeliness, ", impact=", this.impact, ", inverse=");
        u9.A(stringBuilder0, this.inverse, ", reverse=", this.reverse, ", persistent=");
        u9.y(stringBuilder0, this.persistent, ", progressWeight=", this.progressWeight, ", triggered=");
        return u9.g(stringBuilder0, this.triggered, ")");
    }
}

