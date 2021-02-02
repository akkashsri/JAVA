import javax.swing.JFrame;

public class ShowAFrame{
    public static void main(String args[]){
        JFrame  myFrame= new JFrame();
        String myTitle = "Blank Frame";
        myFrame.setVisible(true);
        
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle(myTitle);
        myFrame.setSize(600,400);
    }
}