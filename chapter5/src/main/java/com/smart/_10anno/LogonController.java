package com.smart._10anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LogonController {
	
    @Autowired
	private LogonService logonService;
}
