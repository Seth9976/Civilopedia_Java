package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Audio_ScriptTypes;", "", "scriptType", "", "value", "", "(Ljava/lang/String;I)V", "getScriptType", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Audio_ScriptTypes {
    private final String scriptType;
    private final int value;

    public Civ5Audio_ScriptTypes(String s, int v) {
        this.scriptType = s;
        this.value = v;
    }

    public final String component1() {
        return this.scriptType;
    }

    public final int component2() {
        return this.value;
    }

    public final Civ5Audio_ScriptTypes copy(String s, int v) {
        return new Civ5Audio_ScriptTypes(s, v);
    }

    public static Civ5Audio_ScriptTypes copy$default(Civ5Audio_ScriptTypes civ5Audio_ScriptTypes0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Audio_ScriptTypes0.scriptType;
        }
        if((v1 & 2) != 0) {
            v = civ5Audio_ScriptTypes0.value;
        }
        return civ5Audio_ScriptTypes0.copy(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Audio_ScriptTypes)) {
            return false;
        }
        return j.a(this.scriptType, ((Civ5Audio_ScriptTypes)object0).scriptType) ? this.value == ((Civ5Audio_ScriptTypes)object0).value : false;
    }

    public final String getScriptType() {
        return this.scriptType;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.scriptType == null ? this.value : this.scriptType.hashCode() * 0x1F + this.value;
    }

    @Override
    public String toString() {
        return f.f(this.value, "Civ5Audio_ScriptTypes(scriptType=", this.scriptType, ", value=", ")");
    }
}

