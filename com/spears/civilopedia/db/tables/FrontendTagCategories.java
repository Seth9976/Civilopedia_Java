package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\u00042\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001A\u0004\b\u001A\u0010\f¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendTagCategories;", "Lo2/m;", "", "tagCategoryType", "", "hideInDetails", "<init>", "(Ljava/lang/String;Z)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/spears/civilopedia/db/tables/FrontendTagCategories;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTagCategoryType", "Z", "getHideInDetails", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendTagCategories implements m {
    private final boolean hideInDetails;
    private final String tagCategoryType;

    public FrontendTagCategories(String s, boolean z) {
        j.f(s, "tagCategoryType");
        super();
        this.tagCategoryType = s;
        this.hideInDetails = z;
    }

    public final String component1() {
        return this.tagCategoryType;
    }

    public final boolean component2() {
        return this.hideInDetails;
    }

    public final FrontendTagCategories copy(String s, boolean z) {
        j.f(s, "tagCategoryType");
        return new FrontendTagCategories(s, z);
    }

    public static FrontendTagCategories copy$default(FrontendTagCategories frontendTagCategories0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendTagCategories0.tagCategoryType;
        }
        if((v & 2) != 0) {
            z = frontendTagCategories0.hideInDetails;
        }
        return frontendTagCategories0.copy(s, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendTagCategories)) {
            return false;
        }
        return j.a(this.tagCategoryType, ((FrontendTagCategories)object0).tagCategoryType) ? this.hideInDetails == ((FrontendTagCategories)object0).hideInDetails : false;
    }

    public final boolean getHideInDetails() {
        return this.hideInDetails;
    }

    public final String getTagCategoryType() {
        return this.tagCategoryType;
    }

    @Override
    public int hashCode() {
        int v = this.tagCategoryType.hashCode();
        return this.hideInDetails ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return "TagCategoryType";
    }

    @Override
    public String toString() {
        return "FrontendTagCategories(tagCategoryType=" + this.tagCategoryType + ", hideInDetails=" + this.hideInDetails + ")";
    }
}

