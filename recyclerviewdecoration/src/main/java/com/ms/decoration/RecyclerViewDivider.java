package com.ms.decoration;

public class RecyclerViewDivider {

    public RecyclerViewSideLine leftSideLine;
    public RecyclerViewSideLine topSideLine;
    public RecyclerViewSideLine rightSideLine;
    public RecyclerViewSideLine bottomSideLine;

    public RecyclerViewDivider(RecyclerViewSideLine leftSideLine, RecyclerViewSideLine topSideLine,
                               RecyclerViewSideLine rightSideLine, RecyclerViewSideLine bottomSideLine) {
        this.leftSideLine = leftSideLine;
        this.topSideLine = topSideLine;
        this.rightSideLine = rightSideLine;
        this.bottomSideLine = bottomSideLine;
    }

    public RecyclerViewSideLine getLeftSideLine() {
        return leftSideLine;
    }

    public void setLeftSideLine(RecyclerViewSideLine leftSideLine) {
        this.leftSideLine = leftSideLine;
    }

    public RecyclerViewSideLine getTopSideLine() {
        return topSideLine;
    }

    public void setTopSideLine(RecyclerViewSideLine topSideLine) {
        this.topSideLine = topSideLine;
    }

    public RecyclerViewSideLine getRightSideLine() {
        return rightSideLine;
    }

    public void setRightSideLine(RecyclerViewSideLine rightSideLine) {
        this.rightSideLine = rightSideLine;
    }

    public RecyclerViewSideLine getBottomSideLine() {
        return bottomSideLine;
    }

    public void setBottomSideLine(RecyclerViewSideLine bottomSideLine) {
        this.bottomSideLine = bottomSideLine;
    }
}
