package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Unit_RebellionTags;", "", "rebellionLevel", "", "tag", "", "forbiddenTag", "numCreated", "(ILjava/lang/String;Ljava/lang/String;I)V", "getForbiddenTag", "()Ljava/lang/String;", "getNumCreated", "()I", "getRebellionLevel", "getTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Unit_RebellionTags {
    private final String forbiddenTag;
    private final int numCreated;
    private final int rebellionLevel;
    private final String tag;

    public Civ7Unit_RebellionTags(int v, String s, String s1, int v1) {
        j.f(s, "tag");
        super();
        this.rebellionLevel = v;
        this.tag = s;
        this.forbiddenTag = s1;
        this.numCreated = v1;
    }

    public final int component1() {
        return this.rebellionLevel;
    }

    public final String component2() {
        return this.tag;
    }

    public final String component3() {
        return this.forbiddenTag;
    }

    public final int component4() {
        return this.numCreated;
    }

    public final Civ7Unit_RebellionTags copy(int v, String s, String s1, int v1) {
        j.f(s, "tag");
        return new Civ7Unit_RebellionTags(v, s, s1, v1);
    }

    public static Civ7Unit_RebellionTags copy$default(Civ7Unit_RebellionTags civ7Unit_RebellionTags0, int v, String s, String s1, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = civ7Unit_RebellionTags0.rebellionLevel;
        }
        if((v2 & 2) != 0) {
            s = civ7Unit_RebellionTags0.tag;
        }
        if((v2 & 4) != 0) {
            s1 = civ7Unit_RebellionTags0.forbiddenTag;
        }
        if((v2 & 8) != 0) {
            v1 = civ7Unit_RebellionTags0.numCreated;
        }
        return civ7Unit_RebellionTags0.copy(v, s, s1, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Unit_RebellionTags)) {
            return false;
        }
        if(this.rebellionLevel != ((Civ7Unit_RebellionTags)object0).rebellionLevel) {
            return false;
        }
        if(!j.a(this.tag, ((Civ7Unit_RebellionTags)object0).tag)) {
            return false;
        }
        return j.a(this.forbiddenTag, ((Civ7Unit_RebellionTags)object0).forbiddenTag) ? this.numCreated == ((Civ7Unit_RebellionTags)object0).numCreated : false;
    }

    public final String getForbiddenTag() {
        return this.forbiddenTag;
    }

    public final int getNumCreated() {
        return this.numCreated;
    }

    public final int getRebellionLevel() {
        return this.rebellionLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.rebellionLevel * 0x1F, 0x1F, this.tag);
        return this.forbiddenTag == null ? v * 0x1F + this.numCreated : (v + this.forbiddenTag.hashCode()) * 0x1F + this.numCreated;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7Unit_RebellionTags(rebellionLevel=");
        stringBuilder0.append(this.rebellionLevel);
        stringBuilder0.append(", tag=");
        stringBuilder0.append(this.tag);
        stringBuilder0.append(", forbiddenTag=");
        return f.l(stringBuilder0, this.numCreated, this.forbiddenTag, ", numCreated=", ")");
    }
}

