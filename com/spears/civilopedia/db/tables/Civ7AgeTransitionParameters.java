package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\u0010\u0010\u0012\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0013J`\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u000FJ\u0010\u0010\u001C\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u0013J\u001A\u0010 \u001A\u00020\u001F2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u00D6\u0003\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010\"\u001A\u0004\b#\u0010\u000FR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010\"\u001A\u0004\b$\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010%\u001A\u0004\b&\u0010\u0013R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010%\u001A\u0004\b\'\u0010\u0013R\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\b\u0010%\u001A\u0004\b(\u0010\u0013R\u0017\u0010\t\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\t\u0010%\u001A\u0004\b)\u0010\u0013R\u0017\u0010\n\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\n\u0010%\u001A\u0004\b*\u0010\u0013R\u0017\u0010\u000B\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010%\u001A\u0004\b+\u0010\u0013\u00A8\u0006,"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeTransitionParameters;", "Lo2/m;", "", "setting", "age", "", "cityCountOnTransition", "commanderCountOnTransition", "defaultGoldOnTransition", "goldGainOnTransition", "settlementCountOnTransition", "wonderCountOnTransition", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIII)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;IIIIII)Lcom/spears/civilopedia/db/tables/Civ7AgeTransitionParameters;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSetting", "getAge", "I", "getCityCountOnTransition", "getCommanderCountOnTransition", "getDefaultGoldOnTransition", "getGoldGainOnTransition", "getSettlementCountOnTransition", "getWonderCountOnTransition", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeTransitionParameters implements m {
    private final String age;
    private final int cityCountOnTransition;
    private final int commanderCountOnTransition;
    private final int defaultGoldOnTransition;
    private final int goldGainOnTransition;
    private final String setting;
    private final int settlementCountOnTransition;
    private final int wonderCountOnTransition;

    public Civ7AgeTransitionParameters(String s, String s1, int v, int v1, int v2, int v3, int v4, int v5) {
        j.f(s, "setting");
        j.f(s1, "age");
        super();
        this.setting = s;
        this.age = s1;
        this.cityCountOnTransition = v;
        this.commanderCountOnTransition = v1;
        this.defaultGoldOnTransition = v2;
        this.goldGainOnTransition = v3;
        this.settlementCountOnTransition = v4;
        this.wonderCountOnTransition = v5;
    }

    public final String component1() {
        return this.setting;
    }

    public final String component2() {
        return this.age;
    }

    public final int component3() {
        return this.cityCountOnTransition;
    }

    public final int component4() {
        return this.commanderCountOnTransition;
    }

    public final int component5() {
        return this.defaultGoldOnTransition;
    }

    public final int component6() {
        return this.goldGainOnTransition;
    }

    public final int component7() {
        return this.settlementCountOnTransition;
    }

    public final int component8() {
        return this.wonderCountOnTransition;
    }

    public final Civ7AgeTransitionParameters copy(String s, String s1, int v, int v1, int v2, int v3, int v4, int v5) {
        j.f(s, "setting");
        j.f(s1, "age");
        return new Civ7AgeTransitionParameters(s, s1, v, v1, v2, v3, v4, v5);
    }

    public static Civ7AgeTransitionParameters copy$default(Civ7AgeTransitionParameters civ7AgeTransitionParameters0, String s, String s1, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
        String s2 = (v6 & 1) == 0 ? s : civ7AgeTransitionParameters0.setting;
        String s3 = (v6 & 2) == 0 ? s1 : civ7AgeTransitionParameters0.age;
        int v7 = (v6 & 4) == 0 ? v : civ7AgeTransitionParameters0.cityCountOnTransition;
        int v8 = (v6 & 8) == 0 ? v1 : civ7AgeTransitionParameters0.commanderCountOnTransition;
        int v9 = (v6 & 16) == 0 ? v2 : civ7AgeTransitionParameters0.defaultGoldOnTransition;
        int v10 = (v6 & 0x20) == 0 ? v3 : civ7AgeTransitionParameters0.goldGainOnTransition;
        int v11 = (v6 & 0x40) == 0 ? v4 : civ7AgeTransitionParameters0.settlementCountOnTransition;
        return (v6 & 0x80) == 0 ? civ7AgeTransitionParameters0.copy(s2, s3, v7, v8, v9, v10, v11, v5) : civ7AgeTransitionParameters0.copy(s2, s3, v7, v8, v9, v10, v11, civ7AgeTransitionParameters0.wonderCountOnTransition);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeTransitionParameters)) {
            return false;
        }
        if(!j.a(this.setting, ((Civ7AgeTransitionParameters)object0).setting)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AgeTransitionParameters)object0).age)) {
            return false;
        }
        if(this.cityCountOnTransition != ((Civ7AgeTransitionParameters)object0).cityCountOnTransition) {
            return false;
        }
        if(this.commanderCountOnTransition != ((Civ7AgeTransitionParameters)object0).commanderCountOnTransition) {
            return false;
        }
        if(this.defaultGoldOnTransition != ((Civ7AgeTransitionParameters)object0).defaultGoldOnTransition) {
            return false;
        }
        if(this.goldGainOnTransition != ((Civ7AgeTransitionParameters)object0).goldGainOnTransition) {
            return false;
        }
        return this.settlementCountOnTransition == ((Civ7AgeTransitionParameters)object0).settlementCountOnTransition ? this.wonderCountOnTransition == ((Civ7AgeTransitionParameters)object0).wonderCountOnTransition : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getCityCountOnTransition() {
        return this.cityCountOnTransition;
    }

    public final int getCommanderCountOnTransition() {
        return this.commanderCountOnTransition;
    }

    public final int getDefaultGoldOnTransition() {
        return this.defaultGoldOnTransition;
    }

    public final int getGoldGainOnTransition() {
        return this.goldGainOnTransition;
    }

    public final String getSetting() {
        return this.setting;
    }

    public final int getSettlementCountOnTransition() {
        return this.settlementCountOnTransition;
    }

    public final int getWonderCountOnTransition() {
        return this.wonderCountOnTransition;
    }

    @Override
    public int hashCode() {
        return (((((f.b(this.setting.hashCode() * 0x1F, 0x1F, this.age) + this.cityCountOnTransition) * 0x1F + this.commanderCountOnTransition) * 0x1F + this.defaultGoldOnTransition) * 0x1F + this.goldGainOnTransition) * 0x1F + this.settlementCountOnTransition) * 0x1F + this.wonderCountOnTransition;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.setting;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AgeTransitionParameters(setting=", this.setting, ", age=", this.age, ", cityCountOnTransition=");
        f.q(stringBuilder0, this.cityCountOnTransition, ", commanderCountOnTransition=", this.commanderCountOnTransition, ", defaultGoldOnTransition=");
        f.q(stringBuilder0, this.defaultGoldOnTransition, ", goldGainOnTransition=", this.goldGainOnTransition, ", settlementCountOnTransition=");
        stringBuilder0.append(this.settlementCountOnTransition);
        stringBuilder0.append(", wonderCountOnTransition=");
        stringBuilder0.append(this.wonderCountOnTransition);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

