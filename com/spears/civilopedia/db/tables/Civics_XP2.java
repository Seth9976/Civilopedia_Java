package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00042\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001B\u001A\u0004\b\u001C\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001B\u001A\u0004\b\u001D\u0010\r¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civics_XP2;", "Lo2/m;", "", "civicType", "", "randomPrereqs", "hiddenUntilPrereqComplete", "<init>", "(Ljava/lang/String;ZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZZ)Lcom/spears/civilopedia/db/tables/Civics_XP2;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCivicType", "Z", "getRandomPrereqs", "getHiddenUntilPrereqComplete", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civics_XP2 implements m {
    private final String civicType;
    private final boolean hiddenUntilPrereqComplete;
    private final boolean randomPrereqs;

    public Civics_XP2(String s, boolean z, boolean z1) {
        j.f(s, "civicType");
        super();
        this.civicType = s;
        this.randomPrereqs = z;
        this.hiddenUntilPrereqComplete = z1;
    }

    public final String component1() {
        return this.civicType;
    }

    public final boolean component2() {
        return this.randomPrereqs;
    }

    public final boolean component3() {
        return this.hiddenUntilPrereqComplete;
    }

    public final Civics_XP2 copy(String s, boolean z, boolean z1) {
        j.f(s, "civicType");
        return new Civics_XP2(s, z, z1);
    }

    public static Civics_XP2 copy$default(Civics_XP2 civics_XP20, String s, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civics_XP20.civicType;
        }
        if((v & 2) != 0) {
            z = civics_XP20.randomPrereqs;
        }
        if((v & 4) != 0) {
            z1 = civics_XP20.hiddenUntilPrereqComplete;
        }
        return civics_XP20.copy(s, z, z1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civics_XP2)) {
            return false;
        }
        if(!j.a(this.civicType, ((Civics_XP2)object0).civicType)) {
            return false;
        }
        return this.randomPrereqs == ((Civics_XP2)object0).randomPrereqs ? this.hiddenUntilPrereqComplete == ((Civics_XP2)object0).hiddenUntilPrereqComplete : false;
    }

    public final String getCivicType() {
        return this.civicType;
    }

    public final boolean getHiddenUntilPrereqComplete() {
        return this.hiddenUntilPrereqComplete;
    }

    public final boolean getRandomPrereqs() {
        return this.randomPrereqs;
    }

    @Override
    public int hashCode() {
        int v = this.civicType.hashCode();
        int v1 = 0x4D5;
        int v2 = this.randomPrereqs ? 0x4CF : 0x4D5;
        if(this.hiddenUntilPrereqComplete) {
            v1 = 0x4CF;
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.civicType;
    }

    @Override
    public String toString() {
        return u9.g(u9.j("Civics_XP2(civicType=", this.civicType, this.randomPrereqs, ", randomPrereqs=", ", hiddenUntilPrereqComplete="), this.hiddenUntilPrereqComplete, ")");
    }
}

