package com.xvitcoder.springmvcangularjs.dao;



import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xvitcoder.springmvcangularjs.beans.Kullanici;

public class KullaniciJDBCTemplate implements KullaniciDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(String kullaniciAdi, String sifre) {
      String SQL = "insert into Kullanici (KullaniciAdi, Sifre) values (?, ?)";
      jdbcTemplateObject.update( SQL, kullaniciAdi, sifre);
      return;
   }

   public Kullanici getKullanici(String kullaniciAdi, String sifre) {
	   try{
		   String SQL = "select * from Kullanici where KullaniciAdi=? and Sifre = ?";
		      Kullanici kullanici = jdbcTemplateObject.queryForObject(SQL, 
		                        new Object[]{kullaniciAdi, sifre}, new KullaniciMapper());
		      return kullanici;
	   }
	   catch (Exception e) {
			return null;
	   }
      
   }

   public List<Kullanici> listKullanici() {
      String SQL = "select * from Kullanici";
      List <Kullanici> kullanicilar = jdbcTemplateObject.query(SQL, 
                                new KullaniciMapper());
      return kullanicilar;
   }

   public void delete(Integer id){
      String SQL = "delete from Kullanici where Id = ?";
      jdbcTemplateObject.update(SQL, id);
      return;
   }

   public void update(Integer id, String sifre){
      String SQL = "update Kullanici set Sifre = ? where id = ?";
      jdbcTemplateObject.update(SQL, sifre, id);
      return;
   }

}