import java.awt.EventQueue;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    EventQueue.invokeLater(() -> {
      Application ex = new Application();
      ex.setVisible(true);
    });
  }
}