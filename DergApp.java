
import javax.swing.JFrame;

class DergApp extends JFrame{
  public DergApp() {

    initUI();
  }

  private void initUI() {

    add(new DergPanel());

    setSize(250, 200);

    setTitle("Application");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }    
}