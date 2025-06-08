package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Improvement_ValidFeatures;", "", "improvementType", "", "featureType", "prereqTech", "prereqCivic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeatureType", "()Ljava/lang/String;", "getImprovementType", "getPrereqCivic", "getPrereqTech", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Improvement_ValidFeatures {
    private final String featureType;
    private final String improvementType;
    private final String prereqCivic;
    private final String prereqTech;

    public Improvement_ValidFeatures(String s, String s1, String s2, String s3) {
        j.f(s, "improvementType");
        j.f(s1, "featureType");
        super();
        this.improvementType = s;
        this.featureType = s1;
        this.prereqTech = s2;
        this.prereqCivic = s3;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final String component3() {
        return this.prereqTech;
    }

    public final String component4() {
        return this.prereqCivic;
    }

    public final Improvement_ValidFeatures copy(String s, String s1, String s2, String s3) {
        j.f(s, "improvementType");
        j.f(s1, "featureType");
        return new Improvement_ValidFeatures(s, s1, s2, s3);
    }

    public static Improvement_ValidFeatures copy$default(Improvement_ValidFeatures improvement_ValidFeatures0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = improvement_ValidFeatures0.improvementType;
        }
        if((v & 2) != 0) {
            s1 = improvement_ValidFeatures0.featureType;
        }
        if((v & 4) != 0) {
            s2 = improvement_ValidFeatures0.prereqTech;
        }
        if((v & 8) != 0) {
            s3 = improvement_ValidFeatures0.prereqCivic;
        }
        return improvement_ValidFeatures0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Improvement_ValidFeatures)) {
            return false;
        }
        if(!j.a(this.improvementType, ((Improvement_ValidFeatures)object0).improvementType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Improvement_ValidFeatures)object0).featureType)) {
            return false;
        }
        return j.a(this.prereqTech, ((Improvement_ValidFeatures)object0).prereqTech) ? j.a(this.prereqCivic, ((Improvement_ValidFeatures)object0).prereqCivic) : false;
    }

    public final String getFeatureType() {
        return this.featureType;
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

    @Override
    public int hashCode() {
        int v = f.b(this.improvementType.hashCode() * 0x1F, 0x1F, this.featureType);
        int v1 = 0;
        int v2 = this.prereqTech == null ? 0 : this.prereqTech.hashCode();
        String s = this.prereqCivic;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return e.i(e.j("Improvement_ValidFeatures(improvementType=", this.improvementType, ", featureType=", this.featureType, ", prereqTech="), this.prereqTech, ", prereqCivic=", this.prereqCivic, ")");
    }
}

