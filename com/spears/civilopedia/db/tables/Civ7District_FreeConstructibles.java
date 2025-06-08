package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001A\u00020\b\u00A2\u0006\u0002\u0010\rJ\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\bH\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010!\u001A\u00020\bH\u00C6\u0003Jm\u0010\"\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001A\u00020\bH\u00C6\u0001J\u0013\u0010#\u001A\u00020$2\b\u0010%\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010&\u001A\u00020\bH\u00D6\u0001J\t\u0010\'\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000FR\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000FR\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u000FR\u0011\u0010\f\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0014\u00A8\u0006("}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7District_FreeConstructibles;", "", "biomeType", "", "constructibleType", "districtType", "featureType", "priority", "", "resourceType", "riverType", "terrainType", "tier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBiomeType", "()Ljava/lang/String;", "getConstructibleType", "getDistrictType", "getFeatureType", "getPriority", "()I", "getResourceType", "getRiverType", "getTerrainType", "getTier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7District_FreeConstructibles {
    private final String biomeType;
    private final String constructibleType;
    private final String districtType;
    private final String featureType;
    private final int priority;
    private final String resourceType;
    private final String riverType;
    private final String terrainType;
    private final int tier;

    public Civ7District_FreeConstructibles(String s, String s1, String s2, String s3, int v, String s4, String s5, String s6, int v1) {
        j.f(s1, "constructibleType");
        j.f(s2, "districtType");
        super();
        this.biomeType = s;
        this.constructibleType = s1;
        this.districtType = s2;
        this.featureType = s3;
        this.priority = v;
        this.resourceType = s4;
        this.riverType = s5;
        this.terrainType = s6;
        this.tier = v1;
    }

    public final String component1() {
        return this.biomeType;
    }

    public final String component2() {
        return this.constructibleType;
    }

    public final String component3() {
        return this.districtType;
    }

    public final String component4() {
        return this.featureType;
    }

    public final int component5() {
        return this.priority;
    }

    public final String component6() {
        return this.resourceType;
    }

    public final String component7() {
        return this.riverType;
    }

    public final String component8() {
        return this.terrainType;
    }

    public final int component9() {
        return this.tier;
    }

    public final Civ7District_FreeConstructibles copy(String s, String s1, String s2, String s3, int v, String s4, String s5, String s6, int v1) {
        j.f(s1, "constructibleType");
        j.f(s2, "districtType");
        return new Civ7District_FreeConstructibles(s, s1, s2, s3, v, s4, s5, s6, v1);
    }

    public static Civ7District_FreeConstructibles copy$default(Civ7District_FreeConstructibles civ7District_FreeConstructibles0, String s, String s1, String s2, String s3, int v, String s4, String s5, String s6, int v1, int v2, Object object0) {
        String s7 = (v2 & 1) == 0 ? s : civ7District_FreeConstructibles0.biomeType;
        String s8 = (v2 & 2) == 0 ? s1 : civ7District_FreeConstructibles0.constructibleType;
        String s9 = (v2 & 4) == 0 ? s2 : civ7District_FreeConstructibles0.districtType;
        String s10 = (v2 & 8) == 0 ? s3 : civ7District_FreeConstructibles0.featureType;
        int v3 = (v2 & 16) == 0 ? v : civ7District_FreeConstructibles0.priority;
        String s11 = (v2 & 0x20) == 0 ? s4 : civ7District_FreeConstructibles0.resourceType;
        String s12 = (v2 & 0x40) == 0 ? s5 : civ7District_FreeConstructibles0.riverType;
        String s13 = (v2 & 0x80) == 0 ? s6 : civ7District_FreeConstructibles0.terrainType;
        return (v2 & 0x100) == 0 ? civ7District_FreeConstructibles0.copy(s7, s8, s9, s10, v3, s11, s12, s13, v1) : civ7District_FreeConstructibles0.copy(s7, s8, s9, s10, v3, s11, s12, s13, civ7District_FreeConstructibles0.tier);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7District_FreeConstructibles)) {
            return false;
        }
        if(!j.a(this.biomeType, ((Civ7District_FreeConstructibles)object0).biomeType)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7District_FreeConstructibles)object0).constructibleType)) {
            return false;
        }
        if(!j.a(this.districtType, ((Civ7District_FreeConstructibles)object0).districtType)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7District_FreeConstructibles)object0).featureType)) {
            return false;
        }
        if(this.priority != ((Civ7District_FreeConstructibles)object0).priority) {
            return false;
        }
        if(!j.a(this.resourceType, ((Civ7District_FreeConstructibles)object0).resourceType)) {
            return false;
        }
        if(!j.a(this.riverType, ((Civ7District_FreeConstructibles)object0).riverType)) {
            return false;
        }
        return j.a(this.terrainType, ((Civ7District_FreeConstructibles)object0).terrainType) ? this.tier == ((Civ7District_FreeConstructibles)object0).tier : false;
    }

    public final String getBiomeType() {
        return this.biomeType;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final String getDistrictType() {
        return this.districtType;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final String getRiverType() {
        return this.riverType;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    public final int getTier() {
        return this.tier;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((f.b(f.b((this.biomeType == null ? 0 : this.biomeType.hashCode()) * 0x1F, 0x1F, this.constructibleType), 0x1F, this.districtType) + (this.featureType == null ? 0 : this.featureType.hashCode())) * 0x1F + this.priority) * 0x1F;
        int v2 = this.resourceType == null ? 0 : this.resourceType.hashCode();
        int v3 = this.riverType == null ? 0 : this.riverType.hashCode();
        String s = this.terrainType;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + this.tier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7District_FreeConstructibles(biomeType=", this.biomeType, ", constructibleType=", this.constructibleType, ", districtType=");
        f.t(stringBuilder0, this.districtType, ", featureType=", this.featureType, ", priority=");
        f.r(stringBuilder0, this.priority, ", resourceType=", this.resourceType, ", riverType=");
        f.t(stringBuilder0, this.riverType, ", terrainType=", this.terrainType, ", tier=");
        return e.g(stringBuilder0, this.tier, ")");
    }
}

