package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0007HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Project_GreatPersonPoints;", "", "greatPersonClassType", "", "projectType", "pointProgressionModel", "pointProgressionParam1", "", "points", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getGreatPersonClassType", "()Ljava/lang/String;", "getPointProgressionModel", "getPointProgressionParam1", "()I", "getPoints", "getProjectType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Project_GreatPersonPoints {
    private final String greatPersonClassType;
    private final String pointProgressionModel;
    private final int pointProgressionParam1;
    private final int points;
    private final String projectType;

    public Civ7Project_GreatPersonPoints(String s, String s1, String s2, int v, int v1) {
        j.f(s, "greatPersonClassType");
        j.f(s1, "projectType");
        j.f(s2, "pointProgressionModel");
        super();
        this.greatPersonClassType = s;
        this.projectType = s1;
        this.pointProgressionModel = s2;
        this.pointProgressionParam1 = v;
        this.points = v1;
    }

    public final String component1() {
        return this.greatPersonClassType;
    }

    public final String component2() {
        return this.projectType;
    }

    public final String component3() {
        return this.pointProgressionModel;
    }

    public final int component4() {
        return this.pointProgressionParam1;
    }

    public final int component5() {
        return this.points;
    }

    public final Civ7Project_GreatPersonPoints copy(String s, String s1, String s2, int v, int v1) {
        j.f(s, "greatPersonClassType");
        j.f(s1, "projectType");
        j.f(s2, "pointProgressionModel");
        return new Civ7Project_GreatPersonPoints(s, s1, s2, v, v1);
    }

    public static Civ7Project_GreatPersonPoints copy$default(Civ7Project_GreatPersonPoints civ7Project_GreatPersonPoints0, String s, String s1, String s2, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7Project_GreatPersonPoints0.greatPersonClassType;
        }
        if((v2 & 2) != 0) {
            s1 = civ7Project_GreatPersonPoints0.projectType;
        }
        if((v2 & 4) != 0) {
            s2 = civ7Project_GreatPersonPoints0.pointProgressionModel;
        }
        if((v2 & 8) != 0) {
            v = civ7Project_GreatPersonPoints0.pointProgressionParam1;
        }
        if((v2 & 16) != 0) {
            v1 = civ7Project_GreatPersonPoints0.points;
        }
        return civ7Project_GreatPersonPoints0.copy(s, s1, s2, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Project_GreatPersonPoints)) {
            return false;
        }
        if(!j.a(this.greatPersonClassType, ((Civ7Project_GreatPersonPoints)object0).greatPersonClassType)) {
            return false;
        }
        if(!j.a(this.projectType, ((Civ7Project_GreatPersonPoints)object0).projectType)) {
            return false;
        }
        if(!j.a(this.pointProgressionModel, ((Civ7Project_GreatPersonPoints)object0).pointProgressionModel)) {
            return false;
        }
        return this.pointProgressionParam1 == ((Civ7Project_GreatPersonPoints)object0).pointProgressionParam1 ? this.points == ((Civ7Project_GreatPersonPoints)object0).points : false;
    }

    public final String getGreatPersonClassType() {
        return this.greatPersonClassType;
    }

    public final String getPointProgressionModel() {
        return this.pointProgressionModel;
    }

    public final int getPointProgressionParam1() {
        return this.pointProgressionParam1;
    }

    public final int getPoints() {
        return this.points;
    }

    public final String getProjectType() {
        return this.projectType;
    }

    @Override
    public int hashCode() {
        return (f.b(f.b(this.greatPersonClassType.hashCode() * 0x1F, 0x1F, this.projectType), 0x1F, this.pointProgressionModel) + this.pointProgressionParam1) * 0x1F + this.points;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Project_GreatPersonPoints(greatPersonClassType=", this.greatPersonClassType, ", projectType=", this.projectType, ", pointProgressionModel=");
        f.s(stringBuilder0, this.pointProgressionModel, ", pointProgressionParam1=", this.pointProgressionParam1, ", points=");
        return e.g(stringBuilder0, this.points, ")");
    }
}

