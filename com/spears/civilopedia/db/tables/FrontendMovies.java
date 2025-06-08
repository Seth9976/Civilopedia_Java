package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u001A\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000B\u001A\u00020\f\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0005H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\fH\u00C6\u0003J_\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000B\u001A\u00020\fH\u00C6\u0001J\u0013\u0010\"\u001A\u00020\f2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010$\u001A\u00020\u0005H\u00D6\u0001J\t\u0010%\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000FR\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000FR\u0011\u0010\u000B\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018\u00A8\u0006&"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendMovies;", "", "movieType", "", "resolution", "", "locale", "url", "audio", "stopAudio", "subtitles", "useCoverFitMode", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAudio", "()Ljava/lang/String;", "getLocale", "getMovieType", "getResolution", "()I", "getStopAudio", "getSubtitles", "getUrl", "getUseCoverFitMode", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendMovies {
    private final String audio;
    private final String locale;
    private final String movieType;
    private final int resolution;
    private final String stopAudio;
    private final String subtitles;
    private final String url;
    private final boolean useCoverFitMode;

    public FrontendMovies(String s, int v, String s1, String s2, String s3, String s4, String s5, boolean z) {
        j.f(s, "movieType");
        j.f(s1, "locale");
        j.f(s2, "url");
        super();
        this.movieType = s;
        this.resolution = v;
        this.locale = s1;
        this.url = s2;
        this.audio = s3;
        this.stopAudio = s4;
        this.subtitles = s5;
        this.useCoverFitMode = z;
    }

    public final String component1() {
        return this.movieType;
    }

    public final int component2() {
        return this.resolution;
    }

    public final String component3() {
        return this.locale;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.audio;
    }

    public final String component6() {
        return this.stopAudio;
    }

    public final String component7() {
        return this.subtitles;
    }

    public final boolean component8() {
        return this.useCoverFitMode;
    }

    public final FrontendMovies copy(String s, int v, String s1, String s2, String s3, String s4, String s5, boolean z) {
        j.f(s, "movieType");
        j.f(s1, "locale");
        j.f(s2, "url");
        return new FrontendMovies(s, v, s1, s2, s3, s4, s5, z);
    }

    public static FrontendMovies copy$default(FrontendMovies frontendMovies0, String s, int v, String s1, String s2, String s3, String s4, String s5, boolean z, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : frontendMovies0.movieType;
        int v2 = (v1 & 2) == 0 ? v : frontendMovies0.resolution;
        String s7 = (v1 & 4) == 0 ? s1 : frontendMovies0.locale;
        String s8 = (v1 & 8) == 0 ? s2 : frontendMovies0.url;
        String s9 = (v1 & 16) == 0 ? s3 : frontendMovies0.audio;
        String s10 = (v1 & 0x20) == 0 ? s4 : frontendMovies0.stopAudio;
        String s11 = (v1 & 0x40) == 0 ? s5 : frontendMovies0.subtitles;
        return (v1 & 0x80) == 0 ? frontendMovies0.copy(s6, v2, s7, s8, s9, s10, s11, z) : frontendMovies0.copy(s6, v2, s7, s8, s9, s10, s11, frontendMovies0.useCoverFitMode);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendMovies)) {
            return false;
        }
        if(!j.a(this.movieType, ((FrontendMovies)object0).movieType)) {
            return false;
        }
        if(this.resolution != ((FrontendMovies)object0).resolution) {
            return false;
        }
        if(!j.a(this.locale, ((FrontendMovies)object0).locale)) {
            return false;
        }
        if(!j.a(this.url, ((FrontendMovies)object0).url)) {
            return false;
        }
        if(!j.a(this.audio, ((FrontendMovies)object0).audio)) {
            return false;
        }
        if(!j.a(this.stopAudio, ((FrontendMovies)object0).stopAudio)) {
            return false;
        }
        return j.a(this.subtitles, ((FrontendMovies)object0).subtitles) ? this.useCoverFitMode == ((FrontendMovies)object0).useCoverFitMode : false;
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
        int v = f.b(f.b((this.movieType.hashCode() * 0x1F + this.resolution) * 0x1F, 0x1F, this.locale), 0x1F, this.url);
        int v1 = 0;
        int v2 = this.audio == null ? 0 : this.audio.hashCode();
        int v3 = this.stopAudio == null ? 0 : this.stopAudio.hashCode();
        String s = this.subtitles;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.useCoverFitMode ? (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + 0x4CF : (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.resolution, "FrontendMovies(movieType=", this.movieType, ", resolution=", ", locale=");
        f.t(stringBuilder0, this.locale, ", url=", this.url, ", audio=");
        f.t(stringBuilder0, this.audio, ", stopAudio=", this.stopAudio, ", subtitles=");
        stringBuilder0.append(this.subtitles);
        stringBuilder0.append(", useCoverFitMode=");
        stringBuilder0.append(this.useCoverFitMode);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

