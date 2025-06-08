package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000FJ\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJB\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000FJ\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001E\u001A\u0004\b\u001F\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b \u0010\fR\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001E\u001A\u0004\b!\u0010\u000FR\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001C\u001A\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7CityStateTypes;", "Lo2/m;", "", "cityStateType", "", "disperseRewardAmount", "name", "weight", "yieldType", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7CityStateTypes;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCityStateType", "I", "getDisperseRewardAmount", "getName", "getWeight", "getYieldType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7CityStateTypes implements m {
    private final String cityStateType;
    private final int disperseRewardAmount;
    private final String name;
    private final int weight;
    private final String yieldType;

    public Civ7CityStateTypes(String s, int v, String s1, int v1, String s2) {
        j.f(s, "cityStateType");
        j.f(s1, "name");
        j.f(s2, "yieldType");
        super();
        this.cityStateType = s;
        this.disperseRewardAmount = v;
        this.name = s1;
        this.weight = v1;
        this.yieldType = s2;
    }

    public final String component1() {
        return this.cityStateType;
    }

    public final int component2() {
        return this.disperseRewardAmount;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.weight;
    }

    public final String component5() {
        return this.yieldType;
    }

    public final Civ7CityStateTypes copy(String s, int v, String s1, int v1, String s2) {
        j.f(s, "cityStateType");
        j.f(s1, "name");
        j.f(s2, "yieldType");
        return new Civ7CityStateTypes(s, v, s1, v1, s2);
    }

    public static Civ7CityStateTypes copy$default(Civ7CityStateTypes civ7CityStateTypes0, String s, int v, String s1, int v1, String s2, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7CityStateTypes0.cityStateType;
        }
        if((v2 & 2) != 0) {
            v = civ7CityStateTypes0.disperseRewardAmount;
        }
        if((v2 & 4) != 0) {
            s1 = civ7CityStateTypes0.name;
        }
        if((v2 & 8) != 0) {
            v1 = civ7CityStateTypes0.weight;
        }
        if((v2 & 16) != 0) {
            s2 = civ7CityStateTypes0.yieldType;
        }
        return civ7CityStateTypes0.copy(s, v, s1, v1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7CityStateTypes)) {
            return false;
        }
        if(!j.a(this.cityStateType, ((Civ7CityStateTypes)object0).cityStateType)) {
            return false;
        }
        if(this.disperseRewardAmount != ((Civ7CityStateTypes)object0).disperseRewardAmount) {
            return false;
        }
        if(!j.a(this.name, ((Civ7CityStateTypes)object0).name)) {
            return false;
        }
        return this.weight == ((Civ7CityStateTypes)object0).weight ? j.a(this.yieldType, ((Civ7CityStateTypes)object0).yieldType) : false;
    }

    public final String getCityStateType() {
        return this.cityStateType;
    }

    public final int getDisperseRewardAmount() {
        return this.disperseRewardAmount;
    }

    public final String getName() {
        return this.name;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        return this.yieldType.hashCode() + (f.b((this.cityStateType.hashCode() * 0x1F + this.disperseRewardAmount) * 0x1F, 0x1F, this.name) + this.weight) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.cityStateType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.disperseRewardAmount, "Civ7CityStateTypes(cityStateType=", this.cityStateType, ", disperseRewardAmount=", ", name=");
        f.s(stringBuilder0, this.name, ", weight=", this.weight, ", yieldType=");
        return e.h(stringBuilder0, this.yieldType, ")");
    }
}

