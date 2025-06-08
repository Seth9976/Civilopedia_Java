package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\nJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001A\u001A\u0004\b\u001B\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001A\u0004\b\u001C\u0010\n¨\u0006\u001D"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomacyAgendaAmountTypes;", "Lo2/m;", "", "diplomacyAgendaAmountType", "", "amount", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7DiplomacyAgendaAmountTypes;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDiplomacyAgendaAmountType", "I", "getAmount", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomacyAgendaAmountTypes implements m {
    private final int amount;
    private final String diplomacyAgendaAmountType;
    private final String name;

    public Civ7DiplomacyAgendaAmountTypes(String s, int v, String s1) {
        j.f(s, "diplomacyAgendaAmountType");
        j.f(s1, "name");
        super();
        this.diplomacyAgendaAmountType = s;
        this.amount = v;
        this.name = s1;
    }

    public final String component1() {
        return this.diplomacyAgendaAmountType;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.name;
    }

    public final Civ7DiplomacyAgendaAmountTypes copy(String s, int v, String s1) {
        j.f(s, "diplomacyAgendaAmountType");
        j.f(s1, "name");
        return new Civ7DiplomacyAgendaAmountTypes(s, v, s1);
    }

    public static Civ7DiplomacyAgendaAmountTypes copy$default(Civ7DiplomacyAgendaAmountTypes civ7DiplomacyAgendaAmountTypes0, String s, int v, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7DiplomacyAgendaAmountTypes0.diplomacyAgendaAmountType;
        }
        if((v1 & 2) != 0) {
            v = civ7DiplomacyAgendaAmountTypes0.amount;
        }
        if((v1 & 4) != 0) {
            s1 = civ7DiplomacyAgendaAmountTypes0.name;
        }
        return civ7DiplomacyAgendaAmountTypes0.copy(s, v, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomacyAgendaAmountTypes)) {
            return false;
        }
        if(!j.a(this.diplomacyAgendaAmountType, ((Civ7DiplomacyAgendaAmountTypes)object0).diplomacyAgendaAmountType)) {
            return false;
        }
        return this.amount == ((Civ7DiplomacyAgendaAmountTypes)object0).amount ? j.a(this.name, ((Civ7DiplomacyAgendaAmountTypes)object0).name) : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDiplomacyAgendaAmountType() {
        return this.diplomacyAgendaAmountType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + (this.diplomacyAgendaAmountType.hashCode() * 0x1F + this.amount) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.diplomacyAgendaAmountType;
    }

    @Override
    public String toString() {
        return e.h(f.m(this.amount, "Civ7DiplomacyAgendaAmountTypes(diplomacyAgendaAmountType=", this.diplomacyAgendaAmountType, ", amount=", ", name="), this.name, ")");
    }
}

