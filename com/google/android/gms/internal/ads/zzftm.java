package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class zzftm implements FilenameFilter {
    public final Pattern a;

    public zzftm(Pattern pattern0) {
        pattern0.getClass();
        this.a = pattern0;
    }

    @Override
    public final boolean accept(File file0, String s) {
        return this.a.matcher(s).matches();
    }
}

