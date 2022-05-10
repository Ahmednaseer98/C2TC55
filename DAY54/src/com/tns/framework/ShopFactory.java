package com.tns.framework;

public interface ShopFactory {
	public abstract primeAcc getNewPrimeAccount(int AccNo);
	public abstract NormalAcc getNewNormalAccount(int AccNO);

}

