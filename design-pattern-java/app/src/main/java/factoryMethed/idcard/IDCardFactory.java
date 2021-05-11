package factoryMethed.idcard;

import factoryMethed.framework.Factory;
import factoryMethed.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private final List<IDCard> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add((IDCard) product);
    }
}
