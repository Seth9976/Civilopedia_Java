package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000BJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00042\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001D\u001A\u0004\b\u001E\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001B\u001A\u0004\b\u001F\u0010\u000BR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001B\u001A\u0004\b \u0010\u000B¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7ResourceClasses;", "Lo2/m;", "", "resourceClassType", "", "assignable", "description", "name", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7ResourceClasses;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResourceClassType", "Z", "getAssignable", "getDescription", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7ResourceClasses implements m {
    private final boolean assignable;
    private final String description;
    private final String name;
    private final String resourceClassType;

    public Civ7ResourceClasses(String s, boolean z, String s1, String s2) {
        j.f(s, "resourceClassType");
        j.f(s1, "description");
        j.f(s2, "name");
        super();
        this.resourceClassType = s;
        this.assignable = z;
        this.description = s1;
        this.name = s2;
    }

    public final String component1() {
        return this.resourceClassType;
    }

    public final boolean component2() {
        return this.assignable;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7ResourceClasses copy(String s, boolean z, String s1, String s2) {
        j.f(s, "resourceClassType");
        j.f(s1, "description");
        j.f(s2, "name");
        return new Civ7ResourceClasses(s, z, s1, s2);
    }

    public static Civ7ResourceClasses copy$default(Civ7ResourceClasses civ7ResourceClasses0, String s, boolean z, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7ResourceClasses0.resourceClassType;
        }
        if((v & 2) != 0) {
            z = civ7ResourceClasses0.assignable;
        }
        if((v & 4) != 0) {
            s1 = civ7ResourceClasses0.description;
        }
        if((v & 8) != 0) {
            s2 = civ7ResourceClasses0.name;
        }
        return civ7ResourceClasses0.copy(s, z, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7ResourceClasses)) {
            return false;
        }
        if(!j.a(this.resourceClassType, ((Civ7ResourceClasses)object0).resourceClassType)) {
            return false;
        }
        if(this.assignable != ((Civ7ResourceClasses)object0).assignable) {
            return false;
        }
        return j.a(this.description, ((Civ7ResourceClasses)object0).description) ? j.a(this.name, ((Civ7ResourceClasses)object0).name) : false;
    }

    public final boolean getAssignable() {
        return this.assignable;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getResourceClassType() {
        return this.resourceClassType;
    }

    @Override
    public int hashCode() {
        int v = this.resourceClassType.hashCode();
        return this.assignable ? this.name.hashCode() + f.b((v * 0x1F + 0x4CF) * 0x1F, 0x1F, this.description) : this.name.hashCode() + f.b((v * 0x1F + 0x4D5) * 0x1F, 0x1F, this.description);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.resourceClassType;
    }

    @Override
    public String toString() {
        return e.i(u9.j("Civ7ResourceClasses(resourceClassType=", this.resourceClassType, this.assignable, ", assignable=", ", description="), this.description, ", name=", this.name, ")");
    }
}

