package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000FJJ\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\bHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MinorCivTraits_Status;", "", "type", "", "statusIcon", "positiveStatusMeter", "negativeStatusMeter", "statusMeterIconAtlasIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getNegativeStatusMeter", "()Ljava/lang/String;", "getPositiveStatusMeter", "getStatusIcon", "getStatusMeterIconAtlasIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5MinorCivTraits_Status;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MinorCivTraits_Status {
    private final String negativeStatusMeter;
    private final String positiveStatusMeter;
    private final String statusIcon;
    private final Integer statusMeterIconAtlasIndex;
    private final String type;

    public Civ5MinorCivTraits_Status(String s, String s1, String s2, String s3, Integer integer0) {
        this.type = s;
        this.statusIcon = s1;
        this.positiveStatusMeter = s2;
        this.negativeStatusMeter = s3;
        this.statusMeterIconAtlasIndex = integer0;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.statusIcon;
    }

    public final String component3() {
        return this.positiveStatusMeter;
    }

    public final String component4() {
        return this.negativeStatusMeter;
    }

    public final Integer component5() {
        return this.statusMeterIconAtlasIndex;
    }

    public final Civ5MinorCivTraits_Status copy(String s, String s1, String s2, String s3, Integer integer0) {
        return new Civ5MinorCivTraits_Status(s, s1, s2, s3, integer0);
    }

    public static Civ5MinorCivTraits_Status copy$default(Civ5MinorCivTraits_Status civ5MinorCivTraits_Status0, String s, String s1, String s2, String s3, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5MinorCivTraits_Status0.type;
        }
        if((v & 2) != 0) {
            s1 = civ5MinorCivTraits_Status0.statusIcon;
        }
        if((v & 4) != 0) {
            s2 = civ5MinorCivTraits_Status0.positiveStatusMeter;
        }
        if((v & 8) != 0) {
            s3 = civ5MinorCivTraits_Status0.negativeStatusMeter;
        }
        if((v & 16) != 0) {
            integer0 = civ5MinorCivTraits_Status0.statusMeterIconAtlasIndex;
        }
        return civ5MinorCivTraits_Status0.copy(s, s1, s2, s3, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MinorCivTraits_Status)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5MinorCivTraits_Status)object0).type)) {
            return false;
        }
        if(!j.a(this.statusIcon, ((Civ5MinorCivTraits_Status)object0).statusIcon)) {
            return false;
        }
        if(!j.a(this.positiveStatusMeter, ((Civ5MinorCivTraits_Status)object0).positiveStatusMeter)) {
            return false;
        }
        return j.a(this.negativeStatusMeter, ((Civ5MinorCivTraits_Status)object0).negativeStatusMeter) ? j.a(this.statusMeterIconAtlasIndex, ((Civ5MinorCivTraits_Status)object0).statusMeterIconAtlasIndex) : false;
    }

    public final String getNegativeStatusMeter() {
        return this.negativeStatusMeter;
    }

    public final String getPositiveStatusMeter() {
        return this.positiveStatusMeter;
    }

    public final String getStatusIcon() {
        return this.statusIcon;
    }

    public final Integer getStatusMeterIconAtlasIndex() {
        return this.statusMeterIconAtlasIndex;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.type == null ? 0 : this.type.hashCode();
        int v2 = this.statusIcon == null ? 0 : this.statusIcon.hashCode();
        int v3 = this.positiveStatusMeter == null ? 0 : this.positiveStatusMeter.hashCode();
        int v4 = this.negativeStatusMeter == null ? 0 : this.negativeStatusMeter.hashCode();
        Integer integer0 = this.statusMeterIconAtlasIndex;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5MinorCivTraits_Status(type=", this.type, ", statusIcon=", this.statusIcon, ", positiveStatusMeter=");
        f.t(stringBuilder0, this.positiveStatusMeter, ", negativeStatusMeter=", this.negativeStatusMeter, ", statusMeterIconAtlasIndex=");
        return u9.f(stringBuilder0, this.statusMeterIconAtlasIndex, ")");
    }
}

