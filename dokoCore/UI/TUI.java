/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokoCore.UI;
import android.util.Log;

import dokoCore.Essentials.Cards;
import dokoCore.Players.Player;

/**
 *
 * @author Jonas
 */
public class TUI implements UserInterface {
    
    @Override
    public Cards deliver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display(Player player, Cards card) {

        Log.i("ZUG:","Spieler "+  player.toString() + " spielt: "+ card.toString());
      // System.out.println("Spieler %s spielt: %s" player, card);
    }


}
