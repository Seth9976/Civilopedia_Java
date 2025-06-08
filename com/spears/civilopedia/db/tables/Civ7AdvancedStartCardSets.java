package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0010\u0010\u000E\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000BJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00052\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001B\u001A\u0004\b\u001D\u0010\u000BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001E\u001A\u0004\b\u001F\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001B\u001A\u0004\b \u0010\u000B¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartCardSets;", "Lo2/m;", "", "cardSet", "age", "", "defaultSet", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartCardSets;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardSet", "getAge", "Z", "getDefaultSet", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvancedStartCardSets implements m {
    private final String age;
    private final String cardSet;
    private final boolean defaultSet;
    private final String name;

    public Civ7AdvancedStartCardSets(String s, String s1, boolean z, String s2) {
        j.f(s, "cardSet");
        j.f(s1, "age");
        j.f(s2, "name");
        super();
        this.cardSet = s;
        this.age = s1;
        this.defaultSet = z;
        this.name = s2;
    }

    public final String component1() {
        return this.cardSet;
    }

    public final String component2() {
        return this.age;
    }

    public final boolean component3() {
        return this.defaultSet;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7AdvancedStartCardSets copy(String s, String s1, boolean z, String s2) {
        j.f(s, "cardSet");
        j.f(s1, "age");
        j.f(s2, "name");
        return new Civ7AdvancedStartCardSets(s, s1, z, s2);
    }

    public static Civ7AdvancedStartCardSets copy$default(Civ7AdvancedStartCardSets civ7AdvancedStartCardSets0, String s, String s1, boolean z, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AdvancedStartCardSets0.cardSet;
        }
        if((v & 2) != 0) {
            s1 = civ7AdvancedStartCardSets0.age;
        }
        if((v & 4) != 0) {
            z = civ7AdvancedStartCardSets0.defaultSet;
        }
        if((v & 8) != 0) {
            s2 = civ7AdvancedStartCardSets0.name;
        }
        return civ7AdvancedStartCardSets0.copy(s, s1, z, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvancedStartCardSets)) {
            return false;
        }
        if(!j.a(this.cardSet, ((Civ7AdvancedStartCardSets)object0).cardSet)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AdvancedStartCardSets)object0).age)) {
            return false;
        }
        return this.defaultSet == ((Civ7AdvancedStartCardSets)object0).defaultSet ? j.a(this.name, ((Civ7AdvancedStartCardSets)object0).name) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getCardSet() {
        return this.cardSet;
    }

    public final boolean getDefaultSet() {
        return this.defaultSet;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.cardSet.hashCode() * 0x1F, 0x1F, this.age);
        return this.defaultSet ? this.name.hashCode() + (v + 0x4CF) * 0x1F : this.name.hashCode() + (v + 0x4D5) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.cardSet;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AdvancedStartCardSets(cardSet=", this.cardSet, ", age=", this.age, ", defaultSet=");
        stringBuilder0.append(this.defaultSet);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

