import com.jogamp.opengl.GL4bc;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;

public class EventListener implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        //called once on startup
        GL4bc gl = glAutoDrawable.getGL().getGL4bc();
        //What color the screen is when clearing the frame, in this case black
        gl.glClearColor(0f, 0f, 0f, 1);
        //This clears the color buffer(note self: look into color buffers, is it just a buffer for color data?)

    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {
        //called once on close
    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        GL4bc gl = glAutoDrawable.getGL().getGL4bc();

        gl.glClear(GL4bc.GL_COLOR_BUFFER_BIT);
        //3f Stands for 3 floats
        gl.glColor3f(0, 0, 1);

        gl.glBegin(GL4bc.GL_QUADS);
            gl.glVertex2f(-0.5f, -0.5f);
            gl.glVertex2f(0.5f, -0.5f);
            gl.glVertex2f(-0.5f, 0.5f);
            gl.glVertex2f(0.5f, 0.5f);
        gl.glEnd();

        //called every frame, most coding for this class is here
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int x, int y, int width, int height) {
        //called when you resize the window or when the window is first opened
        GL4bc gl = glAutoDrawable.getGL().getGL4bc();

        gl.glMatrixMode(GL4bc.GL_PROJECTION);
        gl.glLoadIdentity();

        gl.glOrtho(0, 3, 0, 3, -1, 1);
        gl.glMatrixMode(GL4bc.GL_MODELVIEW);
    }
}
