package com.xvitcoder.springmvcangularjs.beans;

public class Kullanici {
	private int id;
    private String kullaniciAdi;
    private String sifre;
    private int birimId;
    
    
    public Kullanici() { }

    public Kullanici(int id, String kullaniciAdi, String sifre) {
        this.setId(id);
        this.setKullaniciAdi(kullaniciAdi);
        this.setSifre(sifre);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public int getBirimId() {
		return birimId;
	}

	public void setBirimId(int birimId) {
		this.birimId = birimId;
	}

   
  

}
