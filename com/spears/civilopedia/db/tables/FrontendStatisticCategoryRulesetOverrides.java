package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001A\u00020\tHÆ\u0003J=\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00072\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\tHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\rR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendStatisticCategoryRulesetOverrides;", "", "rulesetType", "", "category", "name", "isHidden", "", "sortOrder", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getCategory", "()Ljava/lang/String;", "()Z", "getName", "getRulesetType", "getSortOrder", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendStatisticCategoryRulesetOverrides {
    private final String category;
    private final boolean isHidden;
    private final String name;
    private final String rulesetType;
    private final int sortOrder;

    public FrontendStatisticCategoryRulesetOverrides(String s, String s1, String s2, boolean z, int v) {
        j.f(s, "rulesetType");
        j.f(s1, "category");
        super();
        this.rulesetType = s;
        this.category = s1;
        this.name = s2;
        this.isHidden = z;
        this.sortOrder = v;
    }

    public final String component1() {
        return this.rulesetType;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.name;
    }

    public final boolean component4() {
        return this.isHidden;
    }

    public final int component5() {
        return this.sortOrder;
    }

    public final FrontendStatisticCategoryRulesetOverrides copy(String s, String s1, String s2, boolean z, int v) {
        j.f(s, "rulesetType");
        j.f(s1, "category");
        return new FrontendStatisticCategoryRulesetOverrides(s, s1, s2, z, v);
    }

    public static FrontendStatisticCategoryRulesetOverrides copy$default(FrontendStatisticCategoryRulesetOverrides frontendStatisticCategoryRulesetOverrides0, String s, String s1, String s2, boolean z, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendStatisticCategoryRulesetOverrides0.rulesetType;
        }
        if((v1 & 2) != 0) {
            s1 = frontendStatisticCategoryRulesetOverrides0.category;
        }
        if((v1 & 4) != 0) {
            s2 = frontendStatisticCategoryRulesetOverrides0.name;
        }
        if((v1 & 8) != 0) {
            z = frontendStatisticCategoryRulesetOverrides0.isHidden;
        }
        if((v1 & 16) != 0) {
            v = frontendStatisticCategoryRulesetOverrides0.sortOrder;
        }
        return frontendStatisticCategoryRulesetOverrides0.copy(s, s1, s2, z, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendStatisticCategoryRulesetOverrides)) {
            return false;
        }
        if(!j.a(this.rulesetType, ((FrontendStatisticCategoryRulesetOverrides)object0).rulesetType)) {
            return false;
        }
        if(!j.a(this.category, ((FrontendStatisticCategoryRulesetOverrides)object0).category)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendStatisticCategoryRulesetOverrides)object0).name)) {
            return false;
        }
        return this.isHidden == ((FrontendStatisticCategoryRulesetOverrides)object0).isHidden ? this.sortOrder == ((FrontendStatisticCategoryRulesetOverrides)object0).sortOrder : false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRulesetType() {
        return this.rulesetType;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.rulesetType.hashCode() * 0x1F, 0x1F, this.category);
        int v1 = this.name == null ? 0 : this.name.hashCode();
        return this.isHidden ? ((v + v1) * 0x1F + 0x4CF) * 0x1F + this.sortOrder : ((v + v1) * 0x1F + 0x4D5) * 0x1F + this.sortOrder;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendStatisticCategoryRulesetOverrides(rulesetType=", this.rulesetType, ", category=", this.category, ", name=");
        u9.x(stringBuilder0, this.name, ", isHidden=", this.isHidden, ", sortOrder=");
        return e.g(stringBuilder0, this.sortOrder, ")");
    }
}

