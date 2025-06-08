package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\n\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\n\u0012\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0002\u0010\u000FJ\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\u0006H\u00C6\u0003J\t\u0010!\u001A\u00020\u0006H\u00C6\u0003J\u000B\u0010\"\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010#\u001A\u00020\nH\u00C6\u0003J\t\u0010$\u001A\u00020\nH\u00C6\u0003J\t\u0010%\u001A\u00020\nH\u00C6\u0003J\t\u0010&\u001A\u00020\nH\u00C6\u0003Jo\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\u0006H\u00C6\u0001J\u0013\u0010(\u001A\u00020\n2\b\u0010)\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010*\u001A\u00020\u0006H\u00D6\u0001J\t\u0010+\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000B\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0018R\u0011\u0010\r\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0018R\u0011\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0014\u00A8\u0006,"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_GreatWorks;", "", "constructibleType", "", "greatWorkSlotType", "nonUniquePersonYield", "", "numSlots", "themingBonusDescription", "themingSameAges", "", "themingSameObjectType", "themingUniqueCivs", "themingUniquePerson", "themingYieldMultiplier", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ZZZZI)V", "getConstructibleType", "()Ljava/lang/String;", "getGreatWorkSlotType", "getNonUniquePersonYield", "()I", "getNumSlots", "getThemingBonusDescription", "getThemingSameAges", "()Z", "getThemingSameObjectType", "getThemingUniqueCivs", "getThemingUniquePerson", "getThemingYieldMultiplier", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_GreatWorks {
    private final String constructibleType;
    private final String greatWorkSlotType;
    private final int nonUniquePersonYield;
    private final int numSlots;
    private final String themingBonusDescription;
    private final boolean themingSameAges;
    private final boolean themingSameObjectType;
    private final boolean themingUniqueCivs;
    private final boolean themingUniquePerson;
    private final int themingYieldMultiplier;

    public Civ7Constructible_GreatWorks(String s, String s1, int v, int v1, String s2, boolean z, boolean z1, boolean z2, boolean z3, int v2) {
        j.f(s, "constructibleType");
        j.f(s1, "greatWorkSlotType");
        super();
        this.constructibleType = s;
        this.greatWorkSlotType = s1;
        this.nonUniquePersonYield = v;
        this.numSlots = v1;
        this.themingBonusDescription = s2;
        this.themingSameAges = z;
        this.themingSameObjectType = z1;
        this.themingUniqueCivs = z2;
        this.themingUniquePerson = z3;
        this.themingYieldMultiplier = v2;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final int component10() {
        return this.themingYieldMultiplier;
    }

    public final String component2() {
        return this.greatWorkSlotType;
    }

    public final int component3() {
        return this.nonUniquePersonYield;
    }

    public final int component4() {
        return this.numSlots;
    }

    public final String component5() {
        return this.themingBonusDescription;
    }

    public final boolean component6() {
        return this.themingSameAges;
    }

    public final boolean component7() {
        return this.themingSameObjectType;
    }

    public final boolean component8() {
        return this.themingUniqueCivs;
    }

    public final boolean component9() {
        return this.themingUniquePerson;
    }

    public final Civ7Constructible_GreatWorks copy(String s, String s1, int v, int v1, String s2, boolean z, boolean z1, boolean z2, boolean z3, int v2) {
        j.f(s, "constructibleType");
        j.f(s1, "greatWorkSlotType");
        return new Civ7Constructible_GreatWorks(s, s1, v, v1, s2, z, z1, z2, z3, v2);
    }

    public static Civ7Constructible_GreatWorks copy$default(Civ7Constructible_GreatWorks civ7Constructible_GreatWorks0, String s, String s1, int v, int v1, String s2, boolean z, boolean z1, boolean z2, boolean z3, int v2, int v3, Object object0) {
        String s3 = (v3 & 1) == 0 ? s : civ7Constructible_GreatWorks0.constructibleType;
        String s4 = (v3 & 2) == 0 ? s1 : civ7Constructible_GreatWorks0.greatWorkSlotType;
        int v4 = (v3 & 4) == 0 ? v : civ7Constructible_GreatWorks0.nonUniquePersonYield;
        int v5 = (v3 & 8) == 0 ? v1 : civ7Constructible_GreatWorks0.numSlots;
        String s5 = (v3 & 16) == 0 ? s2 : civ7Constructible_GreatWorks0.themingBonusDescription;
        boolean z4 = (v3 & 0x20) == 0 ? z : civ7Constructible_GreatWorks0.themingSameAges;
        boolean z5 = (v3 & 0x40) == 0 ? z1 : civ7Constructible_GreatWorks0.themingSameObjectType;
        boolean z6 = (v3 & 0x80) == 0 ? z2 : civ7Constructible_GreatWorks0.themingUniqueCivs;
        boolean z7 = (v3 & 0x100) == 0 ? z3 : civ7Constructible_GreatWorks0.themingUniquePerson;
        return (v3 & 0x200) == 0 ? civ7Constructible_GreatWorks0.copy(s3, s4, v4, v5, s5, z4, z5, z6, z7, v2) : civ7Constructible_GreatWorks0.copy(s3, s4, v4, v5, s5, z4, z5, z6, z7, civ7Constructible_GreatWorks0.themingYieldMultiplier);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_GreatWorks)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7Constructible_GreatWorks)object0).constructibleType)) {
            return false;
        }
        if(!j.a(this.greatWorkSlotType, ((Civ7Constructible_GreatWorks)object0).greatWorkSlotType)) {
            return false;
        }
        if(this.nonUniquePersonYield != ((Civ7Constructible_GreatWorks)object0).nonUniquePersonYield) {
            return false;
        }
        if(this.numSlots != ((Civ7Constructible_GreatWorks)object0).numSlots) {
            return false;
        }
        if(!j.a(this.themingBonusDescription, ((Civ7Constructible_GreatWorks)object0).themingBonusDescription)) {
            return false;
        }
        if(this.themingSameAges != ((Civ7Constructible_GreatWorks)object0).themingSameAges) {
            return false;
        }
        if(this.themingSameObjectType != ((Civ7Constructible_GreatWorks)object0).themingSameObjectType) {
            return false;
        }
        if(this.themingUniqueCivs != ((Civ7Constructible_GreatWorks)object0).themingUniqueCivs) {
            return false;
        }
        return this.themingUniquePerson == ((Civ7Constructible_GreatWorks)object0).themingUniquePerson ? this.themingYieldMultiplier == ((Civ7Constructible_GreatWorks)object0).themingYieldMultiplier : false;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final String getGreatWorkSlotType() {
        return this.greatWorkSlotType;
    }

    public final int getNonUniquePersonYield() {
        return this.nonUniquePersonYield;
    }

    public final int getNumSlots() {
        return this.numSlots;
    }

    public final String getThemingBonusDescription() {
        return this.themingBonusDescription;
    }

    public final boolean getThemingSameAges() {
        return this.themingSameAges;
    }

    public final boolean getThemingSameObjectType() {
        return this.themingSameObjectType;
    }

    public final boolean getThemingUniqueCivs() {
        return this.themingUniqueCivs;
    }

    public final boolean getThemingUniquePerson() {
        return this.themingUniquePerson;
    }

    public final int getThemingYieldMultiplier() {
        return this.themingYieldMultiplier;
    }

    @Override
    public int hashCode() {
        int v = ((f.b(this.constructibleType.hashCode() * 0x1F, 0x1F, this.greatWorkSlotType) + this.nonUniquePersonYield) * 0x1F + this.numSlots) * 0x1F;
        int v1 = this.themingBonusDescription == null ? 0 : this.themingBonusDescription.hashCode();
        int v2 = 0x4D5;
        int v3 = this.themingSameAges ? 0x4CF : 0x4D5;
        int v4 = this.themingSameObjectType ? 0x4CF : 0x4D5;
        int v5 = this.themingUniqueCivs ? 0x4CF : 0x4D5;
        if(this.themingUniquePerson) {
            v2 = 0x4CF;
        }
        return (((((v + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v2) * 0x1F + this.themingYieldMultiplier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Constructible_GreatWorks(constructibleType=", this.constructibleType, ", greatWorkSlotType=", this.greatWorkSlotType, ", nonUniquePersonYield=");
        f.q(stringBuilder0, this.nonUniquePersonYield, ", numSlots=", this.numSlots, ", themingBonusDescription=");
        u9.x(stringBuilder0, this.themingBonusDescription, ", themingSameAges=", this.themingSameAges, ", themingSameObjectType=");
        u9.A(stringBuilder0, this.themingSameObjectType, ", themingUniqueCivs=", this.themingUniqueCivs, ", themingUniquePerson=");
        stringBuilder0.append(this.themingUniquePerson);
        stringBuilder0.append(", themingYieldMultiplier=");
        stringBuilder0.append(this.themingYieldMultiplier);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

