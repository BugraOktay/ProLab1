import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Robot;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JScrollBar;

public class Arayuz extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtSatr;
	private JTextField txtStun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arayuz frame = new Arayuz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws AWTException 
	 */
	public Arayuz() throws AWTException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 550);
		getContentPane().setLayout(null);
		
		JLabel[][] lblNewLabel = new JLabel[70][70];
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		
		
		
		panel_3.setBackground(new Color(250, 128, 114));
		panel_3.setBounds(0, 0, 856, 550);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		txtSatr = new JTextField();
		txtSatr.setToolTipText("");
		txtSatr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSatr.setBounds(760, 42, 86, 20);
		panel_3.add(txtSatr);
		txtSatr.setColumns(10);
		
		txtStun = new JTextField();
		txtStun.setToolTipText("");
		txtStun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtStun.setBounds(760, 11, 86, 20);
		panel_3.add(txtStun);
		txtStun.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("M:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(727, 10, 23, 21);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("N:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(727, 41, 23, 21);
		panel_3.add(lblNewLabel_2_1);
		
		JButton btnNewButton_7 = new JButton("Çalıştır");
		
		btnNewButton_7.setBounds(727, 91, 119, 23);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Labirent Değiş");
		
		btnNewButton_8.setBounds(726, 126, 120, 23);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("En kısa yol");
		
		
		btnNewButton_9.setBounds(727, 160, 119, 23);
		panel_3.add(btnNewButton_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 128, 114));
		panel_2.setBounds(0, 0, 856, 550);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Problem 1");
		
		btnNewButton_6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		btnNewButton_6.setBounds(163, 186, 189, 70);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("Problem 2");
		
		btnNewButton_6_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		btnNewButton_6_1.setBounds(526, 186, 189, 70);
		panel_2.add(btnNewButton_6_1);
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBackground(new Color(250, 128, 114));
		panel_1.setBounds(0, 0, 856, 550);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Çalıştır");
		btnNewButton.setBounds(531, 66, 111, 32);
		panel_1.add(btnNewButton);
		
		
		panel_1.setVisible(false);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Robot_hareket(panel_1);
				btnNewButton.setEnabled(false);
			}
		});
		
		
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setLayout(null);
		panel.setBackground(new Color(250, 128, 114));
		panel.setBounds(0, 0, 856, 550);
		getContentPane().add(panel);
		
		JButton btnNewButton_2 = new JButton("URL Değiştir");
		
		btnNewButton_2.setBounds(531, 350, 111, 32);
		panel.add(btnNewButton_2);
		JButton btnNewButton_1_1 = new JButton("Çalıştır");
		btnNewButton_1_1.setBounds(531, 74, 111, 32);
		panel.add(btnNewButton_1_1);
		
		
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Robot_hareket(panel);
				btnNewButton_1_1.setEnabled(false);
			}
		});
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				Izgara_olustur(panel_1, 1, lblNewLabel);
				
			}
		});
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel.setVisible(true);
				Izgara_olustur(panel, 2, lblNewLabel);
			}
		});
		
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(true);
				
			}
		});
		
		
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0;i<70;i++) {
					for (int j = 0; j < 70; j++) {
						if(sayi.lbL2[i][j]!=null)
							sayi.lbL2[i][j].setVisible(false);
					}
				}
				
				Labirent labirent = new Labirent(Integer.parseInt(txtStun.getText()), Integer.parseInt(txtSatr.getText()));
				labirent.labirent_yap();
				labirent.labirent_ciz(panel_3, labirent.labirent_don());
			}
		});
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Labirent labirent = new Labirent(Integer.parseInt(txtStun.getText()), Integer.parseInt(txtSatr.getText()));
				labirent.labirent_yap();
				sayi.stack=labirent.labirent_calitir();
			}
		});
		
		
		Image resim7 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Cell cell : sayi.stack) {
					sayi.lbL2[cell.x][cell.y].setIcon(new ImageIcon(resim7));
				}
				
			}
		});
		
		
	}
	
	
	
	public void Izgara_olustur(JPanel panel,int degıs,JLabel[][] lblNewLabel) {
		Image resim1 = new ImageIcon(this.getClass().getResource("kutu.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kutu2.png")).getImage();
		
		String stoplam= Izgara.link(degıs);
		
		int a=0;
		int b=0;
		int x=0,y=0;
		int[][] matris = new int[50][50];
		String[] arrSplit = stoplam.split(",");
	    for (String arrSplit1 : arrSplit) {
            y++;
            x=arrSplit1.length();
	    	for (int j = 0; j < arrSplit1.length(); j++) {
        		int c=Character.getNumericValue(arrSplit1.charAt(j));
				matris[a][b]=c;
				b++;
			}
        	a++;
        	b=0;
        }

		sayi.matris=matris;
		
	    b=5;
		int konumx=0;
		int konumy=0;
		
		int xx=5;
		for(int i=0;i<y+2;i++) {
			JLabel lbL = new JLabel("");
			lbL.setBounds(xx,b,20,20);
			panel.add(lbL);
			lbL.setIcon(new ImageIcon(resim1));
			xx+=21;
		}
		b=26;
		for(int i=0;i<y;i++) {
			a=5;
			
			JLabel lbL = new JLabel("");
			lbL.setBounds(a,b,20,20);
			panel.add(lbL);
			lbL.setIcon(new ImageIcon(resim1));
			a=26;
			
			for(int j=0;j<x;j++) {
				lblNewLabel[konumy][konumx]= new JLabel("");
				lblNewLabel[konumy][konumx].setBounds(a, b, 20, 20);
				panel.add(lblNewLabel[konumy][konumx]);
				
				
				if(matris[i][j]==0) {
					lblNewLabel[konumy][konumx].setIcon(new ImageIcon(resim2)); //Beyaz
					lblNewLabel[konumy][konumx].setName("b");
					}
				else {
					lblNewLabel[konumy][konumx].setIcon(new ImageIcon(resim1)); //Siyah
					lblNewLabel[konumy][konumx].setName("s");
				}
				
				konumx++;
				a+=21;
			}
			JLabel lbL1 = new JLabel("");
			lbL1.setBounds(a,b,20,20);
			panel.add(lbL1);
			lbL1.setIcon(new ImageIcon(resim1));
			
			b+=21;
			konumy++;
			konumx=0;
		}
		
		xx=5;
		for(int i=0;i<y+2;i++) {
			JLabel lbL = new JLabel("");
			lbL.setBounds(xx,b,20,20);
			panel.add(lbL);
			lbL.setIcon(new ImageIcon(resim1));
			xx+=21;
		}
		
		sayi.x=x;
		sayi.y=y;
		sayi.lbL=lblNewLabel;
		
		
		
	}
	
	
	public void Robot_hareket(JPanel panel ) {
		
		Image resim3 = new ImageIcon(this.getClass().getResource("b.png")).getImage();
		Image resim4 = new ImageIcon(this.getClass().getResource("s.png")).getImage();
		Image resim5 = new ImageIcon(this.getClass().getResource("mavi.png")).getImage();
		Image resim6 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
		Image resim7 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		int xbas=0,xson=0;
		int ybas=0,yson=0;
		Random r = new Random();
		
		do {
		xbas=r.nextInt(sayi.x);
		ybas=r.nextInt(sayi.y);
		}while(sayi.lbL[ybas][xbas].getName()=="s");
		
		do {
			xson=r.nextInt(sayi.x);
			yson=r.nextInt(sayi.y);
			}while(sayi.lbL[yson][xson].getName()=="s");
		
		
		
		sayi.lbL[ybas][xbas].setIcon(new ImageIcon(resim3));
		sayi.lbL[yson][xson].setIcon(new ImageIcon(resim4));
		sayi.lbL[yson][xson].setName("hedef");
		int [] bas= {ybas,xbas};
		int [] son= {yson,xson};
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(595, 11, 240, 44);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("En kısa Yol");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			sayi.EKY_size=BFS.EKY(sayi.matris, bas, son).size()-1;
				
				for (int i = 0; i < BFS.EKY(sayi.matris, bas, son).size(); i++) {
					
					sayi.lbL[BFS.EKY(sayi.matris, bas, son).get(i).x][BFS.EKY(sayi.matris, bas, son).get(i).y].setIcon(new ImageIcon(resim6));
					
				}
			}
		});
		btnNewButton_1.setBounds(531, 127, 111, 32);
		panel.add(btnNewButton_1);
		
		System.out.println(ybas+" "+xbas+"   "+yson+" "+xson);
		
		
		JButton btnNewButton_3 = new JButton("Adım Adım");
		btnNewButton_3.setBounds(531, 180, 111, 32);
		panel.add(btnNewButton_3);
		
		
		sayi.kuyruk=Robott.Hareket(sayi.matris, bas,son, resim5);
		
		sayi.say=sayi.kuyruk.size()-1;
		sayi.YOL_size=sayi.kuyruk.size()-1;
		
		
		  btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					  Cell cell=sayi.kuyruk.get(sayi.say);
					  System.out.println(cell.x+" "+cell.y);
					  sayi.lbL[cell.x][cell.y].setIcon(new ImageIcon(resim7));
					  if((cell.x==son[0] && cell.y==son[1])||(cell.x+1==son[0] && cell.y==son[1])||(cell.x-1==son[0] && cell.y==son[1])||(cell.x==son[0] && cell.y+1==son[1])||(cell.x==son[0] && cell.y-1==son[1]))
						  btnNewButton_3.setEnabled(false);
					  sayi.say--;
			
				}
			});
		

			JButton btnNewButton_4 = new JButton("Hepsini aç");
			btnNewButton_4.setBounds(531, 240, 111, 32);
			panel.add(btnNewButton_4);
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					for (Cell cell: sayi.kuyruk ) {
						sayi.lbL[cell.x][cell.y].setIcon(new ImageIcon(resim5));
					}
					 
					btnNewButton_4.setEnabled(false);
				}
			});
			
			JButton btnNewButton_5 = new JButton("Geçilen yollar");
			btnNewButton_5.setBounds(531, 305, 111, 32);
			panel.add(btnNewButton_5);
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Uygulama.yazdir(lblNewLabel_1);
					
				}
			});
			
			
		
			
		
	}
}




