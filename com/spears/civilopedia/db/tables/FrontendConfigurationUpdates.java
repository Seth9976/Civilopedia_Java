package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\n\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0002\u0010\fJ\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\nH\u00C6\u0003J\t\u0010\u001E\u001A\u00020\nH\u00C6\u0003J]\u0010\u001F\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u00C6\u0001J\u0013\u0010 \u001A\u00020\n2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010\"\u001A\u00020#H\u00D6\u0001J\t\u0010$\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\t\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0010R\u0011\u0010\u000B\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010R\u0011\u0010\b\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0010\u00A8\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendConfigurationUpdates;", "", "key1", "", "key2", "sourceGroup", "sourceKey", "targetGroup", "targetKey", "hash", "", "static", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getHash", "()Z", "getKey1", "()Ljava/lang/String;", "getKey2", "getSourceGroup", "getSourceKey", "getStatic", "getTargetGroup", "getTargetKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendConfigurationUpdates {
    private final boolean hash;
    private final String key1;
    private final String key2;
    private final String sourceGroup;
    private final String sourceKey;
    private final boolean static;
    private final String targetGroup;
    private final String targetKey;

    public FrontendConfigurationUpdates(String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1) {
        j.f(s2, "sourceGroup");
        j.f(s3, "sourceKey");
        j.f(s4, "targetGroup");
        j.f(s5, "targetKey");
        super();
        this.key1 = s;
        this.key2 = s1;
        this.sourceGroup = s2;
        this.sourceKey = s3;
        this.targetGroup = s4;
        this.targetKey = s5;
        this.hash = z;
        this.static = z1;
    }

    public final String component1() {
        return this.key1;
    }

    public final String component2() {
        return this.key2;
    }

    public final String component3() {
        return this.sourceGroup;
    }

    public final String component4() {
        return this.sourceKey;
    }

    public final String component5() {
        return this.targetGroup;
    }

    public final String component6() {
        return this.targetKey;
    }

    public final boolean component7() {
        return this.hash;
    }

    public final boolean component8() {
        return this.static;
    }

    public final FrontendConfigurationUpdates copy(String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1) {
        j.f(s2, "sourceGroup");
        j.f(s3, "sourceKey");
        j.f(s4, "targetGroup");
        j.f(s5, "targetKey");
        return new FrontendConfigurationUpdates(s, s1, s2, s3, s4, s5, z, z1);
    }

    public static FrontendConfigurationUpdates copy$default(FrontendConfigurationUpdates frontendConfigurationUpdates0, String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1, int v, Object object0) {
        String s6 = (v & 1) == 0 ? s : frontendConfigurationUpdates0.key1;
        String s7 = (v & 2) == 0 ? s1 : frontendConfigurationUpdates0.key2;
        String s8 = (v & 4) == 0 ? s2 : frontendConfigurationUpdates0.sourceGroup;
        String s9 = (v & 8) == 0 ? s3 : frontendConfigurationUpdates0.sourceKey;
        String s10 = (v & 16) == 0 ? s4 : frontendConfigurationUpdates0.targetGroup;
        String s11 = (v & 0x20) == 0 ? s5 : frontendConfigurationUpdates0.targetKey;
        boolean z2 = (v & 0x40) == 0 ? z : frontendConfigurationUpdates0.hash;
        return (v & 0x80) == 0 ? frontendConfigurationUpdates0.copy(s6, s7, s8, s9, s10, s11, z2, z1) : frontendConfigurationUpdates0.copy(s6, s7, s8, s9, s10, s11, z2, frontendConfigurationUpdates0.static);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendConfigurationUpdates)) {
            return false;
        }
        if(!j.a(this.key1, ((FrontendConfigurationUpdates)object0).key1)) {
            return false;
        }
        if(!j.a(this.key2, ((FrontendConfigurationUpdates)object0).key2)) {
            return false;
        }
        if(!j.a(this.sourceGroup, ((FrontendConfigurationUpdates)object0).sourceGroup)) {
            return false;
        }
        if(!j.a(this.sourceKey, ((FrontendConfigurationUpdates)object0).sourceKey)) {
            return false;
        }
        if(!j.a(this.targetGroup, ((FrontendConfigurationUpdates)object0).targetGroup)) {
            return false;
        }
        if(!j.a(this.targetKey, ((FrontendConfigurationUpdates)object0).targetKey)) {
            return false;
        }
        return this.hash == ((FrontendConfigurationUpdates)object0).hash ? this.static == ((FrontendConfigurationUpdates)object0).static : false;
    }

    public final boolean getHash() {
        return this.hash;
    }

    public final String getKey1() {
        return this.key1;
    }

    public final String getKey2() {
        return this.key2;
    }

    public final String getSourceGroup() {
        return this.sourceGroup;
    }

    public final String getSourceKey() {
        return this.sourceKey;
    }

    public final boolean getStatic() {
        return this.static;
    }

    public final String getTargetGroup() {
        return this.targetGroup;
    }

    public final String getTargetKey() {
        return this.targetKey;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.key1 == null ? 0 : this.key1.hashCode();
        String s = this.key2;
        if(s != null) {
            v = s.hashCode();
        }
        int v2 = f.b(f.b(f.b(f.b((v1 * 0x1F + v) * 0x1F, 0x1F, this.sourceGroup), 0x1F, this.sourceKey), 0x1F, this.targetGroup), 0x1F, this.targetKey);
        int v3 = 0x4D5;
        int v4 = this.hash ? 0x4CF : 0x4D5;
        if(this.static) {
            v3 = 0x4CF;
        }
        return (v2 + v4) * 0x1F + v3;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendConfigurationUpdates(key1=", this.key1, ", key2=", this.key2, ", sourceGroup=");
        f.t(stringBuilder0, this.sourceGroup, ", sourceKey=", this.sourceKey, ", targetGroup=");
        f.t(stringBuilder0, this.targetGroup, ", targetKey=", this.targetKey, ", hash=");
        stringBuilder0.append(this.hash);
        stringBuilder0.append(", static=");
        stringBuilder0.append(this.static);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

