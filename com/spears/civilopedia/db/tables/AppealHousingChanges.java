package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/AppealHousingChanges;", "", "districtType", "", "minimumValue", "", "appealChange", "description", "(Ljava/lang/String;IILjava/lang/String;)V", "getAppealChange", "()I", "getDescription", "()Ljava/lang/String;", "getDistrictType", "getMinimumValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AppealHousingChanges {
    private final int appealChange;
    private final String description;
    private final String districtType;
    private final int minimumValue;

    public AppealHousingChanges(String s, int v, int v1, String s1) {
        j.f(s, "districtType");
        j.f(s1, "description");
        super();
        this.districtType = s;
        this.minimumValue = v;
        this.appealChange = v1;
        this.description = s1;
    }

    public final String component1() {
        return this.districtType;
    }

    public final int component2() {
        return this.minimumValue;
    }

    public final int component3() {
        return this.appealChange;
    }

    public final String component4() {
        return this.description;
    }

    public final AppealHousingChanges copy(String s, int v, int v1, String s1) {
        j.f(s, "districtType");
        j.f(s1, "description");
        return new AppealHousingChanges(s, v, v1, s1);
    }

    public static AppealHousingChanges copy$default(AppealHousingChanges appealHousingChanges0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = appealHousingChanges0.districtType;
        }
        if((v2 & 2) != 0) {
            v = appealHousingChanges0.minimumValue;
        }
        if((v2 & 4) != 0) {
            v1 = appealHousingChanges0.appealChange;
        }
        if((v2 & 8) != 0) {
            s1 = appealHousingChanges0.description;
        }
        return appealHousingChanges0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AppealHousingChanges)) {
            return false;
        }
        if(!j.a(this.districtType, ((AppealHousingChanges)object0).districtType)) {
            return false;
        }
        if(this.minimumValue != ((AppealHousingChanges)object0).minimumValue) {
            return false;
        }
        return this.appealChange == ((AppealHousingChanges)object0).appealChange ? j.a(this.description, ((AppealHousingChanges)object0).description) : false;
    }

    public final int getAppealChange() {
        return this.appealChange;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDistrictType() {
        return this.districtType;
    }

    public final int getMinimumValue() {
        return this.minimumValue;
    }

    @Override
    public int hashCode() {
        return this.description.hashCode() + ((this.districtType.hashCode() * 0x1F + this.minimumValue) * 0x1F + this.appealChange) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.minimumValue, "AppealHousingChanges(districtType=", this.districtType, ", minimumValue=", ", appealChange="), this.appealChange, ", description=", this.description, ")");
    }
}

