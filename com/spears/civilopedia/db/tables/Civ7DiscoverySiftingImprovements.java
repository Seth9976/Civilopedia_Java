package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\tJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ.\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001A\u0004\b\u001B\u0010\t¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiscoverySiftingImprovements;", "Lo2/m;", "", "queueType", "activation", "constructibleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7DiscoverySiftingImprovements;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQueueType", "getActivation", "getConstructibleType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiscoverySiftingImprovements implements m {
    private final String activation;
    private final String constructibleType;
    private final String queueType;

    public Civ7DiscoverySiftingImprovements(String s, String s1, String s2) {
        j.f(s, "queueType");
        j.f(s1, "activation");
        j.f(s2, "constructibleType");
        super();
        this.queueType = s;
        this.activation = s1;
        this.constructibleType = s2;
    }

    public final String component1() {
        return this.queueType;
    }

    public final String component2() {
        return this.activation;
    }

    public final String component3() {
        return this.constructibleType;
    }

    public final Civ7DiscoverySiftingImprovements copy(String s, String s1, String s2) {
        j.f(s, "queueType");
        j.f(s1, "activation");
        j.f(s2, "constructibleType");
        return new Civ7DiscoverySiftingImprovements(s, s1, s2);
    }

    public static Civ7DiscoverySiftingImprovements copy$default(Civ7DiscoverySiftingImprovements civ7DiscoverySiftingImprovements0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7DiscoverySiftingImprovements0.queueType;
        }
        if((v & 2) != 0) {
            s1 = civ7DiscoverySiftingImprovements0.activation;
        }
        if((v & 4) != 0) {
            s2 = civ7DiscoverySiftingImprovements0.constructibleType;
        }
        return civ7DiscoverySiftingImprovements0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiscoverySiftingImprovements)) {
            return false;
        }
        if(!j.a(this.queueType, ((Civ7DiscoverySiftingImprovements)object0).queueType)) {
            return false;
        }
        return j.a(this.activation, ((Civ7DiscoverySiftingImprovements)object0).activation) ? j.a(this.constructibleType, ((Civ7DiscoverySiftingImprovements)object0).constructibleType) : false;
    }

    public final String getActivation() {
        return this.activation;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final String getQueueType() {
        return this.queueType;
    }

    @Override
    public int hashCode() {
        return this.constructibleType.hashCode() + f.b(this.queueType.hashCode() * 0x1F, 0x1F, this.activation);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.queueType;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7DiscoverySiftingImprovements(queueType=", this.queueType, ", activation=", this.activation, ", constructibleType="), this.constructibleType, ")");
    }
}

