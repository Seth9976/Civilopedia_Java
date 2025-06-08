package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000BJH\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u0010\u0010\u000BR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000E¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Audio_Sounds;", "", "soundID", "", "fileName", "loadType", "onlyLoadOneVariationEachTime", "", "dontCache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDontCache", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFileName", "()Ljava/lang/String;", "getLoadType", "getOnlyLoadOneVariationEachTime", "getSoundID", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Audio_Sounds;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Audio_Sounds {
    private final Integer dontCache;
    private final String fileName;
    private final String loadType;
    private final Integer onlyLoadOneVariationEachTime;
    private final String soundID;

    public Civ5Audio_Sounds(String s, String s1, String s2, Integer integer0, Integer integer1) {
        j.f(s1, "fileName");
        super();
        this.soundID = s;
        this.fileName = s1;
        this.loadType = s2;
        this.onlyLoadOneVariationEachTime = integer0;
        this.dontCache = integer1;
    }

    public final String component1() {
        return this.soundID;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.loadType;
    }

    public final Integer component4() {
        return this.onlyLoadOneVariationEachTime;
    }

    public final Integer component5() {
        return this.dontCache;
    }

    public final Civ5Audio_Sounds copy(String s, String s1, String s2, Integer integer0, Integer integer1) {
        j.f(s1, "fileName");
        return new Civ5Audio_Sounds(s, s1, s2, integer0, integer1);
    }

    public static Civ5Audio_Sounds copy$default(Civ5Audio_Sounds civ5Audio_Sounds0, String s, String s1, String s2, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Audio_Sounds0.soundID;
        }
        if((v & 2) != 0) {
            s1 = civ5Audio_Sounds0.fileName;
        }
        if((v & 4) != 0) {
            s2 = civ5Audio_Sounds0.loadType;
        }
        if((v & 8) != 0) {
            integer0 = civ5Audio_Sounds0.onlyLoadOneVariationEachTime;
        }
        if((v & 16) != 0) {
            integer1 = civ5Audio_Sounds0.dontCache;
        }
        return civ5Audio_Sounds0.copy(s, s1, s2, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Audio_Sounds)) {
            return false;
        }
        if(!j.a(this.soundID, ((Civ5Audio_Sounds)object0).soundID)) {
            return false;
        }
        if(!j.a(this.fileName, ((Civ5Audio_Sounds)object0).fileName)) {
            return false;
        }
        if(!j.a(this.loadType, ((Civ5Audio_Sounds)object0).loadType)) {
            return false;
        }
        return j.a(this.onlyLoadOneVariationEachTime, ((Civ5Audio_Sounds)object0).onlyLoadOneVariationEachTime) ? j.a(this.dontCache, ((Civ5Audio_Sounds)object0).dontCache) : false;
    }

    public final Integer getDontCache() {
        return this.dontCache;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getLoadType() {
        return this.loadType;
    }

    public final Integer getOnlyLoadOneVariationEachTime() {
        return this.onlyLoadOneVariationEachTime;
    }

    public final String getSoundID() {
        return this.soundID;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.soundID == null ? 0 : this.soundID.hashCode()) * 0x1F, 0x1F, this.fileName);
        int v2 = this.loadType == null ? 0 : this.loadType.hashCode();
        int v3 = this.onlyLoadOneVariationEachTime == null ? 0 : this.onlyLoadOneVariationEachTime.hashCode();
        Integer integer0 = this.dontCache;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Audio_Sounds(soundID=", this.soundID, ", fileName=", this.fileName, ", loadType=");
        u9.p(this.onlyLoadOneVariationEachTime, this.loadType, ", onlyLoadOneVariationEachTime=", ", dontCache=", stringBuilder0);
        return u9.f(stringBuilder0, this.dontCache, ")");
    }
}

