package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000EJ>\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000E¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5AnimationPath_Entries;", "", "animationPathType", "", "category", "operator", "parameter", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAnimationPathType", "()Ljava/lang/String;", "getCategory", "getOperator", "getParameter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ5AnimationPath_Entries;", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5AnimationPath_Entries {
    private final String animationPathType;
    private final String category;
    private final String operator;
    private final Double parameter;

    public Civ5AnimationPath_Entries(String s, String s1, String s2, Double double0) {
        this.animationPathType = s;
        this.category = s1;
        this.operator = s2;
        this.parameter = double0;
    }

    public final String component1() {
        return this.animationPathType;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.operator;
    }

    public final Double component4() {
        return this.parameter;
    }

    public final Civ5AnimationPath_Entries copy(String s, String s1, String s2, Double double0) {
        return new Civ5AnimationPath_Entries(s, s1, s2, double0);
    }

    public static Civ5AnimationPath_Entries copy$default(Civ5AnimationPath_Entries civ5AnimationPath_Entries0, String s, String s1, String s2, Double double0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5AnimationPath_Entries0.animationPathType;
        }
        if((v & 2) != 0) {
            s1 = civ5AnimationPath_Entries0.category;
        }
        if((v & 4) != 0) {
            s2 = civ5AnimationPath_Entries0.operator;
        }
        if((v & 8) != 0) {
            double0 = civ5AnimationPath_Entries0.parameter;
        }
        return civ5AnimationPath_Entries0.copy(s, s1, s2, double0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5AnimationPath_Entries)) {
            return false;
        }
        if(!j.a(this.animationPathType, ((Civ5AnimationPath_Entries)object0).animationPathType)) {
            return false;
        }
        if(!j.a(this.category, ((Civ5AnimationPath_Entries)object0).category)) {
            return false;
        }
        return j.a(this.operator, ((Civ5AnimationPath_Entries)object0).operator) ? j.a(this.parameter, ((Civ5AnimationPath_Entries)object0).parameter) : false;
    }

    public final String getAnimationPathType() {
        return this.animationPathType;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final Double getParameter() {
        return this.parameter;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.animationPathType == null ? 0 : this.animationPathType.hashCode();
        int v2 = this.category == null ? 0 : this.category.hashCode();
        int v3 = this.operator == null ? 0 : this.operator.hashCode();
        Double double0 = this.parameter;
        if(double0 != null) {
            v = double0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5AnimationPath_Entries(animationPathType=", this.animationPathType, ", category=", this.category, ", operator=");
        stringBuilder0.append(this.operator);
        stringBuilder0.append(", parameter=");
        stringBuilder0.append(this.parameter);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

