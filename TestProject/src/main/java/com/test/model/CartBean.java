package com.test.model;

import java.util.HashMap;

public class CartBean extends HashMap {

	public CartBean() {
		super();
	}

	public void addSanPham(ProductDTO sp) {
		String key = sp.getProduct().getCode();
		if (this.containsKey(key)) {
			int oldQuantity = ((ProductDTO) this.get(key)).getQuantity();
			((ProductDTO) this.get(key)).setQuantity(oldQuantity + 1);
		}else {
			this.put(sp.getProduct().getCode(), sp);
		}
	}
	
	public boolean removeSanPham(String code) {
		if(this.containsKey(code)) {
			this.remove(code);
			return true;
		}
		return false;
	}

}
