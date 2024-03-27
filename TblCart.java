package jp.co.internous.milestone.model.domain;

import java.sql.Timestamp;

import jp.co.internous.milestone.model.form.CartForm;

/**
 * tbl_cartのドメイン
 * @author インターノウス
 *
 */
public class TblCart {
    private int id;
    private int userId;
    private int productId;
    private int productCount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    public TblCart() {};
    public TblCart(CartForm f,int userId) {
		this.setUserId(userId);
		this.setProductId(f.getProductId());
		this.setProductCount(f.getProductCount());
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
