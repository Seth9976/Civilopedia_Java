package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JB\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001A\u0010\u001B\u001A\u00020\u00042\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001D\u001A\u0004\b\u001E\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001F\u001A\u0004\b \u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001F\u001A\u0004\b!\u0010\u0010R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001A\u0004\b#\u0010\u0013R\u0017\u0010\t\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001A\u0004\b$\u0010\u0013¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Feature_NaturalWonders;", "Lo2/m;", "", "featureType", "", "noRiver", "placeFirst", "", "placementPercentage", "tiles", "<init>", "(Ljava/lang/String;ZZII)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;ZZII)Lcom/spears/civilopedia/db/tables/Civ7Feature_NaturalWonders;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFeatureType", "Z", "getNoRiver", "getPlaceFirst", "I", "getPlacementPercentage", "getTiles", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Feature_NaturalWonders implements m {
    private final String featureType;
    private final boolean noRiver;
    private final boolean placeFirst;
    private final int placementPercentage;
    private final int tiles;

    public Civ7Feature_NaturalWonders(String s, boolean z, boolean z1, int v, int v1) {
        j.f(s, "featureType");
        super();
        this.featureType = s;
        this.noRiver = z;
        this.placeFirst = z1;
        this.placementPercentage = v;
        this.tiles = v1;
    }

    public final String component1() {
        return this.featureType;
    }

    public final boolean component2() {
        return this.noRiver;
    }

    public final boolean component3() {
        return this.placeFirst;
    }

    public final int component4() {
        return this.placementPercentage;
    }

    public final int component5() {
        return this.tiles;
    }

    public final Civ7Feature_NaturalWonders copy(String s, boolean z, boolean z1, int v, int v1) {
        j.f(s, "featureType");
        return new Civ7Feature_NaturalWonders(s, z, z1, v, v1);
    }

    public static Civ7Feature_NaturalWonders copy$default(Civ7Feature_NaturalWonders civ7Feature_NaturalWonders0, String s, boolean z, boolean z1, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7Feature_NaturalWonders0.featureType;
        }
        if((v2 & 2) != 0) {
            z = civ7Feature_NaturalWonders0.noRiver;
        }
        if((v2 & 4) != 0) {
            z1 = civ7Feature_NaturalWonders0.placeFirst;
        }
        if((v2 & 8) != 0) {
            v = civ7Feature_NaturalWonders0.placementPercentage;
        }
        if((v2 & 16) != 0) {
            v1 = civ7Feature_NaturalWonders0.tiles;
        }
        return civ7Feature_NaturalWonders0.copy(s, z, z1, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Feature_NaturalWonders)) {
            return false;
        }
        if(!j.a(this.featureType, ((Civ7Feature_NaturalWonders)object0).featureType)) {
            return false;
        }
        if(this.noRiver != ((Civ7Feature_NaturalWonders)object0).noRiver) {
            return false;
        }
        if(this.placeFirst != ((Civ7Feature_NaturalWonders)object0).placeFirst) {
            return false;
        }
        return this.placementPercentage == ((Civ7Feature_NaturalWonders)object0).placementPercentage ? this.tiles == ((Civ7Feature_NaturalWonders)object0).tiles : false;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final boolean getNoRiver() {
        return this.noRiver;
    }

    public final boolean getPlaceFirst() {
        return this.placeFirst;
    }

    public final int getPlacementPercentage() {
        return this.placementPercentage;
    }

    public final int getTiles() {
        return this.tiles;
    }

    @Override
    public int hashCode() {
        int v = this.featureType.hashCode();
        int v1 = 0x4D5;
        int v2 = this.noRiver ? 0x4CF : 0x4D5;
        if(this.placeFirst) {
            v1 = 0x4CF;
        }
        return (((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.placementPercentage) * 0x1F + this.tiles;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.featureType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7Feature_NaturalWonders(featureType=", this.featureType, this.noRiver, ", noRiver=", ", placeFirst=");
        u9.y(stringBuilder0, this.placeFirst, ", placementPercentage=", this.placementPercentage, ", tiles=");
        return e.g(stringBuilder0, this.tiles, ")");
    }
}

