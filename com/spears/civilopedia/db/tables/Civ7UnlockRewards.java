package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0006HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\r¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnlockRewards;", "", "name", "", "unlockType", "civUnlock", "", "description", "icon", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getCivUnlock", "()Z", "getDescription", "()Ljava/lang/String;", "getIcon", "getName", "getUnlockType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnlockRewards {
    private final boolean civUnlock;
    private final String description;
    private final String icon;
    private final String name;
    private final String unlockType;

    public Civ7UnlockRewards(String s, String s1, boolean z, String s2, String s3) {
        j.f(s, "name");
        j.f(s1, "unlockType");
        super();
        this.name = s;
        this.unlockType = s1;
        this.civUnlock = z;
        this.description = s2;
        this.icon = s3;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.unlockType;
    }

    public final boolean component3() {
        return this.civUnlock;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.icon;
    }

    public final Civ7UnlockRewards copy(String s, String s1, boolean z, String s2, String s3) {
        j.f(s, "name");
        j.f(s1, "unlockType");
        return new Civ7UnlockRewards(s, s1, z, s2, s3);
    }

    public static Civ7UnlockRewards copy$default(Civ7UnlockRewards civ7UnlockRewards0, String s, String s1, boolean z, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnlockRewards0.name;
        }
        if((v & 2) != 0) {
            s1 = civ7UnlockRewards0.unlockType;
        }
        if((v & 4) != 0) {
            z = civ7UnlockRewards0.civUnlock;
        }
        if((v & 8) != 0) {
            s2 = civ7UnlockRewards0.description;
        }
        if((v & 16) != 0) {
            s3 = civ7UnlockRewards0.icon;
        }
        return civ7UnlockRewards0.copy(s, s1, z, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnlockRewards)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7UnlockRewards)object0).name)) {
            return false;
        }
        if(!j.a(this.unlockType, ((Civ7UnlockRewards)object0).unlockType)) {
            return false;
        }
        if(this.civUnlock != ((Civ7UnlockRewards)object0).civUnlock) {
            return false;
        }
        return j.a(this.description, ((Civ7UnlockRewards)object0).description) ? j.a(this.icon, ((Civ7UnlockRewards)object0).icon) : false;
    }

    public final boolean getCivUnlock() {
        return this.civUnlock;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUnlockType() {
        return this.unlockType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.name.hashCode() * 0x1F, 0x1F, this.unlockType);
        int v1 = this.civUnlock ? 0x4CF : 0x4D5;
        int v2 = 0;
        int v3 = this.description == null ? 0 : this.description.hashCode();
        String s = this.icon;
        if(s != null) {
            v2 = s.hashCode();
        }
        return ((v + v1) * 0x1F + v3) * 0x1F + v2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7UnlockRewards(name=", this.name, ", unlockType=", this.unlockType, ", civUnlock=");
        u9.z(stringBuilder0, this.civUnlock, ", description=", this.description, ", icon=");
        return e.h(stringBuilder0, this.icon, ")");
    }
}

