package com.techelevator._inheritance_lecture;

import java.util.ArrayList;
import java.util.List;

public class Auction {
	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;

	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", 0);
		allBids = new ArrayList<>();
	}

	public boolean placeBid(Bid offeredBid) {
		// 1. add bid to the list of all bids.
			allBids.add(offeredBid);
		
		// 2. Check if bid is the new high bid; if so assign it.
		// 3. return true if the bid is the new high bid, otherwise false.
			
			if (currentHighBid.getBidAmount() < offeredBid.getBidAmount()) {
				currentHighBid = offeredBid;
				return true;
			}
		// 3. return true if the bid is the new high bid, otherwise false.
		
		
		return false;
	}

	public Bid getHighBid() {
		return currentHighBid;
	}

	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() {
		return itemForSale;
	}
}
