package jp.yustam.batch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BatchConfig {

  @Value("${db.host}")
  private String host;

  @Value("${db.port}")
  private int port;

  public String getHost() {
    return this.host;
  }

  public void setHost(String port) {
    this.host = port;
  }

  public int getPort() {
    return this.port;
  }

  public void setPort(int port) {
    this.port = port;
  }

}
