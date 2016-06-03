package dokoCore.Interfaces;

/**
 * Created by Jonas on 31.05.2016.
 */
public interface Card extends Comparable<Card> {
    /**
     * TODO
     * Card contains a final int that can only be set in the constructor. Thereby this method is obsolete.
     * There is no Interface for Card needed. Card should be a class.
     *
     * @return value
     * @deprecated
     */
    public int getValue();

}
