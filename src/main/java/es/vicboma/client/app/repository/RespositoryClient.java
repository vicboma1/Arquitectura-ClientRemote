package es.vicboma.client.app.repository;

import java.util.HashMap;
import java.util.Map;

public class RespositoryClient {

  /**
   * Factory method
   * @return
   */
  public static Map<String,String> factory() {
    return new HashMap() {
      {
        put("a","1");
        put("b","2");
        put("c","3");
        put("d","4");
        put("e","5");
        put("f","6");
      }
    };
  }
}
