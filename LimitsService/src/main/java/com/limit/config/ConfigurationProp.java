package com.limit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits")
public class ConfigurationProp {
int max;
int min;
public int getMax() {
	return max;
}
public void setMax(int max) {
	this.max = max;
}
public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}


}
