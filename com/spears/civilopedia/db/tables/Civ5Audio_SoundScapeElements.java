package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJP\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\u0005HÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0015\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\t\u0010\u000BR\u0015\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\r\u0010\u000BR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Audio_SoundScapeElements;", "", "scriptID", "", "soundScapeIndex", "", "scriptType", "minTimeMustNotPlayAgain", "maxTimeMustNotPlayAgain", "isSoundBed", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxTimeMustNotPlayAgain", "getMinTimeMustNotPlayAgain", "getScriptID", "()Ljava/lang/String;", "getScriptType", "getSoundScapeIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Audio_SoundScapeElements;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Audio_SoundScapeElements {
    private final Integer isSoundBed;
    private final Integer maxTimeMustNotPlayAgain;
    private final Integer minTimeMustNotPlayAgain;
    private final String scriptID;
    private final String scriptType;
    private final int soundScapeIndex;

    public Civ5Audio_SoundScapeElements(String s, int v, String s1, Integer integer0, Integer integer1, Integer integer2) {
        j.f(s, "scriptID");
        j.f(s1, "scriptType");
        super();
        this.scriptID = s;
        this.soundScapeIndex = v;
        this.scriptType = s1;
        this.minTimeMustNotPlayAgain = integer0;
        this.maxTimeMustNotPlayAgain = integer1;
        this.isSoundBed = integer2;
    }

    public final String component1() {
        return this.scriptID;
    }

    public final int component2() {
        return this.soundScapeIndex;
    }

    public final String component3() {
        return this.scriptType;
    }

    public final Integer component4() {
        return this.minTimeMustNotPlayAgain;
    }

    public final Integer component5() {
        return this.maxTimeMustNotPlayAgain;
    }

    public final Integer component6() {
        return this.isSoundBed;
    }

    public final Civ5Audio_SoundScapeElements copy(String s, int v, String s1, Integer integer0, Integer integer1, Integer integer2) {
        j.f(s, "scriptID");
        j.f(s1, "scriptType");
        return new Civ5Audio_SoundScapeElements(s, v, s1, integer0, integer1, integer2);
    }

    public static Civ5Audio_SoundScapeElements copy$default(Civ5Audio_SoundScapeElements civ5Audio_SoundScapeElements0, String s, int v, String s1, Integer integer0, Integer integer1, Integer integer2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5Audio_SoundScapeElements0.scriptID;
        }
        if((v1 & 2) != 0) {
            v = civ5Audio_SoundScapeElements0.soundScapeIndex;
        }
        if((v1 & 4) != 0) {
            s1 = civ5Audio_SoundScapeElements0.scriptType;
        }
        if((v1 & 8) != 0) {
            integer0 = civ5Audio_SoundScapeElements0.minTimeMustNotPlayAgain;
        }
        if((v1 & 16) != 0) {
            integer1 = civ5Audio_SoundScapeElements0.maxTimeMustNotPlayAgain;
        }
        if((v1 & 0x20) != 0) {
            integer2 = civ5Audio_SoundScapeElements0.isSoundBed;
        }
        return civ5Audio_SoundScapeElements0.copy(s, v, s1, integer0, integer1, integer2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Audio_SoundScapeElements)) {
            return false;
        }
        if(!j.a(this.scriptID, ((Civ5Audio_SoundScapeElements)object0).scriptID)) {
            return false;
        }
        if(this.soundScapeIndex != ((Civ5Audio_SoundScapeElements)object0).soundScapeIndex) {
            return false;
        }
        if(!j.a(this.scriptType, ((Civ5Audio_SoundScapeElements)object0).scriptType)) {
            return false;
        }
        if(!j.a(this.minTimeMustNotPlayAgain, ((Civ5Audio_SoundScapeElements)object0).minTimeMustNotPlayAgain)) {
            return false;
        }
        return j.a(this.maxTimeMustNotPlayAgain, ((Civ5Audio_SoundScapeElements)object0).maxTimeMustNotPlayAgain) ? j.a(this.isSoundBed, ((Civ5Audio_SoundScapeElements)object0).isSoundBed) : false;
    }

    public final Integer getMaxTimeMustNotPlayAgain() {
        return this.maxTimeMustNotPlayAgain;
    }

    public final Integer getMinTimeMustNotPlayAgain() {
        return this.minTimeMustNotPlayAgain;
    }

    public final String getScriptID() {
        return this.scriptID;
    }

    public final String getScriptType() {
        return this.scriptType;
    }

    public final int getSoundScapeIndex() {
        return this.soundScapeIndex;
    }

    @Override
    public int hashCode() {
        int v = f.b((this.scriptID.hashCode() * 0x1F + this.soundScapeIndex) * 0x1F, 0x1F, this.scriptType);
        int v1 = 0;
        int v2 = this.minTimeMustNotPlayAgain == null ? 0 : this.minTimeMustNotPlayAgain.hashCode();
        int v3 = this.maxTimeMustNotPlayAgain == null ? 0 : this.maxTimeMustNotPlayAgain.hashCode();
        Integer integer0 = this.isSoundBed;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    public final Integer isSoundBed() {
        return this.isSoundBed;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.soundScapeIndex, "Civ5Audio_SoundScapeElements(scriptID=", this.scriptID, ", soundScapeIndex=", ", scriptType=");
        u9.p(this.minTimeMustNotPlayAgain, this.scriptType, ", minTimeMustNotPlayAgain=", ", maxTimeMustNotPlayAgain=", stringBuilder0);
        stringBuilder0.append(this.maxTimeMustNotPlayAgain);
        stringBuilder0.append(", isSoundBed=");
        stringBuilder0.append(this.isSoundBed);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

