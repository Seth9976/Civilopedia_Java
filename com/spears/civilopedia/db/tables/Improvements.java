package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\be\n\u0002\u0010\u0000\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B\u00A1\u0003\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\f\u0012\u0006\u0010\u0010\u001A\u00020\u0005\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001A\u00020\u0002\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001A\u00020\f\u0012\u0006\u0010\u0016\u001A\u00020\f\u0012\u0006\u0010\u0017\u001A\u00020\u0005\u0012\u0006\u0010\u0018\u001A\u00020\f\u0012\u0006\u0010\u0019\u001A\u00020\u0005\u0012\u0006\u0010\u001A\u001A\u00020\u0005\u0012\u0006\u0010\u001B\u001A\u00020\u0005\u0012\u0006\u0010\u001C\u001A\u00020\u0005\u0012\u0006\u0010\u001D\u001A\u00020\f\u0012\u0006\u0010\u001E\u001A\u00020\f\u0012\u0006\u0010\u001F\u001A\u00020\f\u0012\b\u0010 \u001A\u0004\u0018\u00010\f\u0012\u0006\u0010!\u001A\u00020\u0005\u0012\b\u0010\"\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001A\u00020\f\u0012\u0006\u0010$\u001A\u00020\f\u0012\u0006\u0010%\u001A\u00020\f\u0012\u0006\u0010&\u001A\u00020\u0005\u0012\u0006\u0010\'\u001A\u00020\f\u0012\u0006\u0010(\u001A\u00020\f\u0012\u0006\u0010)\u001A\u00020\u0002\u0012\u0006\u0010*\u001A\u00020\u0005\u0012\u0006\u0010+\u001A\u00020\u0005\u0012\u0006\u0010,\u001A\u00020\f\u0012\u0006\u0010-\u001A\u00020\u0005\u0012\b\u0010.\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010/\u001A\u00020\u0005\u0012\u0006\u00100\u001A\u00020\u0005\u0012\u0006\u00101\u001A\u00020\u0005\u0012\u0006\u00102\u001A\u00020\u0005\u0012\u0006\u00103\u001A\u00020\u0005\u0012\u0006\u00104\u001A\u00020\u0005\u0012\u0006\u00105\u001A\u00020\u0005\u00A2\u0006\u0004\b6\u00107J\u000F\u00108\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b:\u00109J\u0010\u0010;\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b;\u00109J\u0010\u0010<\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u0012\u0010>\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b>\u00109J\u0012\u0010?\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b?\u00109J\u0010\u0010@\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b@\u0010=J\u0012\u0010A\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bA\u00109J\u0010\u0010B\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bB\u0010=J\u0010\u0010C\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bE\u00109J\u0010\u0010F\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bF\u0010DJ\u0010\u0010G\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bG\u0010=J\u0012\u0010H\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\bJ\u0010IJ\u0010\u0010K\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bK\u00109J\u0012\u0010L\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bL\u00109J\u0010\u0010M\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bM\u0010DJ\u0010\u0010N\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bN\u0010DJ\u0010\u0010O\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bO\u0010=J\u0010\u0010P\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bP\u0010DJ\u0010\u0010Q\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bQ\u0010=J\u0010\u0010R\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bR\u0010=J\u0010\u0010S\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bS\u0010=J\u0010\u0010T\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bT\u0010=J\u0010\u0010U\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bU\u0010DJ\u0010\u0010V\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bV\u0010DJ\u0010\u0010W\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bW\u0010DJ\u0012\u0010X\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\bX\u0010IJ\u0010\u0010Y\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bY\u0010=J\u0012\u0010Z\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bZ\u00109J\u0010\u0010[\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b[\u0010DJ\u0010\u0010\\\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\\\u0010DJ\u0010\u0010]\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b]\u0010DJ\u0010\u0010^\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b^\u0010=J\u0010\u0010_\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b_\u0010DJ\u0010\u0010`\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b`\u0010DJ\u0010\u0010a\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\ba\u00109J\u0010\u0010b\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bb\u0010=J\u0010\u0010c\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bc\u0010=J\u0010\u0010d\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\bd\u0010DJ\u0010\u0010e\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\be\u0010=J\u0012\u0010f\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bf\u00109J\u0010\u0010g\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bg\u0010=J\u0010\u0010h\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bh\u0010=J\u0010\u0010i\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bi\u0010=J\u0010\u0010j\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bj\u0010=J\u0010\u0010k\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bk\u0010=J\u0010\u0010l\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bl\u0010=J\u0010\u0010m\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bm\u0010=J\u008C\u0004\u0010n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001A\u00020\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\u00052\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001A\u00020\u00022\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001A\u00020\f2\b\b\u0002\u0010\u0016\u001A\u00020\f2\b\b\u0002\u0010\u0017\u001A\u00020\u00052\b\b\u0002\u0010\u0018\u001A\u00020\f2\b\b\u0002\u0010\u0019\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u00052\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\f2\b\b\u0002\u0010\u001E\u001A\u00020\f2\b\b\u0002\u0010\u001F\u001A\u00020\f2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010!\u001A\u00020\u00052\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001A\u00020\f2\b\b\u0002\u0010$\u001A\u00020\f2\b\b\u0002\u0010%\u001A\u00020\f2\b\b\u0002\u0010&\u001A\u00020\u00052\b\b\u0002\u0010\'\u001A\u00020\f2\b\b\u0002\u0010(\u001A\u00020\f2\b\b\u0002\u0010)\u001A\u00020\u00022\b\b\u0002\u0010*\u001A\u00020\u00052\b\b\u0002\u0010+\u001A\u00020\u00052\b\b\u0002\u0010,\u001A\u00020\f2\b\b\u0002\u0010-\u001A\u00020\u00052\n\b\u0002\u0010.\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010/\u001A\u00020\u00052\b\b\u0002\u00100\u001A\u00020\u00052\b\b\u0002\u00101\u001A\u00020\u00052\b\b\u0002\u00102\u001A\u00020\u00052\b\b\u0002\u00103\u001A\u00020\u00052\b\b\u0002\u00104\u001A\u00020\u00052\b\b\u0002\u00105\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bp\u00109J\u0010\u0010q\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\bq\u0010DJ\u001A\u0010t\u001A\u00020\u00052\b\u0010s\u001A\u0004\u0018\u00010rH\u00D6\u0003\u00A2\u0006\u0004\bt\u0010uR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010v\u001A\u0004\bw\u00109R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010v\u001A\u0004\bx\u00109R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010y\u001A\u0004\bz\u0010=R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010v\u001A\u0004\b{\u00109R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010v\u001A\u0004\b|\u00109R\u0017\u0010\t\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\t\u0010y\u001A\u0004\b}\u0010=R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010v\u001A\u0004\b~\u00109R\u0017\u0010\u000B\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010y\u001A\u0004\b\u007F\u0010=R\u0019\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\r\u0010\u0080\u0001\u001A\u0005\b\u0081\u0001\u0010DR\u0018\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\r\n\u0004\b\u000E\u0010v\u001A\u0005\b\u0082\u0001\u00109R\u0019\u0010\u000F\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u000F\u0010\u0080\u0001\u001A\u0005\b\u0083\u0001\u0010DR\u0018\u0010\u0010\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b\u0010\u0010y\u001A\u0005\b\u0084\u0001\u0010=R\u001B\u0010\u0011\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u0011\u0010\u0085\u0001\u001A\u0005\b\u0086\u0001\u0010IR\u001B\u0010\u0012\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u0012\u0010\u0085\u0001\u001A\u0005\b\u0087\u0001\u0010IR\u0018\u0010\u0013\u001A\u00020\u00028\u0006\u00A2\u0006\r\n\u0004\b\u0013\u0010v\u001A\u0005\b\u0088\u0001\u00109R\u001A\u0010\u0014\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\r\n\u0004\b\u0014\u0010v\u001A\u0005\b\u0089\u0001\u00109R\u0019\u0010\u0015\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u0015\u0010\u0080\u0001\u001A\u0005\b\u008A\u0001\u0010DR\u0019\u0010\u0016\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u0016\u0010\u0080\u0001\u001A\u0005\b\u008B\u0001\u0010DR\u0018\u0010\u0017\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b\u0017\u0010y\u001A\u0005\b\u008C\u0001\u0010=R\u0019\u0010\u0018\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u0018\u0010\u0080\u0001\u001A\u0005\b\u008D\u0001\u0010DR\u0018\u0010\u0019\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b\u0019\u0010y\u001A\u0005\b\u008E\u0001\u0010=R\u0018\u0010\u001A\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b\u001A\u0010y\u001A\u0005\b\u008F\u0001\u0010=R\u0018\u0010\u001B\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b\u001B\u0010y\u001A\u0005\b\u0090\u0001\u0010=R\u0018\u0010\u001C\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b\u001C\u0010y\u001A\u0005\b\u0091\u0001\u0010=R\u0019\u0010\u001D\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u001D\u0010\u0080\u0001\u001A\u0005\b\u0092\u0001\u0010DR\u0019\u0010\u001E\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u001E\u0010\u0080\u0001\u001A\u0005\b\u0093\u0001\u0010DR\u0019\u0010\u001F\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\u001F\u0010\u0080\u0001\u001A\u0005\b\u0094\u0001\u0010DR\u001B\u0010 \u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\u000E\n\u0005\b \u0010\u0085\u0001\u001A\u0005\b\u0095\u0001\u0010IR\u0018\u0010!\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b!\u0010y\u001A\u0005\b\u0096\u0001\u0010=R\u001A\u0010\"\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\r\n\u0004\b\"\u0010v\u001A\u0005\b\u0097\u0001\u00109R\u0019\u0010#\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b#\u0010\u0080\u0001\u001A\u0005\b\u0098\u0001\u0010DR\u0019\u0010$\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b$\u0010\u0080\u0001\u001A\u0005\b\u0099\u0001\u0010DR\u0019\u0010%\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b%\u0010\u0080\u0001\u001A\u0005\b\u009A\u0001\u0010DR\u0018\u0010&\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b&\u0010y\u001A\u0005\b\u009B\u0001\u0010=R\u0019\u0010\'\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b\'\u0010\u0080\u0001\u001A\u0005\b\u009C\u0001\u0010DR\u0019\u0010(\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b(\u0010\u0080\u0001\u001A\u0005\b\u009D\u0001\u0010DR\u0018\u0010)\u001A\u00020\u00028\u0006\u00A2\u0006\r\n\u0004\b)\u0010v\u001A\u0005\b\u009E\u0001\u00109R\u0018\u0010*\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b*\u0010y\u001A\u0005\b\u009F\u0001\u0010=R\u0018\u0010+\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b+\u0010y\u001A\u0005\b\u00A0\u0001\u0010=R\u0019\u0010,\u001A\u00020\f8\u0006\u00A2\u0006\u000E\n\u0005\b,\u0010\u0080\u0001\u001A\u0005\b\u00A1\u0001\u0010DR\u0018\u0010-\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b-\u0010y\u001A\u0005\b\u00A2\u0001\u0010=R\u001A\u0010.\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\r\n\u0004\b.\u0010v\u001A\u0005\b\u00A3\u0001\u00109R\u0018\u0010/\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b/\u0010y\u001A\u0005\b\u00A4\u0001\u0010=R\u0018\u00100\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b0\u0010y\u001A\u0005\b\u00A5\u0001\u0010=R\u0018\u00101\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b1\u0010y\u001A\u0005\b\u00A6\u0001\u0010=R\u0018\u00102\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b2\u0010y\u001A\u0005\b\u00A7\u0001\u0010=R\u0018\u00103\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b3\u0010y\u001A\u0005\b\u00A8\u0001\u0010=R\u0018\u00104\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b4\u0010y\u001A\u0005\b\u00A9\u0001\u0010=R\u0018\u00105\u001A\u00020\u00058\u0006\u00A2\u0006\r\n\u0004\b5\u0010y\u001A\u0005\b\u00AA\u0001\u0010=\u00A8\u0006\u00AB\u0001"}, d2 = {"Lcom/spears/civilopedia/db/tables/Improvements;", "Lo2/m;", "", "improvementType", "name", "", "barbarianCamp", "prereqTech", "prereqCivic", "buildable", "description", "removeOnEntry", "", "dispersalGold", "plunderType", "plunderAmount", "goody", "tilesPerGoody", "goodyRange", "icon", "traitType", "housing", "tilesRequired", "sameAdjacentValid", "requiresRiver", "enforceTerrain", "buildInLine", "canBuildOutsideTerritory", "buildOnFrontier", "airSlots", "defenseModifier", "grantFortification", "minimumAppeal", "coast", "yieldFromAppeal", "weaponSlots", "religiousUnitHealRate", "appeal", "onePerCity", "yieldFromAppealPercent", "validAdjacentTerrainAmount", "domain", "adjacentSeaResource", "requiresAdjacentBonusOrLuxury", "movementChange", "workable", "improvementOnRemove", "goodyNotify", "noAdjacentSpecialtyDistrict", "requiresAdjacentLuxury", "adjacentToLand", "removable", "onlyOpenBorders", "capturable", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZILjava/lang/String;IZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIZIZZZZIIILjava/lang/Integer;ZLjava/lang/String;IIIZIILjava/lang/String;ZZIZLjava/lang/String;ZZZZZZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "component11", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZILjava/lang/String;IZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIZIZZZZIIILjava/lang/Integer;ZLjava/lang/String;IIIZIILjava/lang/String;ZZIZLjava/lang/String;ZZZZZZZ)Lcom/spears/civilopedia/db/tables/Improvements;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImprovementType", "getName", "Z", "getBarbarianCamp", "getPrereqTech", "getPrereqCivic", "getBuildable", "getDescription", "getRemoveOnEntry", "I", "getDispersalGold", "getPlunderType", "getPlunderAmount", "getGoody", "Ljava/lang/Integer;", "getTilesPerGoody", "getGoodyRange", "getIcon", "getTraitType", "getHousing", "getTilesRequired", "getSameAdjacentValid", "getRequiresRiver", "getEnforceTerrain", "getBuildInLine", "getCanBuildOutsideTerritory", "getBuildOnFrontier", "getAirSlots", "getDefenseModifier", "getGrantFortification", "getMinimumAppeal", "getCoast", "getYieldFromAppeal", "getWeaponSlots", "getReligiousUnitHealRate", "getAppeal", "getOnePerCity", "getYieldFromAppealPercent", "getValidAdjacentTerrainAmount", "getDomain", "getAdjacentSeaResource", "getRequiresAdjacentBonusOrLuxury", "getMovementChange", "getWorkable", "getImprovementOnRemove", "getGoodyNotify", "getNoAdjacentSpecialtyDistrict", "getRequiresAdjacentLuxury", "getAdjacentToLand", "getRemovable", "getOnlyOpenBorders", "getCapturable", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Improvements implements m {
    private final boolean adjacentSeaResource;
    private final boolean adjacentToLand;
    private final int airSlots;
    private final int appeal;
    private final boolean barbarianCamp;
    private final boolean buildInLine;
    private final boolean buildOnFrontier;
    private final boolean buildable;
    private final boolean canBuildOutsideTerritory;
    private final boolean capturable;
    private final boolean coast;
    private final int defenseModifier;
    private final String description;
    private final int dispersalGold;
    private final String domain;
    private final boolean enforceTerrain;
    private final boolean goody;
    private final boolean goodyNotify;
    private final Integer goodyRange;
    private final int grantFortification;
    private final int housing;
    private final String icon;
    private final String improvementOnRemove;
    private final String improvementType;
    private final Integer minimumAppeal;
    private final int movementChange;
    private final String name;
    private final boolean noAdjacentSpecialtyDistrict;
    private final boolean onePerCity;
    private final boolean onlyOpenBorders;
    private final int plunderAmount;
    private final String plunderType;
    private final String prereqCivic;
    private final String prereqTech;
    private final int religiousUnitHealRate;
    private final boolean removable;
    private final boolean removeOnEntry;
    private final boolean requiresAdjacentBonusOrLuxury;
    private final boolean requiresAdjacentLuxury;
    private final int requiresRiver;
    private final boolean sameAdjacentValid;
    private final Integer tilesPerGoody;
    private final int tilesRequired;
    private final String traitType;
    private final int validAdjacentTerrainAmount;
    private final int weaponSlots;
    private final boolean workable;
    private final String yieldFromAppeal;
    private final int yieldFromAppealPercent;

    public Improvements(String s, String s1, boolean z, String s2, String s3, boolean z1, String s4, boolean z2, int v, String s5, int v1, boolean z3, Integer integer0, Integer integer1, String s6, String s7, int v2, int v3, boolean z4, int v4, boolean z5, boolean z6, boolean z7, boolean z8, int v5, int v6, int v7, Integer integer2, boolean z9, String s8, int v8, int v9, int v10, boolean z10, int v11, int v12, String s9, boolean z11, boolean z12, int v13, boolean z13, String s10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        j.f(s, "improvementType");
        j.f(s1, "name");
        j.f(s5, "plunderType");
        j.f(s6, "icon");
        j.f(s9, "domain");
        super();
        this.improvementType = s;
        this.name = s1;
        this.barbarianCamp = z;
        this.prereqTech = s2;
        this.prereqCivic = s3;
        this.buildable = z1;
        this.description = s4;
        this.removeOnEntry = z2;
        this.dispersalGold = v;
        this.plunderType = s5;
        this.plunderAmount = v1;
        this.goody = z3;
        this.tilesPerGoody = integer0;
        this.goodyRange = integer1;
        this.icon = s6;
        this.traitType = s7;
        this.housing = v2;
        this.tilesRequired = v3;
        this.sameAdjacentValid = z4;
        this.requiresRiver = v4;
        this.enforceTerrain = z5;
        this.buildInLine = z6;
        this.canBuildOutsideTerritory = z7;
        this.buildOnFrontier = z8;
        this.airSlots = v5;
        this.defenseModifier = v6;
        this.grantFortification = v7;
        this.minimumAppeal = integer2;
        this.coast = z9;
        this.yieldFromAppeal = s8;
        this.weaponSlots = v8;
        this.religiousUnitHealRate = v9;
        this.appeal = v10;
        this.onePerCity = z10;
        this.yieldFromAppealPercent = v11;
        this.validAdjacentTerrainAmount = v12;
        this.domain = s9;
        this.adjacentSeaResource = z11;
        this.requiresAdjacentBonusOrLuxury = z12;
        this.movementChange = v13;
        this.workable = z13;
        this.improvementOnRemove = s10;
        this.goodyNotify = z14;
        this.noAdjacentSpecialtyDistrict = z15;
        this.requiresAdjacentLuxury = z16;
        this.adjacentToLand = z17;
        this.removable = z18;
        this.onlyOpenBorders = z19;
        this.capturable = z20;
    }

    public final String component1() {
        return this.improvementType;
    }

    public final String component10() {
        return this.plunderType;
    }

    public final int component11() {
        return this.plunderAmount;
    }

    public final boolean component12() {
        return this.goody;
    }

    public final Integer component13() {
        return this.tilesPerGoody;
    }

    public final Integer component14() {
        return this.goodyRange;
    }

    public final String component15() {
        return this.icon;
    }

    public final String component16() {
        return this.traitType;
    }

    public final int component17() {
        return this.housing;
    }

    public final int component18() {
        return this.tilesRequired;
    }

    public final boolean component19() {
        return this.sameAdjacentValid;
    }

    public final String component2() {
        return this.name;
    }

    public final int component20() {
        return this.requiresRiver;
    }

    public final boolean component21() {
        return this.enforceTerrain;
    }

    public final boolean component22() {
        return this.buildInLine;
    }

    public final boolean component23() {
        return this.canBuildOutsideTerritory;
    }

    public final boolean component24() {
        return this.buildOnFrontier;
    }

    public final int component25() {
        return this.airSlots;
    }

    public final int component26() {
        return this.defenseModifier;
    }

    public final int component27() {
        return this.grantFortification;
    }

    public final Integer component28() {
        return this.minimumAppeal;
    }

    public final boolean component29() {
        return this.coast;
    }

    public final boolean component3() {
        return this.barbarianCamp;
    }

    public final String component30() {
        return this.yieldFromAppeal;
    }

    public final int component31() {
        return this.weaponSlots;
    }

    public final int component32() {
        return this.religiousUnitHealRate;
    }

    public final int component33() {
        return this.appeal;
    }

    public final boolean component34() {
        return this.onePerCity;
    }

    public final int component35() {
        return this.yieldFromAppealPercent;
    }

    public final int component36() {
        return this.validAdjacentTerrainAmount;
    }

    public final String component37() {
        return this.domain;
    }

    public final boolean component38() {
        return this.adjacentSeaResource;
    }

    public final boolean component39() {
        return this.requiresAdjacentBonusOrLuxury;
    }

    public final String component4() {
        return this.prereqTech;
    }

    public final int component40() {
        return this.movementChange;
    }

    public final boolean component41() {
        return this.workable;
    }

    public final String component42() {
        return this.improvementOnRemove;
    }

    public final boolean component43() {
        return this.goodyNotify;
    }

    public final boolean component44() {
        return this.noAdjacentSpecialtyDistrict;
    }

    public final boolean component45() {
        return this.requiresAdjacentLuxury;
    }

    public final boolean component46() {
        return this.adjacentToLand;
    }

    public final boolean component47() {
        return this.removable;
    }

    public final boolean component48() {
        return this.onlyOpenBorders;
    }

    public final boolean component49() {
        return this.capturable;
    }

    public final String component5() {
        return this.prereqCivic;
    }

    public final boolean component6() {
        return this.buildable;
    }

    public final String component7() {
        return this.description;
    }

    public final boolean component8() {
        return this.removeOnEntry;
    }

    public final int component9() {
        return this.dispersalGold;
    }

    public final Improvements copy(String s, String s1, boolean z, String s2, String s3, boolean z1, String s4, boolean z2, int v, String s5, int v1, boolean z3, Integer integer0, Integer integer1, String s6, String s7, int v2, int v3, boolean z4, int v4, boolean z5, boolean z6, boolean z7, boolean z8, int v5, int v6, int v7, Integer integer2, boolean z9, String s8, int v8, int v9, int v10, boolean z10, int v11, int v12, String s9, boolean z11, boolean z12, int v13, boolean z13, String s10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        j.f(s, "improvementType");
        j.f(s1, "name");
        j.f(s5, "plunderType");
        j.f(s6, "icon");
        j.f(s9, "domain");
        return new Improvements(s, s1, z, s2, s3, z1, s4, z2, v, s5, v1, z3, integer0, integer1, s6, s7, v2, v3, z4, v4, z5, z6, z7, z8, v5, v6, v7, integer2, z9, s8, v8, v9, v10, z10, v11, v12, s9, z11, z12, v13, z13, s10, z14, z15, z16, z17, z18, z19, z20);
    }

    public static Improvements copy$default(Improvements improvements0, String s, String s1, boolean z, String s2, String s3, boolean z1, String s4, boolean z2, int v, String s5, int v1, boolean z3, Integer integer0, Integer integer1, String s6, String s7, int v2, int v3, boolean z4, int v4, boolean z5, boolean z6, boolean z7, boolean z8, int v5, int v6, int v7, Integer integer2, boolean z9, String s8, int v8, int v9, int v10, boolean z10, int v11, int v12, String s9, boolean z11, boolean z12, int v13, boolean z13, String s10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, int v14, int v15, Object object0) {
        String s11 = (v14 & 1) == 0 ? s : improvements0.improvementType;
        String s12 = (v14 & 2) == 0 ? s1 : improvements0.name;
        boolean z21 = (v14 & 4) == 0 ? z : improvements0.barbarianCamp;
        String s13 = (v14 & 8) == 0 ? s2 : improvements0.prereqTech;
        String s14 = (v14 & 16) == 0 ? s3 : improvements0.prereqCivic;
        boolean z22 = (v14 & 0x20) == 0 ? z1 : improvements0.buildable;
        String s15 = (v14 & 0x40) == 0 ? s4 : improvements0.description;
        boolean z23 = (v14 & 0x80) == 0 ? z2 : improvements0.removeOnEntry;
        int v16 = (v14 & 0x100) == 0 ? v : improvements0.dispersalGold;
        String s16 = (v14 & 0x200) == 0 ? s5 : improvements0.plunderType;
        int v17 = (v14 & 0x400) == 0 ? v1 : improvements0.plunderAmount;
        boolean z24 = (v14 & 0x800) == 0 ? z3 : improvements0.goody;
        Integer integer3 = (v14 & 0x1000) == 0 ? integer0 : improvements0.tilesPerGoody;
        Integer integer4 = (v14 & 0x2000) == 0 ? integer1 : improvements0.goodyRange;
        String s17 = (v14 & 0x4000) == 0 ? s6 : improvements0.icon;
        String s18 = (v14 & 0x8000) == 0 ? s7 : improvements0.traitType;
        int v18 = (v14 & 0x10000) == 0 ? v2 : improvements0.housing;
        int v19 = (v14 & 0x20000) == 0 ? v3 : improvements0.tilesRequired;
        boolean z25 = (v14 & 0x40000) == 0 ? z4 : improvements0.sameAdjacentValid;
        int v20 = (v14 & 0x80000) == 0 ? v4 : improvements0.requiresRiver;
        boolean z26 = (v14 & 0x100000) == 0 ? z5 : improvements0.enforceTerrain;
        boolean z27 = (v14 & 0x200000) == 0 ? z6 : improvements0.buildInLine;
        boolean z28 = (v14 & 0x400000) == 0 ? z7 : improvements0.canBuildOutsideTerritory;
        boolean z29 = (v14 & 0x800000) == 0 ? z8 : improvements0.buildOnFrontier;
        int v21 = (v14 & 0x1000000) == 0 ? v5 : improvements0.airSlots;
        int v22 = (v14 & 0x2000000) == 0 ? v6 : improvements0.defenseModifier;
        int v23 = (v14 & 0x4000000) == 0 ? v7 : improvements0.grantFortification;
        Integer integer5 = (v14 & 0x8000000) == 0 ? integer2 : improvements0.minimumAppeal;
        boolean z30 = (v14 & 0x10000000) == 0 ? z9 : improvements0.coast;
        String s19 = (v14 & 0x20000000) == 0 ? s8 : improvements0.yieldFromAppeal;
        int v24 = (v14 & 0x40000000) == 0 ? v8 : improvements0.weaponSlots;
        int v25 = (v14 & 0x80000000) == 0 ? v9 : improvements0.religiousUnitHealRate;
        int v26 = (v15 & 1) == 0 ? v10 : improvements0.appeal;
        boolean z31 = (v15 & 2) == 0 ? z10 : improvements0.onePerCity;
        int v27 = (v15 & 4) == 0 ? v11 : improvements0.yieldFromAppealPercent;
        int v28 = (v15 & 8) == 0 ? v12 : improvements0.validAdjacentTerrainAmount;
        String s20 = (v15 & 16) == 0 ? s9 : improvements0.domain;
        boolean z32 = (v15 & 0x20) == 0 ? z11 : improvements0.adjacentSeaResource;
        boolean z33 = (v15 & 0x40) == 0 ? z12 : improvements0.requiresAdjacentBonusOrLuxury;
        int v29 = (v15 & 0x80) == 0 ? v13 : improvements0.movementChange;
        boolean z34 = (v15 & 0x100) == 0 ? z13 : improvements0.workable;
        String s21 = (v15 & 0x200) == 0 ? s10 : improvements0.improvementOnRemove;
        boolean z35 = (v15 & 0x400) == 0 ? z14 : improvements0.goodyNotify;
        boolean z36 = (v15 & 0x800) == 0 ? z15 : improvements0.noAdjacentSpecialtyDistrict;
        boolean z37 = (v15 & 0x1000) == 0 ? z16 : improvements0.requiresAdjacentLuxury;
        boolean z38 = (v15 & 0x2000) == 0 ? z17 : improvements0.adjacentToLand;
        boolean z39 = (v15 & 0x4000) == 0 ? z18 : improvements0.removable;
        boolean z40 = (v15 & 0x8000) == 0 ? z19 : improvements0.onlyOpenBorders;
        return (v15 & 0x10000) == 0 ? improvements0.copy(s11, s12, z21, s13, s14, z22, s15, z23, v16, s16, v17, z24, integer3, integer4, s17, s18, v18, v19, z25, v20, z26, z27, z28, z29, v21, v22, v23, integer5, z30, s19, v24, v25, v26, z31, v27, v28, s20, z32, z33, v29, z34, s21, z35, z36, z37, z38, z39, z40, z20) : improvements0.copy(s11, s12, z21, s13, s14, z22, s15, z23, v16, s16, v17, z24, integer3, integer4, s17, s18, v18, v19, z25, v20, z26, z27, z28, z29, v21, v22, v23, integer5, z30, s19, v24, v25, v26, z31, v27, v28, s20, z32, z33, v29, z34, s21, z35, z36, z37, z38, z39, z40, improvements0.capturable);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Improvements)) {
            return false;
        }
        Improvements improvements0 = (Improvements)object0;
        if(!j.a(this.improvementType, improvements0.improvementType)) {
            return false;
        }
        if(!j.a(this.name, improvements0.name)) {
            return false;
        }
        if(this.barbarianCamp != improvements0.barbarianCamp) {
            return false;
        }
        if(!j.a(this.prereqTech, improvements0.prereqTech)) {
            return false;
        }
        if(!j.a(this.prereqCivic, improvements0.prereqCivic)) {
            return false;
        }
        if(this.buildable != improvements0.buildable) {
            return false;
        }
        if(!j.a(this.description, improvements0.description)) {
            return false;
        }
        if(this.removeOnEntry != improvements0.removeOnEntry) {
            return false;
        }
        if(this.dispersalGold != improvements0.dispersalGold) {
            return false;
        }
        if(!j.a(this.plunderType, improvements0.plunderType)) {
            return false;
        }
        if(this.plunderAmount != improvements0.plunderAmount) {
            return false;
        }
        if(this.goody != improvements0.goody) {
            return false;
        }
        if(!j.a(this.tilesPerGoody, improvements0.tilesPerGoody)) {
            return false;
        }
        if(!j.a(this.goodyRange, improvements0.goodyRange)) {
            return false;
        }
        if(!j.a(this.icon, improvements0.icon)) {
            return false;
        }
        if(!j.a(this.traitType, improvements0.traitType)) {
            return false;
        }
        if(this.housing != improvements0.housing) {
            return false;
        }
        if(this.tilesRequired != improvements0.tilesRequired) {
            return false;
        }
        if(this.sameAdjacentValid != improvements0.sameAdjacentValid) {
            return false;
        }
        if(this.requiresRiver != improvements0.requiresRiver) {
            return false;
        }
        if(this.enforceTerrain != improvements0.enforceTerrain) {
            return false;
        }
        if(this.buildInLine != improvements0.buildInLine) {
            return false;
        }
        if(this.canBuildOutsideTerritory != improvements0.canBuildOutsideTerritory) {
            return false;
        }
        if(this.buildOnFrontier != improvements0.buildOnFrontier) {
            return false;
        }
        if(this.airSlots != improvements0.airSlots) {
            return false;
        }
        if(this.defenseModifier != improvements0.defenseModifier) {
            return false;
        }
        if(this.grantFortification != improvements0.grantFortification) {
            return false;
        }
        if(!j.a(this.minimumAppeal, improvements0.minimumAppeal)) {
            return false;
        }
        if(this.coast != improvements0.coast) {
            return false;
        }
        if(!j.a(this.yieldFromAppeal, improvements0.yieldFromAppeal)) {
            return false;
        }
        if(this.weaponSlots != improvements0.weaponSlots) {
            return false;
        }
        if(this.religiousUnitHealRate != improvements0.religiousUnitHealRate) {
            return false;
        }
        if(this.appeal != improvements0.appeal) {
            return false;
        }
        if(this.onePerCity != improvements0.onePerCity) {
            return false;
        }
        if(this.yieldFromAppealPercent != improvements0.yieldFromAppealPercent) {
            return false;
        }
        if(this.validAdjacentTerrainAmount != improvements0.validAdjacentTerrainAmount) {
            return false;
        }
        if(!j.a(this.domain, improvements0.domain)) {
            return false;
        }
        if(this.adjacentSeaResource != improvements0.adjacentSeaResource) {
            return false;
        }
        if(this.requiresAdjacentBonusOrLuxury != improvements0.requiresAdjacentBonusOrLuxury) {
            return false;
        }
        if(this.movementChange != improvements0.movementChange) {
            return false;
        }
        if(this.workable != improvements0.workable) {
            return false;
        }
        if(!j.a(this.improvementOnRemove, improvements0.improvementOnRemove)) {
            return false;
        }
        if(this.goodyNotify != improvements0.goodyNotify) {
            return false;
        }
        if(this.noAdjacentSpecialtyDistrict != improvements0.noAdjacentSpecialtyDistrict) {
            return false;
        }
        if(this.requiresAdjacentLuxury != improvements0.requiresAdjacentLuxury) {
            return false;
        }
        if(this.adjacentToLand != improvements0.adjacentToLand) {
            return false;
        }
        if(this.removable != improvements0.removable) {
            return false;
        }
        return this.onlyOpenBorders == improvements0.onlyOpenBorders ? this.capturable == improvements0.capturable : false;
    }

    public final boolean getAdjacentSeaResource() {
        return this.adjacentSeaResource;
    }

    public final boolean getAdjacentToLand() {
        return this.adjacentToLand;
    }

    public final int getAirSlots() {
        return this.airSlots;
    }

    public final int getAppeal() {
        return this.appeal;
    }

    public final boolean getBarbarianCamp() {
        return this.barbarianCamp;
    }

    public final boolean getBuildInLine() {
        return this.buildInLine;
    }

    public final boolean getBuildOnFrontier() {
        return this.buildOnFrontier;
    }

    public final boolean getBuildable() {
        return this.buildable;
    }

    public final boolean getCanBuildOutsideTerritory() {
        return this.canBuildOutsideTerritory;
    }

    public final boolean getCapturable() {
        return this.capturable;
    }

    public final boolean getCoast() {
        return this.coast;
    }

    public final int getDefenseModifier() {
        return this.defenseModifier;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDispersalGold() {
        return this.dispersalGold;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final boolean getEnforceTerrain() {
        return this.enforceTerrain;
    }

    public final boolean getGoody() {
        return this.goody;
    }

    public final boolean getGoodyNotify() {
        return this.goodyNotify;
    }

    public final Integer getGoodyRange() {
        return this.goodyRange;
    }

    public final int getGrantFortification() {
        return this.grantFortification;
    }

    public final int getHousing() {
        return this.housing;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImprovementOnRemove() {
        return this.improvementOnRemove;
    }

    public final String getImprovementType() {
        return this.improvementType;
    }

    public final Integer getMinimumAppeal() {
        return this.minimumAppeal;
    }

    public final int getMovementChange() {
        return this.movementChange;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNoAdjacentSpecialtyDistrict() {
        return this.noAdjacentSpecialtyDistrict;
    }

    public final boolean getOnePerCity() {
        return this.onePerCity;
    }

    public final boolean getOnlyOpenBorders() {
        return this.onlyOpenBorders;
    }

    public final int getPlunderAmount() {
        return this.plunderAmount;
    }

    public final String getPlunderType() {
        return this.plunderType;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final int getReligiousUnitHealRate() {
        return this.religiousUnitHealRate;
    }

    public final boolean getRemovable() {
        return this.removable;
    }

    public final boolean getRemoveOnEntry() {
        return this.removeOnEntry;
    }

    public final boolean getRequiresAdjacentBonusOrLuxury() {
        return this.requiresAdjacentBonusOrLuxury;
    }

    public final boolean getRequiresAdjacentLuxury() {
        return this.requiresAdjacentLuxury;
    }

    public final int getRequiresRiver() {
        return this.requiresRiver;
    }

    public final boolean getSameAdjacentValid() {
        return this.sameAdjacentValid;
    }

    public final Integer getTilesPerGoody() {
        return this.tilesPerGoody;
    }

    public final int getTilesRequired() {
        return this.tilesRequired;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    public final int getValidAdjacentTerrainAmount() {
        return this.validAdjacentTerrainAmount;
    }

    public final int getWeaponSlots() {
        return this.weaponSlots;
    }

    public final boolean getWorkable() {
        return this.workable;
    }

    public final String getYieldFromAppeal() {
        return this.yieldFromAppeal;
    }

    public final int getYieldFromAppealPercent() {
        return this.yieldFromAppealPercent;
    }

    // 去混淆评级： 低(30)
    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = 0;
        int v2 = (((f.b((((((((((((((((((((((f.b(((((f.b((((((((f.b(this.improvementType.hashCode() * 0x1F, 0x1F, this.name) + (this.barbarianCamp ? 0x4CF : 0x4D5)) * 0x1F + (this.prereqTech == null ? 0 : this.prereqTech.hashCode())) * 0x1F + (this.prereqCivic == null ? 0 : this.prereqCivic.hashCode())) * 0x1F + (this.buildable ? 0x4CF : 0x4D5)) * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.removeOnEntry ? 0x4CF : 0x4D5)) * 0x1F + this.dispersalGold) * 0x1F, 0x1F, this.plunderType) + this.plunderAmount) * 0x1F + (this.goody ? 0x4CF : 0x4D5)) * 0x1F + (this.tilesPerGoody == null ? 0 : this.tilesPerGoody.hashCode())) * 0x1F + (this.goodyRange == null ? 0 : this.goodyRange.hashCode())) * 0x1F, 0x1F, this.icon) + (this.traitType == null ? 0 : this.traitType.hashCode())) * 0x1F + this.housing) * 0x1F + this.tilesRequired) * 0x1F + (this.sameAdjacentValid ? 0x4CF : 0x4D5)) * 0x1F + this.requiresRiver) * 0x1F + (this.enforceTerrain ? 0x4CF : 0x4D5)) * 0x1F + (this.buildInLine ? 0x4CF : 0x4D5)) * 0x1F + (this.canBuildOutsideTerritory ? 0x4CF : 0x4D5)) * 0x1F + (this.buildOnFrontier ? 0x4CF : 0x4D5)) * 0x1F + this.airSlots) * 0x1F + this.defenseModifier) * 0x1F + this.grantFortification) * 0x1F + (this.minimumAppeal == null ? 0 : this.minimumAppeal.hashCode())) * 0x1F + (this.coast ? 0x4CF : 0x4D5)) * 0x1F + (this.yieldFromAppeal == null ? 0 : this.yieldFromAppeal.hashCode())) * 0x1F + this.weaponSlots) * 0x1F + this.religiousUnitHealRate) * 0x1F + this.appeal) * 0x1F + (this.onePerCity ? 0x4CF : 0x4D5)) * 0x1F + this.yieldFromAppealPercent) * 0x1F + this.validAdjacentTerrainAmount) * 0x1F, 0x1F, this.domain) + (this.adjacentSeaResource ? 0x4CF : 0x4D5)) * 0x1F + (this.requiresAdjacentBonusOrLuxury ? 0x4CF : 0x4D5)) * 0x1F + this.movementChange) * 0x1F;
        int v3 = this.workable ? 0x4CF : 0x4D5;
        String s = this.improvementOnRemove;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v4 = this.goodyNotify ? 0x4CF : 0x4D5;
        int v5 = this.noAdjacentSpecialtyDistrict ? 0x4CF : 0x4D5;
        int v6 = this.requiresAdjacentLuxury ? 0x4CF : 0x4D5;
        int v7 = this.adjacentToLand ? 0x4CF : 0x4D5;
        int v8 = this.removable ? 0x4CF : 0x4D5;
        int v9 = this.onlyOpenBorders ? 0x4CF : 0x4D5;
        if(this.capturable) {
            v = 0x4CF;
        }
        return ((((((((v2 + v3) * 0x1F + v1) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.improvementType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Improvements(improvementType=", this.improvementType, ", name=", this.name, ", barbarianCamp=");
        u9.z(stringBuilder0, this.barbarianCamp, ", prereqTech=", this.prereqTech, ", prereqCivic=");
        u9.x(stringBuilder0, this.prereqCivic, ", buildable=", this.buildable, ", description=");
        u9.x(stringBuilder0, this.description, ", removeOnEntry=", this.removeOnEntry, ", dispersalGold=");
        f.r(stringBuilder0, this.dispersalGold, ", plunderType=", this.plunderType, ", plunderAmount=");
        u9.r(stringBuilder0, this.plunderAmount, ", goody=", this.goody, ", tilesPerGoody=");
        u9.w(stringBuilder0, this.tilesPerGoody, ", goodyRange=", this.goodyRange, ", icon=");
        f.t(stringBuilder0, this.icon, ", traitType=", this.traitType, ", housing=");
        f.q(stringBuilder0, this.housing, ", tilesRequired=", this.tilesRequired, ", sameAdjacentValid=");
        u9.y(stringBuilder0, this.sameAdjacentValid, ", requiresRiver=", this.requiresRiver, ", enforceTerrain=");
        u9.A(stringBuilder0, this.enforceTerrain, ", buildInLine=", this.buildInLine, ", canBuildOutsideTerritory=");
        u9.A(stringBuilder0, this.canBuildOutsideTerritory, ", buildOnFrontier=", this.buildOnFrontier, ", airSlots=");
        f.q(stringBuilder0, this.airSlots, ", defenseModifier=", this.defenseModifier, ", grantFortification=");
        stringBuilder0.append(this.grantFortification);
        stringBuilder0.append(", minimumAppeal=");
        stringBuilder0.append(this.minimumAppeal);
        stringBuilder0.append(", coast=");
        u9.z(stringBuilder0, this.coast, ", yieldFromAppeal=", this.yieldFromAppeal, ", weaponSlots=");
        f.q(stringBuilder0, this.weaponSlots, ", religiousUnitHealRate=", this.religiousUnitHealRate, ", appeal=");
        u9.r(stringBuilder0, this.appeal, ", onePerCity=", this.onePerCity, ", yieldFromAppealPercent=");
        f.q(stringBuilder0, this.yieldFromAppealPercent, ", validAdjacentTerrainAmount=", this.validAdjacentTerrainAmount, ", domain=");
        u9.x(stringBuilder0, this.domain, ", adjacentSeaResource=", this.adjacentSeaResource, ", requiresAdjacentBonusOrLuxury=");
        u9.y(stringBuilder0, this.requiresAdjacentBonusOrLuxury, ", movementChange=", this.movementChange, ", workable=");
        u9.z(stringBuilder0, this.workable, ", improvementOnRemove=", this.improvementOnRemove, ", goodyNotify=");
        u9.A(stringBuilder0, this.goodyNotify, ", noAdjacentSpecialtyDistrict=", this.noAdjacentSpecialtyDistrict, ", requiresAdjacentLuxury=");
        u9.A(stringBuilder0, this.requiresAdjacentLuxury, ", adjacentToLand=", this.adjacentToLand, ", removable=");
        u9.A(stringBuilder0, this.removable, ", onlyOpenBorders=", this.onlyOpenBorders, ", capturable=");
        return u9.g(stringBuilder0, this.capturable, ")");
    }
}

