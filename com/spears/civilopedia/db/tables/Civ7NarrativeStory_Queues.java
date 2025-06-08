package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J.\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000EJ\u001A\u0010\u0017\u001A\u00020\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001A\u0004\b\u001A\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001B\u001A\u0004\b\u001C\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001D\u001A\u0004\b\u001E\u0010\u0010¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_Queues;", "Lo2/m;", "", "queueType", "", "activationCount", "", "startAll", "<init>", "(Ljava/lang/String;IZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Z", "copy", "(Ljava/lang/String;IZ)Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_Queues;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQueueType", "I", "getActivationCount", "Z", "getStartAll", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeStory_Queues implements m {
    private final int activationCount;
    private final String queueType;
    private final boolean startAll;

    public Civ7NarrativeStory_Queues(String s, int v, boolean z) {
        j.f(s, "queueType");
        super();
        this.queueType = s;
        this.activationCount = v;
        this.startAll = z;
    }

    public final String component1() {
        return this.queueType;
    }

    public final int component2() {
        return this.activationCount;
    }

    public final boolean component3() {
        return this.startAll;
    }

    public final Civ7NarrativeStory_Queues copy(String s, int v, boolean z) {
        j.f(s, "queueType");
        return new Civ7NarrativeStory_Queues(s, v, z);
    }

    public static Civ7NarrativeStory_Queues copy$default(Civ7NarrativeStory_Queues civ7NarrativeStory_Queues0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7NarrativeStory_Queues0.queueType;
        }
        if((v1 & 2) != 0) {
            v = civ7NarrativeStory_Queues0.activationCount;
        }
        if((v1 & 4) != 0) {
            z = civ7NarrativeStory_Queues0.startAll;
        }
        return civ7NarrativeStory_Queues0.copy(s, v, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeStory_Queues)) {
            return false;
        }
        if(!j.a(this.queueType, ((Civ7NarrativeStory_Queues)object0).queueType)) {
            return false;
        }
        return this.activationCount == ((Civ7NarrativeStory_Queues)object0).activationCount ? this.startAll == ((Civ7NarrativeStory_Queues)object0).startAll : false;
    }

    public final int getActivationCount() {
        return this.activationCount;
    }

    public final String getQueueType() {
        return this.queueType;
    }

    public final boolean getStartAll() {
        return this.startAll;
    }

    @Override
    public int hashCode() {
        int v = (this.queueType.hashCode() * 0x1F + this.activationCount) * 0x1F;
        return this.startAll ? v + 0x4CF : v + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.queueType;
    }

    @Override
    public String toString() {
        return u9.g(f.m(this.activationCount, "Civ7NarrativeStory_Queues(queueType=", this.queueType, ", activationCount=", ", startAll="), this.startAll, ")");
    }
}

