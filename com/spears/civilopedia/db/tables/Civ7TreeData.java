package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005¢\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003JU\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001A\u00020\u0003HÖ\u0001J\t\u0010!\u001A\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\n\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000F¨\u0006\""}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TreeData;", "", "uniqueId", "", "defaultData", "", "defnId", "nodeId", "parentTag", "tag", "treeName", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultData", "()Ljava/lang/String;", "getDefnId", "()I", "getNodeId", "getParentTag", "getTag", "getTreeName", "getUniqueId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TreeData {
    private final String defaultData;
    private final int defnId;
    private final int nodeId;
    private final String parentTag;
    private final String tag;
    private final String treeName;
    private final int uniqueId;

    public Civ7TreeData(int v, String s, int v1, int v2, String s1, String s2, String s3) {
        j.f(s3, "treeName");
        super();
        this.uniqueId = v;
        this.defaultData = s;
        this.defnId = v1;
        this.nodeId = v2;
        this.parentTag = s1;
        this.tag = s2;
        this.treeName = s3;
    }

    public final int component1() {
        return this.uniqueId;
    }

    public final String component2() {
        return this.defaultData;
    }

    public final int component3() {
        return this.defnId;
    }

    public final int component4() {
        return this.nodeId;
    }

    public final String component5() {
        return this.parentTag;
    }

    public final String component6() {
        return this.tag;
    }

    public final String component7() {
        return this.treeName;
    }

    public final Civ7TreeData copy(int v, String s, int v1, int v2, String s1, String s2, String s3) {
        j.f(s3, "treeName");
        return new Civ7TreeData(v, s, v1, v2, s1, s2, s3);
    }

    public static Civ7TreeData copy$default(Civ7TreeData civ7TreeData0, int v, String s, int v1, int v2, String s1, String s2, String s3, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = civ7TreeData0.uniqueId;
        }
        if((v3 & 2) != 0) {
            s = civ7TreeData0.defaultData;
        }
        if((v3 & 4) != 0) {
            v1 = civ7TreeData0.defnId;
        }
        if((v3 & 8) != 0) {
            v2 = civ7TreeData0.nodeId;
        }
        if((v3 & 16) != 0) {
            s1 = civ7TreeData0.parentTag;
        }
        if((v3 & 0x20) != 0) {
            s2 = civ7TreeData0.tag;
        }
        if((v3 & 0x40) != 0) {
            s3 = civ7TreeData0.treeName;
        }
        return civ7TreeData0.copy(v, s, v1, v2, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TreeData)) {
            return false;
        }
        if(this.uniqueId != ((Civ7TreeData)object0).uniqueId) {
            return false;
        }
        if(!j.a(this.defaultData, ((Civ7TreeData)object0).defaultData)) {
            return false;
        }
        if(this.defnId != ((Civ7TreeData)object0).defnId) {
            return false;
        }
        if(this.nodeId != ((Civ7TreeData)object0).nodeId) {
            return false;
        }
        if(!j.a(this.parentTag, ((Civ7TreeData)object0).parentTag)) {
            return false;
        }
        return j.a(this.tag, ((Civ7TreeData)object0).tag) ? j.a(this.treeName, ((Civ7TreeData)object0).treeName) : false;
    }

    public final String getDefaultData() {
        return this.defaultData;
    }

    public final int getDefnId() {
        return this.defnId;
    }

    public final int getNodeId() {
        return this.nodeId;
    }

    public final String getParentTag() {
        return this.parentTag;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTreeName() {
        return this.treeName;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((this.uniqueId * 0x1F + (this.defaultData == null ? 0 : this.defaultData.hashCode())) * 0x1F + this.defnId) * 0x1F + this.nodeId) * 0x1F;
        int v2 = this.parentTag == null ? 0 : this.parentTag.hashCode();
        String s = this.tag;
        if(s != null) {
            v = s.hashCode();
        }
        return this.treeName.hashCode() + ((v1 + v2) * 0x1F + v) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7TreeData(uniqueId=");
        stringBuilder0.append(this.uniqueId);
        stringBuilder0.append(", defaultData=");
        stringBuilder0.append(this.defaultData);
        stringBuilder0.append(", defnId=");
        f.q(stringBuilder0, this.defnId, ", nodeId=", this.nodeId, ", parentTag=");
        f.t(stringBuilder0, this.parentTag, ", tag=", this.tag, ", treeName=");
        return e.h(stringBuilder0, this.treeName, ")");
    }
}

