package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0006HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Project_GreatPersonPoints;", "", "projectType", "", "greatPersonClassType", "points", "", "pointProgressionModel", "pointProgressionParam1", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getGreatPersonClassType", "()Ljava/lang/String;", "getPointProgressionModel", "getPointProgressionParam1", "()I", "getPoints", "getProjectType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Project_GreatPersonPoints {
    private final String greatPersonClassType;
    private final String pointProgressionModel;
    private final int pointProgressionParam1;
    private final int points;
    private final String projectType;

    public Project_GreatPersonPoints(String s, String s1, int v, String s2, int v1) {
        j.f(s, "projectType");
        j.f(s1, "greatPersonClassType");
        j.f(s2, "pointProgressionModel");
        super();
        this.projectType = s;
        this.greatPersonClassType = s1;
        this.points = v;
        this.pointProgressionModel = s2;
        this.pointProgressionParam1 = v1;
    }

    public final String component1() {
        return this.projectType;
    }

    public final String component2() {
        return this.greatPersonClassType;
    }

    public final int component3() {
        return this.points;
    }

    public final String component4() {
        return this.pointProgressionModel;
    }

    public final int component5() {
        return this.pointProgressionParam1;
    }

    public final Project_GreatPersonPoints copy(String s, String s1, int v, String s2, int v1) {
        j.f(s, "projectType");
        j.f(s1, "greatPersonClassType");
        j.f(s2, "pointProgressionModel");
        return new Project_GreatPersonPoints(s, s1, v, s2, v1);
    }

    public static Project_GreatPersonPoints copy$default(Project_GreatPersonPoints project_GreatPersonPoints0, String s, String s1, int v, String s2, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = project_GreatPersonPoints0.projectType;
        }
        if((v2 & 2) != 0) {
            s1 = project_GreatPersonPoints0.greatPersonClassType;
        }
        if((v2 & 4) != 0) {
            v = project_GreatPersonPoints0.points;
        }
        if((v2 & 8) != 0) {
            s2 = project_GreatPersonPoints0.pointProgressionModel;
        }
        if((v2 & 16) != 0) {
            v1 = project_GreatPersonPoints0.pointProgressionParam1;
        }
        return project_GreatPersonPoints0.copy(s, s1, v, s2, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Project_GreatPersonPoints)) {
            return false;
        }
        if(!j.a(this.projectType, ((Project_GreatPersonPoints)object0).projectType)) {
            return false;
        }
        if(!j.a(this.greatPersonClassType, ((Project_GreatPersonPoints)object0).greatPersonClassType)) {
            return false;
        }
        if(this.points != ((Project_GreatPersonPoints)object0).points) {
            return false;
        }
        return j.a(this.pointProgressionModel, ((Project_GreatPersonPoints)object0).pointProgressionModel) ? this.pointProgressionParam1 == ((Project_GreatPersonPoints)object0).pointProgressionParam1 : false;
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
        return f.b((f.b(this.projectType.hashCode() * 0x1F, 0x1F, this.greatPersonClassType) + this.points) * 0x1F, 0x1F, this.pointProgressionModel) + this.pointProgressionParam1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Project_GreatPersonPoints(projectType=", this.projectType, ", greatPersonClassType=", this.greatPersonClassType, ", points=");
        f.r(stringBuilder0, this.points, ", pointProgressionModel=", this.pointProgressionModel, ", pointProgressionParam1=");
        return e.g(stringBuilder0, this.pointProgressionParam1, ")");
    }
}

