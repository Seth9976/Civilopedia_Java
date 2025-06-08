package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\n\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0018\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\nH\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J_\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\n2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001J\u0013\u0010 \u001A\u00020!2\b\u0010\"\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010#\u001A\u00020\nH\u00D6\u0001J\t\u0010$\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000ER\u0011\u0010\t\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000ER\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E\u00A8\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaPages;", "", "sectionId", "", "pageId", "pageGroupId", "pageLayoutId", "name", "tooltip", "sortIndex", "", "textKeyPrefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPageGroupId", "getPageId", "getPageLayoutId", "getSectionId", "getSortIndex", "()I", "getTextKeyPrefix", "getTooltip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaPages {
    private final String name;
    private final String pageGroupId;
    private final String pageId;
    private final String pageLayoutId;
    private final String sectionId;
    private final int sortIndex;
    private final String textKeyPrefix;
    private final String tooltip;

    public CivilopediaPages(String s, String s1, String s2, String s3, String s4, String s5, int v, String s6) {
        j.f(s, "sectionId");
        j.f(s1, "pageId");
        j.f(s3, "pageLayoutId");
        j.f(s4, "name");
        super();
        this.sectionId = s;
        this.pageId = s1;
        this.pageGroupId = s2;
        this.pageLayoutId = s3;
        this.name = s4;
        this.tooltip = s5;
        this.sortIndex = v;
        this.textKeyPrefix = s6;
    }

    public final String component1() {
        return this.sectionId;
    }

    public final String component2() {
        return this.pageId;
    }

    public final String component3() {
        return this.pageGroupId;
    }

    public final String component4() {
        return this.pageLayoutId;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.tooltip;
    }

    public final int component7() {
        return this.sortIndex;
    }

    public final String component8() {
        return this.textKeyPrefix;
    }

    public final CivilopediaPages copy(String s, String s1, String s2, String s3, String s4, String s5, int v, String s6) {
        j.f(s, "sectionId");
        j.f(s1, "pageId");
        j.f(s3, "pageLayoutId");
        j.f(s4, "name");
        return new CivilopediaPages(s, s1, s2, s3, s4, s5, v, s6);
    }

    public static CivilopediaPages copy$default(CivilopediaPages civilopediaPages0, String s, String s1, String s2, String s3, String s4, String s5, int v, String s6, int v1, Object object0) {
        String s7 = (v1 & 1) == 0 ? s : civilopediaPages0.sectionId;
        String s8 = (v1 & 2) == 0 ? s1 : civilopediaPages0.pageId;
        String s9 = (v1 & 4) == 0 ? s2 : civilopediaPages0.pageGroupId;
        String s10 = (v1 & 8) == 0 ? s3 : civilopediaPages0.pageLayoutId;
        String s11 = (v1 & 16) == 0 ? s4 : civilopediaPages0.name;
        String s12 = (v1 & 0x20) == 0 ? s5 : civilopediaPages0.tooltip;
        int v2 = (v1 & 0x40) == 0 ? v : civilopediaPages0.sortIndex;
        return (v1 & 0x80) == 0 ? civilopediaPages0.copy(s7, s8, s9, s10, s11, s12, v2, s6) : civilopediaPages0.copy(s7, s8, s9, s10, s11, s12, v2, civilopediaPages0.textKeyPrefix);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaPages)) {
            return false;
        }
        if(!j.a(this.sectionId, ((CivilopediaPages)object0).sectionId)) {
            return false;
        }
        if(!j.a(this.pageId, ((CivilopediaPages)object0).pageId)) {
            return false;
        }
        if(!j.a(this.pageGroupId, ((CivilopediaPages)object0).pageGroupId)) {
            return false;
        }
        if(!j.a(this.pageLayoutId, ((CivilopediaPages)object0).pageLayoutId)) {
            return false;
        }
        if(!j.a(this.name, ((CivilopediaPages)object0).name)) {
            return false;
        }
        if(!j.a(this.tooltip, ((CivilopediaPages)object0).tooltip)) {
            return false;
        }
        return this.sortIndex == ((CivilopediaPages)object0).sortIndex ? j.a(this.textKeyPrefix, ((CivilopediaPages)object0).textKeyPrefix) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPageGroupId() {
        return this.pageGroupId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getPageLayoutId() {
        return this.pageLayoutId;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final String getTextKeyPrefix() {
        return this.textKeyPrefix;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((f.b(f.b((f.b(this.sectionId.hashCode() * 0x1F, 0x1F, this.pageId) + (this.pageGroupId == null ? 0 : this.pageGroupId.hashCode())) * 0x1F, 0x1F, this.pageLayoutId), 0x1F, this.name) + (this.tooltip == null ? 0 : this.tooltip.hashCode())) * 0x1F + this.sortIndex) * 0x1F;
        String s = this.textKeyPrefix;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("CivilopediaPages(sectionId=", this.sectionId, ", pageId=", this.pageId, ", pageGroupId=");
        f.t(stringBuilder0, this.pageGroupId, ", pageLayoutId=", this.pageLayoutId, ", name=");
        f.t(stringBuilder0, this.name, ", tooltip=", this.tooltip, ", sortIndex=");
        return u9.e(stringBuilder0, this.sortIndex, ", textKeyPrefix=", this.textKeyPrefix, ")");
    }
}

