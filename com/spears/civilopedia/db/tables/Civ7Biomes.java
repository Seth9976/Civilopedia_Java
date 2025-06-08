package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J:\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Biomes;", "", "biomeType", "", "description", "maxLatitude", "", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBiomeType", "()Ljava/lang/String;", "getDescription", "getMaxLatitude", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7Biomes;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Biomes {
    private final String biomeType;
    private final String description;
    private final Integer maxLatitude;
    private final String name;

    public Civ7Biomes(String s, String s1, Integer integer0, String s2) {
        j.f(s, "biomeType");
        j.f(s2, "name");
        super();
        this.biomeType = s;
        this.description = s1;
        this.maxLatitude = integer0;
        this.name = s2;
    }

    public final String component1() {
        return this.biomeType;
    }

    public final String component2() {
        return this.description;
    }

    public final Integer component3() {
        return this.maxLatitude;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7Biomes copy(String s, String s1, Integer integer0, String s2) {
        j.f(s, "biomeType");
        j.f(s2, "name");
        return new Civ7Biomes(s, s1, integer0, s2);
    }

    public static Civ7Biomes copy$default(Civ7Biomes civ7Biomes0, String s, String s1, Integer integer0, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Biomes0.biomeType;
        }
        if((v & 2) != 0) {
            s1 = civ7Biomes0.description;
        }
        if((v & 4) != 0) {
            integer0 = civ7Biomes0.maxLatitude;
        }
        if((v & 8) != 0) {
            s2 = civ7Biomes0.name;
        }
        return civ7Biomes0.copy(s, s1, integer0, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Biomes)) {
            return false;
        }
        if(!j.a(this.biomeType, ((Civ7Biomes)object0).biomeType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Biomes)object0).description)) {
            return false;
        }
        return j.a(this.maxLatitude, ((Civ7Biomes)object0).maxLatitude) ? j.a(this.name, ((Civ7Biomes)object0).name) : false;
    }

    public final String getBiomeType() {
        return this.biomeType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getMaxLatitude() {
        return this.maxLatitude;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = this.biomeType.hashCode();
        int v1 = 0;
        int v2 = this.description == null ? 0 : this.description.hashCode();
        Integer integer0 = this.maxLatitude;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return this.name.hashCode() + ((v * 0x1F + v2) * 0x1F + v1) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Biomes(biomeType=", this.biomeType, ", description=", this.description, ", maxLatitude=");
        stringBuilder0.append(this.maxLatitude);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

