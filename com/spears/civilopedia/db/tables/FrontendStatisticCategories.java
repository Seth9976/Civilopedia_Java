package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001A\u00020\bHÆ\u0003J3\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\bHÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\fR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendStatisticCategories;", "", "category", "", "name", "isHidden", "", "sortOrder", "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "getCategory", "()Ljava/lang/String;", "()Z", "getName", "getSortOrder", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendStatisticCategories {
    private final String category;
    private final boolean isHidden;
    private final String name;
    private final int sortOrder;

    public FrontendStatisticCategories(String s, String s1, boolean z, int v) {
        j.f(s, "category");
        super();
        this.category = s;
        this.name = s1;
        this.isHidden = z;
        this.sortOrder = v;
    }

    public final String component1() {
        return this.category;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isHidden;
    }

    public final int component4() {
        return this.sortOrder;
    }

    public final FrontendStatisticCategories copy(String s, String s1, boolean z, int v) {
        j.f(s, "category");
        return new FrontendStatisticCategories(s, s1, z, v);
    }

    public static FrontendStatisticCategories copy$default(FrontendStatisticCategories frontendStatisticCategories0, String s, String s1, boolean z, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendStatisticCategories0.category;
        }
        if((v1 & 2) != 0) {
            s1 = frontendStatisticCategories0.name;
        }
        if((v1 & 4) != 0) {
            z = frontendStatisticCategories0.isHidden;
        }
        if((v1 & 8) != 0) {
            v = frontendStatisticCategories0.sortOrder;
        }
        return frontendStatisticCategories0.copy(s, s1, z, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendStatisticCategories)) {
            return false;
        }
        if(!j.a(this.category, ((FrontendStatisticCategories)object0).category)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendStatisticCategories)object0).name)) {
            return false;
        }
        return this.isHidden == ((FrontendStatisticCategories)object0).isHidden ? this.sortOrder == ((FrontendStatisticCategories)object0).sortOrder : false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    // 去混淆评级： 低(23)
    @Override
    public int hashCode() {
        int v = this.category.hashCode();
        int v1 = this.name == null ? 0 : this.name.hashCode();
        return this.isHidden ? 0x9511 + 0x745F * v + 961 * v1 + this.sortOrder : 0x95CB + 0x745F * v + 961 * v1 + this.sortOrder;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendStatisticCategories(category=", this.category, ", name=", this.name, ", isHidden=");
        stringBuilder0.append(this.isHidden);
        stringBuilder0.append(", sortOrder=");
        stringBuilder0.append(this.sortOrder);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

