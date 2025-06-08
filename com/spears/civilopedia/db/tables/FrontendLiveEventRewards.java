package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendLiveEventRewards;", "", "type", "", "event", "reward", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "getReward", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendLiveEventRewards {
    private final String event;
    private final String reward;
    private final String type;

    public FrontendLiveEventRewards(String s, String s1, String s2) {
        j.f(s, "type");
        j.f(s1, "event");
        j.f(s2, "reward");
        super();
        this.type = s;
        this.event = s1;
        this.reward = s2;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.event;
    }

    public final String component3() {
        return this.reward;
    }

    public final FrontendLiveEventRewards copy(String s, String s1, String s2) {
        j.f(s, "type");
        j.f(s1, "event");
        j.f(s2, "reward");
        return new FrontendLiveEventRewards(s, s1, s2);
    }

    public static FrontendLiveEventRewards copy$default(FrontendLiveEventRewards frontendLiveEventRewards0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendLiveEventRewards0.type;
        }
        if((v & 2) != 0) {
            s1 = frontendLiveEventRewards0.event;
        }
        if((v & 4) != 0) {
            s2 = frontendLiveEventRewards0.reward;
        }
        return frontendLiveEventRewards0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendLiveEventRewards)) {
            return false;
        }
        if(!j.a(this.type, ((FrontendLiveEventRewards)object0).type)) {
            return false;
        }
        return j.a(this.event, ((FrontendLiveEventRewards)object0).event) ? j.a(this.reward, ((FrontendLiveEventRewards)object0).reward) : false;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getReward() {
        return this.reward;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.reward.hashCode() + f.b(this.type.hashCode() * 0x1F, 0x1F, this.event);
    }

    @Override
    public String toString() {
        return e.h(e.j("FrontendLiveEventRewards(type=", this.type, ", event=", this.event, ", reward="), this.reward, ")");
    }
}

