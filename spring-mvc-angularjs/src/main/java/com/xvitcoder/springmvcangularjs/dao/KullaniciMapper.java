package com.xvitcoder.springmvcangularjs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.xvitcoder.springmvcangularjs.beans.Kullanici;

public class KullaniciMapper implements RowMapper<Kullanici>  {
	public Kullanici mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kullanici kullanici = new Kullanici();
		kullanici.setId(rs.getInt("id"));
		kullanici.setKullaniciAdi(rs.getString("kullaniciAdi"));
		kullanici.setSifre(rs.getString("sifre"));
		return kullanici;
	}
}
