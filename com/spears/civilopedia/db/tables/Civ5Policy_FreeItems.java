package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ<\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000E¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Policy_FreeItems;", "", "policyType", "", "setType", "minItems", "", "maxItems", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMaxItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinItems", "getPolicyType", "()Ljava/lang/String;", "getSetType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Policy_FreeItems;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Policy_FreeItems {
    private final Integer maxItems;
    private final Integer minItems;
    private final String policyType;
    private final String setType;

    public Civ5Policy_FreeItems(String s, String s1, Integer integer0, Integer integer1) {
        j.f(s1, "setType");
        super();
        this.policyType = s;
        this.setType = s1;
        this.minItems = integer0;
        this.maxItems = integer1;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.setType;
    }

    public final Integer component3() {
        return this.minItems;
    }

    public final Integer component4() {
        return this.maxItems;
    }

    public final Civ5Policy_FreeItems copy(String s, String s1, Integer integer0, Integer integer1) {
        j.f(s1, "setType");
        return new Civ5Policy_FreeItems(s, s1, integer0, integer1);
    }

    public static Civ5Policy_FreeItems copy$default(Civ5Policy_FreeItems civ5Policy_FreeItems0, String s, String s1, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Policy_FreeItems0.policyType;
        }
        if((v & 2) != 0) {
            s1 = civ5Policy_FreeItems0.setType;
        }
        if((v & 4) != 0) {
            integer0 = civ5Policy_FreeItems0.minItems;
        }
        if((v & 8) != 0) {
            integer1 = civ5Policy_FreeItems0.maxItems;
        }
        return civ5Policy_FreeItems0.copy(s, s1, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Policy_FreeItems)) {
            return false;
        }
        if(!j.a(this.policyType, ((Civ5Policy_FreeItems)object0).policyType)) {
            return false;
        }
        if(!j.a(this.setType, ((Civ5Policy_FreeItems)object0).setType)) {
            return false;
        }
        return j.a(this.minItems, ((Civ5Policy_FreeItems)object0).minItems) ? j.a(this.maxItems, ((Civ5Policy_FreeItems)object0).maxItems) : false;
    }

    public final Integer getMaxItems() {
        return this.maxItems;
    }

    public final Integer getMinItems() {
        return this.minItems;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    public final String getSetType() {
        return this.setType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.policyType == null ? 0 : this.policyType.hashCode()) * 0x1F, 0x1F, this.setType);
        int v2 = this.minItems == null ? 0 : this.minItems.hashCode();
        Integer integer0 = this.maxItems;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Policy_FreeItems(policyType=", this.policyType, ", setType=", this.setType, ", minItems=");
        stringBuilder0.append(this.minItems);
        stringBuilder0.append(", maxItems=");
        stringBuilder0.append(this.maxItems);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

