package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartBuildings;", "", "constructibleType", "", "townID", "", "minimumAdjacency", "placement", "(Ljava/lang/String;IILjava/lang/String;)V", "getConstructibleType", "()Ljava/lang/String;", "getMinimumAdjacency", "()I", "getPlacement", "getTownID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvancedStartBuildings {
    private final String constructibleType;
    private final int minimumAdjacency;
    private final String placement;
    private final int townID;

    public Civ7AdvancedStartBuildings(String s, int v, int v1, String s1) {
        j.f(s, "constructibleType");
        j.f(s1, "placement");
        super();
        this.constructibleType = s;
        this.townID = v;
        this.minimumAdjacency = v1;
        this.placement = s1;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final int component2() {
        return this.townID;
    }

    public final int component3() {
        return this.minimumAdjacency;
    }

    public final String component4() {
        return this.placement;
    }

    public final Civ7AdvancedStartBuildings copy(String s, int v, int v1, String s1) {
        j.f(s, "constructibleType");
        j.f(s1, "placement");
        return new Civ7AdvancedStartBuildings(s, v, v1, s1);
    }

    public static Civ7AdvancedStartBuildings copy$default(Civ7AdvancedStartBuildings civ7AdvancedStartBuildings0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7AdvancedStartBuildings0.constructibleType;
        }
        if((v2 & 2) != 0) {
            v = civ7AdvancedStartBuildings0.townID;
        }
        if((v2 & 4) != 0) {
            v1 = civ7AdvancedStartBuildings0.minimumAdjacency;
        }
        if((v2 & 8) != 0) {
            s1 = civ7AdvancedStartBuildings0.placement;
        }
        return civ7AdvancedStartBuildings0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvancedStartBuildings)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7AdvancedStartBuildings)object0).constructibleType)) {
            return false;
        }
        if(this.townID != ((Civ7AdvancedStartBuildings)object0).townID) {
            return false;
        }
        return this.minimumAdjacency == ((Civ7AdvancedStartBuildings)object0).minimumAdjacency ? j.a(this.placement, ((Civ7AdvancedStartBuildings)object0).placement) : false;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final int getMinimumAdjacency() {
        return this.minimumAdjacency;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final int getTownID() {
        return this.townID;
    }

    @Override
    public int hashCode() {
        return this.placement.hashCode() + ((this.constructibleType.hashCode() * 0x1F + this.townID) * 0x1F + this.minimumAdjacency) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.townID, "Civ7AdvancedStartBuildings(constructibleType=", this.constructibleType, ", townID=", ", minimumAdjacency="), this.minimumAdjacency, ", placement=", this.placement, ")");
    }
}

