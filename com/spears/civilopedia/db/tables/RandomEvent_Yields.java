package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001D\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\u0007\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001D\u001A\u00020\tHÆ\u0003J\t\u0010\u001E\u001A\u00020\u0007HÆ\u0003J\u0010\u0010\u001F\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001A\u00020\t2\b\u0010#\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001A\u00020\u0007HÖ\u0001J\t\u0010%\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0015\u0010\u000B\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lcom/spears/civilopedia/db/tables/RandomEvent_Yields;", "", "randomEventType", "", "yieldType", "featureType", "percentage", "", "replaceFeature", "", "amount", "turn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Integer;)V", "getAmount", "()I", "getFeatureType", "()Ljava/lang/String;", "getPercentage", "getRandomEventType", "getReplaceFeature", "()Z", "getTurn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYieldType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Integer;)Lcom/spears/civilopedia/db/tables/RandomEvent_Yields;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RandomEvent_Yields {
    private final int amount;
    private final String featureType;
    private final int percentage;
    private final String randomEventType;
    private final boolean replaceFeature;
    private final Integer turn;
    private final String yieldType;

    public RandomEvent_Yields(String s, String s1, String s2, int v, boolean z, int v1, Integer integer0) {
        j.f(s, "randomEventType");
        j.f(s1, "yieldType");
        j.f(s2, "featureType");
        super();
        this.randomEventType = s;
        this.yieldType = s1;
        this.featureType = s2;
        this.percentage = v;
        this.replaceFeature = z;
        this.amount = v1;
        this.turn = integer0;
    }

    public final String component1() {
        return this.randomEventType;
    }

    public final String component2() {
        return this.yieldType;
    }

    public final String component3() {
        return this.featureType;
    }

    public final int component4() {
        return this.percentage;
    }

    public final boolean component5() {
        return this.replaceFeature;
    }

    public final int component6() {
        return this.amount;
    }

    public final Integer component7() {
        return this.turn;
    }

    public final RandomEvent_Yields copy(String s, String s1, String s2, int v, boolean z, int v1, Integer integer0) {
        j.f(s, "randomEventType");
        j.f(s1, "yieldType");
        j.f(s2, "featureType");
        return new RandomEvent_Yields(s, s1, s2, v, z, v1, integer0);
    }

    public static RandomEvent_Yields copy$default(RandomEvent_Yields randomEvent_Yields0, String s, String s1, String s2, int v, boolean z, int v1, Integer integer0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = randomEvent_Yields0.randomEventType;
        }
        if((v2 & 2) != 0) {
            s1 = randomEvent_Yields0.yieldType;
        }
        if((v2 & 4) != 0) {
            s2 = randomEvent_Yields0.featureType;
        }
        if((v2 & 8) != 0) {
            v = randomEvent_Yields0.percentage;
        }
        if((v2 & 16) != 0) {
            z = randomEvent_Yields0.replaceFeature;
        }
        if((v2 & 0x20) != 0) {
            v1 = randomEvent_Yields0.amount;
        }
        if((v2 & 0x40) != 0) {
            integer0 = randomEvent_Yields0.turn;
        }
        return randomEvent_Yields0.copy(s, s1, s2, v, z, v1, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RandomEvent_Yields)) {
            return false;
        }
        if(!j.a(this.randomEventType, ((RandomEvent_Yields)object0).randomEventType)) {
            return false;
        }
        if(!j.a(this.yieldType, ((RandomEvent_Yields)object0).yieldType)) {
            return false;
        }
        if(!j.a(this.featureType, ((RandomEvent_Yields)object0).featureType)) {
            return false;
        }
        if(this.percentage != ((RandomEvent_Yields)object0).percentage) {
            return false;
        }
        if(this.replaceFeature != ((RandomEvent_Yields)object0).replaceFeature) {
            return false;
        }
        return this.amount == ((RandomEvent_Yields)object0).amount ? j.a(this.turn, ((RandomEvent_Yields)object0).turn) : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public final String getRandomEventType() {
        return this.randomEventType;
    }

    public final boolean getReplaceFeature() {
        return this.replaceFeature;
    }

    public final Integer getTurn() {
        return this.turn;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = (((f.b(f.b(this.randomEventType.hashCode() * 0x1F, 0x1F, this.yieldType), 0x1F, this.featureType) + this.percentage) * 0x1F + (this.replaceFeature ? 0x4CF : 0x4D5)) * 0x1F + this.amount) * 0x1F;
        return this.turn == null ? v : v + this.turn.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("RandomEvent_Yields(randomEventType=", this.randomEventType, ", yieldType=", this.yieldType, ", featureType=");
        f.s(stringBuilder0, this.featureType, ", percentage=", this.percentage, ", replaceFeature=");
        u9.y(stringBuilder0, this.replaceFeature, ", amount=", this.amount, ", turn=");
        return u9.f(stringBuilder0, this.turn, ")");
    }
}

