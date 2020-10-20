package id.kings.stbmanager.model;

import javax.persistence.*;

@Entity
public class Apps {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String apk;
  private String apkid;
  private String version;
  private String finstall;
  private String fupdate;

  @ManyToOne
  private Category category;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getApk() {
    return apk;
  }

  public void setApk(String apk) {
    this.apk = apk;
  }


  public String getApkid() {
    return apkid;
  }

  public void setApkid(String apkid) {
    this.apkid = apkid;
  }


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public String getFinstall() {
    return finstall;
  }

  public void setFinstall(String finstall) {
    this.finstall = finstall;
  }


  public String getFupdate() {
    return fupdate;
  }

  public void setFupdate(String fupdate) {
    this.fupdate = fupdate;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
