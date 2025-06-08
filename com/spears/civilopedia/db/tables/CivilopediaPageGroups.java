package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\n¢\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\bHÆ\u0003J\t\u0010\u001A\u001A\u00020\nHÆ\u0003JG\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nHÆ\u0001J\u0013\u0010\u001C\u001A\u00020\b2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\nHÖ\u0001J\t\u0010\u001F\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaPageGroups;", "", "sectionId", "", "pageGroupId", "name", "tooltip", "visibleIfEmpty", "", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getName", "()Ljava/lang/String;", "getPageGroupId", "getSectionId", "getSortIndex", "()I", "getTooltip", "getVisibleIfEmpty", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaPageGroups {
    private final String name;
    private final String pageGroupId;
    private final String sectionId;
    private final int sortIndex;
    private final String tooltip;
    private final boolean visibleIfEmpty;

    public CivilopediaPageGroups(String s, String s1, String s2, String s3, boolean z, int v) {
        j.f(s, "sectionId");
        j.f(s1, "pageGroupId");
        j.f(s2, "name");
        super();
        this.sectionId = s;
        this.pageGroupId = s1;
        this.name = s2;
        this.tooltip = s3;
        this.visibleIfEmpty = z;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.sectionId;
    }

    public final String component2() {
        return this.pageGroupId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.tooltip;
    }

    public final boolean component5() {
        return this.visibleIfEmpty;
    }

    public final int component6() {
        return this.sortIndex;
    }

    public final CivilopediaPageGroups copy(String s, String s1, String s2, String s3, boolean z, int v) {
        j.f(s, "sectionId");
        j.f(s1, "pageGroupId");
        j.f(s2, "name");
        return new CivilopediaPageGroups(s, s1, s2, s3, z, v);
    }

    public static CivilopediaPageGroups copy$default(CivilopediaPageGroups civilopediaPageGroups0, String s, String s1, String s2, String s3, boolean z, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civilopediaPageGroups0.sectionId;
        }
        if((v1 & 2) != 0) {
            s1 = civilopediaPageGroups0.pageGroupId;
        }
        if((v1 & 4) != 0) {
            s2 = civilopediaPageGroups0.name;
        }
        if((v1 & 8) != 0) {
            s3 = civilopediaPageGroups0.tooltip;
        }
        if((v1 & 16) != 0) {
            z = civilopediaPageGroups0.visibleIfEmpty;
        }
        if((v1 & 0x20) != 0) {
            v = civilopediaPageGroups0.sortIndex;
        }
        return civilopediaPageGroups0.copy(s, s1, s2, s3, z, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaPageGroups)) {
            return false;
        }
        if(!j.a(this.sectionId, ((CivilopediaPageGroups)object0).sectionId)) {
            return false;
        }
        if(!j.a(this.pageGroupId, ((CivilopediaPageGroups)object0).pageGroupId)) {
            return false;
        }
        if(!j.a(this.name, ((CivilopediaPageGroups)object0).name)) {
            return false;
        }
        if(!j.a(this.tooltip, ((CivilopediaPageGroups)object0).tooltip)) {
            return false;
        }
        return this.visibleIfEmpty == ((CivilopediaPageGroups)object0).visibleIfEmpty ? this.sortIndex == ((CivilopediaPageGroups)object0).sortIndex : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPageGroupId() {
        return this.pageGroupId;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public final boolean getVisibleIfEmpty() {
        return this.visibleIfEmpty;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.sectionId.hashCode() * 0x1F, 0x1F, this.pageGroupId), 0x1F, this.name);
        int v1 = this.tooltip == null ? 0 : this.tooltip.hashCode();
        return this.visibleIfEmpty ? ((v + v1) * 0x1F + 0x4CF) * 0x1F + this.sortIndex : ((v + v1) * 0x1F + 0x4D5) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("CivilopediaPageGroups(sectionId=", this.sectionId, ", pageGroupId=", this.pageGroupId, ", name=");
        f.t(stringBuilder0, this.name, ", tooltip=", this.tooltip, ", visibleIfEmpty=");
        stringBuilder0.append(this.visibleIfEmpty);
        stringBuilder0.append(", sortIndex=");
        stringBuilder0.append(this.sortIndex);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

