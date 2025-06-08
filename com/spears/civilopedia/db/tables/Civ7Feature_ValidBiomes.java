package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Feature_ValidBiomes;", "", "biomeType", "", "featureType", "replaceRange", "", "replaceWithBiomeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBiomeType", "()Ljava/lang/String;", "getFeatureType", "getReplaceRange", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReplaceWithBiomeType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7Feature_ValidBiomes;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Feature_ValidBiomes {
    private final String biomeType;
    private final String featureType;
    private final Integer replaceRange;
    private final String replaceWithBiomeType;

    public Civ7Feature_ValidBiomes(String s, String s1, Integer integer0, String s2) {
        j.f(s, "biomeType");
        j.f(s1, "featureType");
        super();
        this.biomeType = s;
        this.featureType = s1;
        this.replaceRange = integer0;
        this.replaceWithBiomeType = s2;
    }

    public final String component1() {
        return this.biomeType;
    }

    public final String component2() {
        return this.featureType;
    }

    public final Integer component3() {
        return this.replaceRange;
    }

    public final String component4() {
        return this.replaceWithBiomeType;
    }

    public final Civ7Feature_ValidBiomes copy(String s, String s1, Integer integer0, String s2) {
        j.f(s, "biomeType");
        j.f(s1, "featureType");
        return new Civ7Feature_ValidBiomes(s, s1, integer0, s2);
    }

    public static Civ7Feature_ValidBiomes copy$default(Civ7Feature_ValidBiomes civ7Feature_ValidBiomes0, String s, String s1, Integer integer0, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Feature_ValidBiomes0.biomeType;
        }
        if((v & 2) != 0) {
            s1 = civ7Feature_ValidBiomes0.featureType;
        }
        if((v & 4) != 0) {
            integer0 = civ7Feature_ValidBiomes0.replaceRange;
        }
        if((v & 8) != 0) {
            s2 = civ7Feature_ValidBiomes0.replaceWithBiomeType;
        }
        return civ7Feature_ValidBiomes0.copy(s, s1, integer0, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Feature_ValidBiomes)) {
            return false;
        }
        if(!j.a(this.biomeType, ((Civ7Feature_ValidBiomes)object0).biomeType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7Feature_ValidBiomes)object0).featureType)) {
            return false;
        }
        return j.a(this.replaceRange, ((Civ7Feature_ValidBiomes)object0).replaceRange) ? j.a(this.replaceWithBiomeType, ((Civ7Feature_ValidBiomes)object0).replaceWithBiomeType) : false;
    }

    public final String getBiomeType() {
        return this.biomeType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final Integer getReplaceRange() {
        return this.replaceRange;
    }

    public final String getReplaceWithBiomeType() {
        return this.replaceWithBiomeType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.biomeType.hashCode() * 0x1F, 0x1F, this.featureType);
        int v1 = 0;
        int v2 = this.replaceRange == null ? 0 : this.replaceRange.hashCode();
        String s = this.replaceWithBiomeType;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Feature_ValidBiomes(biomeType=", this.biomeType, ", featureType=", this.featureType, ", replaceRange=");
        stringBuilder0.append(this.replaceRange);
        stringBuilder0.append(", replaceWithBiomeType=");
        stringBuilder0.append(this.replaceWithBiomeType);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

