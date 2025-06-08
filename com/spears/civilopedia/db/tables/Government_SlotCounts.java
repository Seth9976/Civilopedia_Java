package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Government_SlotCounts;", "", "governmentType", "", "governmentSlotType", "numSlots", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getGovernmentSlotType", "()Ljava/lang/String;", "getGovernmentType", "getNumSlots", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Government_SlotCounts {
    private final String governmentSlotType;
    private final String governmentType;
    private final int numSlots;

    public Government_SlotCounts(String s, String s1, int v) {
        j.f(s, "governmentType");
        j.f(s1, "governmentSlotType");
        super();
        this.governmentType = s;
        this.governmentSlotType = s1;
        this.numSlots = v;
    }

    public final String component1() {
        return this.governmentType;
    }

    public final String component2() {
        return this.governmentSlotType;
    }

    public final int component3() {
        return this.numSlots;
    }

    public final Government_SlotCounts copy(String s, String s1, int v) {
        j.f(s, "governmentType");
        j.f(s1, "governmentSlotType");
        return new Government_SlotCounts(s, s1, v);
    }

    public static Government_SlotCounts copy$default(Government_SlotCounts government_SlotCounts0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = government_SlotCounts0.governmentType;
        }
        if((v1 & 2) != 0) {
            s1 = government_SlotCounts0.governmentSlotType;
        }
        if((v1 & 4) != 0) {
            v = government_SlotCounts0.numSlots;
        }
        return government_SlotCounts0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Government_SlotCounts)) {
            return false;
        }
        if(!j.a(this.governmentType, ((Government_SlotCounts)object0).governmentType)) {
            return false;
        }
        return j.a(this.governmentSlotType, ((Government_SlotCounts)object0).governmentSlotType) ? this.numSlots == ((Government_SlotCounts)object0).numSlots : false;
    }

    public final String getGovernmentSlotType() {
        return this.governmentSlotType;
    }

    public final String getGovernmentType() {
        return this.governmentType;
    }

    public final int getNumSlots() {
        return this.numSlots;
    }

    @Override
    public int hashCode() {
        return f.b(this.governmentType.hashCode() * 0x1F, 0x1F, this.governmentSlotType) + this.numSlots;
    }

    @Override
    public String toString() {
        return e.g(e.j("Government_SlotCounts(governmentType=", this.governmentType, ", governmentSlotType=", this.governmentSlotType, ", numSlots="), this.numSlots, ")");
    }
}

