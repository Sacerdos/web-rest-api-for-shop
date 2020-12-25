package indychkov.webrestapiforshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item extends Basis{

    public Item(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String product;
    private String description;
    private String forKind;
    private int price;

    public Item(Integer id, String product, String description, String forKind, int price) {
        this.id = id;
        this.product = product;
        this.description = description;
        this.forKind = forKind;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getForKinds() {
        return forKind;
    }

    public void setForKinds(String forKind) {
        this.forKind = forKind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
