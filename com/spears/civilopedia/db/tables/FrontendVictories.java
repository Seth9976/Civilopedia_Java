package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u00A2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0018\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\tH\u00C6\u0003J\t\u0010\u001D\u001A\u00020\tH\u00C6\u0003J\t\u0010\u001E\u001A\u00020\tH\u00C6\u0003J[\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\tH\u00C6\u0001J\u0013\u0010 \u001A\u00020\t2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010\"\u001A\u00020#H\u00D6\u0001J\t\u0010$\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u000B\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0011\u0010\n\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000ER\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0011\u00A8\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendVictories;", "", "domain", "", "victoryType", "name", "description", "icon", "visible", "", "readOnly", "enabledByDefault", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getDescription", "()Ljava/lang/String;", "getDomain", "getEnabledByDefault", "()Z", "getIcon", "getName", "getReadOnly", "getVictoryType", "getVisible", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendVictories {
    private final String description;
    private final String domain;
    private final boolean enabledByDefault;
    private final String icon;
    private final String name;
    private final boolean readOnly;
    private final String victoryType;
    private final boolean visible;

    public FrontendVictories(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, boolean z2) {
        j.f(s, "domain");
        j.f(s1, "victoryType");
        j.f(s2, "name");
        j.f(s3, "description");
        super();
        this.domain = s;
        this.victoryType = s1;
        this.name = s2;
        this.description = s3;
        this.icon = s4;
        this.visible = z;
        this.readOnly = z1;
        this.enabledByDefault = z2;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.victoryType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.icon;
    }

    public final boolean component6() {
        return this.visible;
    }

    public final boolean component7() {
        return this.readOnly;
    }

    public final boolean component8() {
        return this.enabledByDefault;
    }

    public final FrontendVictories copy(String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, boolean z2) {
        j.f(s, "domain");
        j.f(s1, "victoryType");
        j.f(s2, "name");
        j.f(s3, "description");
        return new FrontendVictories(s, s1, s2, s3, s4, z, z1, z2);
    }

    public static FrontendVictories copy$default(FrontendVictories frontendVictories0, String s, String s1, String s2, String s3, String s4, boolean z, boolean z1, boolean z2, int v, Object object0) {
        String s5 = (v & 1) == 0 ? s : frontendVictories0.domain;
        String s6 = (v & 2) == 0 ? s1 : frontendVictories0.victoryType;
        String s7 = (v & 4) == 0 ? s2 : frontendVictories0.name;
        String s8 = (v & 8) == 0 ? s3 : frontendVictories0.description;
        String s9 = (v & 16) == 0 ? s4 : frontendVictories0.icon;
        boolean z3 = (v & 0x20) == 0 ? z : frontendVictories0.visible;
        boolean z4 = (v & 0x40) == 0 ? z1 : frontendVictories0.readOnly;
        return (v & 0x80) == 0 ? frontendVictories0.copy(s5, s6, s7, s8, s9, z3, z4, z2) : frontendVictories0.copy(s5, s6, s7, s8, s9, z3, z4, frontendVictories0.enabledByDefault);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendVictories)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendVictories)object0).domain)) {
            return false;
        }
        if(!j.a(this.victoryType, ((FrontendVictories)object0).victoryType)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendVictories)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((FrontendVictories)object0).description)) {
            return false;
        }
        if(!j.a(this.icon, ((FrontendVictories)object0).icon)) {
            return false;
        }
        if(this.visible != ((FrontendVictories)object0).visible) {
            return false;
        }
        return this.readOnly == ((FrontendVictories)object0).readOnly ? this.enabledByDefault == ((FrontendVictories)object0).enabledByDefault : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final String getVictoryType() {
        return this.victoryType;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.victoryType), 0x1F, this.name), 0x1F, this.description);
        int v1 = this.icon == null ? 0 : this.icon.hashCode();
        int v2 = 0x4D5;
        int v3 = this.visible ? 0x4CF : 0x4D5;
        int v4 = this.readOnly ? 0x4CF : 0x4D5;
        if(this.enabledByDefault) {
            v2 = 0x4CF;
        }
        return (((v + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendVictories(domain=", this.domain, ", victoryType=", this.victoryType, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", icon=");
        u9.x(stringBuilder0, this.icon, ", visible=", this.visible, ", readOnly=");
        stringBuilder0.append(this.readOnly);
        stringBuilder0.append(", enabledByDefault=");
        stringBuilder0.append(this.enabledByDefault);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

