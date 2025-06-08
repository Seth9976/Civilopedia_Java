package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5ScannedFiles;", "", "path", "", "dateTime", "", "(Ljava/lang/String;I)V", "getDateTime", "()I", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5ScannedFiles {
    private final int dateTime;
    private final String path;

    public Civ5ScannedFiles(String s, int v) {
        j.f(s, "path");
        super();
        this.path = s;
        this.dateTime = v;
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.dateTime;
    }

    public final Civ5ScannedFiles copy(String s, int v) {
        j.f(s, "path");
        return new Civ5ScannedFiles(s, v);
    }

    public static Civ5ScannedFiles copy$default(Civ5ScannedFiles civ5ScannedFiles0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ5ScannedFiles0.path;
        }
        if((v1 & 2) != 0) {
            v = civ5ScannedFiles0.dateTime;
        }
        return civ5ScannedFiles0.copy(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5ScannedFiles)) {
            return false;
        }
        return j.a(this.path, ((Civ5ScannedFiles)object0).path) ? this.dateTime == ((Civ5ScannedFiles)object0).dateTime : false;
    }

    public final int getDateTime() {
        return this.dateTime;
    }

    public final String getPath() {
        return this.path;
    }

    @Override
    public int hashCode() {
        return this.path.hashCode() * 0x1F + this.dateTime;
    }

    @Override
    public String toString() {
        return f.f(this.dateTime, "Civ5ScannedFiles(path=", this.path, ", dateTime=", ")");
    }
}

