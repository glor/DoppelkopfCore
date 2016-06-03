/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokoCore.Essentials;


/**
 *
 * @author Jonas
 */
public class Cards implements dokoCore.Interfaces.Settings, Comparable<Cards> {


    //========STATICS=======
    public static final int valueNine=0;
    public static final int valueJoker=1;
    public static final int valueQueen=2;
    public static final int valueKing=3;
    public static final int valueTen=4;
    public static final int valueAce=5;

    public static final int Bubensolo =100;
    public static final int Damensolo =101;
    public static final int Fleischlos =102;
    public static final int Kreuzsolo=103;
    public static final int Pieksolo=104;
    public static final int Herzsolo=105;


    private int basevalue;
    private int color;
    private int pointValue;
    private static int order;
    private int value=-1;
    
    private Cards(){
        color = pointValue =error;
        order=1;
        setBaseValue();
    }

    public int getValue() {
        return value;
    }

    private void modifieValue(int order){
        setOrder(order);
        modifieValue();
    }

    private void modifieValue(){
        value=basevalue;
        switch (order){
            case Bubensolo:
                if(pointValue==bube){
                    switch (color){
                        case cross:
                            value=value <<1;
                        case piek:
                            value=value <<1;
                        case heart:
                            value=value <<1;
                        case karo:
                             value=value <<7;
                            break;
                    }
                }
                break;
            case Damensolo:
                if(pointValue==dame){
                    switch (color){
                        case cross:
                            value=value <<1;
                        case piek:
                            value=value <<1;
                        case heart:
                            value=value <<1;
                        case karo:
                            value=value <<11;
                            break;
                    }
                }
                break;
            case Fleischlos:
                break;


            case Kreuzsolo:

                break;
            case Pieksolo:
                break;
            case Herzsolo:
                break;
            default:
                if(pointValue==dame){
                    switch (color){
                        case cross:
                            value=value <<1;
                        case piek:
                            value=value <<1;
                        case heart:
                            value=value <<1;
                        case karo:
                            value=value <<11;
                            break;
                    }
                }
                if(pointValue==bube){
                    switch (color){
                        case cross:
                            value=value <<1;
                        case piek:
                            value=value <<1;
                        case heart:
                            value=value <<1;
                        case karo:
                            value=value <<7;
                            break;
                    }
                }
                if(color == karo){

                }
                break;
        }

    }

    private void setBaseValue(){
        switch (pointValue){
            default:
                break;
            case nine:
                basevalue=valueNine;
                break;
            case bube:
                basevalue=valueJoker;
                break;
            case dame:
                basevalue= valueQueen;
                break;
            case king:
                basevalue=valueKing;
                break;
            case ten:
                basevalue=valueTen;
                break;
            case ace:
                basevalue=valueAce;
                break;
        }
    }

    public Cards (int color, int pointValue){
        setColor(color);
        setPointValue(pointValue);
        setBaseValue();
        order =1;
    }
    
   public Cards (Cards card){
       this.color=card.color;
       this.pointValue =card.pointValue;
       this.basevalue=card.basevalue;
   }

    /**
     * @param color the color to set
     */
    private void setColor(int color) {
        if (color >=karo &&color<=cross)
        this.color = color;
    }
    
    /**
     * @param pointValue the pointValue to set
     */
    private void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    
    
    
    //
    @Override 
    public int compareTo(Cards card){
        if (this.value > card.value)
            return 1;
        if(this.value == card.value)
            return 0;
        return -1;
    }

    @Override
    public boolean equals(Object o){
        if(o==null)
            return false;
        if(o instanceof Cards)
            return (((Cards)o).getColor()==getColor())&&(((Cards)o).getPointValue()== getPointValue());
        return false;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @return the pointValue
     */
    public int getPointValue() {
        return pointValue;
    }
        /**
     * @return the order
     */
    public static int getOrder() {
        return order;
    }

    /**
     * @param aOrder the order to set
     */
    private static void setOrder(int aOrder) {
        order = aOrder;
    }
}
