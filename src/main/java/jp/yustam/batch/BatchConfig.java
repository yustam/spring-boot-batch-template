package jp.yustam.batch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BatchConfig {

  @Value("${hoge}")
  private String dbAddress;

  public String getDbAddress() {
    return dbAddress;
  }

  public void setDbAddress(String dbAddress) {
    this.dbAddress = dbAddress;
  }

}
