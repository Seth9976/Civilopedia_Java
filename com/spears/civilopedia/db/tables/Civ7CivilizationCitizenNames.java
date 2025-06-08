package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0006HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00062\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CivilizationCitizenNames;", "", "citizenName", "", "civilizationType", "female", "", "modern", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCitizenName", "()Ljava/lang/String;", "getCivilizationType", "getFemale", "()Z", "getModern", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CivilizationCitizenNames {
    private final String citizenName;
    private final String civilizationType;
    private final boolean female;
    private final boolean modern;

    public Civ7CivilizationCitizenNames(String s, String s1, boolean z, boolean z1) {
        j.f(s, "citizenName");
        j.f(s1, "civilizationType");
        super();
        this.citizenName = s;
        this.civilizationType = s1;
        this.female = z;
        this.modern = z1;
    }

    public final String component1() {
        return this.citizenName;
    }

    public final String component2() {
        return this.civilizationType;
    }

    public final boolean component3() {
        return this.female;
    }

    public final boolean component4() {
        return this.modern;
    }

    public final Civ7CivilizationCitizenNames copy(String s, String s1, boolean z, boolean z1) {
        j.f(s, "citizenName");
        j.f(s1, "civilizationType");
        return new Civ7CivilizationCitizenNames(s, s1, z, z1);
    }

    public static Civ7CivilizationCitizenNames copy$default(Civ7CivilizationCitizenNames civ7CivilizationCitizenNames0, String s, String s1, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7CivilizationCitizenNames0.citizenName;
        }
        if((v & 2) != 0) {
            s1 = civ7CivilizationCitizenNames0.civilizationType;
        }
        if((v & 4) != 0) {
            z = civ7CivilizationCitizenNames0.female;
        }
        if((v & 8) != 0) {
            z1 = civ7CivilizationCitizenNames0.modern;
        }
        return civ7CivilizationCitizenNames0.copy(s, s1, z, z1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CivilizationCitizenNames)) {
            return false;
        }
        if(!j.a(this.citizenName, ((Civ7CivilizationCitizenNames)object0).citizenName)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((Civ7CivilizationCitizenNames)object0).civilizationType)) {
            return false;
        }
        return this.female == ((Civ7CivilizationCitizenNames)object0).female ? this.modern == ((Civ7CivilizationCitizenNames)object0).modern : false;
    }

    public final String getCitizenName() {
        return this.citizenName;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final boolean getFemale() {
        return this.female;
    }

    public final boolean getModern() {
        return this.modern;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.citizenName.hashCode() * 0x1F, 0x1F, this.civilizationType);
        int v1 = 0x4D5;
        int v2 = this.female ? 0x4CF : 0x4D5;
        if(this.modern) {
            v1 = 0x4CF;
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7CivilizationCitizenNames(citizenName=", this.citizenName, ", civilizationType=", this.civilizationType, ", female=");
        stringBuilder0.append(this.female);
        stringBuilder0.append(", modern=");
        stringBuilder0.append(this.modern);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

