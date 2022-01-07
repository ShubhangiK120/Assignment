package com.Mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello 
{
@RequestMapping("/")
public String welcome()
{
	return"Hello!Welcome to the World";
}
@RequestMapping("/hi")
public String welcome2()
{
	return"Hello!Welcome to Java World";
}
}
