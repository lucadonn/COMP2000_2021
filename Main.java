import javax.swing.*;
import java.awt.*;

class Main extends JFrame {

    class App extends JPanel {

        public App() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g){
            
            for(int i = 10; i<710; i+=35){
                for(int j = 10; j < 710; j+=35){
                    g.setColor(Color.WHITE);
                    g.fillRect(i, j, 35, 35);
                    g.setColor(Color.BLACK);
                    g.drawRect(i, j, 35, 35);
                }
            }
            if(getMousePosition() != null) {
                g.setColor(Color.RED);
                g.fillOval((int)getMousePosition().getX()-5, (int)getMousePosition().getY()-5, 5, 5);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run(){
        while(true){
            this.repaint();
        }
    }

}

