package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LocalWheaterDTO;
import com.example.demo.dto.OpenWheaterDTO;
import com.example.demo.service.WheaterService;

@RestController
@RequestMapping("/wheater")
public class WheaterController {

	@Autowired
	private WheaterService wheaterService;

	@GetMapping("/v1/city")
	public ResponseEntity<?> getWheaterByCity(@RequestParam(value = "cityId", defaultValue = "") String cityId){
		Optional<OpenWheaterDTO> optional = wheaterService.getWheaterByCity(cityId);
		if(optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/v1/cities")
	public ResponseEntity<?> getAllWheaters(){
		Optional<List<LocalWheaterDTO>> optional = wheaterService.getAllWheaters();
		if(optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}

}