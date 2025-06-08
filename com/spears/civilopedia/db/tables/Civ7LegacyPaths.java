package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003JG\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u00072\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7LegacyPaths;", "", "legacyPathType", "", "age", "description", "enabledByDefault", "", "legacyPathClassType", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getDescription", "getEnabledByDefault", "()Z", "getLegacyPathClassType", "getLegacyPathType", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7LegacyPaths {
    private final String age;
    private final String description;
    private final boolean enabledByDefault;
    private final String legacyPathClassType;
    private final String legacyPathType;
    private final String name;

    public Civ7LegacyPaths(String s, String s1, String s2, boolean z, String s3, String s4) {
        j.f(s, "legacyPathType");
        j.f(s1, "age");
        j.f(s3, "legacyPathClassType");
        j.f(s4, "name");
        super();
        this.legacyPathType = s;
        this.age = s1;
        this.description = s2;
        this.enabledByDefault = z;
        this.legacyPathClassType = s3;
        this.name = s4;
    }

    public final String component1() {
        return this.legacyPathType;
    }

    public final String component2() {
        return this.age;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.enabledByDefault;
    }

    public final String component5() {
        return this.legacyPathClassType;
    }

    public final String component6() {
        return this.name;
    }

    public final Civ7LegacyPaths copy(String s, String s1, String s2, boolean z, String s3, String s4) {
        j.f(s, "legacyPathType");
        j.f(s1, "age");
        j.f(s3, "legacyPathClassType");
        j.f(s4, "name");
        return new Civ7LegacyPaths(s, s1, s2, z, s3, s4);
    }

    public static Civ7LegacyPaths copy$default(Civ7LegacyPaths civ7LegacyPaths0, String s, String s1, String s2, boolean z, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7LegacyPaths0.legacyPathType;
        }
        if((v & 2) != 0) {
            s1 = civ7LegacyPaths0.age;
        }
        if((v & 4) != 0) {
            s2 = civ7LegacyPaths0.description;
        }
        if((v & 8) != 0) {
            z = civ7LegacyPaths0.enabledByDefault;
        }
        if((v & 16) != 0) {
            s3 = civ7LegacyPaths0.legacyPathClassType;
        }
        if((v & 0x20) != 0) {
            s4 = civ7LegacyPaths0.name;
        }
        return civ7LegacyPaths0.copy(s, s1, s2, z, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7LegacyPaths)) {
            return false;
        }
        if(!j.a(this.legacyPathType, ((Civ7LegacyPaths)object0).legacyPathType)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7LegacyPaths)object0).age)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7LegacyPaths)object0).description)) {
            return false;
        }
        if(this.enabledByDefault != ((Civ7LegacyPaths)object0).enabledByDefault) {
            return false;
        }
        return j.a(this.legacyPathClassType, ((Civ7LegacyPaths)object0).legacyPathClassType) ? j.a(this.name, ((Civ7LegacyPaths)object0).name) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    public final String getLegacyPathClassType() {
        return this.legacyPathClassType;
    }

    public final String getLegacyPathType() {
        return this.legacyPathType;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.legacyPathType.hashCode() * 0x1F, 0x1F, this.age);
        int v1 = this.description == null ? 0 : this.description.hashCode();
        return this.enabledByDefault ? this.name.hashCode() + f.b(((v + v1) * 0x1F + 0x4CF) * 0x1F, 0x1F, this.legacyPathClassType) : this.name.hashCode() + f.b(((v + v1) * 0x1F + 0x4D5) * 0x1F, 0x1F, this.legacyPathClassType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7LegacyPaths(legacyPathType=", this.legacyPathType, ", age=", this.age, ", description=");
        u9.x(stringBuilder0, this.description, ", enabledByDefault=", this.enabledByDefault, ", legacyPathClassType=");
        return e.i(stringBuilder0, this.legacyPathClassType, ", name=", this.name, ")");
    }
}

