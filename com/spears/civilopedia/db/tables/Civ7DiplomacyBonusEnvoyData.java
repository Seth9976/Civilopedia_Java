package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u001A\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u0012\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001A\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0013Jj\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0010J\u0010\u0010\u001E\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u0013J\u001A\u0010\"\u001A\u00020!2\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u00D6\u0003\u00A2\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010$\u001A\u0004\b%\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010&\u001A\u0004\b\'\u0010\u0013R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010&\u001A\u0004\b(\u0010\u0013R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010&\u001A\u0004\b)\u0010\u0013R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010&\u001A\u0004\b*\u0010\u0013R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\t\u0010&\u001A\u0004\b+\u0010\u0013R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010&\u001A\u0004\b,\u0010\u0013R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010&\u001A\u0004\b-\u0010\u0013R\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\f\u0010&\u001A\u0004\b.\u0010\u0013\u00A8\u0006/"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomacyBonusEnvoyData;", "Lo2/m;", "", "diplomacyActionType", "", "initialFriendly", "initialHelpful", "initialHostile", "initialUnfriendly", "targetFriendly", "targetHelpful", "targetHostile", "targetUnfriendly", "<init>", "(Ljava/lang/String;IIIIIIII)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IIIIIIII)Lcom/spears/civilopedia/db/tables/Civ7DiplomacyBonusEnvoyData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDiplomacyActionType", "I", "getInitialFriendly", "getInitialHelpful", "getInitialHostile", "getInitialUnfriendly", "getTargetFriendly", "getTargetHelpful", "getTargetHostile", "getTargetUnfriendly", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomacyBonusEnvoyData implements m {
    private final String diplomacyActionType;
    private final int initialFriendly;
    private final int initialHelpful;
    private final int initialHostile;
    private final int initialUnfriendly;
    private final int targetFriendly;
    private final int targetHelpful;
    private final int targetHostile;
    private final int targetUnfriendly;

    public Civ7DiplomacyBonusEnvoyData(String s, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        j.f(s, "diplomacyActionType");
        super();
        this.diplomacyActionType = s;
        this.initialFriendly = v;
        this.initialHelpful = v1;
        this.initialHostile = v2;
        this.initialUnfriendly = v3;
        this.targetFriendly = v4;
        this.targetHelpful = v5;
        this.targetHostile = v6;
        this.targetUnfriendly = v7;
    }

    public final String component1() {
        return this.diplomacyActionType;
    }

    public final int component2() {
        return this.initialFriendly;
    }

    public final int component3() {
        return this.initialHelpful;
    }

    public final int component4() {
        return this.initialHostile;
    }

    public final int component5() {
        return this.initialUnfriendly;
    }

    public final int component6() {
        return this.targetFriendly;
    }

    public final int component7() {
        return this.targetHelpful;
    }

    public final int component8() {
        return this.targetHostile;
    }

    public final int component9() {
        return this.targetUnfriendly;
    }

    public final Civ7DiplomacyBonusEnvoyData copy(String s, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        j.f(s, "diplomacyActionType");
        return new Civ7DiplomacyBonusEnvoyData(s, v, v1, v2, v3, v4, v5, v6, v7);
    }

    public static Civ7DiplomacyBonusEnvoyData copy$default(Civ7DiplomacyBonusEnvoyData civ7DiplomacyBonusEnvoyData0, String s, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, Object object0) {
        String s1 = (v8 & 1) == 0 ? s : civ7DiplomacyBonusEnvoyData0.diplomacyActionType;
        int v9 = (v8 & 2) == 0 ? v : civ7DiplomacyBonusEnvoyData0.initialFriendly;
        int v10 = (v8 & 4) == 0 ? v1 : civ7DiplomacyBonusEnvoyData0.initialHelpful;
        int v11 = (v8 & 8) == 0 ? v2 : civ7DiplomacyBonusEnvoyData0.initialHostile;
        int v12 = (v8 & 16) == 0 ? v3 : civ7DiplomacyBonusEnvoyData0.initialUnfriendly;
        int v13 = (v8 & 0x20) == 0 ? v4 : civ7DiplomacyBonusEnvoyData0.targetFriendly;
        int v14 = (v8 & 0x40) == 0 ? v5 : civ7DiplomacyBonusEnvoyData0.targetHelpful;
        int v15 = (v8 & 0x80) == 0 ? v6 : civ7DiplomacyBonusEnvoyData0.targetHostile;
        return (v8 & 0x100) == 0 ? civ7DiplomacyBonusEnvoyData0.copy(s1, v9, v10, v11, v12, v13, v14, v15, v7) : civ7DiplomacyBonusEnvoyData0.copy(s1, v9, v10, v11, v12, v13, v14, v15, civ7DiplomacyBonusEnvoyData0.targetUnfriendly);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomacyBonusEnvoyData)) {
            return false;
        }
        if(!j.a(this.diplomacyActionType, ((Civ7DiplomacyBonusEnvoyData)object0).diplomacyActionType)) {
            return false;
        }
        if(this.initialFriendly != ((Civ7DiplomacyBonusEnvoyData)object0).initialFriendly) {
            return false;
        }
        if(this.initialHelpful != ((Civ7DiplomacyBonusEnvoyData)object0).initialHelpful) {
            return false;
        }
        if(this.initialHostile != ((Civ7DiplomacyBonusEnvoyData)object0).initialHostile) {
            return false;
        }
        if(this.initialUnfriendly != ((Civ7DiplomacyBonusEnvoyData)object0).initialUnfriendly) {
            return false;
        }
        if(this.targetFriendly != ((Civ7DiplomacyBonusEnvoyData)object0).targetFriendly) {
            return false;
        }
        if(this.targetHelpful != ((Civ7DiplomacyBonusEnvoyData)object0).targetHelpful) {
            return false;
        }
        return this.targetHostile == ((Civ7DiplomacyBonusEnvoyData)object0).targetHostile ? this.targetUnfriendly == ((Civ7DiplomacyBonusEnvoyData)object0).targetUnfriendly : false;
    }

    public final String getDiplomacyActionType() {
        return this.diplomacyActionType;
    }

    public final int getInitialFriendly() {
        return this.initialFriendly;
    }

    public final int getInitialHelpful() {
        return this.initialHelpful;
    }

    public final int getInitialHostile() {
        return this.initialHostile;
    }

    public final int getInitialUnfriendly() {
        return this.initialUnfriendly;
    }

    public final int getTargetFriendly() {
        return this.targetFriendly;
    }

    public final int getTargetHelpful() {
        return this.targetHelpful;
    }

    public final int getTargetHostile() {
        return this.targetHostile;
    }

    public final int getTargetUnfriendly() {
        return this.targetUnfriendly;
    }

    @Override
    public int hashCode() {
        return (((((((this.diplomacyActionType.hashCode() * 0x1F + this.initialFriendly) * 0x1F + this.initialHelpful) * 0x1F + this.initialHostile) * 0x1F + this.initialUnfriendly) * 0x1F + this.targetFriendly) * 0x1F + this.targetHelpful) * 0x1F + this.targetHostile) * 0x1F + this.targetUnfriendly;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.diplomacyActionType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.initialFriendly, "Civ7DiplomacyBonusEnvoyData(diplomacyActionType=", this.diplomacyActionType, ", initialFriendly=", ", initialHelpful=");
        f.q(stringBuilder0, this.initialHelpful, ", initialHostile=", this.initialHostile, ", initialUnfriendly=");
        f.q(stringBuilder0, this.initialUnfriendly, ", targetFriendly=", this.targetFriendly, ", targetHelpful=");
        f.q(stringBuilder0, this.targetHelpful, ", targetHostile=", this.targetHostile, ", targetUnfriendly=");
        return e.g(stringBuilder0, this.targetUnfriendly, ")");
    }
}

