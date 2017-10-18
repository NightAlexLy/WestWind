package org.luisyang.adminlte.bean.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户笔记记录
 * @author night
 */
public class RcUserNote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 328124813254688918L;

	private Long id;
	
	private String title;
	
	private String content;
	
	private String lable;
	
	private String category;
	
	private Date createTime;
	
	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "RcUserNotes [id=" + id + ", title=" + title + ", content=" + content + ", lable=" + lable
				+ ", category=" + category + ", createTime=" + createTime + ", userId=" + userId + "]";
	}
	
}
