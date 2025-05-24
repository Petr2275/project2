package cz.engeto.projekt2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CryptoService {
    private final List<Crypto> portfolio = new ArrayList<>();


    // Přidání nové kryptoměny
    public void addCrypto(Crypto crypto) {
        portfolio.add(crypto);
    }

    // Výpis všech kryptoměn
    public void listCryptos() {
        portfolio.forEach(System.out::println);
    }

    // Seřazení podle názvu
    public void sortByName() {
        portfolio.sort(Comparator.comparing(Crypto::getName));
    }

    // Seřazení podle ceny
    public void sortByPrice() {
        portfolio.sort(Comparator.comparing(Crypto::getPrice));
    }

    // Seřazení podle počtu jednotek
    public void sortByQuantity() {
        portfolio.sort(Comparator.comparing(Crypto::getQuantity));
    }
}
