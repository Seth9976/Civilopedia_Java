package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Gossips;", "", "gossipType", "", "description", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getGossipType", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Gossips {
    private final String description;
    private final String gossipType;
    private final String message;

    public Civ7Gossips(String s, String s1, String s2) {
        j.f(s, "gossipType");
        j.f(s2, "message");
        super();
        this.gossipType = s;
        this.description = s1;
        this.message = s2;
    }

    public final String component1() {
        return this.gossipType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.message;
    }

    public final Civ7Gossips copy(String s, String s1, String s2) {
        j.f(s, "gossipType");
        j.f(s2, "message");
        return new Civ7Gossips(s, s1, s2);
    }

    public static Civ7Gossips copy$default(Civ7Gossips civ7Gossips0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Gossips0.gossipType;
        }
        if((v & 2) != 0) {
            s1 = civ7Gossips0.description;
        }
        if((v & 4) != 0) {
            s2 = civ7Gossips0.message;
        }
        return civ7Gossips0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Gossips)) {
            return false;
        }
        if(!j.a(this.gossipType, ((Civ7Gossips)object0).gossipType)) {
            return false;
        }
        return j.a(this.description, ((Civ7Gossips)object0).description) ? j.a(this.message, ((Civ7Gossips)object0).message) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGossipType() {
        return this.gossipType;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override
    public int hashCode() {
        int v = this.gossipType.hashCode();
        return this.description == null ? this.message.hashCode() + v * 961 : this.message.hashCode() + (v * 0x1F + this.description.hashCode()) * 0x1F;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7Gossips(gossipType=", this.gossipType, ", description=", this.description, ", message="), this.message, ")");
    }
}

