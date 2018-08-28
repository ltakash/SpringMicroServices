package com.limit.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.config.ConfigurationProp;
import com.limit.model.LimitConfiguration;

@RestController
public class LimitController {
	@Autowired
	ConfigurationProp configurationProp;

	@GetMapping
	public LimitConfiguration retrieveLimitsConfiguration() {
		return new LimitConfiguration(configurationProp.getMax(), configurationProp.getMin());
	}

}
