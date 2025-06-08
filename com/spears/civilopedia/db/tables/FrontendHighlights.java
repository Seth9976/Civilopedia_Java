package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\bHÆ\u0003J=\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\bHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendHighlights;", "", "dataPoint", "", "name", "caption", "icon", "importance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCaption", "()Ljava/lang/String;", "getDataPoint", "getIcon", "getImportance", "()I", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendHighlights {
    private final String caption;
    private final String dataPoint;
    private final String icon;
    private final int importance;
    private final String name;

    public FrontendHighlights(String s, String s1, String s2, String s3, int v) {
        j.f(s, "dataPoint");
        j.f(s1, "name");
        j.f(s2, "caption");
        super();
        this.dataPoint = s;
        this.name = s1;
        this.caption = s2;
        this.icon = s3;
        this.importance = v;
    }

    public final String component1() {
        return this.dataPoint;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.caption;
    }

    public final String component4() {
        return this.icon;
    }

    public final int component5() {
        return this.importance;
    }

    public final FrontendHighlights copy(String s, String s1, String s2, String s3, int v) {
        j.f(s, "dataPoint");
        j.f(s1, "name");
        j.f(s2, "caption");
        return new FrontendHighlights(s, s1, s2, s3, v);
    }

    public static FrontendHighlights copy$default(FrontendHighlights frontendHighlights0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = frontendHighlights0.dataPoint;
        }
        if((v1 & 2) != 0) {
            s1 = frontendHighlights0.name;
        }
        if((v1 & 4) != 0) {
            s2 = frontendHighlights0.caption;
        }
        if((v1 & 8) != 0) {
            s3 = frontendHighlights0.icon;
        }
        if((v1 & 16) != 0) {
            v = frontendHighlights0.importance;
        }
        return frontendHighlights0.copy(s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendHighlights)) {
            return false;
        }
        if(!j.a(this.dataPoint, ((FrontendHighlights)object0).dataPoint)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendHighlights)object0).name)) {
            return false;
        }
        if(!j.a(this.caption, ((FrontendHighlights)object0).caption)) {
            return false;
        }
        return j.a(this.icon, ((FrontendHighlights)object0).icon) ? this.importance == ((FrontendHighlights)object0).importance : false;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getDataPoint() {
        return this.dataPoint;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.dataPoint.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.caption);
        return this.icon == null ? v * 0x1F + this.importance : (v + this.icon.hashCode()) * 0x1F + this.importance;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendHighlights(dataPoint=", this.dataPoint, ", name=", this.name, ", caption=");
        f.t(stringBuilder0, this.caption, ", icon=", this.icon, ", importance=");
        return e.g(stringBuilder0, this.importance, ")");
    }
}

