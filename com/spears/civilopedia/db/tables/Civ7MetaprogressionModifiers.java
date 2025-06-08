package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7MetaprogressionModifiers;", "", "modifierId", "", "requiredCivilizationType", "requiredLeaderType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModifierId", "()Ljava/lang/String;", "getRequiredCivilizationType", "getRequiredLeaderType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7MetaprogressionModifiers {
    private final String modifierId;
    private final String requiredCivilizationType;
    private final String requiredLeaderType;

    public Civ7MetaprogressionModifiers(String s, String s1, String s2) {
        j.f(s, "modifierId");
        super();
        this.modifierId = s;
        this.requiredCivilizationType = s1;
        this.requiredLeaderType = s2;
    }

    public final String component1() {
        return this.modifierId;
    }

    public final String component2() {
        return this.requiredCivilizationType;
    }

    public final String component3() {
        return this.requiredLeaderType;
    }

    public final Civ7MetaprogressionModifiers copy(String s, String s1, String s2) {
        j.f(s, "modifierId");
        return new Civ7MetaprogressionModifiers(s, s1, s2);
    }

    public static Civ7MetaprogressionModifiers copy$default(Civ7MetaprogressionModifiers civ7MetaprogressionModifiers0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7MetaprogressionModifiers0.modifierId;
        }
        if((v & 2) != 0) {
            s1 = civ7MetaprogressionModifiers0.requiredCivilizationType;
        }
        if((v & 4) != 0) {
            s2 = civ7MetaprogressionModifiers0.requiredLeaderType;
        }
        return civ7MetaprogressionModifiers0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7MetaprogressionModifiers)) {
            return false;
        }
        if(!j.a(this.modifierId, ((Civ7MetaprogressionModifiers)object0).modifierId)) {
            return false;
        }
        return j.a(this.requiredCivilizationType, ((Civ7MetaprogressionModifiers)object0).requiredCivilizationType) ? j.a(this.requiredLeaderType, ((Civ7MetaprogressionModifiers)object0).requiredLeaderType) : false;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    public final String getRequiredCivilizationType() {
        return this.requiredCivilizationType;
    }

    public final String getRequiredLeaderType() {
        return this.requiredLeaderType;
    }

    @Override
    public int hashCode() {
        int v = this.modifierId.hashCode();
        int v1 = 0;
        int v2 = this.requiredCivilizationType == null ? 0 : this.requiredCivilizationType.hashCode();
        String s = this.requiredLeaderType;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7MetaprogressionModifiers(modifierId=", this.modifierId, ", requiredCivilizationType=", this.requiredCivilizationType, ", requiredLeaderType="), this.requiredLeaderType, ")");
    }
}

