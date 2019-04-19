package cn.background.web.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ProductUploadAction extends ActionSupport{
	private File uploadImg;
	private Integer id;
	private String type;
	private Integer price;
	
	public String execute() throws Exception {
//		String path = ServletActionContext.getServletContext().getRealPath("/img");
		String path = "E:/Users/qicheng/eclipse-workspace1/Mall/WebContent/img";
		File file = new File(path);
		if(!file.exists())
			file.mkdirs();
		
		try {
			FileUtils.copyFile(uploadImg, new File(file,type+id+".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public File getUploadImg() {
		return uploadImg;
	}


	public void setUploadImg(File uploadImg) {
		this.uploadImg = uploadImg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
