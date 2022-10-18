package br.com.comex.ws;

import javax.xml.ws.Endpoint;

public class MainComexWS {

	public static void main(String[] args) {
		
		ComexWs servico = new ComexWs();
		String url = "http://localhost:8080/ComexWS";
		
		Endpoint.publish(url, servico);
	}

}
