package com.techelevator._inheritance_lecture;

public class ReserveAuction extends Auction {
	private int reservePrice;

	public ReserveAuction(String itemForSale, int reservePrice) {
		super(itemForSale);
		this.reservePrice = reservePrice;
	}
	@Override
	public boolean placeBid(Bid offeredBid) {
		return false;
	}
}
