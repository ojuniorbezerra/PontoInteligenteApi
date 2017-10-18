package com.pge.pontointeligente.api.controller;

import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ViewScoped;

@Named
@ViewScoped
public class IndexController {

	@Getter @Setter
	private String text = "Teste de controller";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
