package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Audio_SoundScapeElementScripts;", "", "soundScapeScriptID", "", "soundScapeIndex", "", "scriptIndex", "scriptID", "(Ljava/lang/String;IILjava/lang/String;)V", "getScriptID", "()Ljava/lang/String;", "getScriptIndex", "()I", "getSoundScapeIndex", "getSoundScapeScriptID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Audio_SoundScapeElementScripts {
    private final String scriptID;
    private final int scriptIndex;
    private final int soundScapeIndex;
    private final String soundScapeScriptID;

    public Civ5Audio_SoundScapeElementScripts(String s, int v, int v1, String s1) {
        j.f(s, "soundScapeScriptID");
        j.f(s1, "scriptID");
        super();
        this.soundScapeScriptID = s;
        this.soundScapeIndex = v;
        this.scriptIndex = v1;
        this.scriptID = s1;
    }

    public final String component1() {
        return this.soundScapeScriptID;
    }

    public final int component2() {
        return this.soundScapeIndex;
    }

    public final int component3() {
        return this.scriptIndex;
    }

    public final String component4() {
        return this.scriptID;
    }

    public final Civ5Audio_SoundScapeElementScripts copy(String s, int v, int v1, String s1) {
        j.f(s, "soundScapeScriptID");
        j.f(s1, "scriptID");
        return new Civ5Audio_SoundScapeElementScripts(s, v, v1, s1);
    }

    public static Civ5Audio_SoundScapeElementScripts copy$default(Civ5Audio_SoundScapeElementScripts civ5Audio_SoundScapeElementScripts0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ5Audio_SoundScapeElementScripts0.soundScapeScriptID;
        }
        if((v2 & 2) != 0) {
            v = civ5Audio_SoundScapeElementScripts0.soundScapeIndex;
        }
        if((v2 & 4) != 0) {
            v1 = civ5Audio_SoundScapeElementScripts0.scriptIndex;
        }
        if((v2 & 8) != 0) {
            s1 = civ5Audio_SoundScapeElementScripts0.scriptID;
        }
        return civ5Audio_SoundScapeElementScripts0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Audio_SoundScapeElementScripts)) {
            return false;
        }
        if(!j.a(this.soundScapeScriptID, ((Civ5Audio_SoundScapeElementScripts)object0).soundScapeScriptID)) {
            return false;
        }
        if(this.soundScapeIndex != ((Civ5Audio_SoundScapeElementScripts)object0).soundScapeIndex) {
            return false;
        }
        return this.scriptIndex == ((Civ5Audio_SoundScapeElementScripts)object0).scriptIndex ? j.a(this.scriptID, ((Civ5Audio_SoundScapeElementScripts)object0).scriptID) : false;
    }

    public final String getScriptID() {
        return this.scriptID;
    }

    public final int getScriptIndex() {
        return this.scriptIndex;
    }

    public final int getSoundScapeIndex() {
        return this.soundScapeIndex;
    }

    public final String getSoundScapeScriptID() {
        return this.soundScapeScriptID;
    }

    @Override
    public int hashCode() {
        return this.scriptID.hashCode() + ((this.soundScapeScriptID.hashCode() * 0x1F + this.soundScapeIndex) * 0x1F + this.scriptIndex) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.soundScapeIndex, "Civ5Audio_SoundScapeElementScripts(soundScapeScriptID=", this.soundScapeScriptID, ", soundScapeIndex=", ", scriptIndex="), this.scriptIndex, ", scriptID=", this.scriptID, ")");
    }
}

