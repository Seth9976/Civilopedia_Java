package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000B\n\u0003\b\u0085\u0001\n\u0002\u0010\u0000\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001B\u00C3\u0004\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0005\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0012\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0010\u0012\u0006\u0010\u0014\u001A\u00020\u0010\u0012\u0006\u0010\u0015\u001A\u00020\u0010\u0012\u0006\u0010\u0016\u001A\u00020\u0010\u0012\u0006\u0010\u0017\u001A\u00020\u0005\u0012\u0006\u0010\u0018\u001A\u00020\u0005\u0012\u0006\u0010\u0019\u001A\u00020\u0005\u0012\u0006\u0010\u001A\u001A\u00020\u0005\u0012\u0006\u0010\u001B\u001A\u00020\u0005\u0012\u0006\u0010\u001C\u001A\u00020\u0010\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u001E\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001F\u001A\u00020\u0010\u0012\u0006\u0010 \u001A\u00020\u0010\u0012\b\u0010!\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\"\u001A\u00020\u0010\u0012\u0006\u0010#\u001A\u00020\u0002\u0012\u0006\u0010$\u001A\u00020\u0005\u0012\b\u0010%\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010&\u001A\u00020\u0005\u0012\u0006\u0010\'\u001A\u00020\u0005\u0012\b\u0010(\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010-\u001A\u00020\u0010\u0012\b\u0010.\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u00100\u001A\u00020\u0010\u0012\u0006\u00101\u001A\u00020\u0005\u0012\u0006\u00102\u001A\u00020\u0010\u0012\u0006\u00103\u001A\u00020\u0005\u0012\u0006\u00104\u001A\u00020\u0010\u0012\b\u00105\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u00106\u001A\u00020\u0010\u0012\u0006\u00107\u001A\u00020\u0005\u0012\u0006\u00108\u001A\u00020\u0010\u0012\u0006\u00109\u001A\u00020\u0010\u0012\u0006\u0010:\u001A\u00020\u0005\u0012\u0006\u0010;\u001A\u00020\u0010\u0012\u0006\u0010<\u001A\u00020\u0010\u0012\b\u0010=\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010?\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010B\u001A\u00020\u0010\u0012\u0006\u0010C\u001A\u00020\u0010\u0012\u0006\u0010D\u001A\u00020\u0005\u0012\u0006\u0010E\u001A\u00020\u0010\u0012\u0006\u0010F\u001A\u00020\u0010\u0012\u0006\u0010G\u001A\u00020\u0010\u00A2\u0006\u0004\bH\u0010IJ\u000F\u0010J\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bL\u0010KJ\u0010\u0010M\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bM\u0010KJ\u0010\u0010N\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bP\u0010OJ\u0010\u0010Q\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bQ\u0010OJ\u0010\u0010R\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bR\u0010OJ\u0010\u0010S\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bS\u0010OJ\u0010\u0010T\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bT\u0010OJ\u0010\u0010U\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bU\u0010KJ\u0010\u0010V\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bV\u0010KJ\u0010\u0010W\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bW\u0010OJ\u0012\u0010X\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b\\\u0010[J\u0010\u0010]\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b]\u0010[J\u0010\u0010^\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b^\u0010[J\u0010\u0010_\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b_\u0010[J\u0010\u0010`\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b`\u0010[J\u0010\u0010a\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\ba\u0010OJ\u0010\u0010b\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bb\u0010OJ\u0010\u0010c\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bc\u0010OJ\u0010\u0010d\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bd\u0010OJ\u0010\u0010e\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\be\u0010OJ\u0010\u0010f\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bf\u0010[J\u0012\u0010g\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bg\u0010KJ\u0012\u0010h\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bh\u0010KJ\u0010\u0010i\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bi\u0010[J\u0010\u0010j\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bj\u0010[J\u0012\u0010k\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bk\u0010KJ\u0010\u0010l\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bl\u0010[J\u0010\u0010m\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bm\u0010KJ\u0010\u0010n\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bn\u0010OJ\u0012\u0010o\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bo\u0010KJ\u0010\u0010p\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bp\u0010OJ\u0010\u0010q\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\bq\u0010OJ\u0012\u0010r\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\br\u0010KJ\u0012\u0010s\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bs\u0010KJ\u0012\u0010t\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bt\u0010KJ\u0012\u0010u\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\bu\u0010YJ\u0012\u0010v\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bv\u0010KJ\u0010\u0010w\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bw\u0010[J\u0012\u0010x\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\bx\u0010KJ\u0012\u0010y\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\by\u0010KJ\u0010\u0010z\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\bz\u0010[J\u0010\u0010{\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b{\u0010OJ\u0010\u0010|\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b|\u0010[J\u0010\u0010}\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b}\u0010OJ\u0010\u0010~\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b~\u0010[J\u0012\u0010\u007F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u007F\u0010KJ\u0012\u0010\u0080\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0080\u0001\u0010[J\u0012\u0010\u0081\u0001\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0005\b\u0081\u0001\u0010OJ\u0012\u0010\u0082\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0082\u0001\u0010[J\u0012\u0010\u0083\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0083\u0001\u0010[J\u0012\u0010\u0084\u0001\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0005\b\u0084\u0001\u0010OJ\u0012\u0010\u0085\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0085\u0001\u0010[J\u0012\u0010\u0086\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0086\u0001\u0010[J\u0014\u0010\u0087\u0001\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0005\b\u0087\u0001\u0010KJ\u0014\u0010\u0088\u0001\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0005\b\u0088\u0001\u0010KJ\u0014\u0010\u0089\u0001\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0005\b\u0089\u0001\u0010KJ\u0014\u0010\u008A\u0001\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0005\b\u008A\u0001\u0010KJ\u0014\u0010\u008B\u0001\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0005\b\u008B\u0001\u0010KJ\u0012\u0010\u008C\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u008C\u0001\u0010[J\u0012\u0010\u008D\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u008D\u0001\u0010[J\u0012\u0010\u008E\u0001\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0005\b\u008E\u0001\u0010OJ\u0012\u0010\u008F\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u008F\u0001\u0010[J\u0012\u0010\u0090\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0090\u0001\u0010[J\u0012\u0010\u0091\u0001\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0005\b\u0091\u0001\u0010[J\u00D5\u0005\u0010\u0092\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00052\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00102\b\b\u0002\u0010\u0014\u001A\u00020\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u00102\b\b\u0002\u0010\u0017\u001A\u00020\u00052\b\b\u0002\u0010\u0018\u001A\u00020\u00052\b\b\u0002\u0010\u0019\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u00052\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00102\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001F\u001A\u00020\u00102\b\b\u0002\u0010 \u001A\u00020\u00102\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001A\u00020\u00102\b\b\u0002\u0010#\u001A\u00020\u00022\b\b\u0002\u0010$\u001A\u00020\u00052\n\b\u0002\u0010%\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010&\u001A\u00020\u00052\b\b\u0002\u0010\'\u001A\u00020\u00052\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010-\u001A\u00020\u00102\n\b\u0002\u0010.\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u00100\u001A\u00020\u00102\b\b\u0002\u00101\u001A\u00020\u00052\b\b\u0002\u00102\u001A\u00020\u00102\b\b\u0002\u00103\u001A\u00020\u00052\b\b\u0002\u00104\u001A\u00020\u00102\n\b\u0002\u00105\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u00106\u001A\u00020\u00102\b\b\u0002\u00107\u001A\u00020\u00052\b\b\u0002\u00108\u001A\u00020\u00102\b\b\u0002\u00109\u001A\u00020\u00102\b\b\u0002\u0010:\u001A\u00020\u00052\b\b\u0002\u0010;\u001A\u00020\u00102\b\b\u0002\u0010<\u001A\u00020\u00102\n\b\u0002\u0010=\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010>\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010?\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010@\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010A\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010B\u001A\u00020\u00102\b\b\u0002\u0010C\u001A\u00020\u00102\b\b\u0002\u0010D\u001A\u00020\u00052\b\b\u0002\u0010E\u001A\u00020\u00102\b\b\u0002\u0010F\u001A\u00020\u00102\b\b\u0002\u0010G\u001A\u00020\u0010H\u00C6\u0001\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0012\u0010\u0094\u0001\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0005\b\u0094\u0001\u0010KJ\u0012\u0010\u0095\u0001\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0005\b\u0095\u0001\u0010OJ\u001F\u0010\u0098\u0001\u001A\u00020\u00102\n\u0010\u0097\u0001\u001A\u0005\u0018\u00010\u0096\u0001H\u00D6\u0003\u00A2\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u0003\u0010\u009A\u0001\u001A\u0005\b\u009B\u0001\u0010KR\u0019\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u0004\u0010\u009A\u0001\u001A\u0005\b\u009C\u0001\u0010KR\u0019\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u0006\u0010\u009D\u0001\u001A\u0005\b\u009E\u0001\u0010OR\u0019\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u0007\u0010\u009D\u0001\u001A\u0005\b\u009F\u0001\u0010OR\u0019\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\b\u0010\u009D\u0001\u001A\u0005\b\u00A0\u0001\u0010OR\u0019\u0010\t\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\t\u0010\u009D\u0001\u001A\u0005\b\u00A1\u0001\u0010OR\u0019\u0010\n\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\n\u0010\u009D\u0001\u001A\u0005\b\u00A2\u0001\u0010OR\u0019\u0010\u000B\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u000B\u0010\u009D\u0001\u001A\u0005\b\u00A3\u0001\u0010OR\u0019\u0010\f\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\f\u0010\u009A\u0001\u001A\u0005\b\u00A4\u0001\u0010KR\u0019\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\r\u0010\u009A\u0001\u001A\u0005\b\u00A5\u0001\u0010KR\u0019\u0010\u000E\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u000E\u0010\u009D\u0001\u001A\u0005\b\u00A6\u0001\u0010OR\u001B\u0010\u000F\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u000F\u0010\u00A7\u0001\u001A\u0005\b\u00A8\u0001\u0010YR\u0019\u0010\u0011\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u0011\u0010\u00A9\u0001\u001A\u0005\b\u00AA\u0001\u0010[R\u0019\u0010\u0012\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u0012\u0010\u00A9\u0001\u001A\u0005\b\u00AB\u0001\u0010[R\u0019\u0010\u0013\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u0013\u0010\u00A9\u0001\u001A\u0005\b\u00AC\u0001\u0010[R\u0019\u0010\u0014\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u0014\u0010\u00A9\u0001\u001A\u0005\b\u00AD\u0001\u0010[R\u0019\u0010\u0015\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u0015\u0010\u00A9\u0001\u001A\u0005\b\u00AE\u0001\u0010[R\u0019\u0010\u0016\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u0016\u0010\u00A9\u0001\u001A\u0005\b\u00AF\u0001\u0010[R\u0019\u0010\u0017\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u0017\u0010\u009D\u0001\u001A\u0005\b\u00B0\u0001\u0010OR\u0019\u0010\u0018\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u0018\u0010\u009D\u0001\u001A\u0005\b\u00B1\u0001\u0010OR\u0019\u0010\u0019\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u0019\u0010\u009D\u0001\u001A\u0005\b\u00B2\u0001\u0010OR\u0019\u0010\u001A\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u001A\u0010\u009D\u0001\u001A\u0005\b\u00B3\u0001\u0010OR\u0019\u0010\u001B\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\u001B\u0010\u009D\u0001\u001A\u0005\b\u00B4\u0001\u0010OR\u0019\u0010\u001C\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u001C\u0010\u00A9\u0001\u001A\u0005\b\u00B5\u0001\u0010[R\u001B\u0010\u001D\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u001D\u0010\u009A\u0001\u001A\u0005\b\u00B6\u0001\u0010KR\u001B\u0010\u001E\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u001E\u0010\u009A\u0001\u001A\u0005\b\u00B7\u0001\u0010KR\u0019\u0010\u001F\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u001F\u0010\u00A9\u0001\u001A\u0005\b\u00B8\u0001\u0010[R\u0019\u0010 \u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b \u0010\u00A9\u0001\u001A\u0005\b\u00B9\u0001\u0010[R\u001B\u0010!\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b!\u0010\u009A\u0001\u001A\u0005\b\u00BA\u0001\u0010KR\u0019\u0010\"\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\"\u0010\u00A9\u0001\u001A\u0005\b\u00BB\u0001\u0010[R\u0019\u0010#\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b#\u0010\u009A\u0001\u001A\u0005\b\u00BC\u0001\u0010KR\u0019\u0010$\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b$\u0010\u009D\u0001\u001A\u0005\b\u00BD\u0001\u0010OR\u001B\u0010%\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b%\u0010\u009A\u0001\u001A\u0005\b\u00BE\u0001\u0010KR\u0019\u0010&\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b&\u0010\u009D\u0001\u001A\u0005\b\u00BF\u0001\u0010OR\u0019\u0010\'\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b\'\u0010\u009D\u0001\u001A\u0005\b\u00C0\u0001\u0010OR\u001B\u0010(\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b(\u0010\u009A\u0001\u001A\u0005\b\u00C1\u0001\u0010KR\u001B\u0010)\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b)\u0010\u009A\u0001\u001A\u0005\b\u00C2\u0001\u0010KR\u001B\u0010*\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b*\u0010\u009A\u0001\u001A\u0005\b\u00C3\u0001\u0010KR\u001B\u0010+\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\u000E\n\u0005\b+\u0010\u00A7\u0001\u001A\u0005\b\u00C4\u0001\u0010YR\u001B\u0010,\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b,\u0010\u009A\u0001\u001A\u0005\b\u00C5\u0001\u0010KR\u0019\u0010-\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b-\u0010\u00A9\u0001\u001A\u0005\b\u00C6\u0001\u0010[R\u001B\u0010.\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b.\u0010\u009A\u0001\u001A\u0005\b\u00C7\u0001\u0010KR\u001B\u0010/\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b/\u0010\u009A\u0001\u001A\u0005\b\u00C8\u0001\u0010KR\u0019\u00100\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b0\u0010\u00A9\u0001\u001A\u0005\b\u00C9\u0001\u0010[R\u0019\u00101\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b1\u0010\u009D\u0001\u001A\u0005\b\u00CA\u0001\u0010OR\u0019\u00102\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b2\u0010\u00A9\u0001\u001A\u0005\b\u00CB\u0001\u0010[R\u0019\u00103\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b3\u0010\u009D\u0001\u001A\u0005\b\u00CC\u0001\u0010OR\u0019\u00104\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b4\u0010\u00A9\u0001\u001A\u0005\b\u00CD\u0001\u0010[R\u001B\u00105\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b5\u0010\u009A\u0001\u001A\u0005\b\u00CE\u0001\u0010KR\u0019\u00106\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b6\u0010\u00A9\u0001\u001A\u0005\b\u00CF\u0001\u0010[R\u0019\u00107\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b7\u0010\u009D\u0001\u001A\u0005\b\u00D0\u0001\u0010OR\u0019\u00108\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b8\u0010\u00A9\u0001\u001A\u0005\b\u00D1\u0001\u0010[R\u0019\u00109\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b9\u0010\u00A9\u0001\u001A\u0005\b\u00D2\u0001\u0010[R\u0019\u0010:\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\b:\u0010\u009D\u0001\u001A\u0005\b\u00D3\u0001\u0010OR\u0019\u0010;\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b;\u0010\u00A9\u0001\u001A\u0005\b\u00D4\u0001\u0010[R\u0019\u0010<\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\b<\u0010\u00A9\u0001\u001A\u0005\b\u00D5\u0001\u0010[R\u001B\u0010=\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b=\u0010\u009A\u0001\u001A\u0005\b\u00D6\u0001\u0010KR\u001B\u0010>\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b>\u0010\u009A\u0001\u001A\u0005\b\u00D7\u0001\u0010KR\u001B\u0010?\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b?\u0010\u009A\u0001\u001A\u0005\b\u00D8\u0001\u0010KR\u001B\u0010@\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\b@\u0010\u009A\u0001\u001A\u0005\b\u00D9\u0001\u0010KR\u001B\u0010A\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\u000E\n\u0005\bA\u0010\u009A\u0001\u001A\u0005\b\u00DA\u0001\u0010KR\u0019\u0010B\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\bB\u0010\u00A9\u0001\u001A\u0005\b\u00DB\u0001\u0010[R\u0019\u0010C\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\bC\u0010\u00A9\u0001\u001A\u0005\b\u00DC\u0001\u0010[R\u0019\u0010D\u001A\u00020\u00058\u0006\u00A2\u0006\u000E\n\u0005\bD\u0010\u009D\u0001\u001A\u0005\b\u00DD\u0001\u0010OR\u0019\u0010E\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\bE\u0010\u00A9\u0001\u001A\u0005\b\u00DE\u0001\u0010[R\u0019\u0010F\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\bF\u0010\u00A9\u0001\u001A\u0005\b\u00DF\u0001\u0010[R\u0019\u0010G\u001A\u00020\u00108\u0006\u00A2\u0006\u000E\n\u0005\bG\u0010\u00A9\u0001\u001A\u0005\b\u00E0\u0001\u0010[\u00A8\u0006\u00E1\u0001"}, d2 = {"Lcom/spears/civilopedia/db/tables/Units;", "Lo2/m;", "", "unitType", "name", "", "baseSightRange", "baseMoves", "combat", "rangedCombat", "range", "bombard", "domain", "formationClass", "cost", "populationCost", "", "foundCity", "foundReligion", "makeTradeRoute", "evangelizeBelief", "launchInquisition", "requiresInquisition", "buildCharges", "religiousStrength", "religionEvictPercent", "spreadCharges", "religiousHealCharges", "extractsArtifacts", "description", "flavor", "canCapture", "canRetreatWhenCaptured", "traitType", "allowBarbarians", "costProgressionModel", "costProgressionParam1", "promotionClass", "initialLevel", "numRandomChoices", "prereqTech", "prereqCivic", "prereqDistrict", "prereqPopulation", "leaderType", "canTrain", "strategicResource", "purchaseYield", "mustPurchase", "maintenance", "stackable", "airSlots", "canTargetAir", "pseudoYieldType", "zoneOfControl", "antiAirCombat", "spy", "wMDCapable", "parkCharges", "ignoreMoves", "teamVisibility", "obsoleteTech", "obsoleteCivic", "mandatoryObsoleteTech", "mandatoryObsoleteCivic", "advisorType", "enabledByReligion", "trackReligion", "disasterCharges", "useMaxMeleeTrainedStrength", "immediatelyName", "canEarnExperience", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZZZZZZIIIIIZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZIZIZLjava/lang/String;ZIZZIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "component13", "()Z", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "copy", "(Ljava/lang/String;Ljava/lang/String;IIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZZZZZZIIIIIZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZIZIZLjava/lang/String;ZIZZIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZ)Lcom/spears/civilopedia/db/tables/Units;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnitType", "getName", "I", "getBaseSightRange", "getBaseMoves", "getCombat", "getRangedCombat", "getRange", "getBombard", "getDomain", "getFormationClass", "getCost", "Ljava/lang/Integer;", "getPopulationCost", "Z", "getFoundCity", "getFoundReligion", "getMakeTradeRoute", "getEvangelizeBelief", "getLaunchInquisition", "getRequiresInquisition", "getBuildCharges", "getReligiousStrength", "getReligionEvictPercent", "getSpreadCharges", "getReligiousHealCharges", "getExtractsArtifacts", "getDescription", "getFlavor", "getCanCapture", "getCanRetreatWhenCaptured", "getTraitType", "getAllowBarbarians", "getCostProgressionModel", "getCostProgressionParam1", "getPromotionClass", "getInitialLevel", "getNumRandomChoices", "getPrereqTech", "getPrereqCivic", "getPrereqDistrict", "getPrereqPopulation", "getLeaderType", "getCanTrain", "getStrategicResource", "getPurchaseYield", "getMustPurchase", "getMaintenance", "getStackable", "getAirSlots", "getCanTargetAir", "getPseudoYieldType", "getZoneOfControl", "getAntiAirCombat", "getSpy", "getWMDCapable", "getParkCharges", "getIgnoreMoves", "getTeamVisibility", "getObsoleteTech", "getObsoleteCivic", "getMandatoryObsoleteTech", "getMandatoryObsoleteCivic", "getAdvisorType", "getEnabledByReligion", "getTrackReligion", "getDisasterCharges", "getUseMaxMeleeTrainedStrength", "getImmediatelyName", "getCanEarnExperience", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Units implements m {
    private final String advisorType;
    private final int airSlots;
    private final boolean allowBarbarians;
    private final int antiAirCombat;
    private final int baseMoves;
    private final int baseSightRange;
    private final int bombard;
    private final int buildCharges;
    private final boolean canCapture;
    private final boolean canEarnExperience;
    private final boolean canRetreatWhenCaptured;
    private final boolean canTargetAir;
    private final boolean canTrain;
    private final int combat;
    private final int cost;
    private final String costProgressionModel;
    private final int costProgressionParam1;
    private final String description;
    private final int disasterCharges;
    private final String domain;
    private final boolean enabledByReligion;
    private final boolean evangelizeBelief;
    private final boolean extractsArtifacts;
    private final String flavor;
    private final String formationClass;
    private final boolean foundCity;
    private final boolean foundReligion;
    private final boolean ignoreMoves;
    private final boolean immediatelyName;
    private final int initialLevel;
    private final boolean launchInquisition;
    private final String leaderType;
    private final int maintenance;
    private final boolean makeTradeRoute;
    private final String mandatoryObsoleteCivic;
    private final String mandatoryObsoleteTech;
    private final boolean mustPurchase;
    private final String name;
    private final int numRandomChoices;
    private final String obsoleteCivic;
    private final String obsoleteTech;
    private final int parkCharges;
    private final Integer populationCost;
    private final String prereqCivic;
    private final String prereqDistrict;
    private final Integer prereqPopulation;
    private final String prereqTech;
    private final String promotionClass;
    private final String pseudoYieldType;
    private final String purchaseYield;
    private final int range;
    private final int rangedCombat;
    private final int religionEvictPercent;
    private final int religiousHealCharges;
    private final int religiousStrength;
    private final boolean requiresInquisition;
    private final int spreadCharges;
    private final boolean spy;
    private final boolean stackable;
    private final String strategicResource;
    private final boolean teamVisibility;
    private final boolean trackReligion;
    private final String traitType;
    private final String unitType;
    private final boolean useMaxMeleeTrainedStrength;
    private final boolean wMDCapable;
    private final boolean zoneOfControl;

    public Units(String s, String s1, int v, int v1, int v2, int v3, int v4, int v5, String s2, String s3, int v6, Integer integer0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v7, int v8, int v9, int v10, int v11, boolean z6, String s4, String s5, boolean z7, boolean z8, String s6, boolean z9, String s7, int v12, String s8, int v13, int v14, String s9, String s10, String s11, Integer integer1, String s12, boolean z10, String s13, String s14, boolean z11, int v15, boolean z12, int v16, boolean z13, String s15, boolean z14, int v17, boolean z15, boolean z16, int v18, boolean z17, boolean z18, String s16, String s17, String s18, String s19, String s20, boolean z19, boolean z20, int v19, boolean z21, boolean z22, boolean z23) {
        j.f(s, "unitType");
        j.f(s1, "name");
        j.f(s2, "domain");
        j.f(s3, "formationClass");
        j.f(s7, "costProgressionModel");
        super();
        this.unitType = s;
        this.name = s1;
        this.baseSightRange = v;
        this.baseMoves = v1;
        this.combat = v2;
        this.rangedCombat = v3;
        this.range = v4;
        this.bombard = v5;
        this.domain = s2;
        this.formationClass = s3;
        this.cost = v6;
        this.populationCost = integer0;
        this.foundCity = z;
        this.foundReligion = z1;
        this.makeTradeRoute = z2;
        this.evangelizeBelief = z3;
        this.launchInquisition = z4;
        this.requiresInquisition = z5;
        this.buildCharges = v7;
        this.religiousStrength = v8;
        this.religionEvictPercent = v9;
        this.spreadCharges = v10;
        this.religiousHealCharges = v11;
        this.extractsArtifacts = z6;
        this.description = s4;
        this.flavor = s5;
        this.canCapture = z7;
        this.canRetreatWhenCaptured = z8;
        this.traitType = s6;
        this.allowBarbarians = z9;
        this.costProgressionModel = s7;
        this.costProgressionParam1 = v12;
        this.promotionClass = s8;
        this.initialLevel = v13;
        this.numRandomChoices = v14;
        this.prereqTech = s9;
        this.prereqCivic = s10;
        this.prereqDistrict = s11;
        this.prereqPopulation = integer1;
        this.leaderType = s12;
        this.canTrain = z10;
        this.strategicResource = s13;
        this.purchaseYield = s14;
        this.mustPurchase = z11;
        this.maintenance = v15;
        this.stackable = z12;
        this.airSlots = v16;
        this.canTargetAir = z13;
        this.pseudoYieldType = s15;
        this.zoneOfControl = z14;
        this.antiAirCombat = v17;
        this.spy = z15;
        this.wMDCapable = z16;
        this.parkCharges = v18;
        this.ignoreMoves = z17;
        this.teamVisibility = z18;
        this.obsoleteTech = s16;
        this.obsoleteCivic = s17;
        this.mandatoryObsoleteTech = s18;
        this.mandatoryObsoleteCivic = s19;
        this.advisorType = s20;
        this.enabledByReligion = z19;
        this.trackReligion = z20;
        this.disasterCharges = v19;
        this.useMaxMeleeTrainedStrength = z21;
        this.immediatelyName = z22;
        this.canEarnExperience = z23;
    }

    public final String component1() {
        return this.unitType;
    }

    public final String component10() {
        return this.formationClass;
    }

    public final int component11() {
        return this.cost;
    }

    public final Integer component12() {
        return this.populationCost;
    }

    public final boolean component13() {
        return this.foundCity;
    }

    public final boolean component14() {
        return this.foundReligion;
    }

    public final boolean component15() {
        return this.makeTradeRoute;
    }

    public final boolean component16() {
        return this.evangelizeBelief;
    }

    public final boolean component17() {
        return this.launchInquisition;
    }

    public final boolean component18() {
        return this.requiresInquisition;
    }

    public final int component19() {
        return this.buildCharges;
    }

    public final String component2() {
        return this.name;
    }

    public final int component20() {
        return this.religiousStrength;
    }

    public final int component21() {
        return this.religionEvictPercent;
    }

    public final int component22() {
        return this.spreadCharges;
    }

    public final int component23() {
        return this.religiousHealCharges;
    }

    public final boolean component24() {
        return this.extractsArtifacts;
    }

    public final String component25() {
        return this.description;
    }

    public final String component26() {
        return this.flavor;
    }

    public final boolean component27() {
        return this.canCapture;
    }

    public final boolean component28() {
        return this.canRetreatWhenCaptured;
    }

    public final String component29() {
        return this.traitType;
    }

    public final int component3() {
        return this.baseSightRange;
    }

    public final boolean component30() {
        return this.allowBarbarians;
    }

    public final String component31() {
        return this.costProgressionModel;
    }

    public final int component32() {
        return this.costProgressionParam1;
    }

    public final String component33() {
        return this.promotionClass;
    }

    public final int component34() {
        return this.initialLevel;
    }

    public final int component35() {
        return this.numRandomChoices;
    }

    public final String component36() {
        return this.prereqTech;
    }

    public final String component37() {
        return this.prereqCivic;
    }

    public final String component38() {
        return this.prereqDistrict;
    }

    public final Integer component39() {
        return this.prereqPopulation;
    }

    public final int component4() {
        return this.baseMoves;
    }

    public final String component40() {
        return this.leaderType;
    }

    public final boolean component41() {
        return this.canTrain;
    }

    public final String component42() {
        return this.strategicResource;
    }

    public final String component43() {
        return this.purchaseYield;
    }

    public final boolean component44() {
        return this.mustPurchase;
    }

    public final int component45() {
        return this.maintenance;
    }

    public final boolean component46() {
        return this.stackable;
    }

    public final int component47() {
        return this.airSlots;
    }

    public final boolean component48() {
        return this.canTargetAir;
    }

    public final String component49() {
        return this.pseudoYieldType;
    }

    public final int component5() {
        return this.combat;
    }

    public final boolean component50() {
        return this.zoneOfControl;
    }

    public final int component51() {
        return this.antiAirCombat;
    }

    public final boolean component52() {
        return this.spy;
    }

    public final boolean component53() {
        return this.wMDCapable;
    }

    public final int component54() {
        return this.parkCharges;
    }

    public final boolean component55() {
        return this.ignoreMoves;
    }

    public final boolean component56() {
        return this.teamVisibility;
    }

    public final String component57() {
        return this.obsoleteTech;
    }

    public final String component58() {
        return this.obsoleteCivic;
    }

    public final String component59() {
        return this.mandatoryObsoleteTech;
    }

    public final int component6() {
        return this.rangedCombat;
    }

    public final String component60() {
        return this.mandatoryObsoleteCivic;
    }

    public final String component61() {
        return this.advisorType;
    }

    public final boolean component62() {
        return this.enabledByReligion;
    }

    public final boolean component63() {
        return this.trackReligion;
    }

    public final int component64() {
        return this.disasterCharges;
    }

    public final boolean component65() {
        return this.useMaxMeleeTrainedStrength;
    }

    public final boolean component66() {
        return this.immediatelyName;
    }

    public final boolean component67() {
        return this.canEarnExperience;
    }

    public final int component7() {
        return this.range;
    }

    public final int component8() {
        return this.bombard;
    }

    public final String component9() {
        return this.domain;
    }

    public final Units copy(String s, String s1, int v, int v1, int v2, int v3, int v4, int v5, String s2, String s3, int v6, Integer integer0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v7, int v8, int v9, int v10, int v11, boolean z6, String s4, String s5, boolean z7, boolean z8, String s6, boolean z9, String s7, int v12, String s8, int v13, int v14, String s9, String s10, String s11, Integer integer1, String s12, boolean z10, String s13, String s14, boolean z11, int v15, boolean z12, int v16, boolean z13, String s15, boolean z14, int v17, boolean z15, boolean z16, int v18, boolean z17, boolean z18, String s16, String s17, String s18, String s19, String s20, boolean z19, boolean z20, int v19, boolean z21, boolean z22, boolean z23) {
        j.f(s, "unitType");
        j.f(s1, "name");
        j.f(s2, "domain");
        j.f(s3, "formationClass");
        j.f(s7, "costProgressionModel");
        return new Units(s, s1, v, v1, v2, v3, v4, v5, s2, s3, v6, integer0, z, z1, z2, z3, z4, z5, v7, v8, v9, v10, v11, z6, s4, s5, z7, z8, s6, z9, s7, v12, s8, v13, v14, s9, s10, s11, integer1, s12, z10, s13, s14, z11, v15, z12, v16, z13, s15, z14, v17, z15, z16, v18, z17, z18, s16, s17, s18, s19, s20, z19, z20, v19, z21, z22, z23);
    }

    public static Units copy$default(Units units0, String s, String s1, int v, int v1, int v2, int v3, int v4, int v5, String s2, String s3, int v6, Integer integer0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v7, int v8, int v9, int v10, int v11, boolean z6, String s4, String s5, boolean z7, boolean z8, String s6, boolean z9, String s7, int v12, String s8, int v13, int v14, String s9, String s10, String s11, Integer integer1, String s12, boolean z10, String s13, String s14, boolean z11, int v15, boolean z12, int v16, boolean z13, String s15, boolean z14, int v17, boolean z15, boolean z16, int v18, boolean z17, boolean z18, String s16, String s17, String s18, String s19, String s20, boolean z19, boolean z20, int v19, boolean z21, boolean z22, boolean z23, int v20, int v21, int v22, Object object0) {
        String s21 = (v20 & 1) == 0 ? s : units0.unitType;
        String s22 = (v20 & 2) == 0 ? s1 : units0.name;
        int v23 = (v20 & 4) == 0 ? v : units0.baseSightRange;
        int v24 = (v20 & 8) == 0 ? v1 : units0.baseMoves;
        int v25 = (v20 & 16) == 0 ? v2 : units0.combat;
        int v26 = (v20 & 0x20) == 0 ? v3 : units0.rangedCombat;
        int v27 = (v20 & 0x40) == 0 ? v4 : units0.range;
        int v28 = (v20 & 0x80) == 0 ? v5 : units0.bombard;
        String s23 = (v20 & 0x100) == 0 ? s2 : units0.domain;
        String s24 = (v20 & 0x200) == 0 ? s3 : units0.formationClass;
        int v29 = (v20 & 0x400) == 0 ? v6 : units0.cost;
        Integer integer2 = (v20 & 0x800) == 0 ? integer0 : units0.populationCost;
        boolean z24 = (v20 & 0x1000) == 0 ? z : units0.foundCity;
        boolean z25 = (v20 & 0x2000) == 0 ? z1 : units0.foundReligion;
        boolean z26 = (v20 & 0x4000) == 0 ? z2 : units0.makeTradeRoute;
        boolean z27 = (v20 & 0x8000) == 0 ? z3 : units0.evangelizeBelief;
        boolean z28 = (v20 & 0x10000) == 0 ? z4 : units0.launchInquisition;
        boolean z29 = (v20 & 0x20000) == 0 ? z5 : units0.requiresInquisition;
        int v30 = (v20 & 0x40000) == 0 ? v7 : units0.buildCharges;
        int v31 = (v20 & 0x80000) == 0 ? v8 : units0.religiousStrength;
        int v32 = (v20 & 0x100000) == 0 ? v9 : units0.religionEvictPercent;
        int v33 = (v20 & 0x200000) == 0 ? v10 : units0.spreadCharges;
        int v34 = (v20 & 0x400000) == 0 ? v11 : units0.religiousHealCharges;
        boolean z30 = (v20 & 0x800000) == 0 ? z6 : units0.extractsArtifacts;
        String s25 = (v20 & 0x1000000) == 0 ? s4 : units0.description;
        String s26 = (v20 & 0x2000000) == 0 ? s5 : units0.flavor;
        boolean z31 = (v20 & 0x4000000) == 0 ? z7 : units0.canCapture;
        boolean z32 = (v20 & 0x8000000) == 0 ? z8 : units0.canRetreatWhenCaptured;
        String s27 = (v20 & 0x10000000) == 0 ? s6 : units0.traitType;
        boolean z33 = (v20 & 0x20000000) == 0 ? z9 : units0.allowBarbarians;
        String s28 = (v20 & 0x40000000) == 0 ? s7 : units0.costProgressionModel;
        int v35 = (v20 & 0x80000000) == 0 ? v12 : units0.costProgressionParam1;
        String s29 = (v21 & 1) == 0 ? s8 : units0.promotionClass;
        int v36 = (v21 & 2) == 0 ? v13 : units0.initialLevel;
        int v37 = (v21 & 4) == 0 ? v14 : units0.numRandomChoices;
        String s30 = (v21 & 8) == 0 ? s9 : units0.prereqTech;
        String s31 = (v21 & 16) == 0 ? s10 : units0.prereqCivic;
        String s32 = (v21 & 0x20) == 0 ? s11 : units0.prereqDistrict;
        Integer integer3 = (v21 & 0x40) == 0 ? integer1 : units0.prereqPopulation;
        String s33 = (v21 & 0x80) == 0 ? s12 : units0.leaderType;
        boolean z34 = (v21 & 0x100) == 0 ? z10 : units0.canTrain;
        String s34 = (v21 & 0x200) == 0 ? s13 : units0.strategicResource;
        String s35 = (v21 & 0x400) == 0 ? s14 : units0.purchaseYield;
        boolean z35 = (v21 & 0x800) == 0 ? z11 : units0.mustPurchase;
        int v38 = (v21 & 0x1000) == 0 ? v15 : units0.maintenance;
        boolean z36 = (v21 & 0x2000) == 0 ? z12 : units0.stackable;
        int v39 = (v21 & 0x4000) == 0 ? v16 : units0.airSlots;
        boolean z37 = (v21 & 0x8000) == 0 ? z13 : units0.canTargetAir;
        String s36 = (v21 & 0x10000) == 0 ? s15 : units0.pseudoYieldType;
        boolean z38 = (v21 & 0x20000) == 0 ? z14 : units0.zoneOfControl;
        int v40 = (v21 & 0x40000) == 0 ? v17 : units0.antiAirCombat;
        boolean z39 = (v21 & 0x80000) == 0 ? z15 : units0.spy;
        boolean z40 = (v21 & 0x100000) == 0 ? z16 : units0.wMDCapable;
        int v41 = (v21 & 0x200000) == 0 ? v18 : units0.parkCharges;
        boolean z41 = (v21 & 0x400000) == 0 ? z17 : units0.ignoreMoves;
        boolean z42 = (v21 & 0x800000) == 0 ? z18 : units0.teamVisibility;
        String s37 = (v21 & 0x1000000) == 0 ? s16 : units0.obsoleteTech;
        String s38 = (v21 & 0x2000000) == 0 ? s17 : units0.obsoleteCivic;
        String s39 = (v21 & 0x4000000) == 0 ? s18 : units0.mandatoryObsoleteTech;
        String s40 = (v21 & 0x8000000) == 0 ? s19 : units0.mandatoryObsoleteCivic;
        String s41 = (v21 & 0x10000000) == 0 ? s20 : units0.advisorType;
        boolean z43 = (v21 & 0x20000000) == 0 ? z19 : units0.enabledByReligion;
        boolean z44 = (v21 & 0x40000000) == 0 ? z20 : units0.trackReligion;
        int v42 = (v21 & 0x80000000) == 0 ? v19 : units0.disasterCharges;
        boolean z45 = (v22 & 1) == 0 ? z21 : units0.useMaxMeleeTrainedStrength;
        boolean z46 = (v22 & 2) == 0 ? z22 : units0.immediatelyName;
        return (v22 & 4) == 0 ? units0.copy(s21, s22, v23, v24, v25, v26, v27, v28, s23, s24, v29, integer2, z24, z25, z26, z27, z28, z29, v30, v31, v32, v33, v34, z30, s25, s26, z31, z32, s27, z33, s28, v35, s29, v36, v37, s30, s31, s32, integer3, s33, z34, s34, s35, z35, v38, z36, v39, z37, s36, z38, v40, z39, z40, v41, z41, z42, s37, s38, s39, s40, s41, z43, z44, v42, z45, z46, z23) : units0.copy(s21, s22, v23, v24, v25, v26, v27, v28, s23, s24, v29, integer2, z24, z25, z26, z27, z28, z29, v30, v31, v32, v33, v34, z30, s25, s26, z31, z32, s27, z33, s28, v35, s29, v36, v37, s30, s31, s32, integer3, s33, z34, s34, s35, z35, v38, z36, v39, z37, s36, z38, v40, z39, z40, v41, z41, z42, s37, s38, s39, s40, s41, z43, z44, v42, z45, z46, units0.canEarnExperience);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Units)) {
            return false;
        }
        Units units0 = (Units)object0;
        if(!j.a(this.unitType, units0.unitType)) {
            return false;
        }
        if(!j.a(this.name, units0.name)) {
            return false;
        }
        if(this.baseSightRange != units0.baseSightRange) {
            return false;
        }
        if(this.baseMoves != units0.baseMoves) {
            return false;
        }
        if(this.combat != units0.combat) {
            return false;
        }
        if(this.rangedCombat != units0.rangedCombat) {
            return false;
        }
        if(this.range != units0.range) {
            return false;
        }
        if(this.bombard != units0.bombard) {
            return false;
        }
        if(!j.a(this.domain, units0.domain)) {
            return false;
        }
        if(!j.a(this.formationClass, units0.formationClass)) {
            return false;
        }
        if(this.cost != units0.cost) {
            return false;
        }
        if(!j.a(this.populationCost, units0.populationCost)) {
            return false;
        }
        if(this.foundCity != units0.foundCity) {
            return false;
        }
        if(this.foundReligion != units0.foundReligion) {
            return false;
        }
        if(this.makeTradeRoute != units0.makeTradeRoute) {
            return false;
        }
        if(this.evangelizeBelief != units0.evangelizeBelief) {
            return false;
        }
        if(this.launchInquisition != units0.launchInquisition) {
            return false;
        }
        if(this.requiresInquisition != units0.requiresInquisition) {
            return false;
        }
        if(this.buildCharges != units0.buildCharges) {
            return false;
        }
        if(this.religiousStrength != units0.religiousStrength) {
            return false;
        }
        if(this.religionEvictPercent != units0.religionEvictPercent) {
            return false;
        }
        if(this.spreadCharges != units0.spreadCharges) {
            return false;
        }
        if(this.religiousHealCharges != units0.religiousHealCharges) {
            return false;
        }
        if(this.extractsArtifacts != units0.extractsArtifacts) {
            return false;
        }
        if(!j.a(this.description, units0.description)) {
            return false;
        }
        if(!j.a(this.flavor, units0.flavor)) {
            return false;
        }
        if(this.canCapture != units0.canCapture) {
            return false;
        }
        if(this.canRetreatWhenCaptured != units0.canRetreatWhenCaptured) {
            return false;
        }
        if(!j.a(this.traitType, units0.traitType)) {
            return false;
        }
        if(this.allowBarbarians != units0.allowBarbarians) {
            return false;
        }
        if(!j.a(this.costProgressionModel, units0.costProgressionModel)) {
            return false;
        }
        if(this.costProgressionParam1 != units0.costProgressionParam1) {
            return false;
        }
        if(!j.a(this.promotionClass, units0.promotionClass)) {
            return false;
        }
        if(this.initialLevel != units0.initialLevel) {
            return false;
        }
        if(this.numRandomChoices != units0.numRandomChoices) {
            return false;
        }
        if(!j.a(this.prereqTech, units0.prereqTech)) {
            return false;
        }
        if(!j.a(this.prereqCivic, units0.prereqCivic)) {
            return false;
        }
        if(!j.a(this.prereqDistrict, units0.prereqDistrict)) {
            return false;
        }
        if(!j.a(this.prereqPopulation, units0.prereqPopulation)) {
            return false;
        }
        if(!j.a(this.leaderType, units0.leaderType)) {
            return false;
        }
        if(this.canTrain != units0.canTrain) {
            return false;
        }
        if(!j.a(this.strategicResource, units0.strategicResource)) {
            return false;
        }
        if(!j.a(this.purchaseYield, units0.purchaseYield)) {
            return false;
        }
        if(this.mustPurchase != units0.mustPurchase) {
            return false;
        }
        if(this.maintenance != units0.maintenance) {
            return false;
        }
        if(this.stackable != units0.stackable) {
            return false;
        }
        if(this.airSlots != units0.airSlots) {
            return false;
        }
        if(this.canTargetAir != units0.canTargetAir) {
            return false;
        }
        if(!j.a(this.pseudoYieldType, units0.pseudoYieldType)) {
            return false;
        }
        if(this.zoneOfControl != units0.zoneOfControl) {
            return false;
        }
        if(this.antiAirCombat != units0.antiAirCombat) {
            return false;
        }
        if(this.spy != units0.spy) {
            return false;
        }
        if(this.wMDCapable != units0.wMDCapable) {
            return false;
        }
        if(this.parkCharges != units0.parkCharges) {
            return false;
        }
        if(this.ignoreMoves != units0.ignoreMoves) {
            return false;
        }
        if(this.teamVisibility != units0.teamVisibility) {
            return false;
        }
        if(!j.a(this.obsoleteTech, units0.obsoleteTech)) {
            return false;
        }
        if(!j.a(this.obsoleteCivic, units0.obsoleteCivic)) {
            return false;
        }
        if(!j.a(this.mandatoryObsoleteTech, units0.mandatoryObsoleteTech)) {
            return false;
        }
        if(!j.a(this.mandatoryObsoleteCivic, units0.mandatoryObsoleteCivic)) {
            return false;
        }
        if(!j.a(this.advisorType, units0.advisorType)) {
            return false;
        }
        if(this.enabledByReligion != units0.enabledByReligion) {
            return false;
        }
        if(this.trackReligion != units0.trackReligion) {
            return false;
        }
        if(this.disasterCharges != units0.disasterCharges) {
            return false;
        }
        if(this.useMaxMeleeTrainedStrength != units0.useMaxMeleeTrainedStrength) {
            return false;
        }
        return this.immediatelyName == units0.immediatelyName ? this.canEarnExperience == units0.canEarnExperience : false;
    }

    public final String getAdvisorType() {
        return this.advisorType;
    }

    public final int getAirSlots() {
        return this.airSlots;
    }

    public final boolean getAllowBarbarians() {
        return this.allowBarbarians;
    }

    public final int getAntiAirCombat() {
        return this.antiAirCombat;
    }

    public final int getBaseMoves() {
        return this.baseMoves;
    }

    public final int getBaseSightRange() {
        return this.baseSightRange;
    }

    public final int getBombard() {
        return this.bombard;
    }

    public final int getBuildCharges() {
        return this.buildCharges;
    }

    public final boolean getCanCapture() {
        return this.canCapture;
    }

    public final boolean getCanEarnExperience() {
        return this.canEarnExperience;
    }

    public final boolean getCanRetreatWhenCaptured() {
        return this.canRetreatWhenCaptured;
    }

    public final boolean getCanTargetAir() {
        return this.canTargetAir;
    }

    public final boolean getCanTrain() {
        return this.canTrain;
    }

    public final int getCombat() {
        return this.combat;
    }

    public final int getCost() {
        return this.cost;
    }

    public final String getCostProgressionModel() {
        return this.costProgressionModel;
    }

    public final int getCostProgressionParam1() {
        return this.costProgressionParam1;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDisasterCharges() {
        return this.disasterCharges;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final boolean getEnabledByReligion() {
        return this.enabledByReligion;
    }

    public final boolean getEvangelizeBelief() {
        return this.evangelizeBelief;
    }

    public final boolean getExtractsArtifacts() {
        return this.extractsArtifacts;
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getFormationClass() {
        return this.formationClass;
    }

    public final boolean getFoundCity() {
        return this.foundCity;
    }

    public final boolean getFoundReligion() {
        return this.foundReligion;
    }

    public final boolean getIgnoreMoves() {
        return this.ignoreMoves;
    }

    public final boolean getImmediatelyName() {
        return this.immediatelyName;
    }

    public final int getInitialLevel() {
        return this.initialLevel;
    }

    public final boolean getLaunchInquisition() {
        return this.launchInquisition;
    }

    public final String getLeaderType() {
        return this.leaderType;
    }

    public final int getMaintenance() {
        return this.maintenance;
    }

    public final boolean getMakeTradeRoute() {
        return this.makeTradeRoute;
    }

    public final String getMandatoryObsoleteCivic() {
        return this.mandatoryObsoleteCivic;
    }

    public final String getMandatoryObsoleteTech() {
        return this.mandatoryObsoleteTech;
    }

    public final boolean getMustPurchase() {
        return this.mustPurchase;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumRandomChoices() {
        return this.numRandomChoices;
    }

    public final String getObsoleteCivic() {
        return this.obsoleteCivic;
    }

    public final String getObsoleteTech() {
        return this.obsoleteTech;
    }

    public final int getParkCharges() {
        return this.parkCharges;
    }

    public final Integer getPopulationCost() {
        return this.populationCost;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqDistrict() {
        return this.prereqDistrict;
    }

    public final Integer getPrereqPopulation() {
        return this.prereqPopulation;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final String getPromotionClass() {
        return this.promotionClass;
    }

    public final String getPseudoYieldType() {
        return this.pseudoYieldType;
    }

    public final String getPurchaseYield() {
        return this.purchaseYield;
    }

    public final int getRange() {
        return this.range;
    }

    public final int getRangedCombat() {
        return this.rangedCombat;
    }

    public final int getReligionEvictPercent() {
        return this.religionEvictPercent;
    }

    public final int getReligiousHealCharges() {
        return this.religiousHealCharges;
    }

    public final int getReligiousStrength() {
        return this.religiousStrength;
    }

    public final boolean getRequiresInquisition() {
        return this.requiresInquisition;
    }

    public final int getSpreadCharges() {
        return this.spreadCharges;
    }

    public final boolean getSpy() {
        return this.spy;
    }

    public final boolean getStackable() {
        return this.stackable;
    }

    public final String getStrategicResource() {
        return this.strategicResource;
    }

    public final boolean getTeamVisibility() {
        return this.teamVisibility;
    }

    public final boolean getTrackReligion() {
        return this.trackReligion;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public final boolean getUseMaxMeleeTrainedStrength() {
        return this.useMaxMeleeTrainedStrength;
    }

    public final boolean getWMDCapable() {
        return this.wMDCapable;
    }

    public final boolean getZoneOfControl() {
        return this.zoneOfControl;
    }

    // 去混淆评级： 低(35)
    @Override
    public int hashCode() {
        int v = 0;
        int v1 = 0x4D5;
        int v2 = (((((((((((((((((((((((f.b(((((((((((((((((((((f.b(f.b(((((((f.b(this.unitType.hashCode() * 0x1F, 0x1F, this.name) + this.baseSightRange) * 0x1F + this.baseMoves) * 0x1F + this.combat) * 0x1F + this.rangedCombat) * 0x1F + this.range) * 0x1F + this.bombard) * 0x1F, 0x1F, this.domain), 0x1F, this.formationClass) + this.cost) * 0x1F + (this.populationCost == null ? 0 : this.populationCost.hashCode())) * 0x1F + (this.foundCity ? 0x4CF : 0x4D5)) * 0x1F + (this.foundReligion ? 0x4CF : 0x4D5)) * 0x1F + (this.makeTradeRoute ? 0x4CF : 0x4D5)) * 0x1F + (this.evangelizeBelief ? 0x4CF : 0x4D5)) * 0x1F + (this.launchInquisition ? 0x4CF : 0x4D5)) * 0x1F + (this.requiresInquisition ? 0x4CF : 0x4D5)) * 0x1F + this.buildCharges) * 0x1F + this.religiousStrength) * 0x1F + this.religionEvictPercent) * 0x1F + this.spreadCharges) * 0x1F + this.religiousHealCharges) * 0x1F + (this.extractsArtifacts ? 0x4CF : 0x4D5)) * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.flavor == null ? 0 : this.flavor.hashCode())) * 0x1F + (this.canCapture ? 0x4CF : 0x4D5)) * 0x1F + (this.canRetreatWhenCaptured ? 0x4CF : 0x4D5)) * 0x1F + (this.traitType == null ? 0 : this.traitType.hashCode())) * 0x1F + (this.allowBarbarians ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.costProgressionModel) + this.costProgressionParam1) * 0x1F + (this.promotionClass == null ? 0 : this.promotionClass.hashCode())) * 0x1F + this.initialLevel) * 0x1F + this.numRandomChoices) * 0x1F + (this.prereqTech == null ? 0 : this.prereqTech.hashCode())) * 0x1F + (this.prereqCivic == null ? 0 : this.prereqCivic.hashCode())) * 0x1F + (this.prereqDistrict == null ? 0 : this.prereqDistrict.hashCode())) * 0x1F + (this.prereqPopulation == null ? 0 : this.prereqPopulation.hashCode())) * 0x1F + (this.leaderType == null ? 0 : this.leaderType.hashCode())) * 0x1F + (this.canTrain ? 0x4CF : 0x4D5)) * 0x1F + (this.strategicResource == null ? 0 : this.strategicResource.hashCode())) * 0x1F + (this.purchaseYield == null ? 0 : this.purchaseYield.hashCode())) * 0x1F + (this.mustPurchase ? 0x4CF : 0x4D5)) * 0x1F + this.maintenance) * 0x1F + (this.stackable ? 0x4CF : 0x4D5)) * 0x1F + this.airSlots) * 0x1F + (this.canTargetAir ? 0x4CF : 0x4D5)) * 0x1F + (this.pseudoYieldType == null ? 0 : this.pseudoYieldType.hashCode())) * 0x1F + (this.zoneOfControl ? 0x4CF : 0x4D5)) * 0x1F + this.antiAirCombat) * 0x1F + (this.spy ? 0x4CF : 0x4D5)) * 0x1F + (this.wMDCapable ? 0x4CF : 0x4D5)) * 0x1F + this.parkCharges) * 0x1F;
        int v3 = this.ignoreMoves ? 0x4CF : 0x4D5;
        int v4 = this.teamVisibility ? 0x4CF : 0x4D5;
        int v5 = this.obsoleteTech == null ? 0 : this.obsoleteTech.hashCode();
        int v6 = this.obsoleteCivic == null ? 0 : this.obsoleteCivic.hashCode();
        int v7 = this.mandatoryObsoleteTech == null ? 0 : this.mandatoryObsoleteTech.hashCode();
        int v8 = this.mandatoryObsoleteCivic == null ? 0 : this.mandatoryObsoleteCivic.hashCode();
        String s = this.advisorType;
        if(s != null) {
            v = s.hashCode();
        }
        int v9 = ((((((((((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v) * 0x1F + (this.enabledByReligion ? 0x4CF : 0x4D5)) * 0x1F + (this.trackReligion ? 0x4CF : 0x4D5)) * 0x1F + this.disasterCharges) * 0x1F;
        int v10 = this.useMaxMeleeTrainedStrength ? 0x4CF : 0x4D5;
        int v11 = this.immediatelyName ? 0x4CF : 0x4D5;
        if(this.canEarnExperience) {
            v1 = 0x4CF;
        }
        return ((v9 + v10) * 0x1F + v11) * 0x1F + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.unitType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Units(unitType=", this.unitType, ", name=", this.name, ", baseSightRange=");
        f.q(stringBuilder0, this.baseSightRange, ", baseMoves=", this.baseMoves, ", combat=");
        f.q(stringBuilder0, this.combat, ", rangedCombat=", this.rangedCombat, ", range=");
        f.q(stringBuilder0, this.range, ", bombard=", this.bombard, ", domain=");
        f.t(stringBuilder0, this.domain, ", formationClass=", this.formationClass, ", cost=");
        stringBuilder0.append(this.cost);
        stringBuilder0.append(", populationCost=");
        stringBuilder0.append(this.populationCost);
        stringBuilder0.append(", foundCity=");
        u9.A(stringBuilder0, this.foundCity, ", foundReligion=", this.foundReligion, ", makeTradeRoute=");
        u9.A(stringBuilder0, this.makeTradeRoute, ", evangelizeBelief=", this.evangelizeBelief, ", launchInquisition=");
        u9.A(stringBuilder0, this.launchInquisition, ", requiresInquisition=", this.requiresInquisition, ", buildCharges=");
        f.q(stringBuilder0, this.buildCharges, ", religiousStrength=", this.religiousStrength, ", religionEvictPercent=");
        f.q(stringBuilder0, this.religionEvictPercent, ", spreadCharges=", this.spreadCharges, ", religiousHealCharges=");
        u9.r(stringBuilder0, this.religiousHealCharges, ", extractsArtifacts=", this.extractsArtifacts, ", description=");
        f.t(stringBuilder0, this.description, ", flavor=", this.flavor, ", canCapture=");
        u9.A(stringBuilder0, this.canCapture, ", canRetreatWhenCaptured=", this.canRetreatWhenCaptured, ", traitType=");
        u9.x(stringBuilder0, this.traitType, ", allowBarbarians=", this.allowBarbarians, ", costProgressionModel=");
        f.s(stringBuilder0, this.costProgressionModel, ", costProgressionParam1=", this.costProgressionParam1, ", promotionClass=");
        f.s(stringBuilder0, this.promotionClass, ", initialLevel=", this.initialLevel, ", numRandomChoices=");
        f.r(stringBuilder0, this.numRandomChoices, ", prereqTech=", this.prereqTech, ", prereqCivic=");
        f.t(stringBuilder0, this.prereqCivic, ", prereqDistrict=", this.prereqDistrict, ", prereqPopulation=");
        e.l(this.prereqPopulation, ", leaderType=", this.leaderType, ", canTrain=", stringBuilder0);
        u9.z(stringBuilder0, this.canTrain, ", strategicResource=", this.strategicResource, ", purchaseYield=");
        u9.x(stringBuilder0, this.purchaseYield, ", mustPurchase=", this.mustPurchase, ", maintenance=");
        u9.r(stringBuilder0, this.maintenance, ", stackable=", this.stackable, ", airSlots=");
        u9.r(stringBuilder0, this.airSlots, ", canTargetAir=", this.canTargetAir, ", pseudoYieldType=");
        u9.x(stringBuilder0, this.pseudoYieldType, ", zoneOfControl=", this.zoneOfControl, ", antiAirCombat=");
        u9.r(stringBuilder0, this.antiAirCombat, ", spy=", this.spy, ", wMDCapable=");
        u9.y(stringBuilder0, this.wMDCapable, ", parkCharges=", this.parkCharges, ", ignoreMoves=");
        u9.A(stringBuilder0, this.ignoreMoves, ", teamVisibility=", this.teamVisibility, ", obsoleteTech=");
        f.t(stringBuilder0, this.obsoleteTech, ", obsoleteCivic=", this.obsoleteCivic, ", mandatoryObsoleteTech=");
        f.t(stringBuilder0, this.mandatoryObsoleteTech, ", mandatoryObsoleteCivic=", this.mandatoryObsoleteCivic, ", advisorType=");
        u9.x(stringBuilder0, this.advisorType, ", enabledByReligion=", this.enabledByReligion, ", trackReligion=");
        u9.y(stringBuilder0, this.trackReligion, ", disasterCharges=", this.disasterCharges, ", useMaxMeleeTrainedStrength=");
        u9.A(stringBuilder0, this.useMaxMeleeTrainedStrength, ", immediatelyName=", this.immediatelyName, ", canEarnExperience=");
        return u9.g(stringBuilder0, this.canEarnExperience, ")");
    }
}

