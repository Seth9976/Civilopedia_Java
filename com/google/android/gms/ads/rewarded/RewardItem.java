package com.google.android.gms.ads.rewarded;

import t1.c;

public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD;

    static {
        RewardItem.DEFAULT_REWARD = new c(3);
    }

    int getAmount();

    String getType();
}

