package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001E\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000F¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Improvement_BonusYieldChanges;", "", "ID", "", "improvementType", "", "yieldType", "bonusYieldChange", "prereqTech", "prereqCivic", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getID", "()I", "getBonusYieldChange", "getImprovementType", "()Ljava/lang/String;", "getPrereqCivic", "getPrereqTech", "getYieldType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Improvement_BonusYieldChanges {
    private final int ID;
    private final int bonusYieldChange;
    private final String improvementType;
    private final String prereqCivic;
    private final String prereqTech;
    private final String yieldType;

    public Improvement_BonusYieldChanges(int v, String s, String s1, int v1, String s2, String s3) {
        j.f(s, "improvementType");
        j.f(s1, "yieldType");
        super();
        this.ID = v;
        this.improvementType = s;
        this.yieldType = s1;
        this.bonusYieldChange = v1;
        this.prereqTech = s2;
        this.prereqCivic = s3;
    }

    public final int component1() {
        return this.ID;
    }

    public final String component2() {
        return this.improvementType;
    }

    public final String component3() {
        return this.yieldType;
    }

    public final int component4() {
        return this.bonusYieldChange;
    }

    public final String component5() {
        return this.prereqTech;
    }

    public final String component6() {
        return this.prereqCivic;
    }

    public final Improvement_BonusYieldChanges copy(int v, String s, String s1, int v1, String s2, String s3) {
        j.f(s, "improvementType");
        j.f(s1, "yieldType");
        return new Improvement_BonusYieldChanges(v, s, s1, v1, s2, s3);
    }

    public static Improvement_BonusYieldChanges copy$default(Improvement_BonusYieldChanges improvement_BonusYieldChanges0, int v, String s, String s1, int v1, String s2, String s3, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = improvement_BonusYieldChanges0.ID;
        }
        if((v2 & 2) != 0) {
            s = improvement_BonusYieldChanges0.improvementType;
        }
        if((v2 & 4) != 0) {
            s1 = improvement_BonusYieldChanges0.yieldType;
        }
        if((v2 & 8) != 0) {
            v1 = improvement_BonusYieldChanges0.bonusYieldChange;
        }
        if((v2 & 16) != 0) {
            s2 = improvement_BonusYieldChanges0.prereqTech;
        }
        if((v2 & 0x20) != 0) {
            s3 = improvement_BonusYieldChanges0.prereqCivic;
        }
        return improvement_BonusYieldChanges0.copy(v, s, s1, v1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Improvement_BonusYieldChanges)) {
            return false;
        }
        if(this.ID != ((Improvement_BonusYieldChanges)object0).ID) {
            return false;
        }
        if(!j.a(this.improvementType, ((Improvement_BonusYieldChanges)object0).improvementType)) {
            return false;
        }
        if(!j.a(this.yieldType, ((Improvement_BonusYieldChanges)object0).yieldType)) {
            return false;
        }
        if(this.bonusYieldChange != ((Improvement_BonusYieldChanges)object0).bonusYieldChange) {
            return false;
        }
        return j.a(this.prereqTech, ((Improvement_BonusYieldChanges)object0).prereqTech) ? j.a(this.prereqCivic, ((Improvement_BonusYieldChanges)object0).prereqCivic) : false;
    }

    public final int getBonusYieldChange() {
        return this.bonusYieldChange;
    }

    public final int getID() {
        return this.ID;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = (f.b(f.b(this.ID * 0x1F, 0x1F, this.improvementType), 0x1F, this.yieldType) + this.bonusYieldChange) * 0x1F;
        int v1 = 0;
        int v2 = this.prereqTech == null ? 0 : this.prereqTech.hashCode();
        String s = this.prereqCivic;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Improvement_BonusYieldChanges(ID=");
        stringBuilder0.append(this.ID);
        stringBuilder0.append(", improvementType=");
        stringBuilder0.append(this.improvementType);
        stringBuilder0.append(", yieldType=");
        f.s(stringBuilder0, this.yieldType, ", bonusYieldChange=", this.bonusYieldChange, ", prereqTech=");
        return e.i(stringBuilder0, this.prereqTech, ", prereqCivic=", this.prereqCivic, ")");
    }
}

