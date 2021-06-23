package com.example.algamoney.api.event;

import javax.servlet.ServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	
	private ServletResponse response;
	private Long codigo;

	public RecursoCriadoEvent(Object source, ServletResponse response, Long codigo) {
		super(source);
		
		this.response = response;
		this.codigo = codigo;
	}

	public ServletResponse getResponse() {
		return response;
	}
	
	public Long getCodigo() {
		return codigo;
	}
}
