package com.xvitcoder.springmvcangularjs.controller;

import com.xvitcoder.springmvcangularjs.beans.Kullanici;
import com.xvitcoder.springmvcangularjs.service.KullaniciService;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kullanici")
public class KullaniciController {

	@Autowired
	private KullaniciService kullaniciService;

	@RequestMapping("/login")
	public void login(@RequestBody Kullanici kullanici, HttpServletResponse response) throws Exception {
		boolean isExist = kullaniciService.isKullaniciExist(kullanici.getKullaniciAdi(), kullanici.getSifre());

		if (isExist) {

			response.sendRedirect("http://localhost:8080/spring-mvc-angularjs/#/cars");

		}

		else
			throw new Exception("Error");
	}

	@RequestMapping("/layout")
	public String getCarPartialPage() {
		return "kullanici/layout";
	}
	
	@RequestMapping
    public String getIndexPage() {
        return "index";
    }
}
