package com.stackroute.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping//(value = VERSION + ARRIVAL)
@Api//(value = VERSION + ARRIVAL)
public class ArrivalController {

   @ApiOperation(value = "Get all arrivals")
   @GetMapping(value = "all")
   @ResponseBody
   public String getAllArrivals() {
	   return "test2";
   }

   @ApiOperation(value = "Select an arrivals")
   @GetMapping(value = "/{no}")
   @ResponseBody
   public String getAllArrivals(@PathVariable Integer no) {
	   Integer result = no * 2;
	   return result.toString();
   }
}
