package com.ms.decoration;

import android.support.annotation.ColorInt;

public class RecyclerViewDividerBuilder {

    private RecyclerViewSideLine leftSideLine;
    private RecyclerViewSideLine topSideLine;
    private RecyclerViewSideLine rightSideLine;
    private RecyclerViewSideLine bottomSideLine;

    public RecyclerViewDividerBuilder setLeftSideLine(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
        this.leftSideLine = new RecyclerViewSideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
        return this;
    }

    public RecyclerViewDividerBuilder setTopSideLine(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
        this.topSideLine = new RecyclerViewSideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
        return this;
    }

    public RecyclerViewDividerBuilder setRightSideLine(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
        this.rightSideLine = new RecyclerViewSideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
        return this;
    }

    public RecyclerViewDividerBuilder setBottomSideLine(boolean isHave, @ColorInt int color, float widthDp, float startPaddingDp, float endPaddingDp) {
        this.bottomSideLine = new RecyclerViewSideLine(isHave, color, widthDp, startPaddingDp, endPaddingDp);
        return this;
    }

    public RecyclerViewDivider create() {
        //提供一个默认不显示的sideline，防止空指针
        RecyclerViewSideLine defaultSideLine = new RecyclerViewSideLine(false, 0xff666666, 0, 0, 0);

        leftSideLine = (leftSideLine != null ? leftSideLine : defaultSideLine);
        topSideLine = (topSideLine != null ? topSideLine : defaultSideLine);
        rightSideLine = (rightSideLine != null ? rightSideLine : defaultSideLine);
        bottomSideLine = (bottomSideLine != null ? bottomSideLine : defaultSideLine);

        return new RecyclerViewDivider(leftSideLine, topSideLine, rightSideLine, bottomSideLine);
    }

}
