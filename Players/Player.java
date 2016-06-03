/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokoCore.Players;
import java.util.ArrayList;
import dokoCore.Essentials.Cards;

/**
 *
 * @author Jonas
 */
public abstract class Player{
    
    private ArrayList<Cards> hand;
    private Cards[][] playedCards = new Cards[4][12];
    private boolean[] players;
    private boolean re;
    private int player;
    
    
    public Player(Cards[] hand, int player){
        setPlayer(player);
        setHand(hand);
    }
    
    
    public void setPlayer(int player){
        if(player >=0 && player <=3)
            this.player=player;
        
    }
    
    public void setHand(Cards[] hand){
        re =false;
        for(Cards card: hand){
            this.hand.add(new Cards(card));
            if(card.getColor()==Cards.cross && card.getPointValue()==Cards.dame)
                re=true;
        }
    }
    public Cards request(){
        return null;
        
    }
}
