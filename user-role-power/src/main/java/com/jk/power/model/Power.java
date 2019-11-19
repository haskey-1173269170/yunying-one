package com.jk.power.model;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName Power
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 11:54
 * @Version 1.0
 **/
public class Power implements Serializable {
    private static final long serialVersionUID = -2756403093775272194L;
    private Integer id;

    private String text;

    private String url;

    private Integer pid;

    private String state;

    private String checked;

    private List<Power> children;

    private String ident;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public List<Power> getChildren() {
        return children;
    }

    public void setChildren(List<Power> children) {
        this.children = children;
    }
}
