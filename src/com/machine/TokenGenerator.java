package com.machine;

import java.util.Random;

public class TokenGenerator implements IToken{
	private int tokenId;
	private String tokenName;
	private double tokenPrice;
	public int getTokenId() {
		return tokenId;
	}
	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenName() {
		return tokenName;
	}
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}
	public double getTokenPrice() {
		return tokenPrice;
	}
	public void setTokenPrice(double tokenPrice) {
		this.tokenPrice = tokenPrice;
	}
	public TokenGenerator(int tokenId, String tokenName, double tokenPrice) {
		super();
		this.tokenId = tokenId;
		this.tokenName = tokenName;
		this.tokenPrice = tokenPrice;
	}
	public TokenGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TokenGenerator [tokenId=" + tokenId + ", tokenName=" + tokenName + ", tokenPrice=" + tokenPrice + "]";
	}
	@Override
	public void TokenGenerator(double tokenAmount) {
		Random random = new Random();
		int tokenId = random.nextInt(99999);
		this.tokenPrice += tokenAmount;
		System.out.println(tokenAmount +" RUPAY TOKEN GENERATE SUCCEESSFULLY...." );
		System.out.println(" YOUR TOKEN ID " + tokenId);
		this.tokenId = tokenId;
		
	}
	

}
