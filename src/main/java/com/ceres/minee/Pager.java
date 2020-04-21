package com.ceres.minee;

import org.springframework.ui.Model;

public class Pager {
	
	private final int BLOCK_SIZE = 10;
	
	private int firstNumOfBlock;
	private int lastNumOfBlock;
	private int lastPageNum;
	
	private int currentPage;
	
	public int getFirstNumOfBlock() {
		return firstNumOfBlock;
	}
	public void setFirstNumOfBlock(int firstNumOfBlock) {
		this.firstNumOfBlock = firstNumOfBlock;
	}
	public int getLastNumOfBlock() {
		return lastNumOfBlock;
	}
	public void setLastNumOfBlock(int lastNumOfBlock) {
		this.lastNumOfBlock = lastNumOfBlock;
	}
	public int getLastPageNum() {
		return lastPageNum;
	}
	public void setLastPageNum(int lastPageNum) {
		this.lastPageNum = lastPageNum;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	/**
	 * 마지막 페이지 세팅
	 * @param dataSize 검색 결과 개수
	 * @param dataSizePerPage 한 페이지당 최대 데이터 개수
	 */
	public void setLastPage(int dataSize, int dataSizePerPage) {
		if(dataSize == 0) 
			lastPageNum = 1;
		else {
			lastPageNum = dataSize / dataSizePerPage + 1;

			if(dataSize % dataSizePerPage == 0)
				lastPageNum--;
		}
	}
	
	/**
	 * 블럭의 시작 번호, 끝 번호 세팅
	 * @param currentPage 현재 페이지
	 */
	public void setBlock(int currentPage) {
		this.currentPage = currentPage;
		
		int blockNum = currentPage / BLOCK_SIZE;
		if(currentPage % BLOCK_SIZE == 0) 
			blockNum--;
		
		firstNumOfBlock = blockNum * BLOCK_SIZE + 1;
		lastNumOfBlock = (blockNum + 1) * BLOCK_SIZE;
	}
	
	/**
	 * 모델에 pager 객체(속성) 추가
	 * @param model 페이지 모델
	 */
	public void addPagerToModel(Model model) {
		model.addAttribute("pager", this);
	}
	
}
