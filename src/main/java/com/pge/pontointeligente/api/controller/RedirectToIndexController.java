package com.pge.pontointeligente.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Redirect to index.jsf SPA.
 * @author Marcelo Fernandes
 */
@Controller
public class RedirectToIndexController  {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:index.jsf";
	}
}