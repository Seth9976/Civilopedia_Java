package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7LoadingInfo_Leaders;", "", "leaderType", "", "ageTypeOverride", "audioOverride", "civilizationTypeOverride", "leaderImage", "leaderNameTextOverride", "leaderText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgeTypeOverride", "()Ljava/lang/String;", "getAudioOverride", "getCivilizationTypeOverride", "getLeaderImage", "getLeaderNameTextOverride", "getLeaderText", "getLeaderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7LoadingInfo_Leaders {
    private final String ageTypeOverride;
    private final String audioOverride;
    private final String civilizationTypeOverride;
    private final String leaderImage;
    private final String leaderNameTextOverride;
    private final String leaderText;
    private final String leaderType;

    public Civ7LoadingInfo_Leaders(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        j.f(s, "leaderType");
        super();
        this.leaderType = s;
        this.ageTypeOverride = s1;
        this.audioOverride = s2;
        this.civilizationTypeOverride = s3;
        this.leaderImage = s4;
        this.leaderNameTextOverride = s5;
        this.leaderText = s6;
    }

    public final String component1() {
        return this.leaderType;
    }

    public final String component2() {
        return this.ageTypeOverride;
    }

    public final String component3() {
        return this.audioOverride;
    }

    public final String component4() {
        return this.civilizationTypeOverride;
    }

    public final String component5() {
        return this.leaderImage;
    }

    public final String component6() {
        return this.leaderNameTextOverride;
    }

    public final String component7() {
        return this.leaderText;
    }

    public final Civ7LoadingInfo_Leaders copy(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        j.f(s, "leaderType");
        return new Civ7LoadingInfo_Leaders(s, s1, s2, s3, s4, s5, s6);
    }

    public static Civ7LoadingInfo_Leaders copy$default(Civ7LoadingInfo_Leaders civ7LoadingInfo_Leaders0, String s, String s1, String s2, String s3, String s4, String s5, String s6, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7LoadingInfo_Leaders0.leaderType;
        }
        if((v & 2) != 0) {
            s1 = civ7LoadingInfo_Leaders0.ageTypeOverride;
        }
        if((v & 4) != 0) {
            s2 = civ7LoadingInfo_Leaders0.audioOverride;
        }
        if((v & 8) != 0) {
            s3 = civ7LoadingInfo_Leaders0.civilizationTypeOverride;
        }
        if((v & 16) != 0) {
            s4 = civ7LoadingInfo_Leaders0.leaderImage;
        }
        if((v & 0x20) != 0) {
            s5 = civ7LoadingInfo_Leaders0.leaderNameTextOverride;
        }
        if((v & 0x40) != 0) {
            s6 = civ7LoadingInfo_Leaders0.leaderText;
        }
        return civ7LoadingInfo_Leaders0.copy(s, s1, s2, s3, s4, s5, s6);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7LoadingInfo_Leaders)) {
            return false;
        }
        if(!j.a(this.leaderType, ((Civ7LoadingInfo_Leaders)object0).leaderType)) {
            return false;
        }
        if(!j.a(this.ageTypeOverride, ((Civ7LoadingInfo_Leaders)object0).ageTypeOverride)) {
            return false;
        }
        if(!j.a(this.audioOverride, ((Civ7LoadingInfo_Leaders)object0).audioOverride)) {
            return false;
        }
        if(!j.a(this.civilizationTypeOverride, ((Civ7LoadingInfo_Leaders)object0).civilizationTypeOverride)) {
            return false;
        }
        if(!j.a(this.leaderImage, ((Civ7LoadingInfo_Leaders)object0).leaderImage)) {
            return false;
        }
        return j.a(this.leaderNameTextOverride, ((Civ7LoadingInfo_Leaders)object0).leaderNameTextOverride) ? j.a(this.leaderText, ((Civ7LoadingInfo_Leaders)object0).leaderText) : false;
    }

    public final String getAgeTypeOverride() {
        return this.ageTypeOverride;
    }

    public final String getAudioOverride() {
        return this.audioOverride;
    }

    public final String getCivilizationTypeOverride() {
        return this.civilizationTypeOverride;
    }

    public final String getLeaderImage() {
        return this.leaderImage;
    }

    public final String getLeaderNameTextOverride() {
        return this.leaderNameTextOverride;
    }

    public final String getLeaderText() {
        return this.leaderText;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    @Override
    public int hashCode() {
        int v = this.leaderType.hashCode();
        int v1 = 0;
        int v2 = this.ageTypeOverride == null ? 0 : this.ageTypeOverride.hashCode();
        int v3 = this.audioOverride == null ? 0 : this.audioOverride.hashCode();
        int v4 = this.civilizationTypeOverride == null ? 0 : this.civilizationTypeOverride.hashCode();
        int v5 = this.leaderImage == null ? 0 : this.leaderImage.hashCode();
        int v6 = this.leaderNameTextOverride == null ? 0 : this.leaderNameTextOverride.hashCode();
        String s = this.leaderText;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7LoadingInfo_Leaders(leaderType=", this.leaderType, ", ageTypeOverride=", this.ageTypeOverride, ", audioOverride=");
        f.t(stringBuilder0, this.audioOverride, ", civilizationTypeOverride=", this.civilizationTypeOverride, ", leaderImage=");
        f.t(stringBuilder0, this.leaderImage, ", leaderNameTextOverride=", this.leaderNameTextOverride, ", leaderText=");
        return e.h(stringBuilder0, this.leaderText, ")");
    }
}

