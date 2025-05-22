package cz.engeto.projekt2;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class Crypto {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private final int id;
    private String name;
    private String symbol;
    private Double price;
    private Double quantity;

    public Crypto(String name, String symbol, Double price, Double quantity) {
        this.id = counter.getAndIncrement();
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Crypto{id=" + id + ", name='" + name + "', symbol='" + symbol + "', price=" + price + ", quantity=" + quantity + "}";
    }

}
