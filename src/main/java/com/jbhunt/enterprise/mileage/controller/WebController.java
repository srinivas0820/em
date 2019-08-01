package com.jbhunt.enterprise.mileage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	//Example URL : http://localhost:8080/miles/citystate/LowellAR/USA/citystate/SpringdaleAR/USA/rand/19/practical?cache=false
	@RequestMapping(path = "/miles/{originStopType}/{originStop}/{destinationStopType}/{destinationStop}/{country}/{product}/{productVersion}/{routeType}/{restrictions}", method = RequestMethod.GET)
	public ResponseEntity<Double> getMiles(
			@PathVariable(value = "originStopType", required = false) String originStopType,
			@PathVariable(value = "originStop", required = false) String originStop,
			@PathVariable(value = "destinationStopType", required = false) String destinationStopType,
			@PathVariable(value = "destinationStop", required = false) String destinationStop,
			@PathVariable(value = "country", required = false) String country,
			@PathVariable(value = "product", required = false) String product,
			@PathVariable(value = "productVersion", required = false) String productVersion,
			@PathVariable(value = "routeType", required = false) String routeType,
			@PathVariable(value = "restrictions", required = false) String restrictions,
			@RequestParam(value = "cache", required = false) String cache) {
		return ResponseEntity.ok().body(1000.00);
	}

	//Example URL : http://localhost:8080/tolls/benar/cityStateCode/lartx/cityStateCode/eagmn/pcmiler/21/SHORTEST/PHYSICALRESTRICTIONS/discount/23/vehicleconfig/120/48/96/80000/4/1?cache=off@RequestMapping(path = "/tolls/{originStopType}/{originStop}/{destinationStopType}/{destinationStop}/{country}/{product}/{productVersion}/{routeType}/{restrictions}/{tollType}/{tollVersion}/{vehicleconfig}/{vclHeight}/{vclLength}/{vclWidth}/{vclWeight}/{vclAxleNum}/{vclTrailerNum}", method = RequestMethod.GET)
	public ResponseEntity<Double> tolls(@PathVariable(value = "originStopType", required = true) String originStopType,
			@PathVariable(value = "originStop", required = false) String originStop,
			@PathVariable(value = "destinationStopType", required = false) String destinationStopType,
			@PathVariable(value = "destinationStop", required = false) String destinationStop,
			@PathVariable(value = "country", required = false) String country,
			@PathVariable(value = "product", required = false) String product,
			@PathVariable(value = "productVersion", required = false) String productVersion,
			@PathVariable(value = "routeType", required = false) String routeType,
			@PathVariable(value = "restrictions", required = false) String restrictions,
			@PathVariable(value = "tollType", required = false) String tollType,
			@PathVariable(value = "tollVersion", required = false) String tollVersion,
			@PathVariable(value = "vehicleconfig", required = false) String vehicleconfig,
			@PathVariable(value = "vclHeight", required = false) String vclHeight,
			@PathVariable(value = "vclLength", required = false) String vclLength,
			@PathVariable(value = "vclWidth", required = false) String vclWidth,
			@PathVariable(value = "vclWeight", required = false) String vclWeight,
			@PathVariable(value = "vclAxleNum", required = false) String vclAxleNum,
			@PathVariable(value = "vclTrailerNum", required = false) String vclTrailerNum,
			@RequestParam(value = "cache", required = false) String cache) {
		return ResponseEntity.ok().body(1000.00);
	}

}
