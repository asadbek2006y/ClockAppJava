
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.crypto.Data;

public class MyFrame extends JFrame implements ActionListener {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setTitle("My Clock App ");
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.PINK);
        timeLabel.setOpaque(true);

        dayFormat = new SimpleDateFormat("MM-MMMM dd yyyy ");
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        dayLabel.setForeground(new Color(0x00FF00));
        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) { 
            
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
       
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
