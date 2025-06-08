package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ:\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000E¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiOperationLimits;", "", "listType", "", "operationType", "baseValue", "", "deltaValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBaseValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeltaValue", "getListType", "()Ljava/lang/String;", "getOperationType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7AiOperationLimits;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiOperationLimits {
    private final Integer baseValue;
    private final Integer deltaValue;
    private final String listType;
    private final String operationType;

    public Civ7AiOperationLimits(String s, String s1, Integer integer0, Integer integer1) {
        j.f(s, "listType");
        j.f(s1, "operationType");
        super();
        this.listType = s;
        this.operationType = s1;
        this.baseValue = integer0;
        this.deltaValue = integer1;
    }

    public final String component1() {
        return this.listType;
    }

    public final String component2() {
        return this.operationType;
    }

    public final Integer component3() {
        return this.baseValue;
    }

    public final Integer component4() {
        return this.deltaValue;
    }

    public final Civ7AiOperationLimits copy(String s, String s1, Integer integer0, Integer integer1) {
        j.f(s, "listType");
        j.f(s1, "operationType");
        return new Civ7AiOperationLimits(s, s1, integer0, integer1);
    }

    public static Civ7AiOperationLimits copy$default(Civ7AiOperationLimits civ7AiOperationLimits0, String s, String s1, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AiOperationLimits0.listType;
        }
        if((v & 2) != 0) {
            s1 = civ7AiOperationLimits0.operationType;
        }
        if((v & 4) != 0) {
            integer0 = civ7AiOperationLimits0.baseValue;
        }
        if((v & 8) != 0) {
            integer1 = civ7AiOperationLimits0.deltaValue;
        }
        return civ7AiOperationLimits0.copy(s, s1, integer0, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiOperationLimits)) {
            return false;
        }
        if(!j.a(this.listType, ((Civ7AiOperationLimits)object0).listType)) {
            return false;
        }
        if(!j.a(this.operationType, ((Civ7AiOperationLimits)object0).operationType)) {
            return false;
        }
        return j.a(this.baseValue, ((Civ7AiOperationLimits)object0).baseValue) ? j.a(this.deltaValue, ((Civ7AiOperationLimits)object0).deltaValue) : false;
    }

    public final Integer getBaseValue() {
        return this.baseValue;
    }

    public final Integer getDeltaValue() {
        return this.deltaValue;
    }

    public final String getListType() {
        return this.listType;
    }

    public final String getOperationType() {
        return this.operationType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.listType.hashCode() * 0x1F, 0x1F, this.operationType);
        int v1 = 0;
        int v2 = this.baseValue == null ? 0 : this.baseValue.hashCode();
        Integer integer0 = this.deltaValue;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AiOperationLimits(listType=", this.listType, ", operationType=", this.operationType, ", baseValue=");
        stringBuilder0.append(this.baseValue);
        stringBuilder0.append(", deltaValue=");
        stringBuilder0.append(this.deltaValue);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

