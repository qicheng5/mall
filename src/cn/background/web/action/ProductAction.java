package cn.background.web.action;

import java.util.List;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.background.service.ProductService;
import cn.background.service.impl.ProductServiceImpl;
import cn.domain.Product;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	private Product product = new Product();
	private ProductService cs = new ProductServiceImpl();
	
	
	public String list() throws Exception {
		List<Product> list = cs .display();
		ActionContext.getContext().put("list", list);
		
		return SUCCESS;
	}

	public String add() throws Exception {
		if (product.getProduct_id()!=null && StringUtils.isNotBlank(product.getProduct_type())) {
			System.out.println(product.getProduct_id());
			cs.save(product);
			return "list";
		} else {
			return ERROR;
		}
	}
	
	@Override
	public Product getModel() {
		return product;
	}
	
}
