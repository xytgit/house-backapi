package com.team.house.housebackapi.util;

public class PageParameter {
    private Integer curPage=1;

    private Integer PageSize=5;

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }
}
