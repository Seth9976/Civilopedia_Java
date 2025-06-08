package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\tJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ.\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\tJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001A\u0004\b\u001B\u0010\t¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/DynamicModifiers;", "Lo2/m;", "", "modifierType", "collectionType", "effectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/DynamicModifiers;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModifierType", "getCollectionType", "getEffectType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DynamicModifiers implements m {
    private final String collectionType;
    private final String effectType;
    private final String modifierType;

    public DynamicModifiers(String s, String s1, String s2) {
        j.f(s, "modifierType");
        j.f(s1, "collectionType");
        j.f(s2, "effectType");
        super();
        this.modifierType = s;
        this.collectionType = s1;
        this.effectType = s2;
    }

    public final String component1() {
        return this.modifierType;
    }

    public final String component2() {
        return this.collectionType;
    }

    public final String component3() {
        return this.effectType;
    }

    public final DynamicModifiers copy(String s, String s1, String s2) {
        j.f(s, "modifierType");
        j.f(s1, "collectionType");
        j.f(s2, "effectType");
        return new DynamicModifiers(s, s1, s2);
    }

    public static DynamicModifiers copy$default(DynamicModifiers dynamicModifiers0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = dynamicModifiers0.modifierType;
        }
        if((v & 2) != 0) {
            s1 = dynamicModifiers0.collectionType;
        }
        if((v & 4) != 0) {
            s2 = dynamicModifiers0.effectType;
        }
        return dynamicModifiers0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DynamicModifiers)) {
            return false;
        }
        if(!j.a(this.modifierType, ((DynamicModifiers)object0).modifierType)) {
            return false;
        }
        return j.a(this.collectionType, ((DynamicModifiers)object0).collectionType) ? j.a(this.effectType, ((DynamicModifiers)object0).effectType) : false;
    }

    public final String getCollectionType() {
        return this.collectionType;
    }

    public final String getEffectType() {
        return this.effectType;
    }

    public final String getModifierType() {
        return this.modifierType;
    }

    @Override
    public int hashCode() {
        return this.effectType.hashCode() + f.b(this.modifierType.hashCode() * 0x1F, 0x1F, this.collectionType);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.modifierType;
    }

    @Override
    public String toString() {
        return e.h(e.j("DynamicModifiers(modifierType=", this.modifierType, ", collectionType=", this.collectionType, ", effectType="), this.effectType, ")");
    }
}

