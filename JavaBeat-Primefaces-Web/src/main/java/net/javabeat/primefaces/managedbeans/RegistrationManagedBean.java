package net.javabeat.primefaces.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;


import net.javabeat.springdata.beans.RegistrationService;
import net.javabeat.springdata.jpa.data.Item;

import com.google.common.collect.Lists;

@ManagedBean
@SessionScoped
public class RegistrationManagedBean implements Serializable{
	
	private Item item = new Item();
	
	private List<Item> items = new ArrayList<Item>();
	
	@ManagedProperty(value="#{registrationService}")
	private RegistrationService service;

	private Item selectedItem;

	public Item getEmployee() {
		return item;
	}

	public void setItems(Item item) {
		this.item = item;
	}

	public List<Item> getItems() {
		this.items = Lists.newArrayList(this.service.getRepository().findAll());
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	public RegistrationService getService() {
		return service;
	}

	public void setService(RegistrationService service) {
		this.service = service;
	}
	
	public String register(){
		this.service.getRepository().save(item);
		this.item = new Item();
		return "";
	} 
	
    public Item getSelectedItem() {
        return selectedItem;
    }
 
    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Car Selected" + ((Item) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
