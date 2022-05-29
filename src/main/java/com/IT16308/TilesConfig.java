package com.IT16308;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
@Configuration
public class TilesConfig {
	@Bean("viewResolver")
	public ViewResolver getView() {
		UrlBasedViewResolver view = new UrlBasedViewResolver();
		view.setViewClass(TilesView.class);
		return view;
	}
	@Bean("tilesConfiger")
	public TilesConfigurer getTiles() {
		TilesConfigurer config = new TilesConfigurer();
		config.setDefinitions("/WEB-INF/tiles.xml");
		return config;
	}

}
