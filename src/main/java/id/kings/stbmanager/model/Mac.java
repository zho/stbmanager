package id.kings.stbmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mac {

  @Id
  private Long id;
  private String mac;
  private String ugroup;
  private String status;
  private String register;
  private String comments;
  private String adddate;
  private String addby;


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


  public String getUgroup() {
    return ugroup;
  }

  public void setUgroup(String ugroup) {
    this.ugroup = ugroup;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getRegister() {
    return register;
  }

  public void setRegister(String register) {
    this.register = register;
  }


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  public String getAdddate() {
    return adddate;
  }

  public void setAdddate(String adddate) {
    this.adddate = adddate;
  }


  public String getAddby() {
    return addby;
  }

  public void setAddby(String addby) {
    this.addby = addby;
  }

}
