package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\b\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\bH\u00C6\u0003J\t\u0010\u001E\u001A\u00020\bH\u00C6\u0003J\t\u0010\u001F\u001A\u00020\bH\u00C6\u0003J\t\u0010 \u001A\u00020\bH\u00C6\u0003J\t\u0010!\u001A\u00020\bH\u00C6\u0003Je\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\bH\u00C6\u0001J\u0013\u0010#\u001A\u00020$2\b\u0010%\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010&\u001A\u00020\bH\u00D6\u0001J\t\u0010\'\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u000B\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000FR\u0011\u0010\t\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000F\u00A8\u0006("}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMapSizes;", "", "domain", "", "mapSizeType", "name", "description", "minPlayers", "", "maxPlayers", "maxHumans", "defaultPlayers", "sortIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIII)V", "getDefaultPlayers", "()I", "getDescription", "()Ljava/lang/String;", "getDomain", "getMapSizeType", "getMaxHumans", "getMaxPlayers", "getMinPlayers", "getName", "getSortIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMapSizes {
    private final int defaultPlayers;
    private final String description;
    private final String domain;
    private final String mapSizeType;
    private final int maxHumans;
    private final int maxPlayers;
    private final int minPlayers;
    private final String name;
    private final int sortIndex;

    public FrontendMapSizes(String s, String s1, String s2, String s3, int v, int v1, int v2, int v3, int v4) {
        j.f(s, "domain");
        j.f(s1, "mapSizeType");
        j.f(s2, "name");
        super();
        this.domain = s;
        this.mapSizeType = s1;
        this.name = s2;
        this.description = s3;
        this.minPlayers = v;
        this.maxPlayers = v1;
        this.maxHumans = v2;
        this.defaultPlayers = v3;
        this.sortIndex = v4;
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.mapSizeType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final int component5() {
        return this.minPlayers;
    }

    public final int component6() {
        return this.maxPlayers;
    }

    public final int component7() {
        return this.maxHumans;
    }

    public final int component8() {
        return this.defaultPlayers;
    }

    public final int component9() {
        return this.sortIndex;
    }

    public final FrontendMapSizes copy(String s, String s1, String s2, String s3, int v, int v1, int v2, int v3, int v4) {
        j.f(s, "domain");
        j.f(s1, "mapSizeType");
        j.f(s2, "name");
        return new FrontendMapSizes(s, s1, s2, s3, v, v1, v2, v3, v4);
    }

    public static FrontendMapSizes copy$default(FrontendMapSizes frontendMapSizes0, String s, String s1, String s2, String s3, int v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        String s4 = (v5 & 1) == 0 ? s : frontendMapSizes0.domain;
        String s5 = (v5 & 2) == 0 ? s1 : frontendMapSizes0.mapSizeType;
        String s6 = (v5 & 4) == 0 ? s2 : frontendMapSizes0.name;
        String s7 = (v5 & 8) == 0 ? s3 : frontendMapSizes0.description;
        int v6 = (v5 & 16) == 0 ? v : frontendMapSizes0.minPlayers;
        int v7 = (v5 & 0x20) == 0 ? v1 : frontendMapSizes0.maxPlayers;
        int v8 = (v5 & 0x40) == 0 ? v2 : frontendMapSizes0.maxHumans;
        int v9 = (v5 & 0x80) == 0 ? v3 : frontendMapSizes0.defaultPlayers;
        return (v5 & 0x100) == 0 ? frontendMapSizes0.copy(s4, s5, s6, s7, v6, v7, v8, v9, v4) : frontendMapSizes0.copy(s4, s5, s6, s7, v6, v7, v8, v9, frontendMapSizes0.sortIndex);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendMapSizes)) {
            return false;
        }
        if(!j.a(this.domain, ((FrontendMapSizes)object0).domain)) {
            return false;
        }
        if(!j.a(this.mapSizeType, ((FrontendMapSizes)object0).mapSizeType)) {
            return false;
        }
        if(!j.a(this.name, ((FrontendMapSizes)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((FrontendMapSizes)object0).description)) {
            return false;
        }
        if(this.minPlayers != ((FrontendMapSizes)object0).minPlayers) {
            return false;
        }
        if(this.maxPlayers != ((FrontendMapSizes)object0).maxPlayers) {
            return false;
        }
        if(this.maxHumans != ((FrontendMapSizes)object0).maxHumans) {
            return false;
        }
        return this.defaultPlayers == ((FrontendMapSizes)object0).defaultPlayers ? this.sortIndex == ((FrontendMapSizes)object0).sortIndex : false;
    }

    public final int getDefaultPlayers() {
        return this.defaultPlayers;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getMapSizeType() {
        return this.mapSizeType;
    }

    public final int getMaxHumans() {
        return this.maxHumans;
    }

    public final int getMaxPlayers() {
        return this.maxPlayers;
    }

    public final int getMinPlayers() {
        return this.minPlayers;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.domain.hashCode() * 0x1F, 0x1F, this.mapSizeType), 0x1F, this.name);
        return this.description == null ? ((((v * 0x1F + this.minPlayers) * 0x1F + this.maxPlayers) * 0x1F + this.maxHumans) * 0x1F + this.defaultPlayers) * 0x1F + this.sortIndex : (((((v + this.description.hashCode()) * 0x1F + this.minPlayers) * 0x1F + this.maxPlayers) * 0x1F + this.maxHumans) * 0x1F + this.defaultPlayers) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendMapSizes(domain=", this.domain, ", mapSizeType=", this.mapSizeType, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", minPlayers=");
        f.q(stringBuilder0, this.minPlayers, ", maxPlayers=", this.maxPlayers, ", maxHumans=");
        f.q(stringBuilder0, this.maxHumans, ", defaultPlayers=", this.defaultPlayers, ", sortIndex=");
        return e.g(stringBuilder0, this.sortIndex, ")");
    }
}

