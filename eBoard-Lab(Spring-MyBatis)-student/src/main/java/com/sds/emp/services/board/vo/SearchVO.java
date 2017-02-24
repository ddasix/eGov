package com.sds.emp.services.board.vo;

import java.io.Serializable;

public class SearchVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/* 검색조건*/
	private String searchCondition="";	
	/* 검색어 */
	private String searchKeyword="";
	/* 목록 조회시 사용할 페이지 번호 */
	private int pageIndex = 1;
	/* 카테고리 사용 여부 */

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	@Override
	public String toString() {
		return "SearchVO [pageIndex=" + pageIndex + ", searchCondition="
				+ searchCondition + ", searchKeyword=" + searchKeyword + "]";
	}	
}
