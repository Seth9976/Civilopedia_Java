package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001C\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001F\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b \u0010\fR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001A\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7GreatWorkObjectTypes;", "Lo2/m;", "", "greatWorkObjectType", "iconString", "name", "pseudoYieldType", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7GreatWorkObjectTypes;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGreatWorkObjectType", "getIconString", "getName", "getPseudoYieldType", "I", "getValue", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7GreatWorkObjectTypes implements m {
    private final String greatWorkObjectType;
    private final String iconString;
    private final String name;
    private final String pseudoYieldType;
    private final int value;

    public Civ7GreatWorkObjectTypes(String s, String s1, String s2, String s3, int v) {
        j.f(s, "greatWorkObjectType");
        j.f(s1, "iconString");
        j.f(s2, "name");
        j.f(s3, "pseudoYieldType");
        super();
        this.greatWorkObjectType = s;
        this.iconString = s1;
        this.name = s2;
        this.pseudoYieldType = s3;
        this.value = v;
    }

    public final String component1() {
        return this.greatWorkObjectType;
    }

    public final String component2() {
        return this.iconString;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.pseudoYieldType;
    }

    public final int component5() {
        return this.value;
    }

    public final Civ7GreatWorkObjectTypes copy(String s, String s1, String s2, String s3, int v) {
        j.f(s, "greatWorkObjectType");
        j.f(s1, "iconString");
        j.f(s2, "name");
        j.f(s3, "pseudoYieldType");
        return new Civ7GreatWorkObjectTypes(s, s1, s2, s3, v);
    }

    public static Civ7GreatWorkObjectTypes copy$default(Civ7GreatWorkObjectTypes civ7GreatWorkObjectTypes0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7GreatWorkObjectTypes0.greatWorkObjectType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7GreatWorkObjectTypes0.iconString;
        }
        if((v1 & 4) != 0) {
            s2 = civ7GreatWorkObjectTypes0.name;
        }
        if((v1 & 8) != 0) {
            s3 = civ7GreatWorkObjectTypes0.pseudoYieldType;
        }
        if((v1 & 16) != 0) {
            v = civ7GreatWorkObjectTypes0.value;
        }
        return civ7GreatWorkObjectTypes0.copy(s, s1, s2, s3, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7GreatWorkObjectTypes)) {
            return false;
        }
        if(!j.a(this.greatWorkObjectType, ((Civ7GreatWorkObjectTypes)object0).greatWorkObjectType)) {
            return false;
        }
        if(!j.a(this.iconString, ((Civ7GreatWorkObjectTypes)object0).iconString)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7GreatWorkObjectTypes)object0).name)) {
            return false;
        }
        return j.a(this.pseudoYieldType, ((Civ7GreatWorkObjectTypes)object0).pseudoYieldType) ? this.value == ((Civ7GreatWorkObjectTypes)object0).value : false;
    }

    public final String getGreatWorkObjectType() {
        return this.greatWorkObjectType;
    }

    public final String getIconString() {
        return this.iconString;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPseudoYieldType() {
        return this.pseudoYieldType;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return f.b(f.b(f.b(this.greatWorkObjectType.hashCode() * 0x1F, 0x1F, this.iconString), 0x1F, this.name), 0x1F, this.pseudoYieldType) + this.value;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.greatWorkObjectType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7GreatWorkObjectTypes(greatWorkObjectType=", this.greatWorkObjectType, ", iconString=", this.iconString, ", name=");
        f.t(stringBuilder0, this.name, ", pseudoYieldType=", this.pseudoYieldType, ", value=");
        return e.g(stringBuilder0, this.value, ")");
    }
}

