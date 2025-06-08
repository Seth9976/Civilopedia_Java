package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7IdeologyAdoptionModifiers;", "", "adoptionOrder", "", "ideologyType", "", "modifierId", "(ILjava/lang/String;Ljava/lang/String;)V", "getAdoptionOrder", "()I", "getIdeologyType", "()Ljava/lang/String;", "getModifierId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7IdeologyAdoptionModifiers {
    private final int adoptionOrder;
    private final String ideologyType;
    private final String modifierId;

    public Civ7IdeologyAdoptionModifiers(int v, String s, String s1) {
        j.f(s, "ideologyType");
        j.f(s1, "modifierId");
        super();
        this.adoptionOrder = v;
        this.ideologyType = s;
        this.modifierId = s1;
    }

    public final int component1() {
        return this.adoptionOrder;
    }

    public final String component2() {
        return this.ideologyType;
    }

    public final String component3() {
        return this.modifierId;
    }

    public final Civ7IdeologyAdoptionModifiers copy(int v, String s, String s1) {
        j.f(s, "ideologyType");
        j.f(s1, "modifierId");
        return new Civ7IdeologyAdoptionModifiers(v, s, s1);
    }

    public static Civ7IdeologyAdoptionModifiers copy$default(Civ7IdeologyAdoptionModifiers civ7IdeologyAdoptionModifiers0, int v, String s, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = civ7IdeologyAdoptionModifiers0.adoptionOrder;
        }
        if((v1 & 2) != 0) {
            s = civ7IdeologyAdoptionModifiers0.ideologyType;
        }
        if((v1 & 4) != 0) {
            s1 = civ7IdeologyAdoptionModifiers0.modifierId;
        }
        return civ7IdeologyAdoptionModifiers0.copy(v, s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7IdeologyAdoptionModifiers)) {
            return false;
        }
        if(this.adoptionOrder != ((Civ7IdeologyAdoptionModifiers)object0).adoptionOrder) {
            return false;
        }
        return j.a(this.ideologyType, ((Civ7IdeologyAdoptionModifiers)object0).ideologyType) ? j.a(this.modifierId, ((Civ7IdeologyAdoptionModifiers)object0).modifierId) : false;
    }

    public final int getAdoptionOrder() {
        return this.adoptionOrder;
    }

    public final String getIdeologyType() {
        return this.ideologyType;
    }

    public final String getModifierId() {
        return this.modifierId;
    }

    @Override
    public int hashCode() {
        return this.modifierId.hashCode() + f.b(this.adoptionOrder * 0x1F, 0x1F, this.ideologyType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7IdeologyAdoptionModifiers(adoptionOrder=");
        stringBuilder0.append(this.adoptionOrder);
        stringBuilder0.append(", ideologyType=");
        stringBuilder0.append(this.ideologyType);
        stringBuilder0.append(", modifierId=");
        return e.h(stringBuilder0, this.modifierId, ")");
    }
}

