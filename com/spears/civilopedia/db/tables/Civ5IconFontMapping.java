package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5IconFontMapping;", "", "iconName", "", "iconMapping", "", "iconFontTexture", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getIconFontTexture", "()Ljava/lang/String;", "getIconMapping", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5IconFontMapping;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5IconFontMapping {
    private final String iconFontTexture;
    private final Integer iconMapping;
    private final String iconName;

    public Civ5IconFontMapping(String s, Integer integer0, String s1) {
        this.iconName = s;
        this.iconMapping = integer0;
        this.iconFontTexture = s1;
    }

    public final String component1() {
        return this.iconName;
    }

    public final Integer component2() {
        return this.iconMapping;
    }

    public final String component3() {
        return this.iconFontTexture;
    }

    public final Civ5IconFontMapping copy(String s, Integer integer0, String s1) {
        return new Civ5IconFontMapping(s, integer0, s1);
    }

    public static Civ5IconFontMapping copy$default(Civ5IconFontMapping civ5IconFontMapping0, String s, Integer integer0, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5IconFontMapping0.iconName;
        }
        if((v & 2) != 0) {
            integer0 = civ5IconFontMapping0.iconMapping;
        }
        if((v & 4) != 0) {
            s1 = civ5IconFontMapping0.iconFontTexture;
        }
        return civ5IconFontMapping0.copy(s, integer0, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5IconFontMapping)) {
            return false;
        }
        if(!j.a(this.iconName, ((Civ5IconFontMapping)object0).iconName)) {
            return false;
        }
        return j.a(this.iconMapping, ((Civ5IconFontMapping)object0).iconMapping) ? j.a(this.iconFontTexture, ((Civ5IconFontMapping)object0).iconFontTexture) : false;
    }

    public final String getIconFontTexture() {
        return this.iconFontTexture;
    }

    public final Integer getIconMapping() {
        return this.iconMapping;
    }

    public final String getIconName() {
        return this.iconName;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.iconName == null ? 0 : this.iconName.hashCode();
        int v2 = this.iconMapping == null ? 0 : this.iconMapping.hashCode();
        String s = this.iconFontTexture;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return e.h(u9.i("Civ5IconFontMapping(iconName=", this.iconName, ", iconMapping=", this.iconMapping, ", iconFontTexture="), this.iconFontTexture, ")");
    }
}

