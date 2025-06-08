package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0002\b\u000B\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000FJ\u001A\u0010\u0019\u001A\u00020\u00072\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001B\u001A\u0004\b\u001C\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001D\u001A\u0004\b\u001E\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001D\u001A\u0004\b\u001F\u0010\u000FR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001A\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7ModifierTokens;", "Lo2/m;", "", "relationshipModifier", "", "favorsGiven", "grievancesGiven", "", "useSupportEvent", "<init>", "(Ljava/lang/String;IIZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;IIZ)Lcom/spears/civilopedia/db/tables/Civ7ModifierTokens;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRelationshipModifier", "I", "getFavorsGiven", "getGrievancesGiven", "Z", "getUseSupportEvent", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7ModifierTokens implements m {
    private final int favorsGiven;
    private final int grievancesGiven;
    private final String relationshipModifier;
    private final boolean useSupportEvent;

    public Civ7ModifierTokens(String s, int v, int v1, boolean z) {
        j.f(s, "relationshipModifier");
        super();
        this.relationshipModifier = s;
        this.favorsGiven = v;
        this.grievancesGiven = v1;
        this.useSupportEvent = z;
    }

    public final String component1() {
        return this.relationshipModifier;
    }

    public final int component2() {
        return this.favorsGiven;
    }

    public final int component3() {
        return this.grievancesGiven;
    }

    public final boolean component4() {
        return this.useSupportEvent;
    }

    public final Civ7ModifierTokens copy(String s, int v, int v1, boolean z) {
        j.f(s, "relationshipModifier");
        return new Civ7ModifierTokens(s, v, v1, z);
    }

    public static Civ7ModifierTokens copy$default(Civ7ModifierTokens civ7ModifierTokens0, String s, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7ModifierTokens0.relationshipModifier;
        }
        if((v2 & 2) != 0) {
            v = civ7ModifierTokens0.favorsGiven;
        }
        if((v2 & 4) != 0) {
            v1 = civ7ModifierTokens0.grievancesGiven;
        }
        if((v2 & 8) != 0) {
            z = civ7ModifierTokens0.useSupportEvent;
        }
        return civ7ModifierTokens0.copy(s, v, v1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7ModifierTokens)) {
            return false;
        }
        if(!j.a(this.relationshipModifier, ((Civ7ModifierTokens)object0).relationshipModifier)) {
            return false;
        }
        if(this.favorsGiven != ((Civ7ModifierTokens)object0).favorsGiven) {
            return false;
        }
        return this.grievancesGiven == ((Civ7ModifierTokens)object0).grievancesGiven ? this.useSupportEvent == ((Civ7ModifierTokens)object0).useSupportEvent : false;
    }

    public final int getFavorsGiven() {
        return this.favorsGiven;
    }

    public final int getGrievancesGiven() {
        return this.grievancesGiven;
    }

    public final String getRelationshipModifier() {
        return this.relationshipModifier;
    }

    public final boolean getUseSupportEvent() {
        return this.useSupportEvent;
    }

    @Override
    public int hashCode() {
        int v = ((this.relationshipModifier.hashCode() * 0x1F + this.favorsGiven) * 0x1F + this.grievancesGiven) * 0x1F;
        return this.useSupportEvent ? v + 0x4CF : v + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.relationshipModifier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.favorsGiven, "Civ7ModifierTokens(relationshipModifier=", this.relationshipModifier, ", favorsGiven=", ", grievancesGiven=");
        stringBuilder0.append(this.grievancesGiven);
        stringBuilder0.append(", useSupportEvent=");
        stringBuilder0.append(this.useSupportEvent);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

