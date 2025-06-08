package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\bHÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003JE\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\bHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomaticActionResponses;", "", "diplomacyActionType", "", "diplomaticResponseType", "costDescription", "description", "infCost", "", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCostDescription", "()Ljava/lang/String;", "getDescription", "getDiplomacyActionType", "getDiplomaticResponseType", "getInfCost", "()I", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomaticActionResponses {
    private final String costDescription;
    private final String description;
    private final String diplomacyActionType;
    private final String diplomaticResponseType;
    private final int infCost;
    private final String name;

    public Civ7DiplomaticActionResponses(String s, String s1, String s2, String s3, int v, String s4) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "diplomaticResponseType");
        j.f(s2, "costDescription");
        j.f(s3, "description");
        j.f(s4, "name");
        super();
        this.diplomacyActionType = s;
        this.diplomaticResponseType = s1;
        this.costDescription = s2;
        this.description = s3;
        this.infCost = v;
        this.name = s4;
    }

    public final String component1() {
        return this.diplomacyActionType;
    }

    public final String component2() {
        return this.diplomaticResponseType;
    }

    public final String component3() {
        return this.costDescription;
    }

    public final String component4() {
        return this.description;
    }

    public final int component5() {
        return this.infCost;
    }

    public final String component6() {
        return this.name;
    }

    public final Civ7DiplomaticActionResponses copy(String s, String s1, String s2, String s3, int v, String s4) {
        j.f(s, "diplomacyActionType");
        j.f(s1, "diplomaticResponseType");
        j.f(s2, "costDescription");
        j.f(s3, "description");
        j.f(s4, "name");
        return new Civ7DiplomaticActionResponses(s, s1, s2, s3, v, s4);
    }

    public static Civ7DiplomaticActionResponses copy$default(Civ7DiplomaticActionResponses civ7DiplomaticActionResponses0, String s, String s1, String s2, String s3, int v, String s4, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7DiplomaticActionResponses0.diplomacyActionType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7DiplomaticActionResponses0.diplomaticResponseType;
        }
        if((v1 & 4) != 0) {
            s2 = civ7DiplomaticActionResponses0.costDescription;
        }
        if((v1 & 8) != 0) {
            s3 = civ7DiplomaticActionResponses0.description;
        }
        if((v1 & 16) != 0) {
            v = civ7DiplomaticActionResponses0.infCost;
        }
        if((v1 & 0x20) != 0) {
            s4 = civ7DiplomaticActionResponses0.name;
        }
        return civ7DiplomaticActionResponses0.copy(s, s1, s2, s3, v, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomaticActionResponses)) {
            return false;
        }
        if(!j.a(this.diplomacyActionType, ((Civ7DiplomaticActionResponses)object0).diplomacyActionType)) {
            return false;
        }
        if(!j.a(this.diplomaticResponseType, ((Civ7DiplomaticActionResponses)object0).diplomaticResponseType)) {
            return false;
        }
        if(!j.a(this.costDescription, ((Civ7DiplomaticActionResponses)object0).costDescription)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7DiplomaticActionResponses)object0).description)) {
            return false;
        }
        return this.infCost == ((Civ7DiplomaticActionResponses)object0).infCost ? j.a(this.name, ((Civ7DiplomaticActionResponses)object0).name) : false;
    }

    public final String getCostDescription() {
        return this.costDescription;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDiplomacyActionType() {
        return this.diplomacyActionType;
    }

    public final String getDiplomaticResponseType() {
        return this.diplomaticResponseType;
    }

    public final int getInfCost() {
        return this.infCost;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + (f.b(f.b(f.b(this.diplomacyActionType.hashCode() * 0x1F, 0x1F, this.diplomaticResponseType), 0x1F, this.costDescription), 0x1F, this.description) + this.infCost) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7DiplomaticActionResponses(diplomacyActionType=", this.diplomacyActionType, ", diplomaticResponseType=", this.diplomaticResponseType, ", costDescription=");
        f.t(stringBuilder0, this.costDescription, ", description=", this.description, ", infCost=");
        return u9.e(stringBuilder0, this.infCost, ", name=", this.name, ")");
    }
}

