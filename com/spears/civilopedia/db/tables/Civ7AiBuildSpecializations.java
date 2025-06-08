package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\u000B¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001D\u001A\u00020\u000BHÆ\u0003JQ\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000BHÆ\u0001J\u0013\u0010\u001F\u001A\u00020\u00072\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\u000BHÖ\u0001J\t\u0010\"\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0011\u0010\n\u001A\u00020\u000B¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiBuildSpecializations;", "", "prioritizationYield", "", "specializationType", "buildingYield", "includeDefense", "", "includeMilitaryUnits", "includePopulation", "priorityOffset", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZI)V", "getBuildingYield", "()Ljava/lang/String;", "getIncludeDefense", "()Z", "getIncludeMilitaryUnits", "getIncludePopulation", "getPrioritizationYield", "getPriorityOffset", "()I", "getSpecializationType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiBuildSpecializations {
    private final String buildingYield;
    private final boolean includeDefense;
    private final boolean includeMilitaryUnits;
    private final boolean includePopulation;
    private final String prioritizationYield;
    private final int priorityOffset;
    private final String specializationType;

    public Civ7AiBuildSpecializations(String s, String s1, String s2, boolean z, boolean z1, boolean z2, int v) {
        j.f(s, "prioritizationYield");
        j.f(s1, "specializationType");
        super();
        this.prioritizationYield = s;
        this.specializationType = s1;
        this.buildingYield = s2;
        this.includeDefense = z;
        this.includeMilitaryUnits = z1;
        this.includePopulation = z2;
        this.priorityOffset = v;
    }

    public final String component1() {
        return this.prioritizationYield;
    }

    public final String component2() {
        return this.specializationType;
    }

    public final String component3() {
        return this.buildingYield;
    }

    public final boolean component4() {
        return this.includeDefense;
    }

    public final boolean component5() {
        return this.includeMilitaryUnits;
    }

    public final boolean component6() {
        return this.includePopulation;
    }

    public final int component7() {
        return this.priorityOffset;
    }

    public final Civ7AiBuildSpecializations copy(String s, String s1, String s2, boolean z, boolean z1, boolean z2, int v) {
        j.f(s, "prioritizationYield");
        j.f(s1, "specializationType");
        return new Civ7AiBuildSpecializations(s, s1, s2, z, z1, z2, v);
    }

    public static Civ7AiBuildSpecializations copy$default(Civ7AiBuildSpecializations civ7AiBuildSpecializations0, String s, String s1, String s2, boolean z, boolean z1, boolean z2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7AiBuildSpecializations0.prioritizationYield;
        }
        if((v1 & 2) != 0) {
            s1 = civ7AiBuildSpecializations0.specializationType;
        }
        if((v1 & 4) != 0) {
            s2 = civ7AiBuildSpecializations0.buildingYield;
        }
        if((v1 & 8) != 0) {
            z = civ7AiBuildSpecializations0.includeDefense;
        }
        if((v1 & 16) != 0) {
            z1 = civ7AiBuildSpecializations0.includeMilitaryUnits;
        }
        if((v1 & 0x20) != 0) {
            z2 = civ7AiBuildSpecializations0.includePopulation;
        }
        if((v1 & 0x40) != 0) {
            v = civ7AiBuildSpecializations0.priorityOffset;
        }
        return civ7AiBuildSpecializations0.copy(s, s1, s2, z, z1, z2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiBuildSpecializations)) {
            return false;
        }
        if(!j.a(this.prioritizationYield, ((Civ7AiBuildSpecializations)object0).prioritizationYield)) {
            return false;
        }
        if(!j.a(this.specializationType, ((Civ7AiBuildSpecializations)object0).specializationType)) {
            return false;
        }
        if(!j.a(this.buildingYield, ((Civ7AiBuildSpecializations)object0).buildingYield)) {
            return false;
        }
        if(this.includeDefense != ((Civ7AiBuildSpecializations)object0).includeDefense) {
            return false;
        }
        if(this.includeMilitaryUnits != ((Civ7AiBuildSpecializations)object0).includeMilitaryUnits) {
            return false;
        }
        return this.includePopulation == ((Civ7AiBuildSpecializations)object0).includePopulation ? this.priorityOffset == ((Civ7AiBuildSpecializations)object0).priorityOffset : false;
    }

    public final String getBuildingYield() {
        return this.buildingYield;
    }

    public final boolean getIncludeDefense() {
        return this.includeDefense;
    }

    public final boolean getIncludeMilitaryUnits() {
        return this.includeMilitaryUnits;
    }

    public final boolean getIncludePopulation() {
        return this.includePopulation;
    }

    public final String getPrioritizationYield() {
        return this.prioritizationYield;
    }

    public final int getPriorityOffset() {
        return this.priorityOffset;
    }

    public final String getSpecializationType() {
        return this.specializationType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.prioritizationYield.hashCode() * 0x1F, 0x1F, this.specializationType);
        int v1 = this.buildingYield == null ? 0 : this.buildingYield.hashCode();
        int v2 = 0x4D5;
        int v3 = this.includeDefense ? 0x4CF : 0x4D5;
        int v4 = this.includeMilitaryUnits ? 0x4CF : 0x4D5;
        if(this.includePopulation) {
            v2 = 0x4CF;
        }
        return ((((v + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2) * 0x1F + this.priorityOffset;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AiBuildSpecializations(prioritizationYield=", this.prioritizationYield, ", specializationType=", this.specializationType, ", buildingYield=");
        u9.x(stringBuilder0, this.buildingYield, ", includeDefense=", this.includeDefense, ", includeMilitaryUnits=");
        u9.A(stringBuilder0, this.includeMilitaryUnits, ", includePopulation=", this.includePopulation, ", priorityOffset=");
        return e.g(stringBuilder0, this.priorityOffset, ")");
    }
}

