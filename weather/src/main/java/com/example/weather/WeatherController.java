package com.example.weather;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class WeatherController {

    private static final String XML_EXAMPLE_FILE_PATH = "weather/src/main/java/com/example/weather/xml/response.xml";

    private static final String DOWNLOADED_XML_FILE_PATH = "weather/src/main/java/com/example/weather/xml/downloaded_weather_info.xml";

    private static final String BASE_URL = "https://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/weather/import")
    @Operation(summary = " ")
    public String downloadWeatherInfo() throws IOException {
        HttpHeaders headers = createRapidApiHeaders();
        String xmlString = restTemplate.exchange(BASE_URL, HttpMethod.GET, new HttpEntity<>(headers), String.class).getBody();
        BufferedWriter writer = new BufferedWriter(new FileWriter(DOWNLOADED_XML_FILE_PATH));
        writer.write(xmlString);
        writer.close();
        return xmlString;
    }

    @GetMapping("/weather/from-file")
    public Forecast weatherFromFile() throws IOException {
        String xmlFromFile = new String(Files.readAllBytes(Paths.get(XML_EXAMPLE_FILE_PATH)));
        XmlMapper xmlMapper = new XmlMapper();
        Forecast forecast = xmlMapper.readValue(xmlFromFile, Forecast.class);
        return forecast;
    }



    private static HttpHeaders createRapidApiHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_XML));
        headers.setContentType(MediaType.APPLICATION_XML);
        return headers;
    }


}
