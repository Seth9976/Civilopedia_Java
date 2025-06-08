package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7PrevailingWinds;", "", "directionType", "", "maximumLatitude", "", "minimumLatitude", "weight", "(Ljava/lang/String;III)V", "getDirectionType", "()Ljava/lang/String;", "getMaximumLatitude", "()I", "getMinimumLatitude", "getWeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7PrevailingWinds {
    private final String directionType;
    private final int maximumLatitude;
    private final int minimumLatitude;
    private final int weight;

    public Civ7PrevailingWinds(String s, int v, int v1, int v2) {
        j.f(s, "directionType");
        super();
        this.directionType = s;
        this.maximumLatitude = v;
        this.minimumLatitude = v1;
        this.weight = v2;
    }

    public final String component1() {
        return this.directionType;
    }

    public final int component2() {
        return this.maximumLatitude;
    }

    public final int component3() {
        return this.minimumLatitude;
    }

    public final int component4() {
        return this.weight;
    }

    public final Civ7PrevailingWinds copy(String s, int v, int v1, int v2) {
        j.f(s, "directionType");
        return new Civ7PrevailingWinds(s, v, v1, v2);
    }

    public static Civ7PrevailingWinds copy$default(Civ7PrevailingWinds civ7PrevailingWinds0, String s, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            s = civ7PrevailingWinds0.directionType;
        }
        if((v3 & 2) != 0) {
            v = civ7PrevailingWinds0.maximumLatitude;
        }
        if((v3 & 4) != 0) {
            v1 = civ7PrevailingWinds0.minimumLatitude;
        }
        if((v3 & 8) != 0) {
            v2 = civ7PrevailingWinds0.weight;
        }
        return civ7PrevailingWinds0.copy(s, v, v1, v2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7PrevailingWinds)) {
            return false;
        }
        if(!j.a(this.directionType, ((Civ7PrevailingWinds)object0).directionType)) {
            return false;
        }
        if(this.maximumLatitude != ((Civ7PrevailingWinds)object0).maximumLatitude) {
            return false;
        }
        return this.minimumLatitude == ((Civ7PrevailingWinds)object0).minimumLatitude ? this.weight == ((Civ7PrevailingWinds)object0).weight : false;
    }

    public final String getDirectionType() {
        return this.directionType;
    }

    public final int getMaximumLatitude() {
        return this.maximumLatitude;
    }

    public final int getMinimumLatitude() {
        return this.minimumLatitude;
    }

    public final int getWeight() {
        return this.weight;
    }

    @Override
    public int hashCode() {
        return ((this.directionType.hashCode() * 0x1F + this.maximumLatitude) * 0x1F + this.minimumLatitude) * 0x1F + this.weight;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.maximumLatitude, "Civ7PrevailingWinds(directionType=", this.directionType, ", maximumLatitude=", ", minimumLatitude=");
        stringBuilder0.append(this.minimumLatitude);
        stringBuilder0.append(", weight=");
        stringBuilder0.append(this.weight);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

