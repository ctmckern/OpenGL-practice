package Inputs;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import static com.jogamp.newt.event.KeyEvent.*;


//Needs cleaning up from leftover chip8 code
public class KeyInput implements KeyListener
{
    public static int[] keys = new int[16];
    @Override
    public void keyPressed(KeyEvent keyEvent)
    {
        if(keyEvent.getKeyCode() == VK_1) keys[0x1] = 1;
        else if(keyEvent.getKeyCode() == VK_2) keys[0x2] = 2;
        else if(keyEvent.getKeyCode() == VK_3) keys[0x3] = 3;
        else if(keyEvent.getKeyCode() == VK_4) keys[0xC] = 'C';

        else if(keyEvent.getKeyCode() == VK_Q) keys[0x5] = 4;
        else if(keyEvent.getKeyCode() == VK_W) keys[0x6] = 5;
        else if(keyEvent.getKeyCode() == VK_E) keys[0x6] = 6;
        else if(keyEvent.getKeyCode() == VK_R) keys[0xD] = 'D';

        else if(keyEvent.getKeyCode() == VK_A) keys[0x7] = 7;
        else if(keyEvent.getKeyCode() == VK_S) keys[0x8] = 8;
        else if(keyEvent.getKeyCode() == VK_D) keys[0x9] = 9;
        else if(keyEvent.getKeyCode() == VK_F) keys[0xE] = 'E';

        else if(keyEvent.getKeyCode() == VK_Z) keys[0xA] = 'A';
        else if(keyEvent.getKeyCode() == VK_X) keys[0x0] = 0;
        else if(keyEvent.getKeyCode() == VK_C) keys[0xB] = 'B';
        else if(keyEvent.getKeyCode() == VK_V) keys[0xF] = 'F';
        else System.out.println("false");
    }
    @Override
    public void keyReleased(KeyEvent keyEvent)
    {
        if(keyEvent.getKeyCode() == VK_1) keys[0x1] = 1;
        else if(keyEvent.getKeyCode() == VK_2) keys[0x2] = 2;
        else if(keyEvent.getKeyCode() == VK_3) keys[0x3] = 3;
        else if(keyEvent.getKeyCode() == VK_4) keys[0xC] = 'C';

        else if(keyEvent.getKeyCode() == VK_Q) keys[0x5] = 4;
        else if(keyEvent.getKeyCode() == VK_W) keys[0x6] = 5;
        else if(keyEvent.getKeyCode() == VK_E) keys[0x6] = 6;
        else if(keyEvent.getKeyCode() == VK_R) keys[0xD] = 'D';

        else if(keyEvent.getKeyCode() == VK_A) keys[0x7] = 7;
        else if(keyEvent.getKeyCode() == VK_S) keys[0x8] = 8;
        else if(keyEvent.getKeyCode() == VK_D) keys[0x9] = 9;
        else if(keyEvent.getKeyCode() == VK_F) keys[0xE] = 'E';

        else if(keyEvent.getKeyCode() == VK_Z) keys[0xA] = 'A';
        else if(keyEvent.getKeyCode() == VK_X) keys[0x0] = 0;
        else if(keyEvent.getKeyCode() == VK_C) keys[0xB] = 'B';
        else if(keyEvent.getKeyCode() == VK_V) keys[0xF] = 'F';
        else System.out.println("false");
    }
}
