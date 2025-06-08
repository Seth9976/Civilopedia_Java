package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011JV\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\t2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0015\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GameEffects;", "", "type", "", "contextInterfaces", "description", "gameCapabilities", "subjectInterfaces", "supportsRemove", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContextInterfaces", "()Ljava/lang/String;", "getDescription", "getGameCapabilities", "getSubjectInterfaces", "getSupportsRemove", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ7GameEffects;", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GameEffects {
    private final String contextInterfaces;
    private final String description;
    private final String gameCapabilities;
    private final String subjectInterfaces;
    private final Boolean supportsRemove;
    private final String type;

    public Civ7GameEffects(String s, String s1, String s2, String s3, String s4, Boolean boolean0) {
        this.type = s;
        this.contextInterfaces = s1;
        this.description = s2;
        this.gameCapabilities = s3;
        this.subjectInterfaces = s4;
        this.supportsRemove = boolean0;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.contextInterfaces;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.gameCapabilities;
    }

    public final String component5() {
        return this.subjectInterfaces;
    }

    public final Boolean component6() {
        return this.supportsRemove;
    }

    public final Civ7GameEffects copy(String s, String s1, String s2, String s3, String s4, Boolean boolean0) {
        return new Civ7GameEffects(s, s1, s2, s3, s4, boolean0);
    }

    public static Civ7GameEffects copy$default(Civ7GameEffects civ7GameEffects0, String s, String s1, String s2, String s3, String s4, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7GameEffects0.type;
        }
        if((v & 2) != 0) {
            s1 = civ7GameEffects0.contextInterfaces;
        }
        if((v & 4) != 0) {
            s2 = civ7GameEffects0.description;
        }
        if((v & 8) != 0) {
            s3 = civ7GameEffects0.gameCapabilities;
        }
        if((v & 16) != 0) {
            s4 = civ7GameEffects0.subjectInterfaces;
        }
        if((v & 0x20) != 0) {
            boolean0 = civ7GameEffects0.supportsRemove;
        }
        return civ7GameEffects0.copy(s, s1, s2, s3, s4, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GameEffects)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7GameEffects)object0).type)) {
            return false;
        }
        if(!j.a(this.contextInterfaces, ((Civ7GameEffects)object0).contextInterfaces)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7GameEffects)object0).description)) {
            return false;
        }
        if(!j.a(this.gameCapabilities, ((Civ7GameEffects)object0).gameCapabilities)) {
            return false;
        }
        return j.a(this.subjectInterfaces, ((Civ7GameEffects)object0).subjectInterfaces) ? j.a(this.supportsRemove, ((Civ7GameEffects)object0).supportsRemove) : false;
    }

    public final String getContextInterfaces() {
        return this.contextInterfaces;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGameCapabilities() {
        return this.gameCapabilities;
    }

    public final String getSubjectInterfaces() {
        return this.subjectInterfaces;
    }

    public final Boolean getSupportsRemove() {
        return this.supportsRemove;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.type == null ? 0 : this.type.hashCode();
        int v2 = this.contextInterfaces == null ? 0 : this.contextInterfaces.hashCode();
        int v3 = this.description == null ? 0 : this.description.hashCode();
        int v4 = this.gameCapabilities == null ? 0 : this.gameCapabilities.hashCode();
        int v5 = this.subjectInterfaces == null ? 0 : this.subjectInterfaces.hashCode();
        Boolean boolean0 = this.supportsRemove;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7GameEffects(type=", this.type, ", contextInterfaces=", this.contextInterfaces, ", description=");
        f.t(stringBuilder0, this.description, ", gameCapabilities=", this.gameCapabilities, ", subjectInterfaces=");
        stringBuilder0.append(this.subjectInterfaces);
        stringBuilder0.append(", supportsRemove=");
        stringBuilder0.append(this.supportsRemove);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

