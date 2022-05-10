package com.tns.client;

public class Clint {

	public static void main(String[] args)
	{
		//step1=step a
		GSShopFactory gssfactory= new GSSFactory();
		gssfactory.getNewPrimeAccount(123,"Naseer");
		gssfactory.getNewPrimeAccount(111,"Naseer");
		//step2
		GSPrimeAcc gsprime=new GSPrimeAcc();
		gsPrime.getAccNm();
		gsPrime.getAccNo();
		gsPrime.getcharges();
		//step4/sted d.
		gsPrime.bookProduct(1000);
		//step5/step e.
		gsprime.toString();
		//step 3
		GSNormalAcc gsnormal=new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveyCharge();
		//step 4/step d.
		gsnormal.bookProduct(1000);
		//step5/step e.
		gsnormal.toString();
	}
}

