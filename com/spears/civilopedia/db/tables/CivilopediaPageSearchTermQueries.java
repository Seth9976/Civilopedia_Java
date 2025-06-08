package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/CivilopediaPageSearchTermQueries;", "", "rowId", "", "SQL", "", "sectionIdColumn", "pageIdColumn", "searchTermColumn", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSQL", "()Ljava/lang/String;", "getPageIdColumn", "getRowId", "()I", "getSearchTermColumn", "getSectionIdColumn", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivilopediaPageSearchTermQueries {
    private final String SQL;
    private final String pageIdColumn;
    private final int rowId;
    private final String searchTermColumn;
    private final String sectionIdColumn;

    public CivilopediaPageSearchTermQueries(int v, String s, String s1, String s2, String s3) {
        j.f(s, "SQL");
        j.f(s1, "sectionIdColumn");
        j.f(s2, "pageIdColumn");
        j.f(s3, "searchTermColumn");
        super();
        this.rowId = v;
        this.SQL = s;
        this.sectionIdColumn = s1;
        this.pageIdColumn = s2;
        this.searchTermColumn = s3;
    }

    public final int component1() {
        return this.rowId;
    }

    public final String component2() {
        return this.SQL;
    }

    public final String component3() {
        return this.sectionIdColumn;
    }

    public final String component4() {
        return this.pageIdColumn;
    }

    public final String component5() {
        return this.searchTermColumn;
    }

    public final CivilopediaPageSearchTermQueries copy(int v, String s, String s1, String s2, String s3) {
        j.f(s, "SQL");
        j.f(s1, "sectionIdColumn");
        j.f(s2, "pageIdColumn");
        j.f(s3, "searchTermColumn");
        return new CivilopediaPageSearchTermQueries(v, s, s1, s2, s3);
    }

    public static CivilopediaPageSearchTermQueries copy$default(CivilopediaPageSearchTermQueries civilopediaPageSearchTermQueries0, int v, String s, String s1, String s2, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = civilopediaPageSearchTermQueries0.rowId;
        }
        if((v1 & 2) != 0) {
            s = civilopediaPageSearchTermQueries0.SQL;
        }
        if((v1 & 4) != 0) {
            s1 = civilopediaPageSearchTermQueries0.sectionIdColumn;
        }
        if((v1 & 8) != 0) {
            s2 = civilopediaPageSearchTermQueries0.pageIdColumn;
        }
        if((v1 & 16) != 0) {
            s3 = civilopediaPageSearchTermQueries0.searchTermColumn;
        }
        return civilopediaPageSearchTermQueries0.copy(v, s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CivilopediaPageSearchTermQueries)) {
            return false;
        }
        if(this.rowId != ((CivilopediaPageSearchTermQueries)object0).rowId) {
            return false;
        }
        if(!j.a(this.SQL, ((CivilopediaPageSearchTermQueries)object0).SQL)) {
            return false;
        }
        if(!j.a(this.sectionIdColumn, ((CivilopediaPageSearchTermQueries)object0).sectionIdColumn)) {
            return false;
        }
        return j.a(this.pageIdColumn, ((CivilopediaPageSearchTermQueries)object0).pageIdColumn) ? j.a(this.searchTermColumn, ((CivilopediaPageSearchTermQueries)object0).searchTermColumn) : false;
    }

    public final String getPageIdColumn() {
        return this.pageIdColumn;
    }

    public final int getRowId() {
        return this.rowId;
    }

    public final String getSQL() {
        return this.SQL;
    }

    public final String getSearchTermColumn() {
        return this.searchTermColumn;
    }

    public final String getSectionIdColumn() {
        return this.sectionIdColumn;
    }

    @Override
    public int hashCode() {
        return this.searchTermColumn.hashCode() + f.b(f.b(f.b(this.rowId * 0x1F, 0x1F, this.SQL), 0x1F, this.sectionIdColumn), 0x1F, this.pageIdColumn);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CivilopediaPageSearchTermQueries(rowId=");
        stringBuilder0.append(this.rowId);
        stringBuilder0.append(", SQL=");
        stringBuilder0.append(this.SQL);
        stringBuilder0.append(", sectionIdColumn=");
        f.t(stringBuilder0, this.sectionIdColumn, ", pageIdColumn=", this.pageIdColumn, ", searchTermColumn=");
        return e.h(stringBuilder0, this.searchTermColumn, ")");
    }
}

