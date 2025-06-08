package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u001A\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\f\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0006H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\fH\u00C6\u0003J_\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\fH\u00C6\u0001J\u0013\u0010\"\u001A\u00020\f2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010$\u001A\u00020\u0006H\u00D6\u0001J\t\u0010%\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000FR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000FR\u0011\u0010\n\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000FR\u0011\u0010\u000B\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018\u00A8\u0006&"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Movies;", "", "locale", "", "movieType", "resolution", "", "audio", "stopAudio", "subtitles", "url", "useCoverFitMode", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAudio", "()Ljava/lang/String;", "getLocale", "getMovieType", "getResolution", "()I", "getStopAudio", "getSubtitles", "getUrl", "getUseCoverFitMode", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Movies {
    private final String audio;
    private final String locale;
    private final String movieType;
    private final int resolution;
    private final String stopAudio;
    private final String subtitles;
    private final String url;
    private final boolean useCoverFitMode;

    public Civ7Movies(String s, String s1, int v, String s2, String s3, String s4, String s5, boolean z) {
        j.f(s, "locale");
        j.f(s1, "movieType");
        j.f(s5, "url");
        super();
        this.locale = s;
        this.movieType = s1;
        this.resolution = v;
        this.audio = s2;
        this.stopAudio = s3;
        this.subtitles = s4;
        this.url = s5;
        this.useCoverFitMode = z;
    }

    public final String component1() {
        return this.locale;
    }

    public final String component2() {
        return this.movieType;
    }

    public final int component3() {
        return this.resolution;
    }

    public final String component4() {
        return this.audio;
    }

    public final String component5() {
        return this.stopAudio;
    }

    public final String component6() {
        return this.subtitles;
    }

    public final String component7() {
        return this.url;
    }

    public final boolean component8() {
        return this.useCoverFitMode;
    }

    public final Civ7Movies copy(String s, String s1, int v, String s2, String s3, String s4, String s5, boolean z) {
        j.f(s, "locale");
        j.f(s1, "movieType");
        j.f(s5, "url");
        return new Civ7Movies(s, s1, v, s2, s3, s4, s5, z);
    }

    public static Civ7Movies copy$default(Civ7Movies civ7Movies0, String s, String s1, int v, String s2, String s3, String s4, String s5, boolean z, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : civ7Movies0.locale;
        String s7 = (v1 & 2) == 0 ? s1 : civ7Movies0.movieType;
        int v2 = (v1 & 4) == 0 ? v : civ7Movies0.resolution;
        String s8 = (v1 & 8) == 0 ? s2 : civ7Movies0.audio;
        String s9 = (v1 & 16) == 0 ? s3 : civ7Movies0.stopAudio;
        String s10 = (v1 & 0x20) == 0 ? s4 : civ7Movies0.subtitles;
        String s11 = (v1 & 0x40) == 0 ? s5 : civ7Movies0.url;
        return (v1 & 0x80) == 0 ? civ7Movies0.copy(s6, s7, v2, s8, s9, s10, s11, z) : civ7Movies0.copy(s6, s7, v2, s8, s9, s10, s11, civ7Movies0.useCoverFitMode);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Movies)) {
            return false;
        }
        if(!j.a(this.locale, ((Civ7Movies)object0).locale)) {
            return false;
        }
        if(!j.a(this.movieType, ((Civ7Movies)object0).movieType)) {
            return false;
        }
        if(this.resolution != ((Civ7Movies)object0).resolution) {
            return false;
        }
        if(!j.a(this.audio, ((Civ7Movies)object0).audio)) {
            return false;
        }
        if(!j.a(this.stopAudio, ((Civ7Movies)object0).stopAudio)) {
            return false;
        }
        if(!j.a(this.subtitles, ((Civ7Movies)object0).subtitles)) {
            return false;
        }
        return j.a(this.url, ((Civ7Movies)object0).url) ? this.useCoverFitMode == ((Civ7Movies)object0).useCoverFitMode : false;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getMovieType() {
        return this.movieType;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public final String getStopAudio() {
        return this.stopAudio;
    }

    public final String getSubtitles() {
        return this.subtitles;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseCoverFitMode() {
        return this.useCoverFitMode;
    }

    @Override
    public int hashCode() {
        int v = (f.b(this.locale.hashCode() * 0x1F, 0x1F, this.movieType) + this.resolution) * 0x1F;
        int v1 = 0;
        int v2 = this.audio == null ? 0 : this.audio.hashCode();
        int v3 = this.stopAudio == null ? 0 : this.stopAudio.hashCode();
        String s = this.subtitles;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v4 = f.b((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F, 0x1F, this.url);
        return this.useCoverFitMode ? v4 + 0x4CF : v4 + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Movies(locale=", this.locale, ", movieType=", this.movieType, ", resolution=");
        f.r(stringBuilder0, this.resolution, ", audio=", this.audio, ", stopAudio=");
        f.t(stringBuilder0, this.stopAudio, ", subtitles=", this.subtitles, ", url=");
        stringBuilder0.append(this.url);
        stringBuilder0.append(", useCoverFitMode=");
        stringBuilder0.append(this.useCoverFitMode);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

