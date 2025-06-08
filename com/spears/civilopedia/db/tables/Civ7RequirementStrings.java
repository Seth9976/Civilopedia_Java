package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7RequirementStrings;", "", "context", "", "requirementId", "text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getRequirementId", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7RequirementStrings {
    private final String context;
    private final String requirementId;
    private final String text;

    public Civ7RequirementStrings(String s, String s1, String s2) {
        j.f(s, "context");
        j.f(s1, "requirementId");
        j.f(s2, "text");
        super();
        this.context = s;
        this.requirementId = s1;
        this.text = s2;
    }

    public final String component1() {
        return this.context;
    }

    public final String component2() {
        return this.requirementId;
    }

    public final String component3() {
        return this.text;
    }

    public final Civ7RequirementStrings copy(String s, String s1, String s2) {
        j.f(s, "context");
        j.f(s1, "requirementId");
        j.f(s2, "text");
        return new Civ7RequirementStrings(s, s1, s2);
    }

    public static Civ7RequirementStrings copy$default(Civ7RequirementStrings civ7RequirementStrings0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7RequirementStrings0.context;
        }
        if((v & 2) != 0) {
            s1 = civ7RequirementStrings0.requirementId;
        }
        if((v & 4) != 0) {
            s2 = civ7RequirementStrings0.text;
        }
        return civ7RequirementStrings0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7RequirementStrings)) {
            return false;
        }
        if(!j.a(this.context, ((Civ7RequirementStrings)object0).context)) {
            return false;
        }
        return j.a(this.requirementId, ((Civ7RequirementStrings)object0).requirementId) ? j.a(this.text, ((Civ7RequirementStrings)object0).text) : false;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getRequirementId() {
        return this.requirementId;
    }

    public final String getText() {
        return this.text;
    }

    @Override
    public int hashCode() {
        return this.text.hashCode() + f.b(this.context.hashCode() * 0x1F, 0x1F, this.requirementId);
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7RequirementStrings(context=", this.context, ", requirementId=", this.requirementId, ", text="), this.text, ")");
    }
}

