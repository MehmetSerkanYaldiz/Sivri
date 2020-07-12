package com.ex.sivri.Models;

public class Bilgiler{
	private String kariyer;
	private String ask;
	private String maddi;
	private String genel;

	public void setKariyer(String kariyer){
		this.kariyer = kariyer;
	}

	public String getKariyer(){
		return kariyer;
	}

	public void setAsk(String ask){
		this.ask = ask;
	}

	public String getAsk(){
		return ask;
	}

	public void setMaddi(String maddi){
		this.maddi = maddi;
	}

	public String getMaddi(){
		return maddi;
	}

	public void setGenel(String genel){
		this.genel = genel;
	}

	public String getGenel(){
		return genel;
	}

	@Override
 	public String toString(){
		return 
			"Bilgiler{" + 
			"kariyer = '" + kariyer + '\'' + 
			",ask = '" + ask + '\'' + 
			",maddi = '" + maddi + '\'' + 
			",genel = '" + genel + '\'' + 
			"}";
		}
}
