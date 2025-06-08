package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Constructible_RoleIcons;", "", "constructibleType", "", "iconPath", "context", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConstructibleType", "()Ljava/lang/String;", "getContext", "getIconPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Constructible_RoleIcons {
    private final String constructibleType;
    private final String context;
    private final String iconPath;

    public Civ7Constructible_RoleIcons(String s, String s1, String s2) {
        j.f(s, "constructibleType");
        j.f(s1, "iconPath");
        super();
        this.constructibleType = s;
        this.iconPath = s1;
        this.context = s2;
    }

    public final String component1() {
        return this.constructibleType;
    }

    public final String component2() {
        return this.iconPath;
    }

    public final String component3() {
        return this.context;
    }

    public final Civ7Constructible_RoleIcons copy(String s, String s1, String s2) {
        j.f(s, "constructibleType");
        j.f(s1, "iconPath");
        return new Civ7Constructible_RoleIcons(s, s1, s2);
    }

    public static Civ7Constructible_RoleIcons copy$default(Civ7Constructible_RoleIcons civ7Constructible_RoleIcons0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Constructible_RoleIcons0.constructibleType;
        }
        if((v & 2) != 0) {
            s1 = civ7Constructible_RoleIcons0.iconPath;
        }
        if((v & 4) != 0) {
            s2 = civ7Constructible_RoleIcons0.context;
        }
        return civ7Constructible_RoleIcons0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Constructible_RoleIcons)) {
            return false;
        }
        if(!j.a(this.constructibleType, ((Civ7Constructible_RoleIcons)object0).constructibleType)) {
            return false;
        }
        return j.a(this.iconPath, ((Civ7Constructible_RoleIcons)object0).iconPath) ? j.a(this.context, ((Civ7Constructible_RoleIcons)object0).context) : false;
    }

    public final String getConstructibleType() {
        return this.constructibleType;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.constructibleType.hashCode() * 0x1F, 0x1F, this.iconPath);
        return this.context == null ? v : v + this.context.hashCode();
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7Constructible_RoleIcons(constructibleType=", this.constructibleType, ", iconPath=", this.iconPath, ", context="), this.context, ")");
    }
}

