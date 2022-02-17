package co.edu.unbosque.model;

import java.util.Objects;

public class Productos {
	
	private String InvoiceNo;
	private String StockCode;
	private String Descripcion;
	private String Quantity;
	private String InvoiceDte;
	private String UnitiPrice;
	private String CustomerID;
	private String Country;
	
	public Productos(String InvoiceNo,String StockCode,String Descripcion,String Quantity,String InvoiceDte,String UnitiPrice,
			         String CustomerID,String Country) {
		
		this.InvoiceNo=InvoiceNo;
		this.StockCode=StockCode;
		this.Descripcion=Descripcion;
		this.Quantity=Quantity;
		this.InvoiceDte=InvoiceDte;
		this.UnitiPrice=UnitiPrice;
		this.CustomerID=CustomerID;
		this.Country=Country;
		
	}

	public String getInvoiceNo() {
		return InvoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}

	public String getStockCode() {
		return StockCode;
	}

	public void setStockCode(String stockCode) {
		StockCode = stockCode;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getInvoiceDte() {
		return InvoiceDte;
	}

	public void setInvoiceDte(String invoiceDte) {
		InvoiceDte = invoiceDte;
	}

	public String getUnitiPrice() {
		return UnitiPrice;
	}

	public void setUnitiPrice(String unitiPrice) {
		UnitiPrice = unitiPrice;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
}