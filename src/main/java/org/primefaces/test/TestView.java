package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;
import org.primefaces.test.dto.User;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;
    private List<User> userList;

    @PostConstruct
    private void init() {
        string = "Welcome to PrimeFaces!!!";
        userList = new ArrayList<>();
        userList.add(User.builder().fullName("Ali").age(2).build());
        userList.add(User.builder().fullName("Zuhayr").age(4).build());
        userList.add(User.builder().fullName("Umaima").age(6).build());
    }

    public void add() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Add action called"));
    }
    public void update() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update action called"));
    }
    public void delete() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Delete action called"));
    }

}
