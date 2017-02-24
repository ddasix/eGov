package com.sds.emp.services.board.vo;

import java.io.Serializable;

public class SearchVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/* �˻�����*/
	private String searchCondition="";	
	/* �˻��� */
	private String searchKeyword="";
	/* ��� ��ȸ�� ����� ������ ��ȣ */
	private int pageIndex = 1;
	/* ī�װ� ��� ���� */

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
