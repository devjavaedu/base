package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.LocalWheaterDTO;
import com.example.demo.dto.OpenWheaterDTO;
import com.example.demo.entity.Wheater;
import com.example.demo.repository.WheaterRepository;
import com.google.gson.Gson;

@Service
public class WheaterService {

	private static final Logger logger = LoggerFactory.getLogger(WheaterService.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WheaterRepository wheaterRepository;

	@Value("${api.openwheatermap.url}")
	private String wheaterUrl;

	@Value("${api.openwheatermap.city}")
	private String wheaterCity;

	@Value("${api.openwheatermap.apikey}")
	private String wheaterApiKey;

	private static ModelMapper modelMapper = new ModelMapper();

	public Optional<OpenWheaterDTO> getWheaterByCity(String city) {

		city = city != null && !city.isEmpty() ? city : wheaterCity;
		logger.info("City {}", city);

		String url = wheaterUrl + "" + "?id=" + city + "&appid=" + wheaterApiKey;
		OpenWheaterDTO result = restTemplate.getForObject(url, OpenWheaterDTO.class);
		logger.info("Body {}", new Gson().toJson(result, OpenWheaterDTO.class));

		saveWheater(result);

		return Optional.ofNullable(result);

	}

	public Optional<List<LocalWheaterDTO>> getAllWheaters() {
		List<Wheater> list = wheaterRepository.findAll();
		List<LocalWheaterDTO> dtos = list.stream().map(index -> modelMapper.map(index, LocalWheaterDTO.class)).collect(Collectors.toList());
		return Optional.ofNullable(dtos);
	}

	private void saveWheater(OpenWheaterDTO dto) {
		wheaterRepository.save(new Wheater(dto.getCity().getName(), dto.getCity().getCountry(),
				LocalDateTime.now(), convertFromFahrenheitToCelsius(dto.getList().get(0).getMain().getTempMin()),
				convertFromFahrenheitToCelsius(dto.getList().get(0).getMain().getTempMax())));
	}

	private Double convertFromFahrenheitToCelsius(Double value) {
		Double result = (((value - 32) * 5)/9);
		logger.info("Conversion from {}ºF to {}ºC", value, result);
		return result;
	}

}