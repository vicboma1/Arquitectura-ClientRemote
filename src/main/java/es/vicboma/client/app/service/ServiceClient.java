package es.vicboma.client.app.service;

import java.util.Map;

public interface ServiceClient {

  /**
   * Get all map
   * @return
   */
  Map<String,String> getAllMap();

  /**
   * Get id
   * @return
   */
  String getId(String id);

}
