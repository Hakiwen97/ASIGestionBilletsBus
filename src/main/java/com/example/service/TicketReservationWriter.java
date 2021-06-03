package com.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jdi.ObjectCollectedException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class TicketReservationWriter {


  public void writeTicket(String ligne) throws IOException, ParseException {

    JSONParser parser=new JSONParser();
    JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\ASI\\ASIGestionBilletsBus\\tickets\\tickets.json"));

    JSONObject ticket = new JSONObject();

    ticket.put("ligne", ligne);

    //JSONArray tickets = new JSONArray();
    //tickets.add(ticket);

   a.add(ticket);




    try (

        FileWriter file = new FileWriter("C:\\ASI\\ASIGestionBilletsBus\\tickets\\tickets.json")) {
      file.write(a.toJSONString());
      file.flush();
    } catch (
        IOException e) {
      e.printStackTrace();
    }
  }



}
