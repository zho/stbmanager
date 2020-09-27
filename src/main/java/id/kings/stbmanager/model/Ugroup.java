package id.kings.stbmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ugroup {

  @Id
  private Long id;
  private String name;
  private String logo;
  private String background;
  private String iptv;
  private String playstore;
  private String speedtest;
  private String miscapp;
  private String scroll;
  private String scrolltime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }


  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }


  public String getIptv() {
    return iptv;
  }

  public void setIptv(String iptv) {
    this.iptv = iptv;
  }


  public String getPlaystore() {
    return playstore;
  }

  public void setPlaystore(String playstore) {
    this.playstore = playstore;
  }


  public String getSpeedtest() {
    return speedtest;
  }

  public void setSpeedtest(String speedtest) {
    this.speedtest = speedtest;
  }


  public String getMiscapp() {
    return miscapp;
  }

  public void setMiscapp(String miscapp) {
    this.miscapp = miscapp;
  }


  public String getScroll() {
    return scroll;
  }

  public void setScroll(String scroll) {
    this.scroll = scroll;
  }


  public String getScrolltime() {
    return scrolltime;
  }

  public void setScrolltime(String scrolltime) {
    this.scrolltime = scrolltime;
  }

}
