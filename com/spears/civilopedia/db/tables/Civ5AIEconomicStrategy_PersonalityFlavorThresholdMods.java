package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000BJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods;", "", "aIEconomicStrategyType", "", "flavorType", "flavor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAIEconomicStrategyType", "()Ljava/lang/String;", "getFlavor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFlavorType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods {
    private final String aIEconomicStrategyType;
    private final Integer flavor;
    private final String flavorType;

    public Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods(String s, String s1, Integer integer0) {
        this.aIEconomicStrategyType = s;
        this.flavorType = s1;
        this.flavor = integer0;
    }

    public final String component1() {
        return this.aIEconomicStrategyType;
    }

    public final String component2() {
        return this.flavorType;
    }

    public final Integer component3() {
        return this.flavor;
    }

    public final Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods copy(String s, String s1, Integer integer0) {
        return new Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods(s, s1, integer0);
    }

    public static Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods copy$default(Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods civ5AIEconomicStrategy_PersonalityFlavorThresholdMods0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5AIEconomicStrategy_PersonalityFlavorThresholdMods0.aIEconomicStrategyType;
        }
        if((v & 2) != 0) {
            s1 = civ5AIEconomicStrategy_PersonalityFlavorThresholdMods0.flavorType;
        }
        if((v & 4) != 0) {
            integer0 = civ5AIEconomicStrategy_PersonalityFlavorThresholdMods0.flavor;
        }
        return civ5AIEconomicStrategy_PersonalityFlavorThresholdMods0.copy(s, s1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods)) {
            return false;
        }
        if(!j.a(this.aIEconomicStrategyType, ((Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods)object0).aIEconomicStrategyType)) {
            return false;
        }
        return j.a(this.flavorType, ((Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods)object0).flavorType) ? j.a(this.flavor, ((Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods)object0).flavor) : false;
    }

    public final String getAIEconomicStrategyType() {
        return this.aIEconomicStrategyType;
    }

    public final Integer getFlavor() {
        return this.flavor;
    }

    public final String getFlavorType() {
        return this.flavorType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.aIEconomicStrategyType == null ? 0 : this.aIEconomicStrategyType.hashCode();
        int v2 = this.flavorType == null ? 0 : this.flavorType.hashCode();
        Integer integer0 = this.flavor;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(e.j("Civ5AIEconomicStrategy_PersonalityFlavorThresholdMods(aIEconomicStrategyType=", this.aIEconomicStrategyType, ", flavorType=", this.flavorType, ", flavor="), this.flavor, ")");
    }
}

