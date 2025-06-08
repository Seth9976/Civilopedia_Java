package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0006HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0006HÆ\u0003JI\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0011\u0010\t\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000F¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7PlotEvalConditions;", "", "conditionType", "", "goodTooltipString", "goodValue", "", "poorTooltipString", "poorValue", "value", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getConditionType", "()Ljava/lang/String;", "getGoodTooltipString", "getGoodValue", "()I", "getPoorTooltipString", "getPoorValue", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7PlotEvalConditions {
    private final String conditionType;
    private final String goodTooltipString;
    private final int goodValue;
    private final String poorTooltipString;
    private final int poorValue;
    private final int value;

    public Civ7PlotEvalConditions(String s, String s1, int v, String s2, int v1, int v2) {
        j.f(s, "conditionType");
        super();
        this.conditionType = s;
        this.goodTooltipString = s1;
        this.goodValue = v;
        this.poorTooltipString = s2;
        this.poorValue = v1;
        this.value = v2;
    }

    public final String component1() {
        return this.conditionType;
    }

    public final String component2() {
        return this.goodTooltipString;
    }

    public final int component3() {
        return this.goodValue;
    }

    public final String component4() {
        return this.poorTooltipString;
    }

    public final int component5() {
        return this.poorValue;
    }

    public final int component6() {
        return this.value;
    }

    public final Civ7PlotEvalConditions copy(String s, String s1, int v, String s2, int v1, int v2) {
        j.f(s, "conditionType");
        return new Civ7PlotEvalConditions(s, s1, v, s2, v1, v2);
    }

    public static Civ7PlotEvalConditions copy$default(Civ7PlotEvalConditions civ7PlotEvalConditions0, String s, String s1, int v, String s2, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            s = civ7PlotEvalConditions0.conditionType;
        }
        if((v3 & 2) != 0) {
            s1 = civ7PlotEvalConditions0.goodTooltipString;
        }
        if((v3 & 4) != 0) {
            v = civ7PlotEvalConditions0.goodValue;
        }
        if((v3 & 8) != 0) {
            s2 = civ7PlotEvalConditions0.poorTooltipString;
        }
        if((v3 & 16) != 0) {
            v1 = civ7PlotEvalConditions0.poorValue;
        }
        if((v3 & 0x20) != 0) {
            v2 = civ7PlotEvalConditions0.value;
        }
        return civ7PlotEvalConditions0.copy(s, s1, v, s2, v1, v2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7PlotEvalConditions)) {
            return false;
        }
        if(!j.a(this.conditionType, ((Civ7PlotEvalConditions)object0).conditionType)) {
            return false;
        }
        if(!j.a(this.goodTooltipString, ((Civ7PlotEvalConditions)object0).goodTooltipString)) {
            return false;
        }
        if(this.goodValue != ((Civ7PlotEvalConditions)object0).goodValue) {
            return false;
        }
        if(!j.a(this.poorTooltipString, ((Civ7PlotEvalConditions)object0).poorTooltipString)) {
            return false;
        }
        return this.poorValue == ((Civ7PlotEvalConditions)object0).poorValue ? this.value == ((Civ7PlotEvalConditions)object0).value : false;
    }

    public final String getConditionType() {
        return this.conditionType;
    }

    public final String getGoodTooltipString() {
        return this.goodTooltipString;
    }

    public final int getGoodValue() {
        return this.goodValue;
    }

    public final String getPoorTooltipString() {
        return this.poorTooltipString;
    }

    public final int getPoorValue() {
        return this.poorValue;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((this.conditionType.hashCode() * 0x1F + (this.goodTooltipString == null ? 0 : this.goodTooltipString.hashCode())) * 0x1F + this.goodValue) * 0x1F;
        String s = this.poorTooltipString;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + v) * 0x1F + this.poorValue) * 0x1F + this.value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7PlotEvalConditions(conditionType=", this.conditionType, ", goodTooltipString=", this.goodTooltipString, ", goodValue=");
        f.r(stringBuilder0, this.goodValue, ", poorTooltipString=", this.poorTooltipString, ", poorValue=");
        stringBuilder0.append(this.poorValue);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.value);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

