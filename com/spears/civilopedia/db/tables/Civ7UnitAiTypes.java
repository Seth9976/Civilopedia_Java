package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000FJ0\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00052\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001A"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitAiTypes;", "", "aiType", "", "priority", "", "typeValue", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAiType", "()Ljava/lang/String;", "getPriority", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTypeValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7UnitAiTypes;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitAiTypes {
    private final String aiType;
    private final Boolean priority;
    private final Integer typeValue;

    public Civ7UnitAiTypes(String s, Boolean boolean0, Integer integer0) {
        j.f(s, "aiType");
        super();
        this.aiType = s;
        this.priority = boolean0;
        this.typeValue = integer0;
    }

    public final String component1() {
        return this.aiType;
    }

    public final Boolean component2() {
        return this.priority;
    }

    public final Integer component3() {
        return this.typeValue;
    }

    public final Civ7UnitAiTypes copy(String s, Boolean boolean0, Integer integer0) {
        j.f(s, "aiType");
        return new Civ7UnitAiTypes(s, boolean0, integer0);
    }

    public static Civ7UnitAiTypes copy$default(Civ7UnitAiTypes civ7UnitAiTypes0, String s, Boolean boolean0, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7UnitAiTypes0.aiType;
        }
        if((v & 2) != 0) {
            boolean0 = civ7UnitAiTypes0.priority;
        }
        if((v & 4) != 0) {
            integer0 = civ7UnitAiTypes0.typeValue;
        }
        return civ7UnitAiTypes0.copy(s, boolean0, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitAiTypes)) {
            return false;
        }
        if(!j.a(this.aiType, ((Civ7UnitAiTypes)object0).aiType)) {
            return false;
        }
        return j.a(this.priority, ((Civ7UnitAiTypes)object0).priority) ? j.a(this.typeValue, ((Civ7UnitAiTypes)object0).typeValue) : false;
    }

    public final String getAiType() {
        return this.aiType;
    }

    public final Boolean getPriority() {
        return this.priority;
    }

    public final Integer getTypeValue() {
        return this.typeValue;
    }

    @Override
    public int hashCode() {
        int v = this.aiType.hashCode();
        int v1 = 0;
        int v2 = this.priority == null ? 0 : this.priority.hashCode();
        Integer integer0 = this.typeValue;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7UnitAiTypes(aiType=");
        stringBuilder0.append(this.aiType);
        stringBuilder0.append(", priority=");
        stringBuilder0.append(this.priority);
        stringBuilder0.append(", typeValue=");
        return u9.f(stringBuilder0, this.typeValue, ")");
    }
}

