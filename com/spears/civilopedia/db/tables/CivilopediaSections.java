package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J:\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001A\u001A\u0004\b\u001C\u0010\u000BR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001A\u001A\u0004\b\u001D\u0010\u000BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001E\u001A\u0004\b\u001F\u0010\u0010¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaSections;", "Lo2/m;", "", "sectionId", "name", "icon", "", "sortIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/CivilopediaSections;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSectionId", "getName", "getIcon", "I", "getSortIndex", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaSections implements m {
    private final String icon;
    private final String name;
    private final String sectionId;
    private final int sortIndex;

    public CivilopediaSections(String s, String s1, String s2, int v) {
        j.f(s, "sectionId");
        j.f(s1, "name");
        super();
        this.sectionId = s;
        this.name = s1;
        this.icon = s2;
        this.sortIndex = v;
    }

    public final String component1() {
        return this.sectionId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.icon;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final CivilopediaSections copy(String s, String s1, String s2, int v) {
        j.f(s, "sectionId");
        j.f(s1, "name");
        return new CivilopediaSections(s, s1, s2, v);
    }

    public static CivilopediaSections copy$default(CivilopediaSections civilopediaSections0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civilopediaSections0.sectionId;
        }
        if((v1 & 2) != 0) {
            s1 = civilopediaSections0.name;
        }
        if((v1 & 4) != 0) {
            s2 = civilopediaSections0.icon;
        }
        if((v1 & 8) != 0) {
            v = civilopediaSections0.sortIndex;
        }
        return civilopediaSections0.copy(s, s1, s2, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaSections)) {
            return false;
        }
        if(!j.a(this.sectionId, ((CivilopediaSections)object0).sectionId)) {
            return false;
        }
        if(!j.a(this.name, ((CivilopediaSections)object0).name)) {
            return false;
        }
        return j.a(this.icon, ((CivilopediaSections)object0).icon) ? this.sortIndex == ((CivilopediaSections)object0).sortIndex : false;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.sectionId.hashCode() * 0x1F, 0x1F, this.name);
        return this.icon == null ? v * 0x1F + this.sortIndex : (v + this.icon.hashCode()) * 0x1F + this.sortIndex;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.sectionId;
    }

    @Override
    public String toString() {
        return f.l(e.j("CivilopediaSections(sectionId=", this.sectionId, ", name=", this.name, ", icon="), this.sortIndex, this.icon, ", sortIndex=", ")");
    }
}

