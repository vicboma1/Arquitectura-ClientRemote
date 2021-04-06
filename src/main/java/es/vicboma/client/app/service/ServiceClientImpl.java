package es.vicboma.client.app.service;

import es.vicboma.client.app.repository.RespositoryClient;

import java.util.Map;
import javax.annotation.PostConstruct;

@org.springframework.stereotype.Service
public class ServiceClientImpl implements ServiceClient {

  private Map<String,String> map;

  /**
   * Constructor
   */
  public ServiceClientImpl(){

  }

  @PostConstruct
  private void postConstruct() {
    this.map = RespositoryClient.factory();
  }

  /**
   * Get all map
   * @return
   */
  public Map<String,String> getAllMap(){
    return this.map;
  }

  /**
   * Get id
   * @return
   */
  public String getId(String id){
    return getAllMap().get(id);
  }

}

