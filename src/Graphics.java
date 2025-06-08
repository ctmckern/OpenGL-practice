import com.jogamp.opengl.GL4bc;

public class Graphics {


    public static void fillRect(float x, float y, float width, float height){
        GL4bc gl = EventListener.gl;

        gl.glColor3f(0, 0, 1);
        gl.glBegin(GL4bc.GL_QUADS);
        gl.glVertex2f(-x, -y);
        gl.glVertex2f(-x, y + height);
        gl.glVertex2f(x + width, y + height);
        gl.glVertex2f(x + width, -y);
        gl.glEnd();
    }

}
