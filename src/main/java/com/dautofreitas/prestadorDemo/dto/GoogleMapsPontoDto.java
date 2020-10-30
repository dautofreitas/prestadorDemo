package com.dautofreitas.prestadorDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoogleMapsPontoDto {
	private int id;
	private double latitude;
	private double longitude;
}
