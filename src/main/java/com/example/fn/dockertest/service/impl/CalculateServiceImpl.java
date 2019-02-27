package com.example.fn.dockertest.service.impl;

import org.springframework.stereotype.Service;
import com.example.fn.dockertest.service.CalculateService;

@Service
public class CalculateServiceImpl implements CalculateService {
	@Override
	public int cal(int x, int y, String operare) {
		if (operare.equals("+"))
			return x + y;
		else if (operare.equals("-"))
			return x - y;
		else if (operare.equals("*"))
			return x * y;
		else
			return x / y;
	}
}