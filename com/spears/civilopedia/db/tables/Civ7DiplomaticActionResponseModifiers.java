package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J;\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomaticActionResponseModifiers;", "", "diplomacyActionType", "", "diplomaticResponseType", "modifierId", "modifierTarget", "modifierType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiplomacyActionType", "()Ljava/lang/String;", "getDiplomaticResponseType", "getModifierId", "getModifierTarget", "getModifierType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomaticActionResponseModifiers {
    private final String diplomacyActionType;
    private final String diplomaticResponseType;
    private final String modifierId;
    private final String modifierTarget;
    private final String modifierType;

    public Civ7DiplomaticActionResponseModifiers(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "diplomaticResponseType");
        j.f(s2, "modifierId");
        j.f(s3, "modifierTarget");
        j.f(s4, "modifierType");
        super();
        this.diplomacyActionType = s;
        this.diplomaticResponseType = s1;
        this.modifierId = s2;
        this.modifierTarget = s3;
        this.modifierType = s4;
    }

    public final String component1() {
        return this.diplomacyActionType;
    }

    public final String component2() {
        return this.diplomaticResponseType;
    }

    public final String component3() {
        return this.modifierId;
    }

    public final String component4() {
        return this.modifierTarget;
    }

    public final String component5() {
        return this.modifierType;
    }

    public final Civ7DiplomaticActionResponseModifiers copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "diplomaticResponseType");
        j.f(s2, "modifierId");
        j.f(s3, "modifierTarget");
        j.f(s4, "modifierType");
        return new Civ7DiplomaticActionResponseModifiers(s, s1, s2, s3, s4);
    }

    public static Civ7DiplomaticActionResponseModifiers copy$default(Civ7DiplomaticActionResponseModifiers civ7DiplomaticActionResponseModifiers0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7DiplomaticActionResponseModifiers0.diplomacyActionType;
        }
        if((v & 2) != 0) {
            s1 = civ7DiplomaticActionResponseModifiers0.diplomaticResponseType;
        }
        if((v & 4) != 0) {
            s2 = civ7DiplomaticActionResponseModifiers0.modifierId;
        }
        if((v & 8) != 0) {
            s3 = civ7DiplomaticActionResponseModifiers0.modifierTarget;
        }
        if((v & 16) != 0) {
            s4 = civ7DiplomaticActionResponseModifiers0.modifierType;
        }
        return civ7DiplomaticActionResponseModifiers0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomaticActionResponseModifiers)) {
            return false;
        }
        if(!j.a(this.diplomacyActionType, ((Civ7DiplomaticActionResponseModifiers)object0).diplomacyActionType)) {
            return false;
        }
        if(!j.a(this.diplomaticResponseType, ((Civ7DiplomaticActionResponseModifiers)object0).diplomaticResponseType)) {
            return false;
        }
        if(!j.a(this.modifierId, ((Civ7DiplomaticActionResponseModifiers)object0).modifierId)) {
            return false;
        }
        return j.a(this.modifierTarget, ((Civ7DiplomaticActionResponseModifiers)object0).modifierTarget) ? j.a(this.modifierType, ((Civ7DiplomaticActionResponseModifiers)object0).modifierType) : false;
    }

    public final String getDiplomacyActionType() {
        return this.diplomacyActionType;
    }

    public final String getDiplomaticResponseType() {
        return this.diplomaticResponseType;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    public final String getModifierTarget() {
        return this.modifierTarget;
    }

    public final String getModifierType() {
        return this.modifierType;
    }

    @Override
    public int hashCode() {
        return this.modifierType.hashCode() + f.b(f.b(f.b(this.diplomacyActionType.hashCode() * 0x1F, 0x1F, this.diplomaticResponseType), 0x1F, this.modifierId), 0x1F, this.modifierTarget);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7DiplomaticActionResponseModifiers(diplomacyActionType=", this.diplomacyActionType, ", diplomaticResponseType=", this.diplomaticResponseType, ", modifierId=");
        f.t(stringBuilder0, this.modifierId, ", modifierTarget=", this.modifierTarget, ", modifierType=");
        return e.h(stringBuilder0, this.modifierType, ")");
    }
}

