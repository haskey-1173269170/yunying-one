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
    private String href;
    private Integer pid;
    private Boolean leaf;
    private Boolean selectable;
    private List<Power> nodes;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public List<Power> getNodes() {
        return nodes;
    }

    public void setNodes(List<Power> nodes) {
        this.nodes = nodes;
    }
}
