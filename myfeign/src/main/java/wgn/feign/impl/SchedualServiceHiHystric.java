package wgn.feign.impl;

import org.springframework.stereotype.Component;

import wgn.feign.intf.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}
}
