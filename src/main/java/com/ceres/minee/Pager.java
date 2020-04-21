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
	 * 블럭의 시작 번호, 끝 번호 세팅
	 * @param currentPage 현재 페이지
	 */
	public void setBlock(int currentPage) {
		this.currentPage = currentPage;
		
		int blockNum = (currentPage - 1) / BLOCK_SIZE;
		firstNumOfBlock = blockNum * BLOCK_SIZE + 1;
		lastNumOfBlock = (blockNum + 1) * BLOCK_SIZE;
	}
	
	public void addPagerToModel(Model model) {
		model.addAttribute("pager", this);
	}
	
}
