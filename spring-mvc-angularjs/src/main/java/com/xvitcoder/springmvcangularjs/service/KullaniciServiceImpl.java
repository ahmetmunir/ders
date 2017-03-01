package com.xvitcoder.springmvcangularjs.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.xvitcoder.springmvcangularjs.beans.Kullanici;
import com.xvitcoder.springmvcangularjs.dao.KullaniciJDBCTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/20/12
 * Time: 11:14 PM
 */
@Service("kullaniciService")
public class KullaniciServiceImpl implements KullaniciService {
    private static List<Kullanici> kullaniciList = new ArrayList<Kullanici>();

    @Override
    public List<Kullanici> getAllKullanici() {
        return kullaniciList;
    }

    @Override
    public void addKullanici(String kullaniciAdi, String sifre) {
    	Kullanici entity = new Kullanici();
    	entity.setKullaniciAdi(kullaniciAdi);
    	entity.setSifre(sifre);
    	kullaniciList.add(entity);
    }

    @Override
    public void  deleteKullanici(Integer id){
        
    } 
    public boolean  isKullaniciExist(String kullaniciAdi, String sifre){
    	
    	ApplicationContext context = 
                new ClassPathXmlApplicationContext("bean.xml");
    	
    	KullaniciJDBCTemplate temp = 
    		      (KullaniciJDBCTemplate)context.getBean("kullaniciJDBCTemplate");
    	
    	Kullanici entity = temp.getKullanici(kullaniciAdi, sifre);
    	
        return entity != null;
    }

    @Override
    public void deleteAll() {
    	kullaniciList.clear();
    }
}
