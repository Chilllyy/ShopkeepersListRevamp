package nl.me.shopkeeperslist.inventoryHolders;

import nl.me.shopkeeperslist.enums.ShopGUIType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class ShopInventoryHolder implements InventoryHolder {

    private final ShopGUIType TYPE;
    private final String VALUE;
    private int page;
    private boolean inStock;

    public ShopInventoryHolder(ShopGUIType type, String value, int page, boolean instock) {
        this.TYPE = type;
        this.VALUE = value;
        this.page = page;
        this.inStock = instock;
    }

    public ShopGUIType getTYPE() {
        return TYPE;
    }

    public String getVALUE() {
        return VALUE;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean getInStock() { return inStock; }

    @Override
    public Inventory getInventory() {
        return null;
    }
}
