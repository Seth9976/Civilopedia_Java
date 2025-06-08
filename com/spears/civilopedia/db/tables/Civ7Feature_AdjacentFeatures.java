package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Feature_AdjacentFeatures;", "", "featureType", "", "featureTypeAdjacent", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureType", "()Ljava/lang/String;", "getFeatureTypeAdjacent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Feature_AdjacentFeatures {
    private final String featureType;
    private final String featureTypeAdjacent;

    public Civ7Feature_AdjacentFeatures(String s, String s1) {
        j.f(s, "featureType");
        j.f(s1, "featureTypeAdjacent");
        super();
        this.featureType = s;
        this.featureTypeAdjacent = s1;
    }

    public final String component1() {
        return this.featureType;
    }

    public final String component2() {
        return this.featureTypeAdjacent;
    }

    public final Civ7Feature_AdjacentFeatures copy(String s, String s1) {
        j.f(s, "featureType");
        j.f(s1, "featureTypeAdjacent");
        return new Civ7Feature_AdjacentFeatures(s, s1);
    }

    public static Civ7Feature_AdjacentFeatures copy$default(Civ7Feature_AdjacentFeatures civ7Feature_AdjacentFeatures0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Feature_AdjacentFeatures0.featureType;
        }
        if((v & 2) != 0) {
            s1 = civ7Feature_AdjacentFeatures0.featureTypeAdjacent;
        }
        return civ7Feature_AdjacentFeatures0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Feature_AdjacentFeatures)) {
            return false;
        }
        return j.a(this.featureType, ((Civ7Feature_AdjacentFeatures)object0).featureType) ? j.a(this.featureTypeAdjacent, ((Civ7Feature_AdjacentFeatures)object0).featureTypeAdjacent) : false;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final String getFeatureTypeAdjacent() {
        return this.featureTypeAdjacent;
    }

    @Override
    public int hashCode() {
        return this.featureTypeAdjacent.hashCode() + this.featureType.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        return f.k("Civ7Feature_AdjacentFeatures(featureType=", this.featureType, ", featureTypeAdjacent=", this.featureTypeAdjacent, ")");
    }
}

