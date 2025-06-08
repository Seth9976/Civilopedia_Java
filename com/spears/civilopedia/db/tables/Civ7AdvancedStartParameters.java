package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJ\u0010\u0010\u0016\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0011JV\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0011J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010\"\u001A\u0004\b#\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010\"\u001A\u0004\b$\u0010\u0011R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010\"\u001A\u0004\b%\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010\"\u001A\u0004\b&\u0010\u0011R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010 \u001A\u0004\b\'\u0010\u000ER\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010\"\u001A\u0004\b(\u0010\u0011\u00A8\u0006)"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartParameters;", "Lo2/m;", "", "age", "", "cardLimit", "deckLimit", "freeUnits", "maxRegionPlots", "revealType", "showRegion", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;IIIILjava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartParameters;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAge", "I", "getCardLimit", "getDeckLimit", "getFreeUnits", "getMaxRegionPlots", "getRevealType", "getShowRegion", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvancedStartParameters implements m {
    private final String age;
    private final int cardLimit;
    private final int deckLimit;
    private final int freeUnits;
    private final int maxRegionPlots;
    private final String revealType;
    private final int showRegion;

    public Civ7AdvancedStartParameters(String s, int v, int v1, int v2, int v3, String s1, int v4) {
        j.f(s, "age");
        j.f(s1, "revealType");
        super();
        this.age = s;
        this.cardLimit = v;
        this.deckLimit = v1;
        this.freeUnits = v2;
        this.maxRegionPlots = v3;
        this.revealType = s1;
        this.showRegion = v4;
    }

    public final String component1() {
        return this.age;
    }

    public final int component2() {
        return this.cardLimit;
    }

    public final int component3() {
        return this.deckLimit;
    }

    public final int component4() {
        return this.freeUnits;
    }

    public final int component5() {
        return this.maxRegionPlots;
    }

    public final String component6() {
        return this.revealType;
    }

    public final int component7() {
        return this.showRegion;
    }

    public final Civ7AdvancedStartParameters copy(String s, int v, int v1, int v2, int v3, String s1, int v4) {
        j.f(s, "age");
        j.f(s1, "revealType");
        return new Civ7AdvancedStartParameters(s, v, v1, v2, v3, s1, v4);
    }

    public static Civ7AdvancedStartParameters copy$default(Civ7AdvancedStartParameters civ7AdvancedStartParameters0, String s, int v, int v1, int v2, int v3, String s1, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            s = civ7AdvancedStartParameters0.age;
        }
        if((v5 & 2) != 0) {
            v = civ7AdvancedStartParameters0.cardLimit;
        }
        if((v5 & 4) != 0) {
            v1 = civ7AdvancedStartParameters0.deckLimit;
        }
        if((v5 & 8) != 0) {
            v2 = civ7AdvancedStartParameters0.freeUnits;
        }
        if((v5 & 16) != 0) {
            v3 = civ7AdvancedStartParameters0.maxRegionPlots;
        }
        if((v5 & 0x20) != 0) {
            s1 = civ7AdvancedStartParameters0.revealType;
        }
        if((v5 & 0x40) != 0) {
            v4 = civ7AdvancedStartParameters0.showRegion;
        }
        return civ7AdvancedStartParameters0.copy(s, v, v1, v2, v3, s1, v4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvancedStartParameters)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AdvancedStartParameters)object0).age)) {
            return false;
        }
        if(this.cardLimit != ((Civ7AdvancedStartParameters)object0).cardLimit) {
            return false;
        }
        if(this.deckLimit != ((Civ7AdvancedStartParameters)object0).deckLimit) {
            return false;
        }
        if(this.freeUnits != ((Civ7AdvancedStartParameters)object0).freeUnits) {
            return false;
        }
        if(this.maxRegionPlots != ((Civ7AdvancedStartParameters)object0).maxRegionPlots) {
            return false;
        }
        return j.a(this.revealType, ((Civ7AdvancedStartParameters)object0).revealType) ? this.showRegion == ((Civ7AdvancedStartParameters)object0).showRegion : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getCardLimit() {
        return this.cardLimit;
    }

    public final int getDeckLimit() {
        return this.deckLimit;
    }

    public final int getFreeUnits() {
        return this.freeUnits;
    }

    public final int getMaxRegionPlots() {
        return this.maxRegionPlots;
    }

    public final String getRevealType() {
        return this.revealType;
    }

    public final int getShowRegion() {
        return this.showRegion;
    }

    @Override
    public int hashCode() {
        return f.b(((((this.age.hashCode() * 0x1F + this.cardLimit) * 0x1F + this.deckLimit) * 0x1F + this.freeUnits) * 0x1F + this.maxRegionPlots) * 0x1F, 0x1F, this.revealType) + this.showRegion;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.age;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.cardLimit, "Civ7AdvancedStartParameters(age=", this.age, ", cardLimit=", ", deckLimit=");
        f.q(stringBuilder0, this.deckLimit, ", freeUnits=", this.freeUnits, ", maxRegionPlots=");
        f.r(stringBuilder0, this.maxRegionPlots, ", revealType=", this.revealType, ", showRegion=");
        return e.g(stringBuilder0, this.showRegion, ")");
    }
}

