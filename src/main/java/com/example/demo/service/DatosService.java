package com.example.demo.service;

import com.example.demo.bean.Datos;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;

@Service
public class DatosService {
    @Autowired private RestTemplate restTemplate;

    public static final String PAIS = "Spain";
    public static final String REGION = "galicia";

    public Datos getListaDatos() {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // https://api.covid19tracking.narrativa.com/api/:date/country/:country/region/:region
        String hoy = LocalDate.now().format(formatoFecha);
        final String url= "https://api.covid19tracking.narrativa.com/api/"+ hoy +"/country/"+ PAIS +"/region/"+ REGION;

        ResponseEntity<JsonNode> response = restTemplate.exchange(url, HttpMethod.GET, null, JsonNode.class);
        JsonNode json = response.getBody();
        JsonNode datos = json.get("total");
        Datos result = new Datos()
                .setMuertesConfirmadas(datos.get("today_confirmed").asInt());
        Logger.getLogger(this.getClass().getName()).info(result.toString());
        return result;
    }


}
