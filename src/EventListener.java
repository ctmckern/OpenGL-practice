import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class EventListener implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        //called once on startup
    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {
        //called once on close
    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        //called every frame, most coding for this class is here
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int x, int y, int width, int height) {
        //called when you resize the window
    }
}
