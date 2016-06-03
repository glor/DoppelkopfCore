/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokoCore.UI;
import dokoCore.Essentials.Cards;
import dokoCore.Players.Player;
/**
 *
 * @author Jonas
 */
public interface UserInterface {
    public Cards deliver();
    public void display(Player player, Cards card);
}
