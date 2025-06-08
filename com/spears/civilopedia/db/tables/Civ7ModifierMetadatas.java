package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000EJ:\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000E¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7ModifierMetadatas;", "", "fieldName", "", "modifierID", "string", "value", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getFieldName", "()Ljava/lang/String;", "getModifierID", "getString", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/spears/civilopedia/db/tables/Civ7ModifierMetadatas;", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7ModifierMetadatas {
    private final String fieldName;
    private final String modifierID;
    private final String string;
    private final Double value;

    public Civ7ModifierMetadatas(String s, String s1, String s2, Double double0) {
        j.f(s, "fieldName");
        j.f(s1, "modifierID");
        super();
        this.fieldName = s;
        this.modifierID = s1;
        this.string = s2;
        this.value = double0;
    }

    public final String component1() {
        return this.fieldName;
    }

    public final String component2() {
        return this.modifierID;
    }

    public final String component3() {
        return this.string;
    }

    public final Double component4() {
        return this.value;
    }

    public final Civ7ModifierMetadatas copy(String s, String s1, String s2, Double double0) {
        j.f(s, "fieldName");
        j.f(s1, "modifierID");
        return new Civ7ModifierMetadatas(s, s1, s2, double0);
    }

    public static Civ7ModifierMetadatas copy$default(Civ7ModifierMetadatas civ7ModifierMetadatas0, String s, String s1, String s2, Double double0, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7ModifierMetadatas0.fieldName;
        }
        if((v & 2) != 0) {
            s1 = civ7ModifierMetadatas0.modifierID;
        }
        if((v & 4) != 0) {
            s2 = civ7ModifierMetadatas0.string;
        }
        if((v & 8) != 0) {
            double0 = civ7ModifierMetadatas0.value;
        }
        return civ7ModifierMetadatas0.copy(s, s1, s2, double0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7ModifierMetadatas)) {
            return false;
        }
        if(!j.a(this.fieldName, ((Civ7ModifierMetadatas)object0).fieldName)) {
            return false;
        }
        if(!j.a(this.modifierID, ((Civ7ModifierMetadatas)object0).modifierID)) {
            return false;
        }
        return j.a(this.string, ((Civ7ModifierMetadatas)object0).string) ? j.a(this.value, ((Civ7ModifierMetadatas)object0).value) : false;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getModifierID() {
        return this.modifierID;
    }

    public final String getString() {
        return this.string;
    }

    public final Double getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.fieldName.hashCode() * 0x1F, 0x1F, this.modifierID);
        int v1 = 0;
        int v2 = this.string == null ? 0 : this.string.hashCode();
        Double double0 = this.value;
        if(double0 != null) {
            v1 = double0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7ModifierMetadatas(fieldName=", this.fieldName, ", modifierID=", this.modifierID, ", string=");
        stringBuilder0.append(this.string);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.value);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

