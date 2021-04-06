package es.vicboma.client.app.controller;

import es.vicboma.client.app.service.ServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

  private final ServiceClient serviceClient;

  /**
   *
   * @param serviceClient
   */
  @Autowired
  public Controller(final ServiceClient serviceClient){
    this.serviceClient = serviceClient;
  }

  @GetMapping(value = "/")
  public String manualService() {
    return "getId  => '/id/{id}' where id = [1,2,3,4,5,6]\n"+
           "getAll => '/ids' ";
  }

  @GetMapping(value="/id/{id}")
    public String getId(@PathVariable String id){
      return this.serviceClient.getAllMap().get(id);
    }

  @GetMapping(value="/ids")
  public Map<String,String> getIds(){
    return this.serviceClient.getAllMap();
  }
}
