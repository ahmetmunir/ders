package com.xvitcoder.springmvcangularjs.service;

import java.util.List;

import com.xvitcoder.springmvcangularjs.beans.Kullanici;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/20/12
 * Time: 11:12 PM
 */
public interface KullaniciService {
    public List<Kullanici> getAllKullanici();

    public void addKullanici(String kullaniciAdi, String sifre);

    public void deleteKullanici(Integer id);
    
    public boolean isKullaniciExist(String kullaniciAdi, String sifre);

    public void deleteAll();
}
