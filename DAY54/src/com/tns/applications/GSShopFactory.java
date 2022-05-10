package com.tns.applications;

public class GSShopFactory implements ShopFactory
{
	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNO);
	{
		GSPrimeAcc gsprime=new GSPrimeAcc();
		return gsprime;
	}
	@Override
	public GSNormalAcc getNewNormalAccount(int AccNO);
	{
		GSNormalAcc gsnormal=new GSNormalAcc(AccNO);
		return gsnormal;
				
	}

}
