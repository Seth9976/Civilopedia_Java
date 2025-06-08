package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u001F\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeDisplay_Civilizations;", "", "civilizationType", "", "civilizationImage", "(Ljava/lang/String;Ljava/lang/String;)V", "getCivilizationImage", "()Ljava/lang/String;", "getCivilizationType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeDisplay_Civilizations {
    private final String civilizationImage;
    private final String civilizationType;

    public Civ7NarrativeDisplay_Civilizations(String s, String s1) {
        j.f(s, "civilizationType");
        super();
        this.civilizationType = s;
        this.civilizationImage = s1;
    }

    public final String component1() {
        return this.civilizationType;
    }

    public final String component2() {
        return this.civilizationImage;
    }

    public final Civ7NarrativeDisplay_Civilizations copy(String s, String s1) {
        j.f(s, "civilizationType");
        return new Civ7NarrativeDisplay_Civilizations(s, s1);
    }

    public static Civ7NarrativeDisplay_Civilizations copy$default(Civ7NarrativeDisplay_Civilizations civ7NarrativeDisplay_Civilizations0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7NarrativeDisplay_Civilizations0.civilizationType;
        }
        if((v & 2) != 0) {
            s1 = civ7NarrativeDisplay_Civilizations0.civilizationImage;
        }
        return civ7NarrativeDisplay_Civilizations0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeDisplay_Civilizations)) {
            return false;
        }
        return j.a(this.civilizationType, ((Civ7NarrativeDisplay_Civilizations)object0).civilizationType) ? j.a(this.civilizationImage, ((Civ7NarrativeDisplay_Civilizations)object0).civilizationImage) : false;
    }

    public final String getCivilizationImage() {
        return this.civilizationImage;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    @Override
    public int hashCode() {
        int v = this.civilizationType.hashCode();
        return this.civilizationImage == null ? v * 0x1F : v * 0x1F + this.civilizationImage.hashCode();
    }

    @Override
    public String toString() {
        return f.k("Civ7NarrativeDisplay_Civilizations(civilizationType=", this.civilizationType, ", civilizationImage=", this.civilizationImage, ")");
    }
}

