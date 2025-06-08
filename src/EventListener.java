import com.jogamp.opengl.GL4bc;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;

public class EventListener implements GLEventListener {

    public static GL4bc gl = null;

    @Override
    public void init(GLAutoDrawable glAutoDrawable)
    {
        //called once on startup
        gl = glAutoDrawable.getGL().getGL4bc();
        //What color the screen is when clearing the frame, in this case black
        gl.glClearColor(0f, 0f, 0f, 0.5f);
        //This clears the color buffer(note self: look into color buffers, is it just a buffer for color data?)

    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable)
    {
        //called once on close
    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable)
    {
        gl = glAutoDrawable.getGL().getGL4bc();
        gl.glClear(GL4bc.GL_COLOR_BUFFER_BIT);
        Graphics.fillRect(0, 0, 1, 2);
//        gl.glColor3f(0, 0, 1);
//        gl.glBegin(GL4bc.GL_QUADS);
//            gl.glVertex2f(-50, -50f);
//            gl.glVertex2f(-50f, 50f);
//            gl.glVertex2f(50f, 50f);
//            gl.glVertex2f(50f, -50f);
//        gl.glEnd();

    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int x, int y, int width, int height)
    {
        //called when you resize the window or when the window is first opened
        GL4bc gl = glAutoDrawable.getGL().getGL4bc();

        gl.glMatrixMode(GL4bc.GL_PROJECTION);
        gl.glLoadIdentity();

        float unitsTall = Renderer.getWindowHeight()/(Renderer.getWindowWidth()/Renderer.unitsWide);
        gl.glOrtho(-Renderer.unitsWide/2, Renderer.unitsWide/2,-unitsTall, unitsTall, -1, 1);
        gl.glMatrixMode(GL4bc.GL_MODELVIEW);
    }
}
