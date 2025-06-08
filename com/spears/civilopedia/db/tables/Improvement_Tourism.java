package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\fJ\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001C\u001A\u0004\b\u001E\u0010\fR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001F\u0010\fR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b \u0010\fR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001A\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Improvement_Tourism;", "Lo2/m;", "", "improvementType", "tourismSource", "prereqCivic", "prereqTech", "", "scalingFactor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Improvement_Tourism;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImprovementType", "getTourismSource", "getPrereqCivic", "getPrereqTech", "I", "getScalingFactor", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Improvement_Tourism implements m {
    private final String improvementType;
    private final String prereqCivic;
    private final String prereqTech;
    private final int scalingFactor;
    private final String tourismSource;

    public Improvement_Tourism(String s, String s1, String s2, String s3, int v) {
        j.f(s, "improvementType");
        j.f(s1, "tourismSource");
        super();
        this.improvementType = s;
        this.tourismSource = s1;
        this.prereqCivic = s2;
        this.prereqTech = s3;
        this.scalingFactor = v;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.tourismSource;
    }

    public final String component3() {
        return this.prereqCivic;
    }

    public final String component4() {
        return this.prereqTech;
    }

    public final int component5() {
        return this.scalingFactor;
    }

    public final Improvement_Tourism copy(String s, String s1, String s2, String s3, int v) {
        j.f(s, "improvementType");
        j.f(s1, "tourismSource");
        return new Improvement_Tourism(s, s1, s2, s3, v);
    }

    public static Improvement_Tourism copy$default(Improvement_Tourism improvement_Tourism0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = improvement_Tourism0.improvementType;
        }
        if((v1 & 2) != 0) {
            s1 = improvement_Tourism0.tourismSource;
        }
        if((v1 & 4) != 0) {
            s2 = improvement_Tourism0.prereqCivic;
        }
        if((v1 & 8) != 0) {
            s3 = improvement_Tourism0.prereqTech;
        }
        if((v1 & 16) != 0) {
            v = improvement_Tourism0.scalingFactor;
        }
        return improvement_Tourism0.copy(s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Improvement_Tourism)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Improvement_Tourism)object0).improvementType)) {
            return false;
        }
        if(!j.a(this.tourismSource, ((Improvement_Tourism)object0).tourismSource)) {
            return false;
        }
        if(!j.a(this.prereqCivic, ((Improvement_Tourism)object0).prereqCivic)) {
            return false;
        }
        return j.a(this.prereqTech, ((Improvement_Tourism)object0).prereqTech) ? this.scalingFactor == ((Improvement_Tourism)object0).scalingFactor : false;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final int getScalingFactor() {
        return this.scalingFactor;
    }

    public final String getTourismSource() {
        return this.tourismSource;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.improvementType.hashCode() * 0x1F, 0x1F, this.tourismSource);
        int v1 = 0;
        int v2 = this.prereqCivic == null ? 0 : this.prereqCivic.hashCode();
        String s = this.prereqTech;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + this.scalingFactor;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.improvementType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Improvement_Tourism(improvementType=", this.improvementType, ", tourismSource=", this.tourismSource, ", prereqCivic=");
        f.t(stringBuilder0, this.prereqCivic, ", prereqTech=", this.prereqTech, ", scalingFactor=");
        return e.g(stringBuilder0, this.scalingFactor, ")");
    }
}

