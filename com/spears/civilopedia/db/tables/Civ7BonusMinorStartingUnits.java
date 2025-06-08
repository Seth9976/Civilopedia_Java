package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\n\u0012\u0006\u0010\u000B\u001A\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001D\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001E\u001A\u00020\nHÆ\u0003J\t\u0010\u001F\u001A\u00020\fHÆ\u0003JQ\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\fHÆ\u0001J\u0013\u0010!\u001A\u00020\n2\b\u0010\"\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001A\u00020\fHÖ\u0001J\t\u0010$\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000B\u001A\u00020\f¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000F¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7BonusMinorStartingUnits;", "", "age", "", "minDifficulty", "unit", "difficultyDelta", "", "district", "onDistrictCreated", "", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ZI)V", "getAge", "()Ljava/lang/String;", "getDifficultyDelta", "()D", "getDistrict", "getMinDifficulty", "getOnDistrictCreated", "()Z", "getQuantity", "()I", "getUnit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7BonusMinorStartingUnits {
    private final String age;
    private final double difficultyDelta;
    private final String district;
    private final String minDifficulty;
    private final boolean onDistrictCreated;
    private final int quantity;
    private final String unit;

    public Civ7BonusMinorStartingUnits(String s, String s1, String s2, double f, String s3, boolean z, int v) {
        j.f(s, "age");
        j.f(s2, "unit");
        j.f(s3, "district");
        super();
        this.age = s;
        this.minDifficulty = s1;
        this.unit = s2;
        this.difficultyDelta = f;
        this.district = s3;
        this.onDistrictCreated = z;
        this.quantity = v;
    }

    public final String component1() {
        return this.age;
    }

    public final String component2() {
        return this.minDifficulty;
    }

    public final String component3() {
        return this.unit;
    }

    public final double component4() {
        return this.difficultyDelta;
    }

    public final String component5() {
        return this.district;
    }

    public final boolean component6() {
        return this.onDistrictCreated;
    }

    public final int component7() {
        return this.quantity;
    }

    public final Civ7BonusMinorStartingUnits copy(String s, String s1, String s2, double f, String s3, boolean z, int v) {
        j.f(s, "age");
        j.f(s2, "unit");
        j.f(s3, "district");
        return new Civ7BonusMinorStartingUnits(s, s1, s2, f, s3, z, v);
    }

    public static Civ7BonusMinorStartingUnits copy$default(Civ7BonusMinorStartingUnits civ7BonusMinorStartingUnits0, String s, String s1, String s2, double f, String s3, boolean z, int v, int v1, Object object0) {
        String s4 = (v1 & 1) == 0 ? s : civ7BonusMinorStartingUnits0.age;
        String s5 = (v1 & 2) == 0 ? s1 : civ7BonusMinorStartingUnits0.minDifficulty;
        String s6 = (v1 & 4) == 0 ? s2 : civ7BonusMinorStartingUnits0.unit;
        double f1 = (v1 & 8) == 0 ? f : civ7BonusMinorStartingUnits0.difficultyDelta;
        String s7 = (v1 & 16) == 0 ? s3 : civ7BonusMinorStartingUnits0.district;
        boolean z1 = (v1 & 0x20) == 0 ? z : civ7BonusMinorStartingUnits0.onDistrictCreated;
        return (v1 & 0x40) == 0 ? civ7BonusMinorStartingUnits0.copy(s4, s5, s6, f1, s7, z1, v) : civ7BonusMinorStartingUnits0.copy(s4, s5, s6, f1, s7, z1, civ7BonusMinorStartingUnits0.quantity);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7BonusMinorStartingUnits)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7BonusMinorStartingUnits)object0).age)) {
            return false;
        }
        if(!j.a(this.minDifficulty, ((Civ7BonusMinorStartingUnits)object0).minDifficulty)) {
            return false;
        }
        if(!j.a(this.unit, ((Civ7BonusMinorStartingUnits)object0).unit)) {
            return false;
        }
        if(Double.compare(this.difficultyDelta, ((Civ7BonusMinorStartingUnits)object0).difficultyDelta) != 0) {
            return false;
        }
        if(!j.a(this.district, ((Civ7BonusMinorStartingUnits)object0).district)) {
            return false;
        }
        return this.onDistrictCreated == ((Civ7BonusMinorStartingUnits)object0).onDistrictCreated ? this.quantity == ((Civ7BonusMinorStartingUnits)object0).quantity : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final double getDifficultyDelta() {
        return this.difficultyDelta;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getMinDifficulty() {
        return this.minDifficulty;
    }

    public final boolean getOnDistrictCreated() {
        return this.onDistrictCreated;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getUnit() {
        return this.unit;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.difficultyDelta);
        int v1 = f.b((f.b((this.age.hashCode() * 0x1F + (this.minDifficulty == null ? 0 : this.minDifficulty.hashCode())) * 0x1F, 0x1F, this.unit) + ((int)(v ^ v >>> 0x20))) * 0x1F, 0x1F, this.district);
        return this.onDistrictCreated ? (v1 + 0x4CF) * 0x1F + this.quantity : (v1 + 0x4D5) * 0x1F + this.quantity;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7BonusMinorStartingUnits(age=", this.age, ", minDifficulty=", this.minDifficulty, ", unit=");
        stringBuilder0.append(this.unit);
        stringBuilder0.append(", difficultyDelta=");
        stringBuilder0.append(this.difficultyDelta);
        stringBuilder0.append(", district=");
        stringBuilder0.append(this.district);
        stringBuilder0.append(", onDistrictCreated=");
        stringBuilder0.append(this.onDistrictCreated);
        stringBuilder0.append(", quantity=");
        stringBuilder0.append(this.quantity);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

