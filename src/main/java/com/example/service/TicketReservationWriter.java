package com.example.service;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class TicketReservationWriter {


  public void writeTicket(String ligne) {
    JSONObject employeeDetails = new JSONObject();

    employeeDetails.put("firstName", "Lokesh");
    employeeDetails.put("lastName", "Gupta");
    employeeDetails.put("website", "howtodoinjava.com");

    try (
        FileWriter file = new FileWriter("employees.json")) {
      file.write(employeeDetails.toJSONString());
      file.flush();
    } catch (
        IOException e) {
      e.printStackTrace();
    }
  }


}
