package dokoCore.Interfaces;

/**
 * Created by Jonas on 31.05.2016.
 */
public interface Player {
    public int request();

    public void confirm(); // Wollten wir das streichen??

    public void update(Card card);

    public void reset(Inventory inv);
}
