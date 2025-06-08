package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendTags;", "", "tagType", "", "tagCategoryType", "name", "description", "style", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getStyle", "getTagCategoryType", "getTagType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendTags {
    private final String description;
    private final String name;
    private final String style;
    private final String tagCategoryType;
    private final String tagType;

    public FrontendTags(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "tagType");
        j.f(s1, "tagCategoryType");
        j.f(s2, "name");
        super();
        this.tagType = s;
        this.tagCategoryType = s1;
        this.name = s2;
        this.description = s3;
        this.style = s4;
    }

    public final String component1() {
        return this.tagType;
    }

    public final String component2() {
        return this.tagCategoryType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.style;
    }

    public final FrontendTags copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "tagType");
        j.f(s1, "tagCategoryType");
        j.f(s2, "name");
        return new FrontendTags(s, s1, s2, s3, s4);
    }

    public static FrontendTags copy$default(FrontendTags frontendTags0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendTags0.tagType;
        }
        if((v & 2) != 0) {
            s1 = frontendTags0.tagCategoryType;
        }
        if((v & 4) != 0) {
            s2 = frontendTags0.name;
        }
        if((v & 8) != 0) {
            s3 = frontendTags0.description;
        }
        if((v & 16) != 0) {
            s4 = frontendTags0.style;
        }
        return frontendTags0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendTags)) {
            return false;
        }
        if(!j.a(this.tagType, ((FrontendTags)object0).tagType)) {
            return false;
        }
        if(!j.a(this.tagCategoryType, ((FrontendTags)object0).tagCategoryType)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendTags)object0).name)) {
            return false;
        }
        return j.a(this.description, ((FrontendTags)object0).description) ? j.a(this.style, ((FrontendTags)object0).style) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTagCategoryType() {
        return this.tagCategoryType;
    }

    public final String getTagType() {
        return this.tagType;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.tagType.hashCode() * 0x1F, 0x1F, this.tagCategoryType), 0x1F, this.name);
        int v1 = 0;
        int v2 = this.description == null ? 0 : this.description.hashCode();
        String s = this.style;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendTags(tagType=", this.tagType, ", tagCategoryType=", this.tagCategoryType, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", style=");
        return e.h(stringBuilder0, this.style, ")");
    }
}

