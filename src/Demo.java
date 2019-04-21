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
	 * 创建窗口
	 */
	public MainFrame(){
		
		
		/*
		 * 设置主窗口
		 * 
		 */
		setSize(1080,650);//窗口大小
		setTitle("Text Window");//窗口标题
		this.setLayout(null);//控件布局方式
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出按钮
		/*
		 * 调用分窗口
		 * 
		 */
		
		HomePanel home = new HomePanel();
		add(home);
		
		
		/*
		 * 创建文本框
		 */
		JTextField text = new JTextField();
		text.setBounds(180,20,250,50);
		text.setFont(new Font("",Font.PLAIN,30));
		add(text);
		
		/*
		 * 创建按钮
		 */
		
		JButton bottom = new JButton("Start");//创建按钮
		bottom.setBounds(450,470,160,80);//按钮尺寸
		bottom.setFont(new Font("",Font.PLAIN,20));//案件字体大小
		add(bottom);
		
		bottom.addActionListener(new ActionListener() { //监听按钮
			
			@Override
			public void actionPerformed(ActionEvent e) { //处理
				// TODO Auto-generated method stub
				String ipaddress;
				ipaddress = text.getText();
				
				//显示输出窗口
				ShowWindow showwindow = new ShowWindow();
				showwindow.setVisible(true);
						
				
				//输出在output文本框中
				HomePanel show = new HomePanel();
			
					
					show.Output(ipaddress);
				
				
			}
		});
		
		/*
		 * 创建标题
		 */
		JLabel label = new JLabel();
		label.setLayout(null);
		label.setBounds(20,15,160,50);
		label.setText("IP地址:");
		label.setFont(new Font("",Font.PLAIN,30));
		add(label);
		
	
	}
	
	
		public class HomePanel extends JPanel {
			boolean reshow = false;
			String Message;
			
			public HomePanel() {
				/*
				 * 设置分窗口属性
				 * 
				 */
				setBounds(500,20,540,400);
				setLayout(null);
				setBackground(Color.white);
				
				/*
				 * 创建输出文本框
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
		 * 创建用于显示结果的窗口
		 */
		setSize(1080,500);
		setTitle("正在加载...");
		this.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//设置退出按钮
		
	}
	
	
	
}




public class Demo {
	public static void main(String[] args) {
	
		MainFrame window = new MainFrame();
		
		window.setVisible(true);//设置窗口可见
		
		/*
		 * JBottom b = new JBottom(); 
		 * b.setBounds(50,90,80,60);
		 */
		/* MainFrame.HomePanel Home = new MainFrame(); */
		
		//window.setVisible(true);//设置窗口可见
		/* Home.setVisible(true); */
}
}
