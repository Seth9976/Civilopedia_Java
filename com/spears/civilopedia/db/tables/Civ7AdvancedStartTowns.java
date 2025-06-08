package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001C\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001D\u001A\u00020\u0005HÆ\u0003JO\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u001F\u001A\u00020\u00072\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\u0005HÖ\u0001J\t\u0010\"\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000B\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0013¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartTowns;", "", "age", "", "townID", "", "capital", "", "city", "ruralPopulation", "urbanPopulation", "workerPopulation", "(Ljava/lang/String;IZZIII)V", "getAge", "()Ljava/lang/String;", "getCapital", "()Z", "getCity", "getRuralPopulation", "()I", "getTownID", "getUrbanPopulation", "getWorkerPopulation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvancedStartTowns {
    private final String age;
    private final boolean capital;
    private final boolean city;
    private final int ruralPopulation;
    private final int townID;
    private final int urbanPopulation;
    private final int workerPopulation;

    public Civ7AdvancedStartTowns(String s, int v, boolean z, boolean z1, int v1, int v2, int v3) {
        j.f(s, "age");
        super();
        this.age = s;
        this.townID = v;
        this.capital = z;
        this.city = z1;
        this.ruralPopulation = v1;
        this.urbanPopulation = v2;
        this.workerPopulation = v3;
    }

    public final String component1() {
        return this.age;
    }

    public final int component2() {
        return this.townID;
    }

    public final boolean component3() {
        return this.capital;
    }

    public final boolean component4() {
        return this.city;
    }

    public final int component5() {
        return this.ruralPopulation;
    }

    public final int component6() {
        return this.urbanPopulation;
    }

    public final int component7() {
        return this.workerPopulation;
    }

    public final Civ7AdvancedStartTowns copy(String s, int v, boolean z, boolean z1, int v1, int v2, int v3) {
        j.f(s, "age");
        return new Civ7AdvancedStartTowns(s, v, z, z1, v1, v2, v3);
    }

    public static Civ7AdvancedStartTowns copy$default(Civ7AdvancedStartTowns civ7AdvancedStartTowns0, String s, int v, boolean z, boolean z1, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            s = civ7AdvancedStartTowns0.age;
        }
        if((v4 & 2) != 0) {
            v = civ7AdvancedStartTowns0.townID;
        }
        if((v4 & 4) != 0) {
            z = civ7AdvancedStartTowns0.capital;
        }
        if((v4 & 8) != 0) {
            z1 = civ7AdvancedStartTowns0.city;
        }
        if((v4 & 16) != 0) {
            v1 = civ7AdvancedStartTowns0.ruralPopulation;
        }
        if((v4 & 0x20) != 0) {
            v2 = civ7AdvancedStartTowns0.urbanPopulation;
        }
        if((v4 & 0x40) != 0) {
            v3 = civ7AdvancedStartTowns0.workerPopulation;
        }
        return civ7AdvancedStartTowns0.copy(s, v, z, z1, v1, v2, v3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvancedStartTowns)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AdvancedStartTowns)object0).age)) {
            return false;
        }
        if(this.townID != ((Civ7AdvancedStartTowns)object0).townID) {
            return false;
        }
        if(this.capital != ((Civ7AdvancedStartTowns)object0).capital) {
            return false;
        }
        if(this.city != ((Civ7AdvancedStartTowns)object0).city) {
            return false;
        }
        if(this.ruralPopulation != ((Civ7AdvancedStartTowns)object0).ruralPopulation) {
            return false;
        }
        return this.urbanPopulation == ((Civ7AdvancedStartTowns)object0).urbanPopulation ? this.workerPopulation == ((Civ7AdvancedStartTowns)object0).workerPopulation : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final boolean getCapital() {
        return this.capital;
    }

    public final boolean getCity() {
        return this.city;
    }

    public final int getRuralPopulation() {
        return this.ruralPopulation;
    }

    public final int getTownID() {
        return this.townID;
    }

    public final int getUrbanPopulation() {
        return this.urbanPopulation;
    }

    public final int getWorkerPopulation() {
        return this.workerPopulation;
    }

    @Override
    public int hashCode() {
        int v = (this.age.hashCode() * 0x1F + this.townID) * 0x1F;
        int v1 = 0x4D5;
        int v2 = this.capital ? 0x4CF : 0x4D5;
        if(this.city) {
            v1 = 0x4CF;
        }
        return ((((v + v2) * 0x1F + v1) * 0x1F + this.ruralPopulation) * 0x1F + this.urbanPopulation) * 0x1F + this.workerPopulation;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.townID, "Civ7AdvancedStartTowns(age=", this.age, ", townID=", ", capital=");
        u9.A(stringBuilder0, this.capital, ", city=", this.city, ", ruralPopulation=");
        f.q(stringBuilder0, this.ruralPopulation, ", urbanPopulation=", this.urbanPopulation, ", workerPopulation=");
        return e.g(stringBuilder0, this.workerPopulation, ")");
    }
}

