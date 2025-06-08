package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0004\u0012\u0006\u0010\u000E\u001A\u00020\u0004\u0012\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001A\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0016J\u0010\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0016J\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0016J\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0016J\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u0016J\u0010\u0010\u001F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0016J\u0010\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0016J\u0088\u0001\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00042\b\b\u0002\u0010\u000E\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b#\u0010\u0013J\u0010\u0010$\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u0016J\u001A\u0010(\u001A\u00020\'2\b\u0010&\u001A\u0004\u0018\u00010%H\u00D6\u0003\u00A2\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010*\u001A\u0004\b+\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010,\u001A\u0004\b-\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010,\u001A\u0004\b.\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010,\u001A\u0004\b/\u0010\u0016R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010,\u001A\u0004\b0\u0010\u0016R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\t\u0010,\u001A\u0004\b1\u0010\u0016R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010,\u001A\u0004\b2\u0010\u0016R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010,\u001A\u0004\b3\u0010\u0016R\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\f\u0010,\u001A\u0004\b4\u0010\u0016R\u0017\u0010\r\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\r\u0010,\u001A\u0004\b5\u0010\u0016R\u0017\u0010\u000E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010,\u001A\u0004\b6\u0010\u0016R\u0017\u0010\u000F\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010,\u001A\u0004\b7\u0010\u0016\u00A8\u00068"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomaticActionInfluenceCosts;", "Lo2/m;", "", "diplomacyActionType", "", "infCostFriendly", "infCostHelpful", "infCostHostile", "infCostNeutral", "infCostNoRelationship", "infCostPerTurn", "infCostSupportIncreaseFlat", "infCostSupportIncreasePercent", "infCostUnfriendly", "penaltyInfCostDuration", "penaltyInfCostPerTurn", "<init>", "(Ljava/lang/String;IIIIIIIIIII)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;IIIIIIIIIII)Lcom/spears/civilopedia/db/tables/Civ7DiplomaticActionInfluenceCosts;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDiplomacyActionType", "I", "getInfCostFriendly", "getInfCostHelpful", "getInfCostHostile", "getInfCostNeutral", "getInfCostNoRelationship", "getInfCostPerTurn", "getInfCostSupportIncreaseFlat", "getInfCostSupportIncreasePercent", "getInfCostUnfriendly", "getPenaltyInfCostDuration", "getPenaltyInfCostPerTurn", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomaticActionInfluenceCosts implements m {
    private final String diplomacyActionType;
    private final int infCostFriendly;
    private final int infCostHelpful;
    private final int infCostHostile;
    private final int infCostNeutral;
    private final int infCostNoRelationship;
    private final int infCostPerTurn;
    private final int infCostSupportIncreaseFlat;
    private final int infCostSupportIncreasePercent;
    private final int infCostUnfriendly;
    private final int penaltyInfCostDuration;
    private final int penaltyInfCostPerTurn;

    public Civ7DiplomaticActionInfluenceCosts(String s, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10) {
        j.f(s, "diplomacyActionType");
        super();
        this.diplomacyActionType = s;
        this.infCostFriendly = v;
        this.infCostHelpful = v1;
        this.infCostHostile = v2;
        this.infCostNeutral = v3;
        this.infCostNoRelationship = v4;
        this.infCostPerTurn = v5;
        this.infCostSupportIncreaseFlat = v6;
        this.infCostSupportIncreasePercent = v7;
        this.infCostUnfriendly = v8;
        this.penaltyInfCostDuration = v9;
        this.penaltyInfCostPerTurn = v10;
    }

    public final String component1() {
        return this.diplomacyActionType;
    }

    public final int component10() {
        return this.infCostUnfriendly;
    }

    public final int component11() {
        return this.penaltyInfCostDuration;
    }

    public final int component12() {
        return this.penaltyInfCostPerTurn;
    }

    public final int component2() {
        return this.infCostFriendly;
    }

    public final int component3() {
        return this.infCostHelpful;
    }

    public final int component4() {
        return this.infCostHostile;
    }

    public final int component5() {
        return this.infCostNeutral;
    }

    public final int component6() {
        return this.infCostNoRelationship;
    }

    public final int component7() {
        return this.infCostPerTurn;
    }

    public final int component8() {
        return this.infCostSupportIncreaseFlat;
    }

    public final int component9() {
        return this.infCostSupportIncreasePercent;
    }

    public final Civ7DiplomaticActionInfluenceCosts copy(String s, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10) {
        j.f(s, "diplomacyActionType");
        return new Civ7DiplomaticActionInfluenceCosts(s, v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    public static Civ7DiplomaticActionInfluenceCosts copy$default(Civ7DiplomaticActionInfluenceCosts civ7DiplomaticActionInfluenceCosts0, String s, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10, int v11, Object object0) {
        String s1 = (v11 & 1) == 0 ? s : civ7DiplomaticActionInfluenceCosts0.diplomacyActionType;
        int v12 = (v11 & 2) == 0 ? v : civ7DiplomaticActionInfluenceCosts0.infCostFriendly;
        int v13 = (v11 & 4) == 0 ? v1 : civ7DiplomaticActionInfluenceCosts0.infCostHelpful;
        int v14 = (v11 & 8) == 0 ? v2 : civ7DiplomaticActionInfluenceCosts0.infCostHostile;
        int v15 = (v11 & 16) == 0 ? v3 : civ7DiplomaticActionInfluenceCosts0.infCostNeutral;
        int v16 = (v11 & 0x20) == 0 ? v4 : civ7DiplomaticActionInfluenceCosts0.infCostNoRelationship;
        int v17 = (v11 & 0x40) == 0 ? v5 : civ7DiplomaticActionInfluenceCosts0.infCostPerTurn;
        int v18 = (v11 & 0x80) == 0 ? v6 : civ7DiplomaticActionInfluenceCosts0.infCostSupportIncreaseFlat;
        int v19 = (v11 & 0x100) == 0 ? v7 : civ7DiplomaticActionInfluenceCosts0.infCostSupportIncreasePercent;
        int v20 = (v11 & 0x200) == 0 ? v8 : civ7DiplomaticActionInfluenceCosts0.infCostUnfriendly;
        int v21 = (v11 & 0x400) == 0 ? v9 : civ7DiplomaticActionInfluenceCosts0.penaltyInfCostDuration;
        return (v11 & 0x800) == 0 ? civ7DiplomaticActionInfluenceCosts0.copy(s1, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v10) : civ7DiplomaticActionInfluenceCosts0.copy(s1, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, civ7DiplomaticActionInfluenceCosts0.penaltyInfCostPerTurn);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomaticActionInfluenceCosts)) {
            return false;
        }
        if(!j.a(this.diplomacyActionType, ((Civ7DiplomaticActionInfluenceCosts)object0).diplomacyActionType)) {
            return false;
        }
        if(this.infCostFriendly != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostFriendly) {
            return false;
        }
        if(this.infCostHelpful != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostHelpful) {
            return false;
        }
        if(this.infCostHostile != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostHostile) {
            return false;
        }
        if(this.infCostNeutral != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostNeutral) {
            return false;
        }
        if(this.infCostNoRelationship != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostNoRelationship) {
            return false;
        }
        if(this.infCostPerTurn != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostPerTurn) {
            return false;
        }
        if(this.infCostSupportIncreaseFlat != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostSupportIncreaseFlat) {
            return false;
        }
        if(this.infCostSupportIncreasePercent != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostSupportIncreasePercent) {
            return false;
        }
        if(this.infCostUnfriendly != ((Civ7DiplomaticActionInfluenceCosts)object0).infCostUnfriendly) {
            return false;
        }
        return this.penaltyInfCostDuration == ((Civ7DiplomaticActionInfluenceCosts)object0).penaltyInfCostDuration ? this.penaltyInfCostPerTurn == ((Civ7DiplomaticActionInfluenceCosts)object0).penaltyInfCostPerTurn : false;
    }

    public final String getDiplomacyActionType() {
        return this.diplomacyActionType;
    }

    public final int getInfCostFriendly() {
        return this.infCostFriendly;
    }

    public final int getInfCostHelpful() {
        return this.infCostHelpful;
    }

    public final int getInfCostHostile() {
        return this.infCostHostile;
    }

    public final int getInfCostNeutral() {
        return this.infCostNeutral;
    }

    public final int getInfCostNoRelationship() {
        return this.infCostNoRelationship;
    }

    public final int getInfCostPerTurn() {
        return this.infCostPerTurn;
    }

    public final int getInfCostSupportIncreaseFlat() {
        return this.infCostSupportIncreaseFlat;
    }

    public final int getInfCostSupportIncreasePercent() {
        return this.infCostSupportIncreasePercent;
    }

    public final int getInfCostUnfriendly() {
        return this.infCostUnfriendly;
    }

    public final int getPenaltyInfCostDuration() {
        return this.penaltyInfCostDuration;
    }

    public final int getPenaltyInfCostPerTurn() {
        return this.penaltyInfCostPerTurn;
    }

    @Override
    public int hashCode() {
        return ((((((((((this.diplomacyActionType.hashCode() * 0x1F + this.infCostFriendly) * 0x1F + this.infCostHelpful) * 0x1F + this.infCostHostile) * 0x1F + this.infCostNeutral) * 0x1F + this.infCostNoRelationship) * 0x1F + this.infCostPerTurn) * 0x1F + this.infCostSupportIncreaseFlat) * 0x1F + this.infCostSupportIncreasePercent) * 0x1F + this.infCostUnfriendly) * 0x1F + this.penaltyInfCostDuration) * 0x1F + this.penaltyInfCostPerTurn;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.diplomacyActionType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.infCostFriendly, "Civ7DiplomaticActionInfluenceCosts(diplomacyActionType=", this.diplomacyActionType, ", infCostFriendly=", ", infCostHelpful=");
        f.q(stringBuilder0, this.infCostHelpful, ", infCostHostile=", this.infCostHostile, ", infCostNeutral=");
        f.q(stringBuilder0, this.infCostNeutral, ", infCostNoRelationship=", this.infCostNoRelationship, ", infCostPerTurn=");
        f.q(stringBuilder0, this.infCostPerTurn, ", infCostSupportIncreaseFlat=", this.infCostSupportIncreaseFlat, ", infCostSupportIncreasePercent=");
        f.q(stringBuilder0, this.infCostSupportIncreasePercent, ", infCostUnfriendly=", this.infCostUnfriendly, ", penaltyInfCostDuration=");
        stringBuilder0.append(this.penaltyInfCostDuration);
        stringBuilder0.append(", penaltyInfCostPerTurn=");
        stringBuilder0.append(this.penaltyInfCostPerTurn);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

