package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\nJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001D\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001A\u001A\u0004\b\u001E\u0010\n¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7ScoringCategories;", "Lo2/m;", "", "categoryType", "", "multiplier", "name", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()D", "component3", "copy", "(Ljava/lang/String;DLjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7ScoringCategories;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategoryType", "D", "getMultiplier", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7ScoringCategories implements m {
    private final String categoryType;
    private final double multiplier;
    private final String name;

    public Civ7ScoringCategories(String s, double f, String s1) {
        j.f(s, "categoryType");
        j.f(s1, "name");
        super();
        this.categoryType = s;
        this.multiplier = f;
        this.name = s1;
    }

    public final String component1() {
        return this.categoryType;
    }

    public final double component2() {
        return this.multiplier;
    }

    public final String component3() {
        return this.name;
    }

    public final Civ7ScoringCategories copy(String s, double f, String s1) {
        j.f(s, "categoryType");
        j.f(s1, "name");
        return new Civ7ScoringCategories(s, f, s1);
    }

    public static Civ7ScoringCategories copy$default(Civ7ScoringCategories civ7ScoringCategories0, String s, double f, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7ScoringCategories0.categoryType;
        }
        if((v & 2) != 0) {
            f = civ7ScoringCategories0.multiplier;
        }
        if((v & 4) != 0) {
            s1 = civ7ScoringCategories0.name;
        }
        return civ7ScoringCategories0.copy(s, f, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7ScoringCategories)) {
            return false;
        }
        if(!j.a(this.categoryType, ((Civ7ScoringCategories)object0).categoryType)) {
            return false;
        }
        return Double.compare(this.multiplier, ((Civ7ScoringCategories)object0).multiplier) == 0 ? j.a(this.name, ((Civ7ScoringCategories)object0).name) : false;
    }

    public final String getCategoryType() {
        return this.categoryType;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.multiplier);
        return this.name.hashCode() + (this.categoryType.hashCode() * 0x1F + ((int)(v ^ v >>> 0x20))) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.categoryType;
    }

    @Override
    public String toString() {
        return "Civ7ScoringCategories(categoryType=" + this.categoryType + ", multiplier=" + this.multiplier + ", name=" + this.name + ")";
    }
}

