package Inputs;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import Misc.Chip8;
import static com.jogamp.newt.event.KeyEvent.*;

public class KeyInput implements KeyListener {
    @Override
    public void keyPressed(KeyEvent keyEvent)
    {
        if(keyEvent.getKeyCode() == VK_1) Chip8.keys[0x1] = 1;
        else if(keyEvent.getKeyCode() == VK_2) Chip8.keys[0x2] = 2;
        else if(keyEvent.getKeyCode() == VK_3) Chip8.keys[0x3] = 3;
        else if(keyEvent.getKeyCode() == VK_4) Chip8.keys[0xC] = 'C';

        else if(keyEvent.getKeyCode() == VK_Q) Chip8.keys[0x5] = 4;
        else if(keyEvent.getKeyCode() == VK_W) Chip8.keys[0x6] = 5;
        else if(keyEvent.getKeyCode() == VK_E) Chip8.keys[0x6] = 6;
        else if(keyEvent.getKeyCode() == VK_R) Chip8.keys[0xD] = 'D';

        else if(keyEvent.getKeyCode() == VK_A) Chip8.keys[0x7] = 7;
        else if(keyEvent.getKeyCode() == VK_S) Chip8.keys[0x8] = 8;
        else if(keyEvent.getKeyCode() == VK_D) Chip8.keys[0x9] = 9;
        else if(keyEvent.getKeyCode() == VK_F) Chip8.keys[0xE] = 'E';

        else if(keyEvent.getKeyCode() == VK_Z) Chip8.keys[0xA] = 'A';
        else if(keyEvent.getKeyCode() == VK_X) Chip8.keys[0x0] = 0;
        else if(keyEvent.getKeyCode() == VK_C) Chip8.keys[0xB] = 'B';
        else if(keyEvent.getKeyCode() == VK_V) Chip8.keys[0xF] = 'F';
        else System.out.println("false");
    }
    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == VK_1) Chip8.keys[0x1] = 1;
        else if(keyEvent.getKeyCode() == VK_2) Chip8.keys[0x2] = 2;
        else if(keyEvent.getKeyCode() == VK_3) Chip8.keys[0x3] = 3;
        else if(keyEvent.getKeyCode() == VK_4) Chip8.keys[0xC] = 'C';

        else if(keyEvent.getKeyCode() == VK_Q) Chip8.keys[0x5] = 4;
        else if(keyEvent.getKeyCode() == VK_W) Chip8.keys[0x6] = 5;
        else if(keyEvent.getKeyCode() == VK_E) Chip8.keys[0x6] = 6;
        else if(keyEvent.getKeyCode() == VK_R) Chip8.keys[0xD] = 'D';

        else if(keyEvent.getKeyCode() == VK_A) Chip8.keys[0x7] = 7;
        else if(keyEvent.getKeyCode() == VK_S) Chip8.keys[0x8] = 8;
        else if(keyEvent.getKeyCode() == VK_D) Chip8.keys[0x9] = 9;
        else if(keyEvent.getKeyCode() == VK_F) Chip8.keys[0xE] = 'E';

        else if(keyEvent.getKeyCode() == VK_Z) Chip8.keys[0xA] = 'A';
        else if(keyEvent.getKeyCode() == VK_X) Chip8.keys[0x0] = 0;
        else if(keyEvent.getKeyCode() == VK_C) Chip8.keys[0xB] = 'B';
        else if(keyEvent.getKeyCode() == VK_V) Chip8.keys[0xF] = 'F';
        else System.out.println("false");
    }
}
