package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\f\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\u0010J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010!\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\"\u001A\u00020\u0006H\u00C6\u0003J\t\u0010#\u001A\u00020\u0003H\u00C6\u0003J\t\u0010$\u001A\u00020\tH\u00C6\u0003J\t\u0010%\u001A\u00020\tH\u00C6\u0003J\t\u0010&\u001A\u00020\fH\u00C6\u0003J\u000B\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003Js\u0010)\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\f2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001J\u0013\u0010*\u001A\u00020\t2\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010,\u001A\u00020\fH\u00D6\u0001J\t\u0010-\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000B\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u001AR\u0013\u0010\r\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0012R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u0012R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u0012\u00A8\u0006."}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Routes;", "", "routeType", "", "description", "movementCost", "", "name", "placementRequiresOwnedTile", "", "placementRequiresRoutePresent", "placementValue", "", "prereqAge", "requiredConstructible", "traitType", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getMovementCost", "()D", "getName", "getPlacementRequiresOwnedTile", "()Z", "getPlacementRequiresRoutePresent", "getPlacementValue", "()I", "getPrereqAge", "getRequiredConstructible", "getRouteType", "getTraitType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Routes {
    private final String description;
    private final double movementCost;
    private final String name;
    private final boolean placementRequiresOwnedTile;
    private final boolean placementRequiresRoutePresent;
    private final int placementValue;
    private final String prereqAge;
    private final String requiredConstructible;
    private final String routeType;
    private final String traitType;

    public Civ7Routes(String s, String s1, double f, String s2, boolean z, boolean z1, int v, String s3, String s4, String s5) {
        j.f(s, "routeType");
        j.f(s1, "description");
        j.f(s2, "name");
        super();
        this.routeType = s;
        this.description = s1;
        this.movementCost = f;
        this.name = s2;
        this.placementRequiresOwnedTile = z;
        this.placementRequiresRoutePresent = z1;
        this.placementValue = v;
        this.prereqAge = s3;
        this.requiredConstructible = s4;
        this.traitType = s5;
    }

    public final String component1() {
        return this.routeType;
    }

    public final String component10() {
        return this.traitType;
    }

    public final String component2() {
        return this.description;
    }

    public final double component3() {
        return this.movementCost;
    }

    public final String component4() {
        return this.name;
    }

    public final boolean component5() {
        return this.placementRequiresOwnedTile;
    }

    public final boolean component6() {
        return this.placementRequiresRoutePresent;
    }

    public final int component7() {
        return this.placementValue;
    }

    public final String component8() {
        return this.prereqAge;
    }

    public final String component9() {
        return this.requiredConstructible;
    }

    public final Civ7Routes copy(String s, String s1, double f, String s2, boolean z, boolean z1, int v, String s3, String s4, String s5) {
        j.f(s, "routeType");
        j.f(s1, "description");
        j.f(s2, "name");
        return new Civ7Routes(s, s1, f, s2, z, z1, v, s3, s4, s5);
    }

    public static Civ7Routes copy$default(Civ7Routes civ7Routes0, String s, String s1, double f, String s2, boolean z, boolean z1, int v, String s3, String s4, String s5, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : civ7Routes0.routeType;
        String s7 = (v1 & 2) == 0 ? s1 : civ7Routes0.description;
        double f1 = (v1 & 4) == 0 ? f : civ7Routes0.movementCost;
        String s8 = (v1 & 8) == 0 ? s2 : civ7Routes0.name;
        boolean z2 = (v1 & 16) == 0 ? z : civ7Routes0.placementRequiresOwnedTile;
        boolean z3 = (v1 & 0x20) == 0 ? z1 : civ7Routes0.placementRequiresRoutePresent;
        int v2 = (v1 & 0x40) == 0 ? v : civ7Routes0.placementValue;
        String s9 = (v1 & 0x80) == 0 ? s3 : civ7Routes0.prereqAge;
        String s10 = (v1 & 0x100) == 0 ? s4 : civ7Routes0.requiredConstructible;
        return (v1 & 0x200) == 0 ? civ7Routes0.copy(s6, s7, f1, s8, z2, z3, v2, s9, s10, s5) : civ7Routes0.copy(s6, s7, f1, s8, z2, z3, v2, s9, s10, civ7Routes0.traitType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Routes)) {
            return false;
        }
        if(!j.a(this.routeType, ((Civ7Routes)object0).routeType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7Routes)object0).description)) {
            return false;
        }
        if(Double.compare(this.movementCost, ((Civ7Routes)object0).movementCost) != 0) {
            return false;
        }
        if(!j.a(this.name, ((Civ7Routes)object0).name)) {
            return false;
        }
        if(this.placementRequiresOwnedTile != ((Civ7Routes)object0).placementRequiresOwnedTile) {
            return false;
        }
        if(this.placementRequiresRoutePresent != ((Civ7Routes)object0).placementRequiresRoutePresent) {
            return false;
        }
        if(this.placementValue != ((Civ7Routes)object0).placementValue) {
            return false;
        }
        if(!j.a(this.prereqAge, ((Civ7Routes)object0).prereqAge)) {
            return false;
        }
        return j.a(this.requiredConstructible, ((Civ7Routes)object0).requiredConstructible) ? j.a(this.traitType, ((Civ7Routes)object0).traitType) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final double getMovementCost() {
        return this.movementCost;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPlacementRequiresOwnedTile() {
        return this.placementRequiresOwnedTile;
    }

    public final boolean getPlacementRequiresRoutePresent() {
        return this.placementRequiresRoutePresent;
    }

    public final int getPlacementValue() {
        return this.placementValue;
    }

    public final String getPrereqAge() {
        return this.prereqAge;
    }

    public final String getRequiredConstructible() {
        return this.requiredConstructible;
    }

    public final String getRouteType() {
        return this.routeType;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.movementCost);
        int v1 = f.b((f.b(this.routeType.hashCode() * 0x1F, 0x1F, this.description) + ((int)(v ^ v >>> 0x20))) * 0x1F, 0x1F, this.name);
        int v2 = 0x4D5;
        int v3 = this.placementRequiresOwnedTile ? 0x4CF : 0x4D5;
        if(this.placementRequiresRoutePresent) {
            v2 = 0x4CF;
        }
        int v4 = (((v1 + v3) * 0x1F + v2) * 0x1F + this.placementValue) * 0x1F;
        int v5 = 0;
        int v6 = this.prereqAge == null ? 0 : this.prereqAge.hashCode();
        int v7 = this.requiredConstructible == null ? 0 : this.requiredConstructible.hashCode();
        String s = this.traitType;
        if(s != null) {
            v5 = s.hashCode();
        }
        return ((v4 + v6) * 0x1F + v7) * 0x1F + v5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Routes(routeType=", this.routeType, ", description=", this.description, ", movementCost=");
        stringBuilder0.append(this.movementCost);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", placementRequiresOwnedTile=");
        stringBuilder0.append(this.placementRequiresOwnedTile);
        stringBuilder0.append(", placementRequiresRoutePresent=");
        stringBuilder0.append(this.placementRequiresRoutePresent);
        stringBuilder0.append(", placementValue=");
        stringBuilder0.append(this.placementValue);
        stringBuilder0.append(", prereqAge=");
        stringBuilder0.append(this.prereqAge);
        f.t(stringBuilder0, ", requiredConstructible=", this.requiredConstructible, ", traitType=", this.traitType);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

