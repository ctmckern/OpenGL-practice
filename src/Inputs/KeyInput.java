package Inputs;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

import static com.jogamp.newt.event.KeyEvent.*;

public class KeyInput implements KeyListener {
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == VK_H){
            System.out.println("true");
        }
        else System.out.println("false");
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == VK_F){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
