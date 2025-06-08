package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010JH\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\bHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendChallengeCategoryData;", "", "ID", "", "name", "locName", "iconUrl", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getID", "()Ljava/lang/String;", "getIconUrl", "getLocName", "getName", "getSortIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/FrontendChallengeCategoryData;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendChallengeCategoryData {
    private final String ID;
    private final String iconUrl;
    private final String locName;
    private final String name;
    private final Integer sortIndex;

    public FrontendChallengeCategoryData(String s, String s1, String s2, String s3, Integer integer0) {
        j.f(s, "ID");
        super();
        this.ID = s;
        this.name = s1;
        this.locName = s2;
        this.iconUrl = s3;
        this.sortIndex = integer0;
    }

    public final String component1() {
        return this.ID;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.locName;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final Integer component5() {
        return this.sortIndex;
    }

    public final FrontendChallengeCategoryData copy(String s, String s1, String s2, String s3, Integer integer0) {
        j.f(s, "ID");
        return new FrontendChallengeCategoryData(s, s1, s2, s3, integer0);
    }

    public static FrontendChallengeCategoryData copy$default(FrontendChallengeCategoryData frontendChallengeCategoryData0, String s, String s1, String s2, String s3, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendChallengeCategoryData0.ID;
        }
        if((v & 2) != 0) {
            s1 = frontendChallengeCategoryData0.name;
        }
        if((v & 4) != 0) {
            s2 = frontendChallengeCategoryData0.locName;
        }
        if((v & 8) != 0) {
            s3 = frontendChallengeCategoryData0.iconUrl;
        }
        if((v & 16) != 0) {
            integer0 = frontendChallengeCategoryData0.sortIndex;
        }
        return frontendChallengeCategoryData0.copy(s, s1, s2, s3, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendChallengeCategoryData)) {
            return false;
        }
        if(!j.a(this.ID, ((FrontendChallengeCategoryData)object0).ID)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendChallengeCategoryData)object0).name)) {
            return false;
        }
        if(!j.a(this.locName, ((FrontendChallengeCategoryData)object0).locName)) {
            return false;
        }
        return j.a(this.iconUrl, ((FrontendChallengeCategoryData)object0).iconUrl) ? j.a(this.sortIndex, ((FrontendChallengeCategoryData)object0).sortIndex) : false;
    }

    public final String getID() {
        return this.ID;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLocName() {
        return this.locName;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = this.ID.hashCode();
        int v1 = 0;
        int v2 = this.name == null ? 0 : this.name.hashCode();
        int v3 = this.locName == null ? 0 : this.locName.hashCode();
        int v4 = this.iconUrl == null ? 0 : this.iconUrl.hashCode();
        Integer integer0 = this.sortIndex;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendChallengeCategoryData(ID=", this.ID, ", name=", this.name, ", locName=");
        f.t(stringBuilder0, this.locName, ", iconUrl=", this.iconUrl, ", sortIndex=");
        return u9.f(stringBuilder0, this.sortIndex, ")");
    }
}

