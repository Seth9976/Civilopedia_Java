package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJ\u0010\u0010\u0016\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0011JV\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0011J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010\"\u001A\u0004\b#\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010 \u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010\"\u001A\u0004\b%\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010\"\u001A\u0004\b&\u0010\u0011R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010 \u001A\u0004\b\'\u0010\u000ER\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010\"\u001A\u0004\b(\u0010\u0011\u00A8\u0006)"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomacyFavorsGrievancesEventsData;", "Lo2/m;", "", "diplomacyFavorGrievanceEventType", "", "amount", "diplomacyFavorGrievanceEventGroup", "infAward", "infAwardPerPopulation", "name", "range", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7DiplomacyFavorsGrievancesEventsData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDiplomacyFavorGrievanceEventType", "I", "getAmount", "getDiplomacyFavorGrievanceEventGroup", "getInfAward", "getInfAwardPerPopulation", "getName", "getRange", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomacyFavorsGrievancesEventsData implements m {
    private final int amount;
    private final String diplomacyFavorGrievanceEventGroup;
    private final String diplomacyFavorGrievanceEventType;
    private final int infAward;
    private final int infAwardPerPopulation;
    private final String name;
    private final int range;

    public Civ7DiplomacyFavorsGrievancesEventsData(String s, int v, String s1, int v1, int v2, String s2, int v3) {
        j.f(s, "diplomacyFavorGrievanceEventType");
        j.f(s1, "diplomacyFavorGrievanceEventGroup");
        j.f(s2, "name");
        super();
        this.diplomacyFavorGrievanceEventType = s;
        this.amount = v;
        this.diplomacyFavorGrievanceEventGroup = s1;
        this.infAward = v1;
        this.infAwardPerPopulation = v2;
        this.name = s2;
        this.range = v3;
    }

    public final String component1() {
        return this.diplomacyFavorGrievanceEventType;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.diplomacyFavorGrievanceEventGroup;
    }

    public final int component4() {
        return this.infAward;
    }

    public final int component5() {
        return this.infAwardPerPopulation;
    }

    public final String component6() {
        return this.name;
    }

    public final int component7() {
        return this.range;
    }

    public final Civ7DiplomacyFavorsGrievancesEventsData copy(String s, int v, String s1, int v1, int v2, String s2, int v3) {
        j.f(s, "diplomacyFavorGrievanceEventType");
        j.f(s1, "diplomacyFavorGrievanceEventGroup");
        j.f(s2, "name");
        return new Civ7DiplomacyFavorsGrievancesEventsData(s, v, s1, v1, v2, s2, v3);
    }

    public static Civ7DiplomacyFavorsGrievancesEventsData copy$default(Civ7DiplomacyFavorsGrievancesEventsData civ7DiplomacyFavorsGrievancesEventsData0, String s, int v, String s1, int v1, int v2, String s2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            s = civ7DiplomacyFavorsGrievancesEventsData0.diplomacyFavorGrievanceEventType;
        }
        if((v4 & 2) != 0) {
            v = civ7DiplomacyFavorsGrievancesEventsData0.amount;
        }
        if((v4 & 4) != 0) {
            s1 = civ7DiplomacyFavorsGrievancesEventsData0.diplomacyFavorGrievanceEventGroup;
        }
        if((v4 & 8) != 0) {
            v1 = civ7DiplomacyFavorsGrievancesEventsData0.infAward;
        }
        if((v4 & 16) != 0) {
            v2 = civ7DiplomacyFavorsGrievancesEventsData0.infAwardPerPopulation;
        }
        if((v4 & 0x20) != 0) {
            s2 = civ7DiplomacyFavorsGrievancesEventsData0.name;
        }
        if((v4 & 0x40) != 0) {
            v3 = civ7DiplomacyFavorsGrievancesEventsData0.range;
        }
        return civ7DiplomacyFavorsGrievancesEventsData0.copy(s, v, s1, v1, v2, s2, v3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomacyFavorsGrievancesEventsData)) {
            return false;
        }
        if(!j.a(this.diplomacyFavorGrievanceEventType, ((Civ7DiplomacyFavorsGrievancesEventsData)object0).diplomacyFavorGrievanceEventType)) {
            return false;
        }
        if(this.amount != ((Civ7DiplomacyFavorsGrievancesEventsData)object0).amount) {
            return false;
        }
        if(!j.a(this.diplomacyFavorGrievanceEventGroup, ((Civ7DiplomacyFavorsGrievancesEventsData)object0).diplomacyFavorGrievanceEventGroup)) {
            return false;
        }
        if(this.infAward != ((Civ7DiplomacyFavorsGrievancesEventsData)object0).infAward) {
            return false;
        }
        if(this.infAwardPerPopulation != ((Civ7DiplomacyFavorsGrievancesEventsData)object0).infAwardPerPopulation) {
            return false;
        }
        return j.a(this.name, ((Civ7DiplomacyFavorsGrievancesEventsData)object0).name) ? this.range == ((Civ7DiplomacyFavorsGrievancesEventsData)object0).range : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDiplomacyFavorGrievanceEventGroup() {
        return this.diplomacyFavorGrievanceEventGroup;
    }

    public final String getDiplomacyFavorGrievanceEventType() {
        return this.diplomacyFavorGrievanceEventType;
    }

    public final int getInfAward() {
        return this.infAward;
    }

    public final int getInfAwardPerPopulation() {
        return this.infAwardPerPopulation;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRange() {
        return this.range;
    }

    @Override
    public int hashCode() {
        return f.b(((f.b((this.diplomacyFavorGrievanceEventType.hashCode() * 0x1F + this.amount) * 0x1F, 0x1F, this.diplomacyFavorGrievanceEventGroup) + this.infAward) * 0x1F + this.infAwardPerPopulation) * 0x1F, 0x1F, this.name) + this.range;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.diplomacyFavorGrievanceEventType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.amount, "Civ7DiplomacyFavorsGrievancesEventsData(diplomacyFavorGrievanceEventType=", this.diplomacyFavorGrievanceEventType, ", amount=", ", diplomacyFavorGrievanceEventGroup=");
        f.s(stringBuilder0, this.diplomacyFavorGrievanceEventGroup, ", infAward=", this.infAward, ", infAwardPerPopulation=");
        f.r(stringBuilder0, this.infAwardPerPopulation, ", name=", this.name, ", range=");
        return e.g(stringBuilder0, this.range, ")");
    }
}

