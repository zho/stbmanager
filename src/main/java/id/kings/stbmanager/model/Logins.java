package id.kings.stbmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logins {

  @Id
  private Long id;
  private String mac;
  private String serial;
  private String ip;
  private String isp;
  private String mobile;
  private String proxy;
  private String hosting;
  private String uagent;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }


  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public String getIsp() {
    return isp;
  }

  public void setIsp(String isp) {
    this.isp = isp;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getProxy() {
    return proxy;
  }

  public void setProxy(String proxy) {
    this.proxy = proxy;
  }


  public String getHosting() {
    return hosting;
  }

  public void setHosting(String hosting) {
    this.hosting = hosting;
  }


  public String getUagent() {
    return uagent;
  }

  public void setUagent(String uagent) {
    this.uagent = uagent;
  }

}
