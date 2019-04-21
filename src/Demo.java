import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

class MainFrame extends JFrame{
	/*
	 * ��������
	 */
	public MainFrame(){
		
		
		/*
		 * ����������
		 * 
		 */
		setSize(1080,650);//���ڴ�С
		setTitle("Text Window");//���ڱ���
		this.setLayout(null);//�ؼ����ַ�ʽ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳���ť
		/*
		 * ���÷ִ���
		 * 
		 */
		
		HomePanel home = new HomePanel();
		add(home);
		
		
		/*
		 * �����ı���
		 */
		JTextField text = new JTextField();
		text.setBounds(180,20,250,50);
		text.setFont(new Font("",Font.PLAIN,30));
		add(text);
		
		/*
		 * ������ť
		 */
		
		JButton bottom = new JButton("Start");//������ť
		bottom.setBounds(450,470,160,80);//��ť�ߴ�
		bottom.setFont(new Font("",Font.PLAIN,20));//���������С
		add(bottom);
		
		bottom.addActionListener(new ActionListener() { //������ť
			
			@Override
			public void actionPerformed(ActionEvent e) { //����
				// TODO Auto-generated method stub
				String ipaddress;
				ipaddress = text.getText();
				
				//��ʾ�������
				ShowWindow showwindow = new ShowWindow();
				showwindow.setVisible(true);
						
				
				//�����output�ı�����
				HomePanel show = new HomePanel();
			
					
					show.Output(ipaddress);
				
				
			}
		});
		
		/*
		 * ��������
		 */
		JLabel label = new JLabel();
		label.setLayout(null);
		label.setBounds(20,15,160,50);
		label.setText("IP��ַ:");
		label.setFont(new Font("",Font.PLAIN,30));
		add(label);
		
	
	}
	
	
		public class HomePanel extends JPanel {
			boolean reshow = false;
			String Message;
			
			public HomePanel() {
				/*
				 * ���÷ִ�������
				 * 
				 */
				setBounds(500,20,540,400);
				setLayout(null);
				setBackground(Color.white);
				
				/*
				 * ��������ı���
				 */
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0,187,591,98);
				
					
					JTextArea output = new JTextArea();
					output.setBounds(5,5,535,395);
					output.setLineWrap(true);
					output.setFont(new Font("",Font.PLAIN,20));
					scrollPane.setViewportView(output);
					output.append("Text Message\n");
					output.append(Message+"\n");
					output.paintImmediately(output.getX(), output.getY(), output.getWidth(), output.getHeight());
					add(output);
					
					
			/*
			 * while(true) { if(reshow) {
			 * 
			 * this.reshow = false;
			 * 
			 * }
			 * 
			 * }
			 */
					
					
					
				
				
			
			/*
			 * JTextArea PanelOutput ; JPanel output; output = new JPanel();
			 * output.setBounds(5,5,535,395); output.setFont(new Font("",Font.PLAIN,20));
			 * output.add(new JScrollPane(PanelOutput)); add(output);
			 */
			
				
			}
			
			public void Output(String Message){
				
				this.Message = Message;
				this.reshow = true;
			
			}
			
			public void OutArea(String Message) {
				//String Message;
				
			}
			
		}
}
class ShowWindow extends JFrame{
	
	public ShowWindow() {
		/*
		 * ����������ʾ����Ĵ���
		 */
		setSize(1080,500);
		setTitle("���ڼ���...");
		this.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//�����˳���ť
		
	}
	
	
	
}




public class Demo {
	public static void main(String[] args) {
	
		MainFrame window = new MainFrame();
		
		window.setVisible(true);//���ô��ڿɼ�
		
		/*
		 * JBottom b = new JBottom(); 
		 * b.setBounds(50,90,80,60);
		 */
		/* MainFrame.HomePanel Home = new MainFrame(); */
		
		//window.setVisible(true);//���ô��ڿɼ�
		/* Home.setVisible(true); */
}
}
