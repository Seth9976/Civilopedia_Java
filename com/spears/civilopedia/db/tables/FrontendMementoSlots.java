package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J=\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMementoSlots;", "", "domain", "", "ID", "name", "unlockTitle", "parameterId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/String;", "getDomain", "getName", "getParameterId", "getUnlockTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMementoSlots {
    private final String ID;
    private final String domain;
    private final String name;
    private final String parameterId;
    private final String unlockTitle;

    public FrontendMementoSlots(String s, String s1, String s2, String s3, String s4) {
        j.f(s1, "ID");
        j.f(s2, "name");
        j.f(s3, "unlockTitle");
        j.f(s4, "parameterId");
        super();
        this.domain = s;
        this.ID = s1;
        this.name = s2;
        this.unlockTitle = s3;
        this.parameterId = s4;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.ID;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.unlockTitle;
    }

    public final String component5() {
        return this.parameterId;
    }

    public final FrontendMementoSlots copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s1, "ID");
        j.f(s2, "name");
        j.f(s3, "unlockTitle");
        j.f(s4, "parameterId");
        return new FrontendMementoSlots(s, s1, s2, s3, s4);
    }

    public static FrontendMementoSlots copy$default(FrontendMementoSlots frontendMementoSlots0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendMementoSlots0.domain;
        }
        if((v & 2) != 0) {
            s1 = frontendMementoSlots0.ID;
        }
        if((v & 4) != 0) {
            s2 = frontendMementoSlots0.name;
        }
        if((v & 8) != 0) {
            s3 = frontendMementoSlots0.unlockTitle;
        }
        if((v & 16) != 0) {
            s4 = frontendMementoSlots0.parameterId;
        }
        return frontendMementoSlots0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendMementoSlots)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendMementoSlots)object0).domain)) {
            return false;
        }
        if(!j.a(this.ID, ((FrontendMementoSlots)object0).ID)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendMementoSlots)object0).name)) {
            return false;
        }
        return j.a(this.unlockTitle, ((FrontendMementoSlots)object0).unlockTitle) ? j.a(this.parameterId, ((FrontendMementoSlots)object0).parameterId) : false;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getID() {
        return this.ID;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParameterId() {
        return this.parameterId;
    }

    public final String getUnlockTitle() {
        return this.unlockTitle;
    }

    @Override
    public int hashCode() {
        return this.domain == null ? this.parameterId.hashCode() + f.b(f.b(f.b(0, 0x1F, this.ID), 0x1F, this.name), 0x1F, this.unlockTitle) : this.parameterId.hashCode() + f.b(f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.ID), 0x1F, this.name), 0x1F, this.unlockTitle);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendMementoSlots(domain=", this.domain, ", ID=", this.ID, ", name=");
        f.t(stringBuilder0, this.name, ", unlockTitle=", this.unlockTitle, ", parameterId=");
        return e.h(stringBuilder0, this.parameterId, ")");
    }
}

